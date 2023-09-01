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
            System.out.println("2.  Abrir a garagem ");
            System.out.println("3.  Listar trens criados ");
            System.out.println("4.  Desfazer um trem");
            System.out.println("5.  Encerrar o programa");

            String opcao = keyboard.next();
            boolean switchEdicao = true;
            boolean switchGaragem = true;
            switch(opcao){
                case "1":
                    do{
                        System.out.println("Digite o a opção do que você deseja alterar no trem: ");
                        System.out.println("1.  Adicionar uma locomotiva ao trem ");
                        System.out.println("2.  Adicionar um vagão ao trem ");
                        System.out.println("3.  Remover o último vagão do trem ");
                        System.out.println("4.  Listar as locomotivas livres ");
                        System.out.println("5.  Listar os vagões livres ");
                        System.out.println("6.  Encerrar edição do trem ");
                        String opcaoEdicao = keyboard.next();
                            switch(opcaoEdicao){
                                case "1":
                                    //Add locomotiva
                                    break;
                                case "2":
                                    //Add vagão
                                    break;
                                case "3":
                                    //Remove the last big wagner
                                    break;
                                case "4":
                                    //Show the fredoom locmotives
                                    break;
                                case "5":
                                    //Show the big wagners frees
                                    break;
                                case "6":
                                    //End the process
                                    switchEdicao = false;
                                    break;
                                default:
                                    System.out.println("---------------------------------------------");
                                    System.out.println("            Opção inválida");
                                    System.out.println("---------------------------------------------");
                                    break;
                            }
                        } while(switchEdicao == true);
                    break;
                case "2":
                    do{
                        System.out.println("Escolha o que você deseja ver");
                        System.out.println("1.  Mostrar todos os vagões livres ");
                        System.out.println("2.  Mostrar todos as locomotivas livres ");
                        System.out.println("3.  Voltar ao menu principal");
                        String opcaoGaragem = keyboard.next();
                            switch(opcaoGaragem){
                                case "1":
                                    //Mostrar Os wagners
                                    break;
                                case "2":
                                    //mostrar as loco
                                    break;
                                case "3":
                                    //sair da garagem
                                switchGaragem = false;
                                    break;
                                default:
                                    System.out.println("---------------------------------------------");
                                    System.out.println("            Opção inválida");
                                    System.out.println("---------------------------------------------");
                                    break;
                            }
                    }while(switchGaragem == true);
                    break;
                case "3":
                //listar trens
                    break;
                case "4":
                //Explode the train
                    break;
                case "5":
                    System.out.println("---------------------------------------------");
                    System.out.println("            Fim do programa");
                    System.out.println("---------------------------------------------");
                    return false;                     
                default:
                System.out.println("---------------------------------------------");
                System.out.println("        Opção inválida tente novamente       ");
                System.out.println("---------------------------------------------");
                    break;
        }
         return true;
    }
}
