package org.example;
import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
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
