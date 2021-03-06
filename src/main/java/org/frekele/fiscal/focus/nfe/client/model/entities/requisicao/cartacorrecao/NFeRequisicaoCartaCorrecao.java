package org.frekele.fiscal.focus.nfe.client.model.entities.requisicao.cartacorrecao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fiscal.focus.nfe.client.converter.OffsetDateTimeJsonConverter;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.OffsetDateTime;

/**
 * Requisicao Carta Correção, Inclui os dados completos do protocolo devolvido pela SEFAZ - 'protocolo_cancelamento'.
 *
 * @author frekele - Leandro Kersting de Freitas
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeRequisicaoCartaCorrecao implements FocusNFeEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("versao")
    private String versao;

    @JsonProperty("id_tag")
    private String idTag;

    @JsonProperty("codigo_orgao")
    private String codigoOrgao;

    @JsonProperty("ambiente")
    private String ambiente;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("chave_nfe")
    private String chaveNfe;

    //Formato padrão ISO, exemplo: “2016-12-25T12:00-0300”.
    @OffsetDateTimeJsonConverter
    @JsonProperty("data_evento")
    private OffsetDateTime dataEvento;

    @JsonProperty("tipo_evento")
    private String tipoEvento;

    @JsonProperty("numero_sequencial_evento")
    private String numeroSequencialEvento;

    @JsonProperty("versao_evento")
    private String versaoEvento;

    @JsonProperty("descricao_evento")
    private String descricaoEvento;

    @JsonProperty("correcao")
    private String correcao;

    @JsonProperty("condicoes_uso")
    private String condicoesUso;

    public NFeRequisicaoCartaCorrecao() {
        super();
    }

    private NFeRequisicaoCartaCorrecao(Builder builder) {
        setVersao(builder.versao);
        setIdTag(builder.idTag);
        setCodigoOrgao(builder.codigoOrgao);
        setAmbiente(builder.ambiente);
        setCnpj(builder.cnpj);
        setChaveNfe(builder.chaveNfe);
        setDataEvento(builder.dataEvento);
        setTipoEvento(builder.tipoEvento);
        setNumeroSequencialEvento(builder.numeroSequencialEvento);
        setVersaoEvento(builder.versaoEvento);
        setDescricaoEvento(builder.descricaoEvento);
        setCorrecao(builder.correcao);
        setCondicoesUso(builder.condicoesUso);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    public String getCodigoOrgao() {
        return codigoOrgao;
    }

    public void setCodigoOrgao(String codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public OffsetDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(OffsetDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getNumeroSequencialEvento() {
        return numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(String numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public String getVersaoEvento() {
        return versaoEvento;
    }

    public void setVersaoEvento(String versaoEvento) {
        this.versaoEvento = versaoEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getCorrecao() {
        return correcao;
    }

    public void setCorrecao(String correcao) {
        this.correcao = correcao;
    }

    public String getCondicoesUso() {
        return condicoesUso;
    }

    public void setCondicoesUso(String condicoesUso) {
        this.condicoesUso = condicoesUso;
    }

    /**
     * NFeRequisicaoCartaCorrecao Builder Pattern.
     */
    public static final class Builder {

        private String versao;

        private String idTag;

        private String codigoOrgao;

        private String ambiente;

        private String cnpj;

        private String chaveNfe;

        private OffsetDateTime dataEvento;

        private String tipoEvento;

        private String numeroSequencialEvento;

        private String versaoEvento;

        private String descricaoEvento;

        private String correcao;

        private String condicoesUso;

        private Builder() {
        }

        public Builder withVersao(String val) {
            versao = val;
            return this;
        }

        public Builder withIdTag(String val) {
            idTag = val;
            return this;
        }

        public Builder withCodigoOrgao(String val) {
            codigoOrgao = val;
            return this;
        }

        public Builder withAmbiente(String val) {
            ambiente = val;
            return this;
        }

        public Builder withCnpj(String val) {
            cnpj = val;
            return this;
        }

        public Builder withChaveNfe(String val) {
            chaveNfe = val;
            return this;
        }

        public Builder withDataEvento(OffsetDateTime val) {
            dataEvento = val;
            return this;
        }

        public Builder withTipoEvento(String val) {
            tipoEvento = val;
            return this;
        }

        public Builder withNumeroSequencialEvento(String val) {
            numeroSequencialEvento = val;
            return this;
        }

        public Builder withVersaoEvento(String val) {
            versaoEvento = val;
            return this;
        }

        public Builder withDescricaoEvento(String val) {
            descricaoEvento = val;
            return this;
        }

        public Builder withCorrecao(String val) {
            correcao = val;
            return this;
        }

        public Builder withCondicoesUso(String val) {
            condicoesUso = val;
            return this;
        }

        public NFeRequisicaoCartaCorrecao build() {
            return new NFeRequisicaoCartaCorrecao(this);
        }
    }
}
