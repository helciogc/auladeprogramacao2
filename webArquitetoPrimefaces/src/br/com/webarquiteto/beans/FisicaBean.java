package br.com.webarquiteto.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.exception.CpfDuplicadoException;
import br.com.webarquiteto.fachada.Fachada;

@SessionScoped
public class FisicaBean implements Serializable {

	// atributos primarios
	private static final long serialVersionUID = 1L;
	private Fisica clienteFisica;
	
	// construtores
	
	public FisicaBean(){
		
	}
	
	// gets e sets
	public Fisica getClienteFisica() {
		
		if(clienteFisica == null){
			clienteFisica = new Fisica();
			clienteFisica.setEndereco(new Endereco());
		}
		return clienteFisica;
	}
	public void setClienteFisica(Fisica clienteFisica) {
		this.clienteFisica = clienteFisica;
	}
	
	// metodos
	
	public void salvarFisica(){
		
		try {
			Fachada.getInstancia().adicionarFisica(clienteFisica);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Dados Salvos com Sucesso", "");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (CpfDuplicadoException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"CPF informado já encontra-se cadastrado no sistema!", "");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		clienteFisica = new Fisica();
	}
	
}
