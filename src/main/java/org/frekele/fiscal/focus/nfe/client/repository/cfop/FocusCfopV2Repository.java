package org.frekele.fiscal.focus.nfe.client.repository.cfop;

import java.io.Serializable;

import org.frekele.fiscal.focus.nfe.client.model.request.cfop.param.CfopQueryParam;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarResponse;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarTodosResponse;

/**
 * Interface com chamadas para API V2 CFOP.
 *
 * @author Neylson
 */
public interface FocusCfopV2Repository extends Serializable {

	/**
	 * GET - Consultar um CFOP individualmente. Exemplo de requisição: GET
	 * https://api.focusnfe.com.br/v2/cfops?CODIGO_CFOP
	 */
	CfopConsultarResponse consultar(String cfop);

	/**
	 * GET - Consultar os CFOPs disponíveis. Exemplo de requisição: GET
	 * https://api.focusnfe.com.br/v2/cfops
	 */
	CfopConsultarTodosResponse consultarTodos(CfopQueryParam queryParam);

}
