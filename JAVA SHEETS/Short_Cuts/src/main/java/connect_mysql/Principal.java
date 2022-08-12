package connect_mysql;

import javax.swing.JOptionPane;

public class Principal {
	
	protected String url = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC";
	protected String username = "root";
	protected String password = "13579Rock";
	protected String DBname;
	protected String[] options = {"Criar", "Deletar","Ver","Inserir"};
	
	private String welcome() {
		
		int a = JOptionPane.showConfirmDialog(null,"O banco já existe?","Existe ou não?", JOptionPane.YES_NO_OPTION);
		
		switch(a){
		  case 0:
			DBname = JOptionPane.showInputDialog("Qual o nome do banco de dados: ");
			url = "jdbc:mysql://localhost:3306/" + DBname + "?useTimezone=true&serverTimezone=UTC";	
			break;
		  case 1:
			url = "jdbc:mysql://localhost:3306/pararaio?useTimezone=true&serverTimezone=UTC";
			Create_and_Delete.createDB(url, username, password);
			break;
	    }
		
		int b = JOptionPane.showOptionDialog(null, "Oque quer fazer?","Escolha",JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null,options,options[0]);
		
		switch(a) {
		   case 0:
			    Create_and_Delete.createTable(url,username,password);
			    break;
		   case 1:
			   Create_and_Delete.deleteDB(url,username,password);
			   break;
		   case 2:
			   Put_and_Consult.show();
			   break;
		   case 3:
			   /*Put_and_Consult.input();*/
		}
		return url;
	}
	
    public static void main(String[] args) {
		
    	Principal principal = new Principal();
		JOptionPane.showMessageDialog(null, "Bom dia");
		principal.welcome();		
	}

}
