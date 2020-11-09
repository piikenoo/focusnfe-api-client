package org.frekele.fiscal.focus.nfe.client.model.entities.cfop;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe Json de CFOP.
 * O código CFOP é formato por 4 dígitos, sendo que o primeiro digito indica se a operação é de entrada ou saída e também a 
 * localização da contraparte: mesma UF, outra UF ou exterior.
 * 
 * São aceitos os seguintes parâmetros de pesquisa:
 * codigo: Pesquise pela parte inicial do código CFOP
 * descricao: Pesquisa por parte da descrição do código CFOP.
 * Para buscar os demais registros, utilize o parâmetro offset.
 *
 * @author piikenoo - Neylson Torres
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeCfop implements FocusNFeEntity {

    private static final long serialVersionUID = 1L;

    /**
     * Código do CFOP.
     */
    @JsonProperty("codigo")
    private String codigo;

    /**
     * Descrição completa do código CFOP.
     */
    @JsonProperty("descricao")
    private String descricao;

    public NFeCfop() {
        super();
    }

    private NFeCfop(Builder builder) {
        setCodigo(builder.codigo);
        setDescricao(builder.descricao);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * NFeCfop Builder Pattern
     */
    public static final class Builder {

        private String codigo;

        private String descricao;

        private Builder() {
        }

        public Builder withCodigo(String val) {
            codigo = val;
            return this;
        }

        public Builder withDescricao(String val) {
            descricao = val;
            return this;
        }

        public NFeCfop build() {
            return new NFeCfop(this);
        }
    }
}
