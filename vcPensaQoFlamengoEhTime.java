import java.util.Scanner;

public class vcPensaQoFlamengoEhTime {

    public static void main(String[] args){

        Scanner scany = new Scanner(System.in);

        System.out.println("Você pensa que o Flamengo é time? [Sim] ou [Não]");

        String pensa = scany.nextLine();

        if(pensa.toLowerCase().equals("sim")){
            System.out.println("Time é o Vasco da Gama!");
        } else{
            System.out.println("O FLAMENGO É SELEÇÃO P****!!!!");
        }

    }
}