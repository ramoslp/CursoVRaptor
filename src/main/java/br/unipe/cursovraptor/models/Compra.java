package br.unipe.cursovraptor.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Compra extends AbstractEntity {

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataCompra;

	@ManyToOne
	private Pessoa pessoa;

}