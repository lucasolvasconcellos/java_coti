package inputs;

import javax.swing.JOptionPane;

public class ServicoInput {
	
 public static Integer lerIdServico() throws Exception {
		
	Integer idservico = Integer.parseInt(JOptionPane.showInputDialog("Entre com o id do servico:"));
            
		
		if(idservico > 0) {
			
			return idservico;
		}
		else {throw new Exception
      ("O id do produto deve ser maior do que zero.");
		}
  			
	}
	
	
	public static String lerNome() throws Exception {
		
		String nome = JOptionPane.showInputDialog
        ("Entre com o nome do servico:");
		

		if(nome.trim().length() >= 6 && nome.trim().length() <= 150) {
			return nome;
			
		}
		else {
			
			throw new Exception
        ("O nome do produto deve ter de 6 a 150 caracteres.");
			
		}
	}
	
	
		public static String lerDescricao() throws Exception {
			
			String descricao = JOptionPane.showInputDialog
	    ("Entre com o nome do servico:");
			

			if(descricao.trim().length() >= 6 && descricao.trim().length() <= 150) {
				return descricao;
			}
			
			else {
				throw new Exception
	   ("O descricao do produto deve ter de 6 a 150 caracteres.");
			}
		}

	
	
	public static Double lerPreco() throws Exception {
		
		Double preco = Double.parseDouble(JOptionPane
         .showInputDialog("Entre com o preço do produto:"));
		
		if(preco > 0) {
			return preco;
		}
		else {
			throw new Exception
      ("O preço do produto deve ser maior do que zero.");
		}
	}
	
	
}
 


