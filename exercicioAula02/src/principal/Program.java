package principal;

import entities.Endereco;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(1, "Lucas", "Olievira");

		Endereco endereco = new Endereco(1, "PROG", "Programador JAVA", "987", "Engenho Novo", "Rio de Janeiro",
				"20.950.34-0");

		pessoa.setEndereco(endereco);

		System.out.println("\nDADOS DE PESSOA:\n");
		System.out.println("ID....: " + pessoa.getId());
		System.out.println("NOME..: " + pessoa.getNome());
		System.out.println("SOBRENOME...: " + pessoa.getSobrenome());

		System.out.println("ID DA FUN플O....: " + pessoa.getEndereco().getId());
		System.out.println("SIGLA...........: " + pessoa.getEndereco().getLogradouro());
		System.out.println("DESCRI플O.......: " + pessoa.getEndereco().getComplemento());
		System.out.println("ID DA FUN플O....: " + pessoa.getEndereco().getNumero());
		System.out.println("SIGLA...........: " + pessoa.getEndereco().getBairro());
		System.out.println("DESCRI플O.......: " + pessoa.getEndereco().getCidade());
		System.out.println("SIGLA...........: " + pessoa.getEndereco().getEstado());
		System.out.println("DESCRI플O.......: " + pessoa.getEndereco().getCep());

	}

}
