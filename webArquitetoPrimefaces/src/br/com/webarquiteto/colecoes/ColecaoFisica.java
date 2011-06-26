package br.com.webarquiteto.colecoes;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.colecoes.HibernateUtil;
import br.com.webarquiteto.interfaces.InterfaceColecaoFisica;



public class ColecaoFisica implements InterfaceColecaoFisica {

	/* (non-Javadoc)
	 * @see br.com.webarquiteto.colecoes.InterfaceColecaoFisica#adicionarFisica(br.com.webarquiteto.basicas.Fisica)
	 */
	@Override
	public void adicionarFisica(Fisica Fi) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(Fi);
		sessao.getTransaction().commit(); 
	}
	 
	/* (non-Javadoc)
	 * @see br.com.webarquiteto.colecoes.InterfaceColecaoFisica#removerFisica(long)
	 */
	@Override
	public void removerFisica(long codFisica) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Fisica Fi = (Fisica) sessao.load(Fisica.class, codFisica);
		sessao.delete(Fi);
		sessao.getTransaction().commit();
	}
	 
	/* (non-Javadoc)
	 * @see br.com.webarquiteto.colecoes.InterfaceColecaoFisica#listarFisica()
	 */
	@Override
	public List<Fisica> listarFisica() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Query consulta = sessao.createQuery("from Fisica");
		return consulta.list();
	}
	 
	/* (non-Javadoc)
	 * @see br.com.webarquiteto.colecoes.InterfaceColecaoFisica#atualizarPessoa()
	 */
	@Override
	public void atualizarPessoa() {
	 
	}
	 
	/* (non-Javadoc)
	 * @see br.com.webarquiteto.colecoes.InterfaceColecaoFisica#procurarFisica(long)
	 */
	@Override
	public Fisica procurarFisica(long codFisica) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Fisica P = (Fisica) sessao.load(Fisica.class, codFisica);
		sessao.getTransaction().commit();
		
		return P;
	}
	
	@Override
	public Fisica procurarFisicaCpf(String cpf) {
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Query consulta = sessao.createQuery("from Fisica where numcpf like ?");
		consulta.setParameter(0, cpf);
		Fisica fis = (Fisica) consulta.uniqueResult();
		sessao.getTransaction().commit();
		
		return fis;
	}
}
