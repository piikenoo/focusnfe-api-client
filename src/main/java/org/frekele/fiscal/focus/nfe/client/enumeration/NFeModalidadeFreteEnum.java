package org.frekele.fiscal.focus.nfe.client.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.util.Arrays;
import java.util.List;

@XmlType
@XmlEnum(String.class)
public enum NFeModalidadeFreteEnum {

    POR_CONTA_EMITENTE("0", "Por conta do emitente"),
    POR_CONTA_DESTINATARIO("1", "Por conta do destinatário"),
    POR_CONTA_TERCEIROS("2", "Por conta de terceiros"),
    SEM_FRETE("9", "Sem frete");

    private String code;

    private String description;

    private NFeModalidadeFreteEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonValue
    @XmlValue
    public String getCode() {
        return this.code;
    }

    @JsonCreator
    public static NFeModalidadeFreteEnum fromCode(String value) {
        if (value != null && value.length() != 0) {
            for (NFeModalidadeFreteEnum obj : getAll()) {
                if (obj.code.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<NFeModalidadeFreteEnum> getAll() {
        return Arrays.asList(NFeModalidadeFreteEnum.values());
    }

    public String getDescription() {
        return description;
    }
}