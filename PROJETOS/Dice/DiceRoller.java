package Dice;
import java.util.Random;
public class DiceRoller {
    /*
    DiceRoller(){
        //Variaveis LOCAIS
        Random random = new Random();
        int num = 0;
        roll(random,num);
    }
    */
    //Variaveis GLOBAIS
    Random random;
    int num = 0;
    DiceRoller(){
        random = new Random();
        roll(random,num);
    }
    void roll(Random random,int num){
        num = random.nextInt(6)+1;
        System.out.println(num);
    }
}
