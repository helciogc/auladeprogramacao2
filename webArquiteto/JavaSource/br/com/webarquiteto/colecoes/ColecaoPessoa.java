package br.com.webarquiteto.colecoes;
import java.util.List;

import org.hibernate.Session;

import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.colecoes.HibernateUtil;
public class ColecaoPessoa {

	public void adicionarPessoa(Pessoa P) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(P);
		sessao.getTransaction().commit(); 
	}
	 
	public void removerPessoa() {
	 
	}
	 
	public List<Pessoa> listarPessoa() {
		return null;
	}
	 
	public void atualizarPessoa() {
	 
	}
	 
	public Pessoa procurarPessoa() {
		return null;
	}
}
