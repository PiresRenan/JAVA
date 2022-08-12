package BASIC_JAVA;
public class basic12 {
    public static void main(String[] args) {

        //Declarando um numero octal.
        String octalString = "121" ;

        //Convertendo numero octal em decimal.
        int decimal = Integer.parseInt(octalString, 8) ;

        //Mostrando numero decimal convertido
        System.out.println("Decimal convertido de 121 : " + decimal );
        System.out.println("Decimal convertido de 23 : " + Integer.parseInt("23" , 8 ));
        System.out.println("Decimal convertido de 10 : " + Integer.parseInt("10" , 8 ));
    }
}
