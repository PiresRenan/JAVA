package BASIC_JAVA;
//CONTADOR DE CARACTERES

public class basic11 {
    public static void main(String[] args) {
        String str = "liquidificador helicoptero chines ao vivo a cores" ;
        int[] freq = new int [str.length()];
        int i , j ;

        //convertendo uma string em um chr array
        char string[] = str.toCharArray();

        for (i = 0 ; i < str.length() ; i++ ) {
            freq[i] = 1 ;
            for (j = i + 1 ; j < str.length() ; j++) {
                if (string[i] == string[j]) {
                    freq[i]++ ;
                    //Colocando a str[j] para 0 sem mostrar o caracter visitante.
                    string[j] = '0'; 
                }
            }
        }
        //Mostra cada caracter e sua frequencia correspondente.
        System.out.println("Chrs e suas frequencias correspondentes : ");
        for (i = 0 ; i < freq.length ; i++ ) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + "-" + freq[i]);
            }
        }
    }
}