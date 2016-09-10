package br.unipe.cursovraptor.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class DadosController {

	@Inject
	private Result result;

	@Get("/coletadados")
	public void coletadados() {

	}

	@Post("/resultadoimc")
	public void resultadoimc(String sexo, String peso, String altura) {
		double p = Double.parseDouble(peso);
		double a = Double.parseDouble(altura);
		String condicao = null;
		double imc = p / (a * a);
		
		if (sexo.equals("feminino")){
			if (imc < 19.1) {
				condicao = "Abaixo do peso";
			} else if (imc > 19.1 && imc <= 25.8) {
				condicao = "No peso normal";
			} else if (imc > 25.8 && imc <= 27.3) {
				condicao = "Marginalmente acima do peso";
			} else if (imc > 27.3 && imc <= 32.3) {
				condicao = "Acima do peso ideal";
			} else if (imc > 32.3) {
				condicao = "Obeso";
			}

		} else if (sexo.equals("masculino")){
			if (imc < 20.7) {
				condicao = "Abaixo do peso";
			} else if (imc > 20.7 && imc <= 26.4) {
				condicao = "No peso normal";
			} else if (imc > 26.4 && imc <= 27.8) {
				condicao = "Marginalmente acima do peso";
			} else if (imc > 27.8 && imc <= 31.1) {
				condicao = "Acima do peso ideal";
			} else if (imc > 31.1) {
				condicao = "Obeso";
			}
		}

		System.out.println(condicao);

		result.include("condicao", condicao+" (IMC = "+imc+")");
	}

}