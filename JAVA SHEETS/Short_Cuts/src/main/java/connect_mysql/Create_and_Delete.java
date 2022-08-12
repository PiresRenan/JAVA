package connect_mysql;

import java.sql.*;
import javax.swing.*;
class Create_and_Delete {
	
	static String   DBname;
	static String   query;
	static String   name;
	static String   nomeAtt;
	static String   tipo;
	
	public static void createTable(String url, String username, String password) {
		
		try {
			
			Connection connection = DriverManager.getConnection(url, username, password);
			name = JOptionPane.showInputDialog("Escolha um nome para a Table: ");
			nomeAtt = JOptionPane.showInputDialog("Escolha um nome para variavel: ");
			tipo= JOptionPane.showInputDialog("Escolha um tipo para variavel: ");
			query = "create table " + name + "(" + nomeAtt + "   " + tipo + ");";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate(query);
			statement.close();
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void createDB(String url, String username, String password) {
		try {
			
			Connection connection = DriverManager.getConnection(url, username, password);
			name = JOptionPane.showInputDialog("Escolha um nome para o Banco de Dados: ");
			query = "create database " + name + ";";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate(query);
			statement.close();
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteDB(String url, String username, String password) {
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			name = JOptionPane.showInputDialog("Qual banco de dados deseja excluir?");
			query = "drop database " + name + ";";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate(query);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
