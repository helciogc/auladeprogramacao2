package basicas;

import java.util.Date;
import java.util.Vector;

public class Detento {

	private String nome;
	private String cpf;
	private Date nascimento;
	private String sexo;
	private String observacoes;
	private Vector <Ocorrencias> ocorrencia;
	private Vector <Pena> pena;
	
	//Contrutores
	public Detento(){
		
	}
		
	public Detento(String nome, String cpf, Date nascimento, String sexo,
			String observacoes) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.observacoes = observacoes;
		this.ocorrencia = new Vector<Ocorrencias>();
		this.pena = new Vector<Pena>();
	}

	
	// Gets e Sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Vector<Ocorrencias> getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Vector<Ocorrencias> ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Vector<Pena> getPena() {
		return pena;
	}

	public void setPena(Vector<Pena> pena) {
		this.pena = pena;
	}
	
	//Metodos
	
	public int calcularTotalPena(){
		int total=0;
		for(Pena p:pena){
			total+=p.getDuracaoMeses();
		}
		return total;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Detento){
			Detento dObj = (Detento)obj;
			/*return this.equals(dObj);*/
			if( this.nome.equalsIgnoreCase(dObj.nome))
			return true;
			else
				return false;
		}else{
			return true;
		}
		
	}
		
	
	
	
	
	
}
