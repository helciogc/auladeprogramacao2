package br.com.webarquiteto.exception;

public class CnpjDuplicadoException extends Exception {
	// 	atributos primarios
	
	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	// construtores
	
	public CnpjDuplicadoException(String cnpj){
	super("O cnpj informado já se encontra cadastrado no sistema!");
	this.cnpj = cnpj;
	}

	public String getCnpj() {
	return cnpj;
	}
}
