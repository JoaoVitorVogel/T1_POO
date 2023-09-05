package org.example;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    private static final double PESO_MAXIMO  = 5;
    private static final int ENTIDADES_INICIAIS = 10;
    private static final int CAPACIDADE_CARGA = 6;

    static Garagem garagem = new Garagem();

    public static void criaEmpresa() {

        for(int i = 0; i < ENTIDADES_INICIAIS ; i++){
            garagem.cadastrarLocomotiva(i, PESO_MAXIMO);
            garagem.cadastrarVagao(i, CAPACIDADE_CARGA);
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
                criaTrem();
                break;
            case "2":
                do {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Digite a opção do que você deseja alterar no trem:    ");
                    System.out.println("1.  Adicionar uma locomotiva ao trem                  ");
                    System.out.println("2.  Adicionar um vagão ao trem                        ");
                    System.out.println("3.  Remover o último LOCOMOTIVA do trem                    ");
                    System.out.println("7.  Remover o último VAGAO do trem                    ");
                    System.out.println("4.  Listar as locomotivas livres                      ");
                    System.out.println("5.  Listar os vagões livres                           ");
                    System.out.println("6.  Encerrar edição do trem                           ");
                    System.out.println("------------------------------------------------------");
                    String opcaoEdicao = keyboard.next();
                    switch (opcaoEdicao) {
                        case "1":
                            adicionaLocomotiva();
                            boolean travaAddLocomotiva = true;
                            do{
                                escolheMenu("de edição do trem");
                                String menuAddLocomotiva = keyboard.next();
                                switch (menuAddLocomotiva) {
                                    case "1":
                                        travaAddLocomotiva = false;
                                        break;
                                    case "2":
                                        travaAddLocomotiva = false;
                                        switchEdicao = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                }   
                            }   while(travaAddLocomotiva == true);
                            break;

                        case "2":
                            adicionaVagao();
                            boolean travaAddVagao = true;
                            do{
                                escolheMenu("de edição do trem");
                                String menuAddVagoes = keyboard.next();
                                switch (menuAddVagoes) {
                                    case "1":
                                        travaAddVagao = false;
                                        break;
                                    case "2":
                                        travaAddVagao = false;
                                        switchEdicao = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                }   
                            }   while(travaAddVagao == true);
                            break;
                        case "3": //remove locomotiva
                            try {
                                System.out.println("Insira o ID do trem:");
                                int idTrem = keyboard.nextInt();
        
                                garagem.desacoplarLocomotiva(garagem.getTrem(idTrem));
                                System.out.println(garagem);
                            } catch (InvalidParameterException e) {
                                System.out.println(e.getMessage());
                            } catch (InputMismatchException e){
                                System.out.println("Input invalido");
                                keyboard.nextLine();
                            }
                            boolean travaRemoveVagoes = true;
                            do{
                                escolheMenu("de edição do trem");
                                String menuRemoveVagoes = keyboard.next();
                                switch (menuRemoveVagoes) {
                                    case "1":
                                        travaRemoveVagoes = false;
                                        break;
                                    case "2":
                                        travaRemoveVagoes = false;
                                        switchEdicao = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                }   
                            }   while(travaRemoveVagoes == true);
                            break;

                        case "7": //remove vagao
                            try {
                                System.out.println("Insira o ID do trem:");
                                int idTrem = keyboard.nextInt();
        
                                garagem.desacoplarVagao(garagem.getTrem(idTrem));
                                System.out.println(garagem);
                            } catch (InvalidParameterException e) {
                                System.out.println(e.getMessage());
                            } catch (InputMismatchException e){
                                System.out.println("Input invalido");
                                keyboard.nextLine();
                            }
                            break;
                        case "4":
                            boolean travaMostralocomotivas2 = true;
                            do{
                                escolheMenu("de edição do trem");
                                String menuMostraLocomotivas2 = keyboard.next();
                                switch(menuMostraLocomotivas2){
                                    case "1":
                                        travaMostralocomotivas2= false;
                                        break;
                                    case "2":
                                        travaMostralocomotivas2 =false;
                                        switchEdicao = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                };
                            }while(travaMostralocomotivas2 == true);
                            break;
                        case "5":
                            boolean travaMostraVagoes2 = true;
                            do{
                                escolheMenu("de edição do trem");
                                String menuMostraVagoes2 = keyboard.next();
                                switch (menuMostraVagoes2) {
                                    case "1":
                                        travaMostraVagoes2 = false;
                                        break;
                                    case "2":
                                        travaMostraVagoes2 = false;
                                        switchEdicao = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                }   
                            }   while(travaMostraVagoes2 == true);
                            break;
                        case "6":
                            switchEdicao = false;
                            break;
                        default:
                            opcaoInvalida();
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
                    System.out.println("        1.  Mostrar ALGUMA COISA            ");
                    System.out.println("        2.  Mostrar todos as locomotivas livres       ");
                    System.out.println("        3.  Voltar ao menu principal                  ");
                    System.out.println("------------------------------------------------------");
                    String opcaoGaragem = keyboard.next();
                    switch (opcaoGaragem) {
                        case "1":
                        try {
                            System.out.println("Insira a ID da unidade: (eg: 'L1', 'V2')");
                            String input = keyboard.next().toUpperCase();
                            if(input.startsWith("L")){
                                String idChar = input.replace("L", "");
                                int id = Integer.parseInt(idChar);
    
                                try {
                                    System.out.println("Unidade alocada ao: T" + garagem.inspecionarLocomotiva(id));
                                } catch (InputMismatchException e){
                                    System.out.println(e.getMessage());
                                }
                            } else if(input.startsWith("V")){
                                String idChar = input.replace("L", "");
                                int id = Integer.parseInt(idChar);
    
                                try {
                                    System.out.println("Unidade alocada ao: T" + garagem.inspecionarVagao(id));
                                } catch (InputMismatchException e){
                                    System.out.println(e.getMessage());
                                }
                            } else {
                                System.out.println("O ID inserido nao e valido");
                            }
    
                        } catch (InvalidParameterException e){
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e){
                            System.out.println("Input invalido");
                            keyboard.nextLine();
                        }
                            boolean travaMostraVagoes = true;
                            do{
                                escolheMenu("da garagem");
                                String menuMostraVagoes = keyboard.next();
                                switch (menuMostraVagoes) {
                                    case "1":
                                        travaMostraVagoes = false;
                                        break;
                                    case "2":
                                        travaMostraVagoes = false;
                                        switchGaragem = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                }   
                            }   while(travaMostraVagoes == true);
                            break;
                        case "2":
                            boolean travaMostralocomotivas = true;
                            do{
                                escolheMenu("da garagem");
                                String menuMostraLocomotivas = keyboard.next();
                                switch(menuMostraLocomotivas){
                                    case "1":
                                        travaMostralocomotivas = false;
                                        break;
                                    case "2":
                                        travaMostralocomotivas =false;
                                        switchGaragem = false;
                                        break;
                                    default:
                                        opcaoInvalida();
                                        break;
                                };
                            }while(travaMostralocomotivas == true);
                            break;
                        case "3":
                            switchGaragem = false;
                            break;
                        default:
                            opcaoInvalida();
                            break;
                    }
                } while (switchGaragem == true);
                break;
            case "4":
                System.out.println(garagem);
                    break;
            case "5":
                try {
                    System.out.println("Insira o ID do trem:");
                    int idTrem = keyboard.nextInt();

                    garagem.desfazerTrem(garagem.getTrem(idTrem));
                    System.out.println(garagem);
                } catch (InvalidParameterException e){
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e){
                    System.out.println("Input invalido");
                    keyboard.nextLine();
                }
                break;
            case "6":
                System.out.println("------------------------------------------------------");
                System.out.println("               **Fim do programa**                    ");
                System.out.println("------------------------------------------------------");
                return false;
            default:
                opcaoInvalida();
                break;          
        }
        return true;
    }

    public static void opcaoInvalida(){
        System.out.println("------------------------------------------------------");
        System.out.println("                Opção inválida                        ");
        System.out.println("------------------------------------------------------");
    }

    public static void escolheMenu(String nomeMenu){
        System.out.println("------------------------------------------------------");
        System.out.println("           Escolha o que deseja fazer                 ");
        System.out.println("        1. Voltar ao menu "+nomeMenu                   );
        System.out.println("        2. Voltar ao menu principal                   ");
        System.out.println("------------------------------------------------------");
    }

    public static void criaTrem(){
        try {
            System.out.println("Insira um identificador para o trem:");
            int idTrem = keyboard.nextInt();

            garagem.cadastrarTrem(idTrem);
            System.out.println(garagem);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input invalido");
            keyboard.nextLine();
        }
    }

    public static void adicionaLocomotiva(){
        try {
            System.out.println("Insira o ID do trem:");
            int idTrem = keyboard.nextInt();

            System.out.println("Insira o ID da locomotiva");
            int idLocomotiva = keyboard.nextInt();

            garagem.alocarLocomotiva(garagem.getLocomotiva(idLocomotiva), garagem.getTrem(idTrem));
            System.out.println(garagem);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input invalido");
            keyboard.nextLine();
        }
    }

    public static void adicionaVagao(){
        try {
            System.out.println("Insira o ID do trem:");
            int idTrem = keyboard.nextInt();

            System.out.println("Insira o ID do vagao:");
            int idVagao = keyboard.nextInt();

            garagem.alocarVagao(garagem.getVagao(idVagao), garagem.getTrem(idTrem));
            System.out.println(garagem);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input invalido");
            keyboard.nextLine();
        }
    }
}
