package JAVA_STRINGS;
public class ReplaceLowercaseToUppercase {
    public static void main(String[] args) {
        String str1 = "Vish Fi, Qual Foi?" ;
        StringBuffer newStr = new StringBuffer(str1);

        for (int i = 0 ; i < str1.length(); i++) {
            if (Character.isLowerCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            } else if(Character.isUpperCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("A Frase depois da alteração é: " + newStr);
    }
}
