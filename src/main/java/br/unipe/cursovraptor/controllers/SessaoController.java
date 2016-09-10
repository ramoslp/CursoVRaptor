package br.unipe.cursovraptor.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.unipe.cursovraptor.models.Sessao;
import br.unipe.cursovraptor.models.Usuario;

@Controller
public class SessaoController {
	
	@Inject
	private Result result;
	
	@Inject
	private Sessao sessao;
	
	@Get("/exercicio3")
	public void exercicio3(){
		
	}
	
	@Post("/validarLogin")
	public void validarLogin(String usuario, String senha){
		
		if(usuario.equals("petros") && senha.equals("lucas")){
			Usuario user = new Usuario("Luis Paulo", "luispaulorm@gmail.com");
			sessao.setUsuario(user);
			result.include("validacao", sessao);
		}else{
			result.redirectTo(this).exercicio3();
		}
	}
	

}