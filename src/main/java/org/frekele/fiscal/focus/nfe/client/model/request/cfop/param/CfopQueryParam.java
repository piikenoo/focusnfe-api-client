package org.frekele.fiscal.focus.nfe.client.model.request.cfop.param;

import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;

/**
 * QueryParam para Consulta de CFOPs.
 * O código CFOP é formato por 4 dígitos, sendo que o primeiro digito indica se a operação é de entrada ou saída e também a 
 * localização da contraparte: mesma UF, outra UF ou exterior.
 *
 * @author piikenoo - Neylson Torres
 */

public class CfopQueryParam implements FocusNFeEntity {

    private static final long serialVersionUID = 1L;

    /**
     * Pesquise pela parte inicial do código CFOP.
     */
    private String codigo;

    /**
     * Pesquisa por parte da descrição do código CFOP.
     */
    private String descricao;

    /**
     * A API devolve apenas 50 registros por vez, para buscar os demais registros, utilize o parâmetro offset.
     */
    private String offset;

    public CfopQueryParam() {
        super();
    }

    private CfopQueryParam(Builder builder) {
        setCodigo(builder.codigo);
        setDescricao(builder.descricao);
        setOffset(builder.offset);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Pesquise pela parte inicial do código CFOP.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Pesquise pela parte inicial do código CFOP.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Pesquisa por parte da descrição do código CFOP.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Pesquisa por parte da descrição do código CFOP.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * A API devolve apenas 50 registros por vez, para buscar os demais registros, utilize o parâmetro offset.
     */
    public String getOffset() {
        return offset;
    }

    /**
     * A API devolve apenas 50 registros por vez, para buscar os demais registros, utilize o parâmetro offset.
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * CfopQueryParam Builder Pattern.
     */
    public static final class Builder {

        private String codigo;

        private String descricao;

        private String offset;

        private Builder() {
        }

        /**
         * Pesquise pela parte inicial do código CFOP.
         */
        public Builder withCodigo(String val) {
            codigo = val;
            return this;
        }

        /**
         * Pesquisa por parte da descrição do código CFOP.
         */
        public Builder withDescricao(String val) {
            descricao = val;
            return this;
        }

        /**
         * A API devolve apenas 50 registros por vez, para buscar os demais registros, utilize o parâmetro offset.
         */
        public Builder withOffset(String val) {
            offset = val;
            return this;
        }

        public CfopQueryParam build() {
            return new CfopQueryParam(this);
        }
    }
}
