package inputs;

import javax.swing.JOptionPane;

public class ProfissonalInput {

	public static Integer lerIdProfissonal() throws Exception {

		Integer idProfissonal = Integer.parseInt(JOptionPane.showInputDialog("entre com id do profissional"));

		if (idProfissonal > 0) {

			return idProfissonal;

		}

		else {
			throw new Exception("o id do profissonal deve ser maior do que zero");
		}

	}

	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("entre com nome do profissional:");

		if (nome.trim().length() >= 6 && nome.trim().length() <= 150) {

			return nome;

		}

		else {
			throw new Exception("Nome do pronecedor deve ter entre 6 e 150 caracteres.");
		}

	}

	public static String lerCpf() throws Exception {

		String cpf = JOptionPane.showInputDialog("entre com cpf do profissional");

		if (cpf.trim().length() <= 10 && cpf.trim().length() <= 18) {

			return cpf;

		}

		else {
			throw new Exception("cpf deve cpnter de 10 a 18 caracter.");
		}

	}

	public static String lerTelefone() throws Exception {

		String telefone = JOptionPane.showInputDialog("entre com telefone do profissional");

		if (telefone.trim().length() <= 10 && telefone.trim().length() <= 18) {
			return telefone;
		}

		else {
			throw new Exception("telefone tem que ter no minimo 18 caracter.");
		}
	}

}
