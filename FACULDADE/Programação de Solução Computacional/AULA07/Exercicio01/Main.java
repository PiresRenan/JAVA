package Exercicio01;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int resp = JOptionPane.showConfirmDialog(null, "O carro � novo(0KM)?","Primeira fase", JOptionPane.YES_NO_OPTION);
		
		if(resp == 0) {
			Car car = new Car(
			          JOptionPane.showInputDialog("Marca do carro:"),
			          JOptionPane.showInputDialog("Modelo do carro:"),
			          Double.parseDouble(JOptionPane.showInputDialog("Consumo m�dio do carro(em KM/L):"))
			          );
			car.walk();
			//JOptionPane.showMessageDialog();
		}
		else if(resp == 1) {
			Car car = new Car(
			          JOptionPane.showInputDialog("Marca do carro:"),
			          JOptionPane.showInputDialog("Modelo do carro:"),
			          Double.parseDouble(JOptionPane.showInputDialog("Quantidade de combust�vel no carro(em Litros):")),
			          Double.parseDouble(JOptionPane.showInputDialog("Consumo m�dio do carro(em KM/L):")),
			          Double.parseDouble(JOptionPane.showInputDialog("Quilometragem inicial do carro(em KM):"))
			          );
			car.walk();
			car.toString();
		}
		else {
			JOptionPane.showMessageDialog(null, "At� mais!", null, 0);
		}
	}
	/*
		car.refull();
		
		System.out.println("O carro � um(a): "+ car.toString());
		*/
}


