package br.com.webarquiteto.cadastro;

import java.util.List;

import br.com.webarquiteto.basicas.Fisica;
import br.com.webarquiteto.cadastro.interfaces.InterfaceCadastroFisica;
import br.com.webarquiteto.interfaces.InterfaceColecaoFisica;
import br.com.webarquiteto.exception.CpfDuplicadoException;

public class CadastroFisica implements InterfaceCadastroFisica {
	//atributos
	private InterfaceColecaoFisica clienteFisica;

	// construtores
	
	public CadastroFisica(InterfaceColecaoFisica clienteFisica) {
		super();
		this.clienteFisica = clienteFisica;
	}
	
	
	// metodos delegados
	/* (non-Javadoc)
	 * @see br.com.webarquiteto.cadastro.InterfaceCadastroFisica#adicionarFisica(br.com.webarquiteto.basicas.Fisica)
	 */
	@Override
	public void adicionarFisica(Fisica Fi) throws CpfDuplicadoException {
		
		if( (procurarFisicaCpf(Fi.getNumCpf())) == null){
			clienteFisica.adicionarFisica(Fi);
		}else{
			CpfDuplicadoException ex = new CpfDuplicadoException(Fi.getNumCpf());
			throw ex;
		}
			
	}

	

	/* (non-Javadoc)
	 * @see br.com.webarquiteto.cadastro.InterfaceCadastroFisica#removerFisica(long)
	 */
	@Override
	public void removerFisica(long codFisica) {
		clienteFisica.removerFisica(codFisica);
	}

	/* (non-Javadoc)
	 * @see br.com.webarquiteto.cadastro.InterfaceCadastroFisica#listarFisica()
	 */
	@Override
	public List<Fisica> listarFisica() {
		return clienteFisica.listarFisica();
	}

	/* (non-Javadoc)
	 * @see br.com.webarquiteto.cadastro.InterfaceCadastroFisica#atualizarPessoa()
	 */
	@Override
	public void atualizarFisica(Fisica fis) {
		clienteFisica.atualizarFisica(fis);
	}

	/* (non-Javadoc)
	 * @see br.com.webarquiteto.cadastro.InterfaceCadastroFisica#procurarFisica(long)
	 */
	@Override
	public Fisica procurarFisica(long codFisica) {
		return clienteFisica.procurarFisica(codFisica);
	}

	@Override
	public Fisica procurarFisicaCpf(String cpf) {
		return clienteFisica.procurarFisicaCpf(cpf);
	}
	
	
	
}
