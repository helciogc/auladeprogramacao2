package br.com.webarquiteto.exception;

public class CpfDuplicadoException extends Exception {
	// atributos primarios
	
	private static final long serialVersionUID = 1L;
	private String cpf;
	
	// construtores
	
	public CpfDuplicadoException(String cpf){
	super("O cpf informado já se encontra cadastrado no sistema!");
	this.cpf = cpf;
	}

	public String getCpf() {
	return cpf;
	}
}
