package org.frekele.fiscal.focus.nfe.client.repository.cfop;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.frekele.fiscal.focus.nfe.client.core.FocusMediaType;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarResponse;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.CfopConsultarTodosResponse;

/**
 * 
 * Proxy RestEasy para chamadas da API V2 CFOP
 * 
 * @author Neylson
 *
 */
@Path("/v2")
@Produces({ FocusMediaType.APPLICATION_JSON_CHARSET_UTF8 })
@Consumes({ FocusMediaType.APPLICATION_JSON_CHARSET_UTF8 })
interface FocusCfopV2ProxyClient extends Serializable {

	/**
	 * GET - Consultar um CFOP individualmente. Exemplo de requisição: GET
	 * https://api.focusnfe.com.br/v2/cfops?CODIGO_CFOP
	 */
	@GET
	@Path("cfops?{cfop}")
	CfopConsultarResponse consultar(@HeaderParam("Authorization") String authorization, @PathParam("cfop") String cfop);

	/**
     * GET - Consultar os CFOPs disponíveis.
     * Exemplo de requisição: GET https://api.focusnfe.com.br/v2/cfops
     */
	@GET
	@Path("cfops")
	CfopConsultarTodosResponse consultarTodos(@HeaderParam("Authorization") String authorization,
			@QueryParam("codigo") String codigo, @QueryParam("descricao") String descricao,
			@QueryParam("offset") String offset);

}
