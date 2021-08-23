package principal;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		System.out.println("Aula 01 - Java WebDeveloper");

		Funcionario funcionario = new Funcionario();

		funcionario.setIdFuncionario(1);
		funcionario.setNome("Lucas de Oliveira");
		funcionario.setCpf("167.897.989-09");
		funcionario.setMatricula("1245");
		funcionario.setSalario(3000.00);

		// imprimindo os valores
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("\tId do Cliente......: " + funcionario.getIdFuncionario());
		System.out.println("\tNome do Cliente....: " + funcionario.getNome());
		System.out.println("\tEmail do Cliente...: " + funcionario.getCpf());
		System.out.println("\tCPF do Cliente.....: " + funcionario.getMatricula());
		System.out.println("\tCPF do Cliente.....: " + funcionario.getSalario());
		// criando um objeto para a classe ClienteRepository
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		try {
			funcionarioRepository.gravarArquivo(funcionario);
			System.out.println("\nDados gravados com sucesso!");
		} catch (Exception e) {
			System.out.println("\nErro ao gravar arquivo!");
			System.out.println(e.getMessage());
		}

	}
}