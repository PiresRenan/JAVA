package JAVA_STRINGS;
public class CountPunctuation {
    public static void main(String[] args) {
        int CountPunctMarks = 0 ;
        String str = "Bom dia! Sr. James Potter. Já tomou seu café da manhã?";
        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||
            str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == ':' ||str.charAt(i) == '\"' ) {
                CountPunctMarks++;
            }
        }
        System.out.println("O total de pontuação existentes nessa frase é: "+ CountPunctMarks);
    }
    
}