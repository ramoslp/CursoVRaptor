package br.unipe.cursovraptor.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class PrimeiroController {
	
	@Inject
	private Result result;
	
	@Get("/index")
	public void index(){
		
		result.include("mensagem", "Hello World!");
		
	}
	

}
