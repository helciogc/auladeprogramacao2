package br.com.webarquiteto.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.exception.CpfDuplicadoException;
import br.com.webarquiteto.fachada.Fachada;

@ManagedBean
@ApplicationScoped
public class FisicaBean implements Serializable {

	// atributos primarios
	private static final long serialVersionUID = 1L;
	private Fisica clienteFisica;
	private boolean validaMsg = false;
	private Fisica clienteFisicaSelecionado;
	private List<Fisica> listarPessoaFisica;

	// construtores

	
	public FisicaBean() {

	}

	// gets e sets
	public Fisica getClienteFisica() {

		if (clienteFisica == null) {
			clienteFisica = new Fisica();
			clienteFisica.setEndereco(new Endereco());

		}

		return clienteFisica;
	}

	public void setClienteFisica(Fisica clienteFisica) {
		this.clienteFisica = clienteFisica;
	}

	public Fisica getClienteFisicaSelecionado() {
		
		if(clienteFisicaSelecionado == null){
			clienteFisicaSelecionado = new Fisica();
			clienteFisicaSelecionado.setEndereco(new Endereco());
		}
		
		return clienteFisicaSelecionado;
	}

	public void setClienteFisicaSelecionado(Fisica clienteFisicaSelecionado) {
		this.clienteFisicaSelecionado = clienteFisicaSelecionado;
	}

	public List<Fisica> getListarPessoaFisica() {
		if(listarPessoaFisica == null){
			listarPessoaFisica = new ArrayList<Fisica>();
			listarPessoaFisica = Fachada.getInstancia().listarFisica();
		}
		return listarPessoaFisica;
	}

	public void setListarPessoaFisica(List<Fisica> listarPessoaFisica) {
		this.listarPessoaFisica = listarPessoaFisica;
	}

	public boolean isValidaMsg() {
		return validaMsg;
	}

	public void setValidaMsg(boolean validaMsg) {
		this.validaMsg = validaMsg;
	}

	// metodos

	public void salvarFisica() {
		validaMsg = true;
		try {
			Fachada.getInstancia().adicionarFisica(clienteFisica);
			listarPessoaFisica = Fachada.getInstancia().listarFisica();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Dados Salvos com Sucesso", "");
			FacesContext.getCurrentInstance().addMessage(null, message);

			clienteFisica = new Fisica();
			clienteFisica.setEndereco(new Endereco());
		} catch (CpfDuplicadoException e) {

			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"CPF informado já encontra-se cadastrado no sistema!", "");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}

		validaMsg = false;
	}
		
	public void atualizarFisica(){
		validaMsg = true;
		Fachada.getInstancia().atualizarFisica(clienteFisicaSelecionado);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Dados foram atualizados com Sucesso", "");
		FacesContext.getCurrentInstance().addMessage(null, message);

		clienteFisicaSelecionado = new Fisica();
		clienteFisicaSelecionado.setEndereco(new Endereco());
	}
	
	

}
