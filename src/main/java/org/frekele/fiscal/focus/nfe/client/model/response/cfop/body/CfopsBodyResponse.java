package org.frekele.fiscal.focus.nfe.client.model.response.cfop.body;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;
import org.frekele.fiscal.focus.nfe.client.model.entities.cfop.NFeCfop;
import org.frekele.fiscal.focus.nfe.client.model.entities.erro.NFeErro;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * Response Body CFOP.
 *
 * @author Neylson
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CfopsBodyResponse implements FocusNFeEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * As mensagens de erro serão apresentadas em qualquer operação sempre que for
	 * devolvido um código HTTP que começa com 4.
	 */
	@JsonUnwrapped
	private NFeErro erro;

	/**
	 * Lista de CFOP - "Código Fiscal de Operações e Prestação".
	 */
	@JsonProperty("arrayValues")
	private List<NFeCfop> cfops;

	public CfopsBodyResponse() {
		super();
	}

	/**
	 * As mensagens de erro serão apresentadas em qualquer operação sempre que for
	 * devolvido um código HTTP que começa com 4.
	 */
	public NFeErro getErro() {
		return erro;
	}

	/**
	 * As mensagens de erro serão apresentadas em qualquer operação sempre que for
	 * devolvido um código HTTP que começa com 4.
	 */
	public void setErro(NFeErro erro) {
		this.erro = erro;
	}

	/**
	 * Lista de Cfops.
	 */
	public List<NFeCfop> getCfops() {
		return cfops;
	}

	/**
	 * Lista de Cfops.
	 */
	public void setCfops(List<NFeCfop> cfops) {
		this.cfops = cfops;
	}
}