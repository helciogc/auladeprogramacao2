package br.com.webarquiteto.cadastro.interfaces;

import java.util.List;

import br.com.webarquiteto.basicas.Fisica;

public interface InterfaceCadastroFisica {

	// metodos delegados
	public abstract void adicionarFisica(Fisica Fi);

	public abstract void removerFisica(long codFisica);

	public abstract List<Fisica> listarFisica();

	public abstract void atualizarPessoa();

	public abstract Fisica procurarFisica(long codFisica);

	public abstract Fisica procurarFisicaCpf(String cpf);

}