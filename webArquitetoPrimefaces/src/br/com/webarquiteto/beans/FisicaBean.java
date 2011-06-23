package br.com.webarquiteto.beans;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;

import br.com.webarquiteto.basicas.Fisica;

@SessionScoped
public class FisicaBean implements Serializable {

	// atributos primarios
	private static final long serialVersionUID = 1L;
	private Fisica clienteFisica;
	
	
	// gets e sets
	public Fisica getClienteFisica() {
		if(clienteFisica == null){
			clienteFisica = new Fisica();
		}
		return clienteFisica;
	}
	public void setClienteFisica(Fisica clienteFisica) {
		this.clienteFisica = clienteFisica;
	}
	
}
