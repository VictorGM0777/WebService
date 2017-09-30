package br.com.fiap.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.entity.Produto;

@Path("/produto")
public class ProdutoResource {

	ProdutoBO bo = new ProdutoBO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response post(Produto produto, @Context UriInfo uriInfo) {

		bo.cadastrar(produto);
		UriBuilder url = UriBuilder.fromPath(uriInfo.getPath());
		url.path(String.valueOf(produto.getCodigo()));
		return Response.created(url.build()).build();

	}
	
}
