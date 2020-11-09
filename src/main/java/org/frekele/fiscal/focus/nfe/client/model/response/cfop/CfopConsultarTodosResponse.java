package org.frekele.fiscal.focus.nfe.client.model.response.cfop;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;

import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;
import org.frekele.fiscal.focus.nfe.client.model.response.cfop.body.CfopsBodyResponse;
import org.jboss.resteasy.annotations.Body;
import org.jboss.resteasy.annotations.ResponseObject;
import org.jboss.resteasy.annotations.Status;

/**
 * ResponseObject Consultar CFOP.
 *
 * @author Neylson
 */
@ResponseObject
public interface CfopConsultarTodosResponse extends FocusNFeEntity {

	/**
	 * Número de créditos para o período atual.
	 */
	@HeaderParam("X-Rate-Limit-Limit")
	String getRateLimitLimit();

	/**
	 * Número de créditos que restam no período atual.
	 */
	@HeaderParam("X-Rate-Limit-Remaining")
	String getRateLimitRemaining();

	/**
	 * Número de segundos até que seja reinicializado o contador de créditos.
	 */
	@HeaderParam("X-Rate-Limit-Reset")
	String getRateLimitReset();

	/**
	 * Tempo de execução.
	 */
	@HeaderParam("X-Runtime")
	String getRuntime();

	/**
	 * Representa o número total de ocorrências.
	 */
	@HeaderParam("X-Total-Count")
	String getTotalCount();

	/**
	 * Status Http da Chamada.
	 */
	@Status
	Integer getStatus();

	/**
	 * Corpo da Resposta.
	 */
	@Body
	CfopsBodyResponse getBody();

	/**
	 * Corpo da Resposta em String.
	 */
	@Body
	String getBodyString();

	/**
	 * Response Completo.
	 */
	Response getResponse();
}
