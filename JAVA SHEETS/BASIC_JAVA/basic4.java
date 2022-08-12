package BASIC_JAVA;
public class basic4 {
    public static void main(String[] args) {
        float p , r , t , si ; //Quantia principal , taxa , tempo e juros simples respectivamente.
        p = 13000;
        r = 12;
        t = 2;
        si = ( p * r * t ) / 100;
        System.out.println("Juros é : " + si);
        }
}
