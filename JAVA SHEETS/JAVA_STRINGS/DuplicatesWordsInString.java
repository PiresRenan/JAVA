package JAVA_STRINGS;
public class DuplicatesWordsInString {
    public static void main(String[] args) {
        String string = "Tres pratos de trigo, para tres tigres tristes.";
    int count ;

    string = string.toLowerCase();

    String words[] = string.split(" ");

    System.out.println("As palavras que repetem na frase dada são: ");
    for (int i = 0 ; i < words.length ; i++) {
        count = 1 ;
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                count++;
                words[j] = "0";
            }
        }
        if (count > 1 && words[i] != "0") {
            System.out.println(words[i]);
        }
    }
    }
}
