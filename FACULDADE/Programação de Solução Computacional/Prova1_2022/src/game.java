import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int finalizadas = 0;
		int total = 0;
		float porcentagem;
		String control;
		
		System.out.println("Quantos niveis o jogo tem?");
		total = entrada.nextInt();
		System.out.println("Quantos niveis foram concluidas?");
		finalizadas = entrada.nextInt();
		
		for(int i = 0 ; i < total ; i++) {
			System.out.println("Concluiu mais um nivel?");
			control = entrada.nextLine().toLowerCase();
			if(control.equals("sim")) {
				System.out.println("Parab�ns");
				finalizadas++;
				porcentagem = ((float)finalizadas / (float)total)*100;
				System.out.println("Voc� concluiu " + finalizadas + "/" + total + ".\n" +
				" sua porcentagem no jogo � " + porcentagem + "");
			}else { 
				i--;
			}
		}
		
		if(finalizadas == total){
		System.out.println("100% concluido, PARABEEEEEEEEEEEEEENS!!! platinou ein");
		}
		else {
			System.out.println("ERRADAO PARSA");
		}
	
	
	}
}