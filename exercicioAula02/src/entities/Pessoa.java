package entities;

public class Pessoa {

	private Integer id;
	private String nome;
	private String sobrenome;


	public Pessoa() {

	}

	public Pessoa(Integer id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

}
