package br.com.webarquiteto.beans;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import br.com.webarquiteto.basicas.Endereco;
import br.com.webarquiteto.basicas.Fisica;
import br.com.webarquiteto.fachada.Fachada;

@ManagedBean
@ApplicationScoped
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
		Fachada.getInstancia().adicionarFisica(clienteFisica);
	}
	
}
