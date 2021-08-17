package entities;

import java.util.List;

public class Profissonal {

	private Integer idProfissonal;
	private String nome;
	private String cpf;
	private String telefone;
	private List<Profissonal> profissonal;

	public Profissonal() {

	}

	public Profissonal(Integer idProfissonal, String nome, String cpf, String telefone, List<Profissonal> profissonal) {
		super();
		this.idProfissonal = idProfissonal;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.profissonal = profissonal;
	}

	public Integer getIdProfissonal() {
		return idProfissonal;
	}

	public void setIdProfissonal(Integer idProfissonal) {
		this.idProfissonal = idProfissonal;
	}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Profissonal> getProfissonal() {
		return profissonal;
	}

	public void setProfissonal(List<Profissonal> profissonal) {
		this.profissonal = profissonal;
	}

	public void setServicos(List<Servico> listaDeServicos) {
		// TODO Auto-generated method stub
		
	}

	public Object getServicos() {
		
		return null;
	}

	

}
