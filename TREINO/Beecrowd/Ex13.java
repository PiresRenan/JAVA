package Beecrowd;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt() , B = sc.nextInt() , C = sc.nextInt();
        int i = Math.abs(A-B);
        sc.close();
        int maiorAB = (A + B + i) / 2 ;
        
        if (maiorAB > C) {
            System.out.println(maiorAB +" eh o maior");
        } else {
            System.out.println(C + " eh o maior");
        }

        int maior1 = A > B ? A : B ;
        int maior2 = maior1 > C ? maior1 : C ;

        System.out.println(maior2 + " maior por comparador ternario");
    }
    
}

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos 
seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a+b+abs(a-b)) / 2


Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, 
portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
