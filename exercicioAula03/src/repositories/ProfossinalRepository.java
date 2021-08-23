package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Profissonal;

public class ProfossinalRepository {

	public void exportarDados(Profissonal profissonal)throws Exception {
			
			PrintWriter writer = new PrintWriter
			(new File("c:\\temp\\PROFISSONAL.txt"));
			
			writer.println("\nDADOS DO FORNECEDOR:\n");
			
			writer.println("\tId do fornecedor.: "
			 + profissonal.getIdProfissonal());
			
			writer.println("\tNome.............: "
			+ profissonal.getNome());
			
			writer.println("\tCNPJ.............: "
			+ profissonal.getCpf());
			
			writer.println("\tQtd de produtos..: "
			+ profissonal.getTelefone());
			
			writer.println("\tQtd de produtos..: "
			+ profissonal.getProfissonal());
			
			
			
			for(Servico s : profissonal.getServicos()) {
				
			writer.println("\nDADOS DO PRODUTO:");
			
			
			writer.println("\tId do produto....: "
			+ s.getIdServico());
			
			writer.println("\tNome.............: "
			+ s.getNome());
	
			
			writer.println("\tQuantidade.......: "
			+ s.getDescricao());
			
            	
	        writer.println("\tPreço............: "+ s.getPreco());
			
            }

            writer.flush(); //salvar
             writer.close(); //fechar
       }
   }

