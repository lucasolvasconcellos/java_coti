package inputs;

import javax.swing.JOptionPane;

import enums.Sexo;

public class ClienteInput {

	public static Integer lerIdCliente() throws Exception {

		Integer idCliente = Integer.parseInt(JOptionPane.showInputDialog("Inform o seu Id CLIENTE:"));

		if (idCliente <= 0)
			throw new Exception("O id do cliente deve ser maior do que zero. ");

		return idCliente;
	}

	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("Inform o seu nome:").trim();

		if (nome.length() < 6)
			throw new Exception("O nome do cliente deve ser maior do que zero. ");

		return nome;

	}

	public static String lerEmail() throws Exception {

		String email = JOptionPane.showInputDialog("Inform o seu cpf:").trim();

		if (email.length() <= 7)
			throw new Exception("O cpf do cliente deve ser maior do que zero. ");

		return email;

	}

	public static String lerCpf() throws Exception {

		String cpf = JOptionPane.showInputDialog("Inform o seu cpf:").trim();

		if (cpf.length() != 6)
			throw new Exception("O cpf do cliente deve ser maior do que zero. ");

		return cpf;

	}

	public static Sexo lerSexo() throws Exception {

		Integer sexo = Integer.parseInt(JOptionPane.showInputDialog(" (1)FEMININO, (2)MASCULINO: "));
		switch (sexo) {

		case 1:
			return Sexo.MASCULINO;
		case 2:
			return Sexo.FEMININO;

		default:
			throw new Exception("Tipo de sexo inválido.");

			
		}
	}

}
