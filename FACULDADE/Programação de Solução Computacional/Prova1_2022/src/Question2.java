
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int partidas_concluidas = 0;
		int partidas_total = 0;
		double porcentagem;
		String control;
		
		System.out.println("Quantas partidas o jogo tem?");
		partidas_total = sc.nextInt();
		
		for(int i = 0 ; i < partidas_total ; i++) {
			System.out.println("Concluiu mais uma fase?");
			control = sc.nextLine().toLowerCase();
			if(control.equals("sim") || control.equals("s") || control.equals("yes") || control.equals("y") ) {
				System.out.println("Parab�ns");
				partidas_concluidas++;
				porcentagem = ((double)partidas_concluidas / (double)partidas_total)*100;
				System.out.println("Voc� completou " + partidas_concluidas + "/" + partidas_total + ".\n" +
				"Isso equivale a " + porcentagem + "% do jogo.");
			}else {
				i--;
			}
		}
		
		System.out.println("FIM DE JOGO!");

	}

}
/*
 * Crie um algoritmo que leia um valor inteiro que representa o n�mero de fases
 *  que um jogador completou em um determinado jogo e outro valor inteiro que 
 *  representa o total de fases que existem neste mesmo jogo. O programa deve 
 *  imprimir na sa�da o percentual de fases que o jogador completou.
Dica: fa�a a convers�o de tipos, caso contr�rio a resposta ser�sempre�zero.
*/
