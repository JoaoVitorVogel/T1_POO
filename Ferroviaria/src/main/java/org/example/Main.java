package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static Vagao[] garagemVagao = new Vagao[100];
    static Vagao[] garagemManobraVagao = new Vagao[100];
    static Locomotiva[] garageLocomotiva = new Locomotiva[10];
    static Locomotiva[] garagemManobrLocomotiva = new Locomotiva[10];
    static Composicao[] patioTrem = new Composicao[10];

    public static void criaEmpresa() {
        for (int i = 0; i < 100; i++) {
            garagemVagao[i] = new Vagao(i, 100, 0);
        }
        for (int i = 0; i < 10; i++) {
            garageLocomotiva[i] = new Locomotiva(i, 1500, 15, 0);
        }
    }

    public static void main(String[] ARGS) {
        criaEmpresa();
        while (menu())
            ;
    }

    public static boolean menu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Seja Bem-vindo(a) ao centro de controle da ferroviária ");
        System.out.println("-------------------------------------------------------");
        System.out.println("|                 Menu de opções                      |");
        System.out.println("|           Digite a opção desejada                   |");
        System.out.println("|            1.  Criar um trem                        |");
        System.out.println("|            2.  Editar um trem                       |");
        System.out.println("|            3.  Abrir a garagem                      |");
        System.out.println("|            4.  Listar trens criados                 |");
        System.out.println("|            5.  Desfazer um trem                     |");
        System.out.println("|            6.  Encerrar o programa                  |");
        System.out.println("|-----------------------------------------------------|");
        String opcao = keyboard.next();

        // Travas menu
        boolean switchEdicao = true;
        boolean switchGaragem = true;

        switch (opcao) {
            case "1":
                // Create a train
                break;
            case "2":
                do {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Digite a opção do que você deseja alterar no trem:    ");
                    System.out.println("1.  Adicionar uma locomotiva ao trem                  ");
                    System.out.println("2.  Adicionar um vagão ao trem                        ");
                    System.out.println("3.  Remover o último vagão do trem                    ");
                    System.out.println("4.  Listar as locomotivas livres                      ");
                    System.out.println("5.  Listar os vagões livres                           ");
                    System.out.println("6.  Encerrar edição do trem                           ");
                    System.out.println("------------------------------------------------------");
                    String opcaoEdicao = keyboard.next();
                    switch (opcaoEdicao) {
                        case "1":
                            // Add locomotiva
                            break;
                        case "2":
                            // Add vagão
                            break;
                        case "3":
                            // Remove the last big wagner
                            break;
                        case "4":
                            mostraLocomotivas();
                            break;
                        case "5":
                            mostraVagoes();
                            break;
                        case "6":
                            switchEdicao = false;
                            break;
                        default:
                            System.out.println("------------------------------------------------------");
                            System.out.println("                Opção inválida");
                            System.out.println("------------------------------------------------------");
                            break;
                    }
                } while (switchEdicao == true);
                break;
            case "3":
                do {
                    System.out.println("------------------------------------------------------");
                    System.out.println("                 Menu de opções                       ");
                    System.out.println("------------------------------------------------------");
                    System.out.println("           Escolha o que você deseja visualizar       ");
                    System.out.println("        1.  Mostrar todos os vagões livres            ");
                    System.out.println("        2.  Mostrar todos as locomotivas livres       ");
                    System.out.println("        3.  Voltar ao menu principal                  ");
                    System.out.println("------------------------------------------------------");
                    String opcaoGaragem = keyboard.next();
                    switch (opcaoGaragem) {
                        case "1":
                            mostraVagoes();
                            break;
                        case "2":
                            mostraLocomotivas();
                            break;
                        case "3":
                            switchGaragem = false;
                            break;
                        default:
                            System.out.println("------------------------------------------------------");
                            System.out.println("                Opção inválida");
                            System.out.println("------------------------------------------------------");
                            break;
                    }
                } while (switchGaragem == true);
                break;
            case "4":
                mostraTrens();
                break;
            case "5":
                // Explode the train
                break;
            case "6":
                System.out.println("------------------------------------------------------");
                System.out.println("            Fim do programa");
                System.out.println("------------------------------------------------------");
                return false;
            default:
                System.out.println("------------------------------------------------------");
                System.out.println("        Opção inválida tente novamente                ");
                System.out.println("------------------------------------------------------");
                break;
        }
        return true;
    }

    public static void mostraVagoes() {
        System.out.println("Aqui está a lista com todos os vagóes livres no momento");
        for (int i = 0; i < 100; i++) {
            System.out.println(garagemVagao[i].toStringSemComposicao());
        }
    }

    public static void mostraLocomotivas() {
        System.out.println("Aqui está a lista com todas as locomotivas livres no momento");
        for (int i = 0; i < 10; i++) {
            System.out.println(garageLocomotiva[i].toStringSemComposicao());
        }
    }

    public static void mostraTrens() {
        System.out.println("Aqui está a lista com todos os trens criados no momento");
        for (int i = 0; i < patioTrem.length; i++) {
            if (patioTrem[i] == null) {

            } else {
                System.out.println(patioTrem[i].toString());
            }
        }
    }
}
