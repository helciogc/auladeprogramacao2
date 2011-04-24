package br.com.webarquiteto.basicas;

import java.util.Date;

public class Cliente extends Pessoa{
	//atributos primarios
	
	private long codCliente;

	// construtores
	
	public Cliente() {
		super();
		
	}

	public Cliente(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco) {
		super(nomePessoa, telefoneResidencial, telefoneComercial, telefoneCelular,
				dataNascimento, endereco);
		
	}

	// gets e sets
	
	public long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(long codCliente) {
		this.codCliente = codCliente;
	}

	

	

	
	
	
	
}
