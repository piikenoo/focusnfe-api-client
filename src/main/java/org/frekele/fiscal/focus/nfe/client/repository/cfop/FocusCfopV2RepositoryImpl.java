package org.frekele.fiscal.focus.nfe.client.repository.cfop;

import javax.inject.Inject;

import org.frekele.fiscal.focus.nfe.client.auth.FocusNFeAuth;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFe;
import org.frekele.fiscal.focus.nfe.client.filter.RequestHeaderInfoFilter;
import org.frekele.fiscal.focus.nfe.client.filter.RequestLoggingFilter;
import org.frekele.fiscal.focus.nfe.client.filter.ResponseArrayJsonReplaceFilter;
import org.frekele.fiscal.focus.nfe.client.filter.ResponseLoggingFilter;
import org.frekele.fiscal.focus.nfe.client.model.request.cfop.param.CfopQueryParam;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarResponse;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarTodosResponse;
import org.frekele.fiscal.focus.nfe.client.util.FocusNFeUtils;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Classe com implementação das chamadas para API V2 CFOP.
 *
 * @author Neylson
 */
@FocusNFe
public class FocusCfopV2RepositoryImpl implements FocusCfopV2Repository {

	private static final long serialVersionUID = 1L;

	private final ResteasyClient client;

	private final FocusNFeAuth auth;

	@Inject
	public FocusCfopV2RepositoryImpl(@FocusNFe ResteasyClient client, @FocusNFe FocusNFeAuth auth) {
		FocusNFeUtils.throwInjection(client, auth);
		FocusNFeUtils.throwAuth(auth);
		this.client = client.register(RequestLoggingFilter.class).register(ResponseLoggingFilter.class)
				.register(RequestHeaderInfoFilter.class).register(ResponseArrayJsonReplaceFilter.class);
		this.auth = auth;
	}

	ResteasyClient getClient() {
		return client;
	}

	FocusNFeAuth getAuth() {
		return auth;
	}

	private FocusCfopV2ProxyClient getProxyClient() {
		ResteasyClient client = this.getClient();
		ResteasyWebTarget webTarget = client.target(this.getAuth().getEnvironment().getTargetUrl());
		return webTarget.proxy(FocusCfopV2ProxyClient.class);
	}

	/**
     * GET - Consultar os CFOPs disponíveis.
     * Exemplo de requisição: GET https://api.focusnfe.com.br/v2/cfops
     */
	@Override
	public CfopConsultarTodosResponse consultarTodos(CfopQueryParam queryParam) {
		FocusNFeUtils.throwObject(queryParam, "CfopQueryParam");
		FocusNFeUtils.throwBeanValidation(queryParam);
		FocusCfopV2ProxyClient proxyClient = this.getProxyClient();

		return proxyClient.consultarTodos(this.getAuth().getBasicAuthorization(), queryParam.getCodigo(),
				queryParam.getDescricao(), queryParam.getOffset());
	}

}
