package JAVA_FUNCTIONS;
public class SwapNumberFunction {
    public static void main(String[] args) {

        int a = 30 ;
        int b = 45 ;
        System.out.println("Antes de trocar, a = " + a + " e b = " + b );
        swapFunction(a , b) ;
        System.out.println("\n**Antes e depois de trocar os valores vão estar aqui**: ");
        System.out.println("Depois da troca, a = " + a + " e b é: " + b );

    }
    static void swapFunction(int a, int b){
        
        System.out.println("Antes da troca(dentro),a = " + a +" b = " + b);

        int c = a ;
        a = b ;
        b = c ;
        System.out.println("Depois da troca(dentro), a = " + a + " b = " + b) ;
    }
}
