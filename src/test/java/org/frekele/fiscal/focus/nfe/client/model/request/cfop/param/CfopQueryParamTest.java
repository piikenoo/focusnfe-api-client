package org.frekele.fiscal.focus.nfe.client.model.request.cfop.param;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.frekele.fiscal.focus.nfe.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author piikenoo - Neylson
 */
@Listeners(InvokedMethodListener.class)
public class CfopQueryParamTest {

    @Test
    public void testNewInstance() throws Exception {
        String codigo = "5102";
        String descricao = "5102 - Venda de mercadoria adquirida ou recebida de terceiros";
        String offset = "20";

        CfopQueryParam entity = new CfopQueryParam();
        entity.setCodigo(codigo);
        entity.setDescricao(descricao);
        entity.setOffset(offset);

        assertNotNull(entity);
        assertEquals(codigo, entity.getCodigo());
        assertEquals(descricao, entity.getDescricao());
        assertEquals(offset, entity.getOffset());

        entity = CfopQueryParam.newBuilder()
            .withCodigo(codigo)
            .withDescricao(descricao)
            .withOffset(offset)
            .build();

        assertNotNull(entity);
        assertEquals(codigo, entity.getCodigo());
        assertEquals(descricao, entity.getDescricao());
        assertEquals(offset, entity.getOffset());
    }
}
