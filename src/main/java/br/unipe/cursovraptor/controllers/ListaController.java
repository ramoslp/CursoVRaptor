package br.unipe.cursovraptor.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.unipe.cursovraptor.models.Usuario;

@Controller
public class ListaController {
	
	@Inject
	private Result result;
	
	@Get("/criaLista")
	public void criaLista() {
		Usuario usuario1 = new Usuario("Robson", "robson@gmail.com");
		Usuario usuario2 = new Usuario("André", "andre@hotmail.com");
		Usuario usuario3 = new Usuario("Jânio", "gundam@bol.com.br");
		
		List<Usuario> usuarios = new ArrayList();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		result.include("lista", usuarios);
	}

}
