package org.frekele.fiscal.focus.nfe.client.model.nfe.request.body.requisicao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NFePessoaAutorizada implements FocusNFeEntity {

    private static final long serialVersionUID = 1L;

    //CNPJ autorizado
    @Size(max = 14)
    @JsonProperty("cnpj")
    private String cnpj;

    //CPF autorizado
    @Size(max = 11)
    @JsonProperty("cpf")
    private String cpf;

    public NFePessoaAutorizada() {
        super();
    }

    public NFePessoaAutorizada(String cnpj, String cpf) {
        this.cnpj = cnpj;
        this.cpf = cpf;
    }

    private NFePessoaAutorizada(Builder builder) {
        setCnpj(builder.cnpj);
        setCpf(builder.cpf);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static final class Builder {

        private String cnpj;

        private String cpf;

        private Builder() {
        }

        public Builder withCnpj(String val) {
            cnpj = val;
            return this;
        }

        public Builder withCpf(String val) {
            cpf = val;
            return this;
        }

        public NFePessoaAutorizada build() {
            return new NFePessoaAutorizada(this);
        }
    }
}
