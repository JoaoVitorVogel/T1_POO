package org.example;
import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Vagao[] garagemVagao = new Vagao[100];

        garagemVagao[0] = new Vagao(12, 100, 0);
        System.out.println(garagemVagao[0].toString());

        for(int i = 0; i < 100; i++){
            garagemVagao[i] = new Vagao(i, 100, 0);
            System.out.println(i);
        }

        for(int i = 0; i < 100; i++){
            System.out.println(garagemVagao[i].toString());
            System.out.println(i);
        }

        while(menu());
     
    }

    public static boolean menu(){
            System.out.println("    Menu de opções");
            System.out.println("Digite a opção desejada");
            System.out.println("1.  Editar um trem ");
            System.out.println("2.  Listar trens criados ");
            System.out.println("3.  Desfazer um trem");
            System.out.println("4.  Encerrar o programa");

            String opcao = keyboard.next();
            switch(opcao){
                case "1":
                //editar o trem
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                    break;
                case "2":
                //listar trens
                    break;
                case "3":
                //desfazer o trem
                    break;
                case "4":
                    System.out.println("Fim do programa");
                    return false;
                     
                default:
                System.out.println("");
                System.out.println("Opção inválida tente novamente");
                System.out.println("");
                    break;
        }
         return true;
    }
}
