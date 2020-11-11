package org.frekele.fiscal.focus.nfe.client.model.entities.cfop;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.frekele.fiscal.focus.nfe.client.model.entities.cfop.NFeCfop;
import org.frekele.fiscal.focus.nfe.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author piikenoo - Neylson
 */
@Listeners(InvokedMethodListener.class)
public class NFeCfopTest {

    @Test
    public void testNewInstance() throws Exception {
        String codigo = "1101";
        String descricao = "1101 - Compra p/ industrialização ou produção rural";

        NFeCfop entity = new NFeCfop();
        entity.setCodigo(codigo);
        entity.setDescricao(descricao);

        assertNotNull(entity);
        assertEquals(codigo, entity.getCodigo());
        assertEquals(descricao, entity.getDescricao());

        entity = NFeCfop.newBuilder()
            .withCodigo(codigo)
            .withDescricao(descricao)
            .build();

        assertNotNull(entity);
        assertEquals(codigo, entity.getCodigo());
        assertEquals(descricao, entity.getDescricao());
    }
}
