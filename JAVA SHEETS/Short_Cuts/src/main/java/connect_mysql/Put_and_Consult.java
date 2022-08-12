package connect_mysql;

//IMPORT PACOTES NECESSARIOS
import java.sql.*;

import javax.swing.JOptionPane;
class Put_and_Consult extends Principal{
	//Declarando variaveis como geral para poder usar mais de uma vez e para diferentes finalidades
	//NOME DA URL ONDE ESTA LOCALIZADO O BANCO DE DADOS E "?use..." PARA SETAR O HORARIO CERTO
	private String url;
	//USUARIO E SENHA DO BANCO
	private String username = "root";
	private String password = "13579Rock";
	private String query;

	public static void input() {
		//TRY E CATCH NECESSARIO PARA QUE NAO QUEBRE O BANCO
		/*try {
			//Estabelecer conexão com o banco
			Connection connection = DriverManager.getConnection(url,username,password);
			//QUERY SQL QUE IRA SER UTILIZADA PARA A INSERÇÃO DE DADOS EM UM BANCO
			query = "INSERT INTO" + Create_and_Delete.DBname + "(name, age) VALUES (?,?)";
			//CRIANDO UM OBJETO CONECTADO QUE PODE IR E VIR DENTRO DO BANCO
			PreparedStatement statement = connection.prepareStatement(query);
			//METODO SET
			statement.setString(1, "asd");
			//EXECUTA UM UPDATE NO BANCO
			statement.executeUpdate();
			//FECHA O OBJETO
			statement.close();
			//ENCERRA A CONEXÃO
			connection.close();
			
		} catch (SQLException e) {
			System.out.print("ERROR");
			e.printStackTrace();
		}*/
	}
	
	public static void show() {
		/*try {
			Connection connection = DriverManager.getConnection(url,username,password);

			query = "SELECT * FROM usuario";
			
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			int count = 0;
			while(result.next()) {
				String id = result.getString(1);
				String firstname = result.getString(2);
				String age = result.getString("age");
				count++;
				JOptionPane.showMessageDialog(null,"ID: " + id +  "\nNome: " + firstname + "\nIdade: " + age);
			}
			connection.close();
		} 
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, "ERRO");
			e.printStackTrace();
		}*/
	}
}