package br.com.webarquiteto.basicas;

import java.io.Serializable;
import java.util.Date;

public class Cliente  extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	
	// construtores
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String email) {
		super(nomePessoa, telefoneResidencial, telefoneComercial, telefoneCelular,
				dataNascimento, endereco, email);
		// TODO Auto-generated constructor stub
	}


	
	
	
	

	

	
	
	
	
}
