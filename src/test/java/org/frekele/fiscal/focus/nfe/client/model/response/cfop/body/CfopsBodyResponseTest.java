package org.frekele.fiscal.focus.nfe.client.model.response.cfop.body;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.frekele.fiscal.focus.nfe.client.model.entities.cfop.NFeCfop;
import org.frekele.fiscal.focus.nfe.client.model.entities.erro.NFeErro;
import org.frekele.fiscal.focus.nfe.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author piikenoo - Neylson
 */
@Listeners(InvokedMethodListener.class)
public class CfopsBodyResponseTest {

    @Test
    public void testNewInstance() throws Exception {
        NFeErro erro = new NFeErro();
        List<NFeCfop> cfops = new ArrayList<>();
        cfops.add(new NFeCfop());

        CfopsBodyResponse entity = new CfopsBodyResponse();
        entity.setErro(erro);
        entity.setCfops(cfops);

        assertNotNull(entity);
        assertEquals(erro, entity.getErro());
        assertEquals(cfops, entity.getCfops());
    }
}
