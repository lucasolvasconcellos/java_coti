package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Profissonal;
import entities.Servico;
import inputs.ProfissonalInput;
import inputs.ServicoInput;

public class Program {

	public static void main(String[] args) {

		Profissonal profissonal = new Profissonal();

		try {
			profissonal.setIdProfissonal(ProfissonalInput.lerIdProfissonal());

			profissonal.setNome(ProfissonalInput.lerNome());

			profissonal.setCpf(ProfissonalInput.lerCpf());

			profissonal.setCpf(ProfissonalInput.lerTelefone());

			List<Servico> ListaDeServicos = new ArrayList<Servico>();

			System.out.println("\nLENDO OS DADOS DO SEGUNDO PRODUTO:\n");

			Servico servico1 = new Servico();

			servico1.setIdServico(ServicoInput.lerIdServico());
			servico1.setNome(ServicoInput.lerNome());
			servico1.setDescricao(ServicoInput.lerDescricao());
			servico1.setPreco(ServicoInput.lerPreco());

			ListaDeServicos.add(servico1);

			System.out.println("\nLENDO OS DADOS DO SEGUNDO PRODUTO:\n");

			Servico servico2 = new Servico();

			servico2.setIdServico(ServicoInput.lerIdServico());
			servico2.setNome(ServicoInput.lerNome());
			servico2.setPreco(ServicoInput.lerPreco());
			servico2.setDescricao(ServicoInput.lerDescricao());

			ListaDeServicos.add(servico2);

			profissonal.setServicos(ListaDeServicos);

			System.out.println("\nDADOS DO FORNECEDOR:\n");

			System.out.println("\tId do fornecedor.: " + profissonal.getIdProfissonal());

			System.out.println("\tNome.............: " + profissonal.getNome());

			System.out.println("\tCNPJ.............: " + profissonal.getCpf());

			System.out.println("\tQtd de produtos..: " + profissonal.getTelefone());
			
			System.out.println("\tQtd de produtos..: " + profissonal.getProfissonal());
			
			
			for (Servico s : profissonal.getServicos()) {

				System.out.println("\nDADOS DO PRODUTO:");

				System.out.println("\tId do produto....: " + s.getIdServico());

				System.out.println("\tNome.............: " + s.getNome());

				System.out.println("\tPreço............: " + s.getPreco());

				System.out.println("\tPreço............: " + s.getDescricao());

			}
		}

		catch (Exception e) {

			System.out.println("\nErro: " + e.getMessage());

		}

	}
}