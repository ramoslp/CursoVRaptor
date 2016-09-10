package br.unipe.cursovraptor.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.unipe.cursovraptor.daos.EnderecoRepository;
import br.unipe.cursovraptor.daos.PessoaRepository;
import br.unipe.cursovraptor.models.Endereco;
import br.unipe.cursovraptor.models.Pessoa;

@Controller
public class FormularioController {

	@Inject
	private Result result;
	@Inject
	private EnderecoRepository e1;
	@Inject
	private PessoaRepository p1;

	@Get("/formulario")
	public void formulario() {

	}

	@Post("/registra")
	public void registra(Pessoa pessoa, Endereco endereco) {

		pessoa.setEndereco(endereco);
		e1.save(endereco);
		p1.save(pessoa);

		result.redirectTo(PrimeiroController.class).index();
	}

}
