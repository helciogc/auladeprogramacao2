package br.com.webarquiteto.colecoes;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.colecoes.HibernateUtil;


public class ColecaoFisica {

	public void adicionarFisica(Fisica Fi) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(Fi);
		sessao.getTransaction().commit(); 
	}
	 
	public void removerFisica(long codFisica) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Fisica Fi = (Fisica) sessao.load(Fisica.class, codFisica);
		sessao.delete(Fi);
		sessao.getTransaction().commit();
	}
	 
	public List<Fisica> listarFisica() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Query consulta = sessao.createQuery("from Fisica");
		return consulta.list();
	}
	 
	public void atualizarPessoa() {
	 
	}
	 
	public Fisica procurarFisica(long codFisica) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Fisica P = (Fisica) sessao.load(Fisica.class, codFisica);
		sessao.getTransaction().commit();
		
		return P;
	}
}
