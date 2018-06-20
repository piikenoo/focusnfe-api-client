package org.frekele.fiscal.focus.nfe.client.repository.mde;

import org.frekele.fiscal.focus.nfe.client.model.request.mde.MDeManifestarBodyRequest;
import org.frekele.fiscal.focus.nfe.client.model.response.mde.MDeManifestarResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Path("/v2")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
@Consumes({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
interface FocusMDeV2ProxyClient extends Serializable {

    /**
     * POST - Realiza um manifesto na nota informada.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/nfes_recebidas/CHAVE_NFE/manifesto
     */
    @POST
    @Path("nfes_recebidas/{chaveNFe}/manifesto")
    MDeManifestarResponse manifestar(@HeaderParam("Authorization") String authorization,
                                     @PathParam("chaveNFe") String chaveNFe,
                                     MDeManifestarBodyRequest bodyRequest);

    /**
     * GET - Busca informações resumidas de todas as NFe’s recebidas.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/v2/nfes_recebidas?cnpj=CNPJ
     */
    @GET
    @Path("nfes_recebidas")
    MDeManifestarResponse consultarTudo(@HeaderParam("Authorization") String authorization,
                                        @QueryParam("cnpj") String cnpj);

    /**
     * GET - Busca informações resumidas de todas as NFe’s recebidas.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/v2/nfes_recebidas?cnpj=CNPJ&versao=VERSAO
     */
    @GET
    @Path("nfes_recebidas")
    MDeManifestarResponse consultarTudo(@HeaderParam("Authorization") String authorization,
                                        @QueryParam("cnpj") String cnpj,
                                        @QueryParam("versao") String versao);

    /**
     * GET - Busca informações resumidas de todas as NFe’s recebidas.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/v2/nfes_recebidas?cnpj=CNPJ&versao=VERSAO&pendente=PENDENTE
     */
    @GET
    @Path("nfes_recebidas")
    MDeManifestarResponse consultarTudo(@HeaderParam("Authorization") String authorization,
                                        @QueryParam("cnpj") String cnpj,
                                        @QueryParam("versao") String versao,
                                        @QueryParam("pendente") String pendente);
}
