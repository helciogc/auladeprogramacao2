package br.com.webarquiteto.interfaces;

import java.util.List;

import br.com.webarquiteto.basicas.Fisica;

public interface InterfaceColecaoFisica {

	public abstract void adicionarFisica(Fisica Fi);

	public abstract void removerFisica(long codFisica);

	public abstract List<Fisica> listarFisica();

	public abstract void atualizarPessoa();

	public abstract Fisica procurarFisica(long codFisica);

	public abstract Fisica procurarFisicaCpf(String cpf);

}