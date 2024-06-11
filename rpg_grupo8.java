package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rpg_grupo8 {

    //Função para tempo nas mensagens.
    public static void Texto(String texto, TimeUnit unit, long tempo_texto) throws InterruptedException { 
        for (char caractere : texto.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_texto);
        }

    }
    //tempo do texto
    static int temp_dialog = 0, temp_instrucoes = 15;

    //Pegar nome do jogador.
    public static String principal() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println(".::::::::::::::::: MATHEMATICAL MINDS :::::::::::::::::.\n");
        System.out.println("Bem-vindo Guardião, como você gostaria de ser chamado?\n");
        name = input.nextLine();
        Texto("\nCerto, Guardião " + name + ".\n\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        return name;
    }

    //Função de exibir menu.
    public static int menu_Escolha(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(".:::::::::::::::::::::::::: MENU ::::::::::::::::::::::::::::::.\n");
            System.out.printf("""
                              __________________________________________________
                                           .------------.
                                     ,===:'.,       ____ `-._
                                     `:.`---.____       `-._
                                            `:.     `--.         `.
                                              \\.        `.         `.
                                      (,,(,    \\.         `.   ____,-`.,
                                   (,'     `/   \\.   ,--.___`.'
                                ,  ,'  ,--.  `,   \\.;'         `
                                `{M, {    \\  :    \\;
                                  T,,'    /  /    //
                                  M;;    /  ,' ,-//.    ,---.      ,
                                  \\;'   /  ,' /  _  \\  /  _  \\   ,'/
                                        \\   `'  / \\  `'  / \\  `.' /
                                         `.___,'   `.__,'   `.__,'  
                              __________________________________________________
                              """);
            System.out.println("              Mathematical minds");

            System.out.println("\n[1] - Jogar.  [2] - Créditos.  [3] - Instruções.  [4] - Sair.\n");
            System.out.println(".::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.");
            opcao = input.nextInt();
            if (opcao > 4 || opcao < 1) {
                System.out.println("Opções Inválidas!");
            }
        } while (opcao > 4 || opcao < 1);

        return opcao;
    }
    //Função do menu
    public static void menu(int opcao, String name) throws InterruptedException {
        do {
            switch (opcao) {
                case 1:
                    historia(name);
                    break;
                case 2:
                    creditos(name);
                    break;
                case 3:
                    intrucoes(name);
                    break;
                case 4:
                    sair(name);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao == 1 || opcao == 2 || opcao == 3);
    }

    //História do jogo.
    static void historia(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int cap;

        Texto("\nHISTÓRIA:\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("NARRADOR : Em uma ilha chamada Algebraria, a matemática reina suprema sob o sábio Rei Totalis.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("No entanto, um dragão maligno conhecido como \"Error\" ameaça a cidade, buscando desequilibrar as equações.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Para proteger Algebraria, foi preciso chamar os Guardiões matemáticos, representando operações matemáticas fundamentais.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\nE para ajudar esses guardiões, surgiu um novo Protetor na ilha de Algebraria, um mero morador local, chamado " + name + " .\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Cada região da cidade é governada por um Guardião Elemental, mas todos trabalham juntos para manter o equilíbrio.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Com a ameaça crescente de Error, os Guardiões e o Rei Totalis se unem para proteger a cidade do caos iminente,\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("desencadeando uma grande aventura onde a batalha entre a ordem e o caos é travada nos campos da matemática e do coração humano.\n", TimeUnit.MILLISECONDS, temp_dialog);
        // Selecionar cap.
        do {
            System.out.println("\nSelecione o capítulo que você gostaria de jogar :");
            System.out.println("\n[1] Capítulo 1 - O ataque ao reino. \n[2] Capítulo 2 - O Labirinto.\n[3] Capítulo 3 - Batalha Final."); 
            cap = input.nextInt();
        } while (cap < 1 || cap > 3);

        if (cap == 1) {
            capitulo_1(name);
        }else if(cap == 2){
            capitulo_2(name);
        }else if (cap == 3)
            capitulo_3(name);
    }

    //Cap 1.
    static void capitulo_1(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int dialog, dialog_2, dialog_3, dialog_4, dialog_5, dialog_6, dialog_7, dialog_8, dialog_9, dialog_10, dialog_11, dica_1, aviso;
        Texto("\n--------CASTELO DO REI TOTALIS--------\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Olá, Addictus!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Olá, Guardião, por acaso seria você o " + name + " ?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Sim, eu vim para ajudar vocês a derrotarem esse vilão\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Que bom ter você aqui para nos ajudar! Você está bem?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Sim \n[2] Mais ou menos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog = input.nextInt();
        //interção com o jogador.
        switch (dialog) {
            case 1: {
                Texto(name + " : Sim. Estou empenhado a derrotar este vilão!\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Que ótimo! Vamos, precisamos nos apressar.\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            }
            case 2: {
                Texto(name + " : Na verdade não, estou meio triste com essa situação.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Se alegre, meu guerreiro, temos que combater esse ERROR que está a nos ameaçar.\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            }
            default: {
                Texto(name + " : {...}\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Opá amigo, vejo que você não está em um dia muito bom. Mas iremos continuar avançando na nossa missão!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            }
        }
        Texto("Me chamo Addictus, sou um dos guardiões que cuida do reino. Hoje é um dia muito importante.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Todos os guardiões foram convocados para vir até o palácio falar com o rei! Vamos nos sentar todos\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("com o Rei Totalis para discutir sobre essa ameaça!\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("\nAddictus : Você já sabe quem são os guardiões?", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Sim. \n[2] Não.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_2 = input.nextInt();

            switch (dialog_2) {
                case 1: {
                    Texto(name + " : Sim, eu já os conheço. Os Guardiões são guerreiros lendários!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : Ah, que ótimo! Aliás, quem não os conhece rsrs.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                case 2: {
                    Texto(name + " : Tenho apenas um conhecimento superficial sobre vocês.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : Os guardiões são formados por 4 Guerreiros, irei falar de cada um!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Dividus, o guardião da divisão.\nMultiplucus, o guardião da multiplicação.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Subtractus, o guardião da subtração.\nAddicus, vulgo eu. Sou o guardião da adição.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                default:
                    Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (dialog_2 != 1 && dialog_2 != 2);

        Texto("\nVamos, vamos entrar no palácio, o Rei Totalis está chamando!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador : Todos os Guardiões se reuniram com seu rei no palácio.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Rei Totális : BOM DIA A TODOS!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Bom Dia Magestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Bom Dia Magestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Bom Dia Magestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Bom Dia Magestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: Ei Novato, Responda o seu Rei!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Bom dia!. \n[2] Olá!\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_3 = input.nextInt();
            switch (dialog_3) {
                case 1:
                    Texto("\nBom Dia, Majestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2: {
                    Texto(name + " : Olá, Majestade.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : Desculpe, majestade, ele é novo aqui!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("{...}\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : " + name + ", você deveria responder \"Bom Dia, Majestade.\"\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto(name + " : Bom dia, Majestade!.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                default:
                    Texto("\nCaro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (dialog_3 != 1 && dialog_3 != 2);
        Texto("\nRei Totális : Guardiões Elementais, obrigado por virem tão prontamente.\nComo vocês sabem, nossa ", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("amada Algébrica está enfrentando uma ameaça sem precedentes.\nError, o vilão anti matemática ", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("está causando estragos em nossa cidade.\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("\nAddictus : Majestade, estamos prontos para enfrentar qualquer desafio que ameace nosso reino.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Sim, Rei Totalis. Não permitiremos que Error perturbe o equilíbrio matemático de Algebraria.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Estamos ao seu serviço, majestade. Juntos, vamos derrotar essa ameaça.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : A subtração é uma ferramenta poderosa, e usaremos nossos conhecimentos matemáticos para neutralizar o error.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("[1] Estou disposto a ajudar.", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[2] Não estou muito confiante.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_4 = input.nextInt();

            switch (dialog_4) {
                case 1: {
                    Texto(name + " : Estou disposto a ajudar no que for preciso majestade! Pode contar comigo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Rei Totális: Ótimo escutar isso " + name + "! Muito Obrigado em ajudar na defesa do nosso reino.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                case 2: {
                    Texto(name + " : Não estou muito confiante. Será uma boa ideia enfrentar ele?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("\nRei Totális : Mas é claro guerreiro! Estamos com os mais fortes e corajosos guerreiros!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Você está com a responsabilidade de guiá-los com sua inteligência.", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Se acalme, tudo vai dar certo, e vamos sair vitoriosos!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                default: {
                    Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
            }
        } while (dialog_4 != 1 && dialog_4 != 2);
        Texto("Rei Totális : Estou confiante em suas determinações, meus valentes Guardiões Elementais. Enviei mensageiros ", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("para buscar ajuda dos reinos vizinhos, mas precisamos agir rapidamente para proteger nosso povo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\nAddictus : Entendido, majestade. Partiremos imediatamente para enfrentar essa ameaça.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Vamos garantir que a Algébrica permaneça um lugar de equilíbrio e harmonia.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Nossas habilidades matemáticas serão nossa maior arma contra o Error.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : E não permitiremos que nada perturbe a paz de nosso reino.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Rei Totalis : Que a luz da matemática guie seus passos, Guardiões Elementais. Que vocês retornem vitoriosos, trazendo a paz de volta a Álgebra.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Continuar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_5 = input.nextInt();

            switch (dialog_5) {
                case 1:
                    Texto(name + " : Ok, Vamos nessa!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                default:
                    Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (dialog_5 != 1);
        Texto(" (Saindo do palácio…) \n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Residente : GUARDIÕES, GUARDIÕES!! SOCORRO!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Tem um monstro anti matéria destruindo tudo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Se acalme, estamos aqui para ajudá-los!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Nos informe as caracteristicas dele por favor\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Residente : Ele é muito estranho, não tem uma forma certa.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Ele tem cores distorcidas, uma movimentação fluida\nolhos vermelhos e formas matemáticas ficam se movendo em volta dele! \n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Muito obrigado. \n[2] Dê-me mais informações.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_6 = input.nextInt();

            switch (dialog_6) {
                case 1: {
                    Texto(name + " : Muito obrigado pelas informações!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Divíduos : Em que direção o monstro foi?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Residente : Sentido a praça central.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Divíduos : Certo, iremos atrás dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Residente : Por favor, resolvam isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                case 2: {
                    Texto(name + " : Você teria mais alguma informação?.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Residente : Ele foi sentido a praça central.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto(name + " : Certo, obrigado. Iremos fazer o máximo para derrotar esse monstro.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                default: {
                    Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
            }
        } while (dialog_6 != 1 && dialog_6 != 2);

        Texto("\nDivíduos : Ei, esse só pode ser o Discrepância!Capanga miserável do ERROR.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Sim, só pode ser ele mesmo!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("uma das  habilidades dele são. Ilusões Matemáticas: Discrepância pode criar ilusões complexas que\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("distorcem a percepção dos outros sobre números, equações e padrões matemáticos, isso pode \n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("fazer com que os oponentes cometam erros de cálculo ou ajam com base em informações falsas.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Ele também tem a habilidade de “Distorção Numérica”: Ele pode distorcer os valores numéricos de\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("objetos, pessoas ou habilidades, fazendo com que pareçam maiores ou menores do que realmente\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("são. Isso pode afetar a precisão de ataques ou a eficácia de certas habilidades.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Pessoal, FOCO! Precisamos detê-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[2] Continuar a escutar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_7 = input.nextInt();

            switch (dialog_7) {
                case 1:
                    Texto(name + " : Pessoal, FOCO! Precisamos detê-lo. \nse ficarmos falando aqui sobre as habilidades dele e não formos atrás. Ele vai destruir cada vez mais coisas!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Texto("...", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                default:
                    Texto("Caro jogador, digite uma opção válido!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }

            Texto("Addictus : Discrepância é capaz de criar ambientes onde as regras matemáticas\nnormais não se aplicam, causando confusão e desorientação em seus oponentes.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Isso pode incluir terrenos que mudam constantemente, portais matemáticos para dimensões\ndistorcidas ou até mesmo quebra-cabeças matemáticos impossíveis de resolver.\n", TimeUnit.MILLISECONDS, temp_dialog);

        } while (dialog_7 != 1 && dialog_7 != 2);
        Texto("\nSubtrac: Ei pesssoal, qual o plano?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Temos dois caminhos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Nós separar ou irmos todos juntos. Oque vocês acham?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Prefiro todos nós irmos juntos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Concordo com o Multiplus!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Ei " + name + " qual a sua opinião?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Ir todos juntos.\n[2] Discordar.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        //interção com o jogador.
        do {
            dialog_8 = input.nextInt();

            switch (dialog_8) {
                case 1:
                    Texto(name + " : Vamos pessoal, juntos somos mais fortes!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Texto(name + " : Será que ir juntos é a melhor opção? Acho que deveriamos nos separar.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("\nAddictus : Você está doido? Se formos sozinhos, ele vai acabar com a gente um por um.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("\nMultiplus : Sim! Juntos somos mais fortes.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto(name + "\nOk!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                default:
                    System.out.println("\nCaro jogador, digite uma opção válida!\n");
                    break;
            }
        } while (dialog_8 != 1 && dialog_8 != 2);

        Texto("\n--------INDO EM DIREÇÃO A PRAÇA--------\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Ei pessoal, olha ele ali!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Vamos nos aproximar, mas com cuidado guardiões\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Guardiões, ele está se aproximando! Preparem-se para o confronto!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Temos que agir rápido! Discrepância não vai nos dar trégua.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Fiquem alertas! Suas ilusões podem nos confundir.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Não podemos deixar que suas distorções nos abalem. Juntos, podemos vencê-lo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("(Discrepância surge diante dos guardiões, envolto em suas ilusões matemáticas)\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Discrepância : Ah, os valentes Guardiões Elementais! Que surpresa encontrá-los aqui.\nEstão prontos para serem derrotados pelas minhas habilidades?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Não subestime o poder da matemática, Discrepância! Estamos aqui para restaurar o equilíbrio em Algebraria.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Suas ilusões não nos intimidam! Vamos mostrar a ele o poder da multiplicação!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Prepare-se para ser neutralizado, Discrepância! Nossos cálculos estão afiados como lâminas.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Você pode distorcer os números, mas não pode distorcer a determinação dos Guardiões Elementais!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador : (A batalha se intensifica, com os guardiões usando suas habilidades matemáticas para contra-atacar as ilusões de Discrepância)\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus :" + name + ", você tem o conhecimento sobre equação de 1º? precisamos resolver esse problema para dar dano no Discrepância\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Já tenho conhecimento de equação de 1º GRAU. \n[2] Gostaria de saber como funciona a equação de 1º.\n", TimeUnit.MILLISECONDS, temp_dialog);
        dica_1 = input.nextInt();
        //Dica da conta pro jogador.
        switch (dica_1) {
            case 1:
                Texto(name + " : Eu consigo enfraquecer o Discrepância!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            case 2:
                Texto(name + " : EU NÃO SEI COMO RESOLVER ESSE PROBLEMA!.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus :" + name + ", fique calmo, irei te dar um exemplo de como fazer.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                do {
                    Texto("---------------------- DICA EQUAÇÃO DE 1º GRAU -----------------------------------\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Exemplo: 8x +3 = 27\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Primeiro, devemos mover o termo 3 para o outro lado da equação.\nFaremos isso subtraindo 3 de ambos os lados:\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("8x+3-3=27-3\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("8x=24\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Agora que isolamos x, simplificamos a equação dividindo ambos os lados por 8:\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("8x/8 = 24/8.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Portanto, o valor de x é 3.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("------------------------------------------------------------------------------------\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : " + name + ", você entendeu como funciona?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("[1] Sim. \n[2] Não\n", TimeUnit.MILLISECONDS, temp_dialog);

                    dica_1 = input.nextInt();
                    if (dica_1 == 1) {
                        Texto(name + " : Sim, muito obrigado, Addictus. Agora conseguirei enfraquecer o Discrepância!\n", TimeUnit.MILLISECONDS, temp_dialog);
                        Texto("Addictus : É isso ai!" + name + "!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    } else if (dica_1 == 2) {
                        Texto(name + " : Desculpa Addictus, não consegui entender.\n", TimeUnit.MILLISECONDS, temp_dialog);
                        Texto("Addictus : Não tem problema " + name + ", vamos tentar mais uma vez!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    }
                } while (dica_1 != 1);

        }
        Texto("Multiplus : Vamos " + name + " Nos ajude a dar dano nele. Precisamos resolver essa conta de Equação 1ºGRAU!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Pode deixar comigo Multiplus!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("Caro Jogador, você terá um limite de 3 tentativas \nSe você utilzar todas as tentativas o jogo será finalizado.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Continuar \n[2] Desistir\n", TimeUnit.MILLISECONDS, temp_dialog);
        aviso = input.nextInt();
        //interção com o jogador.
        do {
            switch (aviso) {
                case 1:
                    Texto("O game continuará\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    sair(name);
                    break;
                default:
                    Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (aviso != 1 && aviso != 2);

        contasPg(name);
        Texto("Discrepância : Ah Seus malditos! irei acabar com todos vocês! \n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : O " + name + " Conseguiu!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n\nAddictus : Ele está enfraquecendo! Não podemos recuar agora!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Vamos concentrar nossos esforços! Juntos, podemos superá-lo!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Sintam a força da subtração! Cada equação resolvida é um golpe em direção à vitória!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Não vamos parar até que o equilíbrio seja restaurado em Algebraria!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Vamos resolver mais essa equação!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        contasPg(name);
        Texto("\n\nDiscrepância : (coff, coff, coff) Não é possível, fui derrotado por esses pivetes.\nSeus bastardos, meu mestre irá acabar com vocês e essa Algebraria irá cair em ruínas.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("Addictus : Conseguimos! Algebraria está a salvo mais uma vez.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : A matemática sempre prevalece sobre o caos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Nossa união e determinação foram fundamentais para essa vitória.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Que essa batalha sirva como exemplo de que juntos somos invencíveis!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Muito bem pessoal! \n[2] Não se animem!\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_9 = input.nextInt();
        //interção com o jogador.
        do {
            switch (dialog_9) {
                case 1:
                    Texto(name + " : Muito bem pessoal, Conseguimos!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Texto(name + " : Não se animem pessoal, ainda temos muito pela frente.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Multiplus : O " + name + " tem razão, temos que manter o foco.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Divíduos : Concordo!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                default:
                    System.out.println("\nCaro jogador, digite uma opção válida!\n");
                    break;
            }
        } while (dialog_9 != 1 && dialog_9 != 2);

        Texto("\n\nNarrador : O monstro deu seu último suspiro e se desfez em pó, os Guardiões conseguiram proteger a cidade.\nAs pessoas gritaram com alegria com a vitória de seus guardiões.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Mas não foi muito longe, pois no mesmo momento houve um estrondo na cidade e começou um terremoto, a \nAlgebraria se estremece e a poeira fica no ar, mulheres e crianças gritam por socorro.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("\"THUD!\" \"THUD!\" \"THUD!\"\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : QUE ESTRONDO FOI ESSE?!.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : EU NÃO SEI!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Algo está errado, nunca senti uma tremor tão forte em Algebraria!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Concordo, isso é muito estranho. Devemos descobrir o que está acontecendo imediatamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Ir ajudar os moradores \n[2]procurar por pistas\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_11 = input.nextInt();
        //interção com o jogador.
        switch (dialog_11) {
            case 1:
                Texto(name + " : Primeiro devemos ajudar os moradores.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto(" Narrador : Os Guardiões decide ir ajudar os moradores. Correndo pelas ruas, eles veem casas danificadas e pessoas assustadas.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Algumas pessoas estão presas sob os escombros, e outras estão tentando conter incêndios que começaram após o terremoto.\n", TimeUnit.MILLISECONDS, temp_dialog);

                break;
            case 2:
                Texto(name + ": Vamos averiguar pessoal. Alguma coisa me diz que esse tremor tem a ver com ERROR.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Narrador: O grupo decide procurar por pistas sobre a origem do estrondo. Enquanto investigam os arredores, encontram \nUm rastro de destruição que parece ter sido causado por alguma entidade poderosa.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Fragmentos de pedra e destroços estão espalhados pelo chão, e marcas estranhas adornam as paredes das construções próximas.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Há indícios de que algo muito maior do que um simples terremoto aconteceu aqui. O grupo decide seguir as pistas e descobrir o que está por trás desse evento.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                break;
            default:
                Texto("Opção inválida! Você fica parado, sem saber o que fazer diante da situação.\n", TimeUnit.MILLISECONDS, temp_dialog);
                // Outras ações a serem tomadas em caso de escolha inválida...
                break;
        }

        Texto("Narrador : De repente surge um alguém coberto de poeira, que se dirige aos Guardiões.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("Subtract : Olhem, Alguém está vindo ai.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Parece ser o Mensageiro\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("Mensageiro: Meus senhores, acabamos de receber informações do reino do Leste. Esse ataque foi causado pelas tropas de um dos aliados do Error, onde nossos\nEspiões conseguiram identificar que o inimigo está marchando em direção a eles.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Foi informado que é o \"EQUATROM!\", este é o braço direito do DRAGÃO ERROR!\nSe ele conseguir tomar a cidade do Leste, estaremos em sérios apuros, pois a estrada principal do reino passa por lá.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("[1] Continuar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_10 = input.nextInt();
        //interção com o jogador.
        do {
            switch (dialog_10) {
                case 1:
                    Texto(name + " : Vamos Nessa Pessoal, precisamos derrotar Equatrom para chegar até Error.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                    break;
                default:
                    System.out.println("\nCaro jogador, digite uma opção válida!\n");
                    break;
            }
        } while (dialog_10 != 1);

        capitulo_2(name);
    }
    //cap 2
    static void capitulo_2(String name) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int opcao1,opcao2;
        Texto("Segundo capítulo...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: Após a intensa batalha com Discrepância e a notícia da ameaça de Equatrom, os Guardiões Elementais partiram em direção ao reino do Leste\n No entanto, a jornada estava longe de ser simples. No meio do caminho, encontraram um enorme e intricado labirinto que se estendia por quilômetros\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: Parece que teremos que passar por esse labirinto para continuar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus: Eu ouvi falar sobre este lugar. Dizem que é um labirinto matemático cheio de armadilhas e enigmas.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos: Não temos escolha. Se queremos alcançar Equatrom e impedir Error, temos que passar por aqui.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract: Vamos lá, pessoal. Juntos, conseguiremos resolver qualquer enigma.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: Os Guardiões entraram no labirinto, que logo se revelou cheio de desafios matemáticos. As paredes eram cobertas de inscrições e cada encruzilhada\n apresentava um novo enigma a ser resolvido.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: " + name + " Você está pronto para ajudar com os enigmas? Precisamos resolver esses problemas para avançar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("1 - Sim!\n2 - Não, preciso de ajuda.\n", TimeUnit.MILLISECONDS, temp_dialog);

        opcao1 = ler.nextInt();
        do {
            switch (opcao1) {
                case 1:
                    Texto("Sim!! Vamos nessa.",TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                //case de ajuda da conta.       
                case 2:
                    Texto("Preciso de ajuda com os enigmas.\nAddictus : não se preocupe! Vou te ensinar.",TimeUnit.MILLISECONDS, temp_dialog);

                    break;
                default:
                    System.out.println("Digite um valor valido!");
            }
        } while (opcao1 != 1 && opcao1 != 2);

        if ( opcao1 == 2){
            System.out.printf("No segundo capítulo vamos trabalhar com equação de segundo grau e potenciação.\n");
            System.out.printf("Para resolver a equação de segundo grau, primeiro precisamos indentifiar os coeficientes da equação.");
            System.out.printf("Exemplo: x²- 4x + 3 = 0.\n\n A = 1, B = -4, C = 3.\n\n");
            System.out.printf("Depois disso precisamos aplicar a fórmula de bhaskara.\n");
            System.out.printf("X = -B+- a raiz quadrada de b² - 4.a.c Dividido por 2.a.\n");
            System.out.printf("No final vamos ter dois números! X¹ e X².\nQue no caso dessa equação será 3 e 1.\n\n");
            System.out.printf("Já na potenciação, é so fazer o número vezes ele mesmo pelo tanto de vezes que ele está elevado. Como exemplo : 5³\nCinco elevado a 3 da =  125, isso significa que estamos multiplicando 5 por ele mesmo\n");
            System.out.printf("três vezes. Em termos matemáticos, é como se disséssemos 5 x 5 x 5. Quando multiplicamos esses números juntos, obtemos 125 como resultado.\n\n");
        }
        

        Texto("Addictus: Excelente! Vamos começar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: A primeira encruzilhada apresentava um enigma simples, mas crucial uma equação de 2º grau.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Então vamos resolver essa equação.", TimeUnit.MILLISECONDS, temp_dialog);
        ContasSg(name);
        Texto("Narrador: Avançando pelo labirinto, os Guardiões encontraram um novo enigma em\numa câmara iluminada por cristais brilhantes.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus: Este parece mais complexo. Vamos resolver juntos.\n", TimeUnit.MILLISECONDS, temp_dialog);
        ContasSg(name);
        Texto("Divíduos: Muito bem! Vamos continuar\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: Cada passo pelo labirinto trazia um novo desafio matemático.\nOs Guardiões precisavam de todo o seu conhecimento para avançar. Após horas de resolução de enigmas\n, finalmente chegaram ao centro do labirinto, onde uma figura familiar aguardava.", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Equatrom: Vocês chegaram longe, mas este é o fim da linha para vocês!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: Não subestime o poder da matemática e da união!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Resolva essa potenciação para enfraquecer Equatom\n", TimeUnit.MILLISECONDS, temp_dialog);
        ContasPo(name);
        Texto("Addictus Muito bem "+ name + "!\n", TimeUnit.MILLISECONDS, temp_dialog);
        ContasPo(name);
        Texto("Divídus : estamos enfraquecendo ele! Continuem.\n", TimeUnit.MILLISECONDS, temp_dialog);
        contasPg(name);
        Texto("Narrador: A batalha final com Equatrom começou. Os Guardiões usaram tudo o que aprenderam para derrotá-lo.\nCom o conhecimento do jogador, resolveram o enigma final que enfraqueceu Equatrom.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Equatrom : NÃO ACRETIDO! NÃO ACREDITO, Seus...", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador : Equatrom cai no chão sem nem conseguir terminar sua frase. E os guardiões comemoram!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: Conseguimos! Algebraria está a salvo mais uma vez\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus: A matemática sempre prevalece sobre o caos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract: Nossa união e determinação foram fundamentais para essa vitória.", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract: Ei " + name + " qual foi a dificuldade da batalha para você?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] - facíl\n[2] - médio\n[3] - dificíl\n", TimeUnit.MILLISECONDS, temp_dialog);
        opcao2 = ler.nextInt();
        
        do { 
            switch (opcao2){
                case 1 : 
                    Texto("Muito facíl!",TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2 :
                    Texto("Senti uma pequena dificuldade.", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 3 : 
                    Texto("Muito complexo! Mas me esforcei ao maxímo e consegui resolver.", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                default :
                    System.out.println("informe um valor valido!");
            }
        }while ( opcao2 !=1 && opcao2 !=2 && opcao2 !=3);
        
        Texto("Divíduos: Que essa batalha sirva como exemplo de que juntos somos invencíveis!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: Com Equatrom derrotado, os Guardiões se prepararam para a próxima etapa de sua jornada\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("A ameaça de Error ainda pairava sobre Algebraria, mas eles estavam mais determinados do que nunca a proteger seu mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus: Vamos continuar, pessoal. A batalha ainda não acabou.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus: Isso mesmo. Não podemos descansar até que Error seja derrotado.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract: Vamos nessa!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: E assim, os Guardiões Elementais seguiram em direção ao próximo desafio, determinados a restaurar o equilíbrio em seu mundo.\n\nCapítulo 3...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        capitulo_3(name);
    }
    //cap 3
    static void capitulo_3(String name) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    int dialog_1, treinamento, escolha_final;
    
    // Adicione a lógica de narrativa e diálogos para o capítulo 2
    Texto("Narrador: Depois da derrota do braço direito de ERROR, o monstro “EQUATROM”, os guardiões seguem em direção ao lugar mencionado pelo inimigo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto(name + ": EQUATROM não foi uma batalha normal, esse foi difícil e se foi assim o ERROR será igual ou mais difícil.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("ADDICTUS: Exato, em uma batalha em eras passadas o ERROR nos deu muito trabalho, mas graças ao nosso rei TOTALIS, com toda a sua astúcia, conseguiu exilar"
        + " esse dragão, mas não esperava que algum dia ele conseguisse retornar desse exílio.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("DIVIDUOS: Exato, se conseguiu escapar pode ter certeza que ele está mais forte que antes.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("MULTIPLUS: Então pensem comigo, por mais que também somos mais fortes e com o auxílio do " + name + ", precisamos mais que uma estratégia simples.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("SUBTRACT: Tive uma ideia, vamos treinar a batalha dos POLINOMIOS.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("ADDICTUS: Opa, pera lá jovem guerreiro, essa é uma técnica milenar que não é simples de ser executada. E temos que ensinar ao " + name + ", deseja aprender?\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("[1] Sim \n[2] Não\n ", TimeUnit.MILLISECONDS, temp_dialog);
    dialog_1 = input.nextInt();
    
    do{
    switch (dialog_1){
    
        case 1 :
        Texto(name +": Conhecimento e poder é sempre bem vindo. Estou dentro, vamos começar logo pessoal\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("MULTIPLUS: Gostei, é assim que se fala de um verdadeiro Guardião.\n", TimeUnit.MILLISECONDS, temp_dialog);
        break;
        case 2 :
        Texto(name +": Não estou muito afim não, se é técnica milenar deve ser muito complexa.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ADDICTUS: Não desanime, mas concordo contigo não é simples mas é um ótimo poder e conhecimento, e com isso sua evolução é certa.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name +": Você tem razão Addictus, irei fazer o treinamento.\n", TimeUnit.MILLISECONDS, temp_dialog);
        break;
        default :
        System.out.printf("informe um valor valido!\n");
        break;
    }
    }while(dialog_1 !=1 && dialog_1 !=2);
    
    do{
        
    Texto("\n          .::::::::::::::::: TREINAMENTO :::::::::::::::::.    \n\n", TimeUnit.MILLISECONDS, temp_dialog);
    
        Texto("A(x) = 4x^3 + 2x - 5 e B(x) = +3x^3 + x^2 + x + 2\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Primeiro alinhe os polinômios :\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("A(x)  4x^3  + 0x^2  + 2x   - 5\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("B(x) +3x^3  + x^2   + x    + 2\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Some os coeficientes dos termos correspondentes:\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Para x^3 : 4x^3 = 3x^3 = 7x^3\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Para x^2 : 0x^2 + x^2 = x^2\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Para x : 2x + x = 3x\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Para as constantes : -5 + 2 = -3\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Portanto : A(x) + B(x) = 7x^3 + x^2 + 3x - 3\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("ADDICTUS: " +name+ ", você conseguiu executar o treinamento?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Sim \n[2] Não ", TimeUnit.MILLISECONDS, temp_dialog);
        treinamento = input.nextInt();
        
        switch(treinamento){
            
            case 1: 
            Texto(name + ": Sim, obrigado pelo treinamento.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("ADDICTUS: Muito bem, "+name+ ", vamos avançar.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto(name + ": Ok.\n", TimeUnit.MILLISECONDS, temp_dialog);
            break;
            
            case 2:
            Texto(name + ": Não addictus, eu preciso de mais tempo treinando.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("ADDICTUS: Ok,"+name+ ".\n", TimeUnit.MILLISECONDS, temp_dialog);
            break;
            default:
                System.out.println("informe um valor valido!");
        }
        }while(treinamento !=1);
        
        Texto("DIVIDUS: Vamos, precisamos correr pois o tempo agora é crucial.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("NARRADOR: Depois de fazer suas refeições e de levantar o acampamento, seguiram ao seu destino\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Depois de uma longa caminhada com os seus fortes cavalos, MULTIPLUS identificou uma torre de vigia.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name +": Estamos próximos.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador: Após ter avistado uma torre concluíram que realmente chegaram no lugar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Após olharem ao redor, constataram muitos soldados do inimigo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Decidiram entrar furtivamente, contra vontade de MULTIPLUS, pois por ele entraria na pancadaria.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("Foi avistado uma fortaleza alta e perceberam que seria ali onde ERROR estaria. Os\n" +
              "guardiões conseguiram entrar sem ser notados, até que conseguiram ouvir alguém falando\n" +
              "com raiva, era o inimigo ERROR.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Não é possível que EQUATROM foi derrotado, quem fez isso? \n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("SUBORDINADO: Pelo relato dos espias, foram os Guardiões do reino de TOTALIS.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Infelizes. Mande os comandantes iniciarem o ataque, não iremos perder mais\n" +
              "tempo em acabar com Algebraria.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("NARRADOR: Ouvindo isso ADDICTUS, com a sua coragem correu em direção de ERROR e\n" +
              "os guardiões o seguiram.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ADDICTUS: Sigam o plano, não desviem a sua atenção do inimigo ele é cruel e articuloso.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: O que significa isso? (espanto)\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto(".:::::::::::: INICIO DA BATALHA FINAL :::::::::::.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Acerte a conta a seguir para dar causar dano em ERROR\n", TimeUnit.MILLISECONDS, temp_dialog);
        contasPg(name);
        Texto("ERROR: Seu bastardo, de onde você saiu? Seu infeliz.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("SUBTRACT: Oohhhhh… belo golpe "+name+", isso vai deixar ele esperto.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("DIVIDUS: Peguei o SUBORDINADO, com isso a ordem aos generais não chegará.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("MULTIPLUS: Te encontramos ERROR, você não irá mais avançar diante no reino de", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Algebraria. Estamos aqui para detê-lo, nem que custe as nossas vidas\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ADDICUS: Iremos acabar de vez com você, não terá outra oportunidade de exílio.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Hahahahahahaha… É uma piada isso, só pode. Vocês não serão o suficiente para isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(".:::::::::::::::::::: SEGUNDO GOLPE :::::::::::::::::.\n", TimeUnit.MILLISECONDS, temp_dialog);
        ContasSg(name);
        Texto("ADDICUS: Muito bem "+name+", foi esperto acertou ele no ponto cego.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Coff, Coff, Coff… Grrrr….\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Maldição, seu inseto. Não terá outra oportunidade dessas. O mesmo golpe não irá funcionar comigo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("NARRADOR: SUBTRACT aproveita a deixa e aplica outro golpe, mas o vilão está esperto e\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("consegue bloquea-lo e contra golpeia com um ataque direto e certeiro.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Os Guardiões ficam em choque ao ver SUBTRACT cair desacordado e gravemente ferido\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ADDICUS: Miserável, você irá pagar por isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Vocês serão os próximos.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+": Seu patife, irei mostrar meu verdadeiro poder você não irá escapar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Hahahahahaha… Você? Não me faça rir, um inseto igual a você não é páreo contra mim.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+": Não me subestime, irei lhe mostrar o que significa querer ser um Guardião. Vou lhe aplicar o golpe Polinômios.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("ERROR: Não é possível que um verme igual a você, aprendeu esse golpe.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+": Sim, e você irá recebê-lo com todo o meu poder.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("DIVIDUS: "+name+", você realmente aprendeu esse golpe após o treinamento? Ele é muito difícil, nós guardiões estamos em treinamento para conseguir executar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+": Não se preocupe, antes de querer entrar para a elite dos Guardiões eu me dediquei bastante em aprender esse golpe.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("NARRADOR: Todos os guardiões ficaram em atenção máxima, e o ERROR ficou incrédulo com a ousadia do novo guardião.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

      
        
       Texto("Caro jogador, você só terá uma chance para conseguir aplicar o golpe que poderá salvar o reino de Algebraria\n" + 
            "escolha a opção correta:.\n", TimeUnit.MILLISECONDS, temp_dialog);  
       Texto("[1] Deseja continuar e salvar o reino? \n[2] Desistir.\n", TimeUnit.MILLISECONDS, temp_dialog);  
      escolha_final = input.nextInt();
      
      do{
      switch(escolha_final){
      
        case 1 :
           Texto("NARRADOR: O guardião mais novo da equipe toma a sua posição e começa a concentrar\n" +
                 "energia do universo matemático, e o ambiente fica estático onde pontos do local começam\n" +
                 "a soltar raios.\n", TimeUnit.MILLISECONDS, temp_dialog);
        break;
        case 2 :
            Texto("NARRADOR: Infelizmente o jogador, não achou que iria conseguir e desistiu da batalha,\n" +
                  "fazendo com que os guardiões perdesse para o inimigo, TERROR aplicou outro golpe que\n" +
                  "acertou os guardiões e esses não conseguiram continuar com a batalha devido a potência\n" +
                  "do golpe e o vilão TERROR seguiu com as suas tropas contra a Algebraria.\n", TimeUnit.MILLISECONDS, temp_dialog);
            System.exit(0);
        break;
        default :
            System.out.println("informe um valor valido!");
      }
      
      }while(escolha_final !=1 && escolha_final!=2);
      
      
      Texto("Claramente o vilão se adiantou para atrapalhar o seu adversário, pois o golpe que estava\n" +
            "por vir é extremamente perigoso e raramente visto.\n" +
            "E no exato momento em que iria aplicar o mesmo golpe que derrubou o guardião\n" +
            "SUBTRACT, o MULTIPLUS percebeu o movimento e dando um passo à frente, desferiu um\n" +
            "golpe, que estremeceu o lugar\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("O vilão ERROR foi derrubado, e ao se levantar foi nesse momento em que o grande golpe\n" +
            "místico veio, tão rápido como um raio em uma tempestade furiosa.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("Muito bem "+name+", escolha uma das opções corretas para conseguir vencer o inimigo.:\n\n", TimeUnit.MILLISECONDS, temp_dialog); 
      Texto(".:::::::::::: GOLPE FINAL :::::::::::.\n", TimeUnit.MILLISECONDS, temp_dialog);  
      SomaPolinomios();
      
      Texto("NARRADOR: Houve um clarão de cegar os olhos por alguns instantes e um forte estrono\n" +
            "como um terremoto de derrubar montanhas, e de repente um silêncio…\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("... Os Guardiões movendo a mão diante dos olhos do qual estava protegendo o rosto\n" +
            "devido ao clarão, olharam o JOGADOR à alguns passos depois de onde estava o inimigo\n" +
            "TERROR e com os punhos fechados e em volta dele saía uma fumaça.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("Quando perceberam que no chão estava uma grande sobra desenhada igualmente de\n" +
             "acordo como era o vilão ERROR.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("MULTIPLOS extremamente surpreso com tamanho poder que ali foi aplicado, começou a\n" +
             "gargalhar de felicidade.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("DIVIDUS começou a chorar de alegria e ao olhar que o amigo SUBTRACT havia\n" +
            "despertado.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("ADDICTUS foi até o novo guardião e no momento que chegou perto, o segurou. Pois o\n" +
            name+ ", cambaleou um pouco devido ao esforço que aplicou.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("ADDICTUS : Opa "+name+", não vá desmaiar agora hehehe, que a benção da matemática\n" +
            "esteja sempre contigo. Meu jovem, mas que golpe fantástico foi esse? O TERROR foi\n" +
            "desintegrado completamente, só se sobrou a sombra dele no chão de tão forte e rápido.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto(name+": Ufa, ufa, ufa… Preciso tomar um fôlego, acho que deu certo hehehe.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("MULTIPLUS: MEU AMIGO, que loucura foi essa hahahahaha… serei eternamente grato por\n" +
           "presenciar tamanho poder. Ainda bem que está do nosso lado hahahaha…\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("NARRADOR: DIVIDUS trazendo SUBTRACTS pelos ombros.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("DIVIDUS: Jovem que maravilha. Nunca vi algo do tipo.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("SUBTRACT: "+name+ ", agradeço por se juntar a nós, e só estou de pé por sua causa, ou\n" +
            "quase em pé hehehe… aí.. aí..\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("ADDICUS: Bom trabalho, vamos deixar a comemoração para depois e retornar para\n" +
            "Algebraria, cuidar dos ferimentos de SUSBTRACT, relatar ao rei sobre a vitória e sobre a\n" +
            "façanha do nosso Guaridão "+name+".\n" +   
            "Mas antes teremos um pequeno trabalho do lado de fora, ainda tem as tropas do inimigo.\n" + 
            "Precisamos dizimá-las para que esse mau não crie raízes.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("NARRADOR: Falando isso os guardiões saíram do local e ao olhar no horizonte, viram só\n" +
            "poeira cinza de desfazendo no ar. Se olharam e deram um grande grito de vitória.\n" +
            "As tropas do inimigo se desfez no momento que o grande vilão foi vencido.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("Retornaram ao grande reino de ALGEBRARIA, relataram ao rei TOTALIS onde realizou\n" +
             "grande festa em homenagem aos grandes GUARDIÕES e em especial com honrarias ao\n" +
             "grande GUARDIÃO "+name+".\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("O reino voltou a ficar em segurança com os lendários GUARDIÕES, os cidadãos de\n" +
            "ALGEBRARIA estão em paz.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("FIM.\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        System.exit(0); 
        
    }    
        
        
    //Função de créditos que é exibida no menu.
    static void creditos(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int retornar;
        Texto("Centro Universitário Senac - Santo Amaro.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Projeto Integrador - Prof. Dr. Eduardo Takeo Ueda.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Projeto Semestral - 2024.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto(".:::::::: Desenvolvedores ::::::::.", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("\n1 João Paulo Gomes Silva \n2 Alex Araújo Reis \n3 Gabriel Oliveira Quintino \n4 Rafael Oliveira Quintino \n5 Rodrigo Pereira Gama\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        System.out.println("");
        Texto("[1] - Retornar ao Menu\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        retornar = input.nextInt();
        do {
            switch (retornar) {
                case 1:
                    int escolha = menu_Escolha(name);
                    menu(escolha, name);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (retornar == 1);

    }

    //Função de instruções do jogo. É exibida no meu.
    static void intrucoes(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int retornar_1;
        Texto(".:::::::: INSTRUÇÕES DO JOGO ::::::::.", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("\n\nBem-vindo ao Reino de Algebraria!\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Você está prestes a embarcar em uma jornada épica como um guardião do reino. Suas decisões e\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("habilidades matemáticas determinarão o destino de Algebraria. Siga estas instruções para navegar\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("pelo jogo e ajudar a derrotar a ameaça do vilão Error e seus capangas.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto(".:::::::: OBJETIVO DO JOGO ::::::::. ", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("\n\nO objetivo é ajudar os Guardiões Elementais a defender o Reino de Algebraria das ameaças\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("matemáticas causadas por Error. Tome decisões sábias, resolva equações e use suas habilidades\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("matemáticas para derrotar os inimigos.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        Texto(".:::::::: INICIAR O JOGO. ::::::::. \n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("O jogo começa com uma introdução onde você é saudado por Addictus, um dos guardiões do reino.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        // Tomar Decisões
        Texto(".:::::::: TOMAR DECISÕES ::::::::.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Durante o jogo, você será apresentado com várias opções de resposta. Digite o número da opção que você deseja escolher e pressione Enter.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Exemplo : Se perguntado \"1 - Sim \\n2 - Mais ou menos!\", digite 1 ou 2 para fazer sua escolha.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        // Conversar com Personagens
        Texto(".:::::::: CONVERSAR COM PERSONAGENS ::::::::.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Interaja com diferentes personagens, incluindo outros guardiões e o Rei Totalis.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Suas respostas podem influenciar a narrativa, então escolha sabiamente.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        // Resolver Equações
        Texto(".:::::::: RESOLVER EQUAÇÕES ::::::::. \n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Em determinados momentos, você precisará resolver equações matemáticas para progredir.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("A função responsavél será chamada para apresentar equações que você deve resolver.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        // Seguir as Narrativas
        Texto(".:::::::: SEGUIR AS NARRATIVAS ::::::::. \n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Preste atenção às descrições e diálogos. Eles fornecerão informações importantes para suas decisões e estratégias.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        // Repetir as Ações
        Texto(".:::::::: REPETIR AS AÇÕES ::::::::. \n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Algumas escolhas podem exigir que você tente novamente até fornecer uma resposta válida.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Siga as instruções de repetição fornecidas pelo jogo para continuar.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);

        do {
            Texto("[1] - Retornar ao Menu\n", TimeUnit.MILLISECONDS, temp_instrucoes);

            retornar_1 = input.nextInt();

            switch (retornar_1) {
                case 1:
                    int escolha = menu_Escolha(name);
                    menu(escolha, name);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (retornar_1 == 1);
    }
    //Função para sair do jogo.
    static void sair(String name) {
        System.out.println("Obrigado por jogar, " + name + "! Até a próxima.");
        System.exit(0);
    }
    //main
    public static void main(String[] args) throws InterruptedException {
        String nome = principal();
        int escolha = menu_Escolha(nome);
        menu(escolha, nome);
        int opcao2;
    }

    //Função de conta. Primeiro grau.
    public static int contasPg(String name) {
        Random rand = new Random();
        int aleat = rand.nextInt(3);
        Scanner ler = new Scanner(System.in);
        boolean sc = false;
        int vida = 0;
        boolean gameOver = false;
        List<String> alt = new ArrayList<>();
        List<String> alt2 = new ArrayList<>();
        List<String> alt3 = new ArrayList<>();

        alt.add("X = 2");
        alt.add("X = 5");
        alt.add("X = 1");
        alt.add("X = 3");

        alt2.add("X = 4");
        alt2.add("X = 2");
        alt2.add("X = 3");
        alt2.add("X = 5");

        alt3.add("X = 3");
        alt3.add("X = 4");
        alt3.add("X = 5");
        alt3.add("X = 2");


        switch (aleat) {
            case 0: {
                do {
                    Collections.shuffle(alt);
                    Collections.shuffle(alt);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : 5x + 7 = 17?");
                    System.out.println("a) " + alt.get(0));
                    System.out.println("b) " + alt.get(1));
                    System.out.println("c) " + alt.get(2));
                    System.out.println("d) " + alt.get(3));

                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt.get(0).equals("X = 2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt.get(1).equals("X = 2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt.get(2).equals("X = 2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt.get(3).equals("X = 2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 1: {

                do {
                    Collections.shuffle(alt2);
                    Collections.shuffle(alt2);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : 3X -4 = 8?");
                    System.out.println("a) " + alt2.get(0));
                    System.out.println("b) " + alt2.get(1));
                    System.out.println("c) " + alt2.get(2));
                    System.out.println("d) " + alt2.get(3));
                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt2.get(0).equals("X = 4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt2.get(1).equals("X = 4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt2.get(2).equals("X = 4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt2.get(3).equals("X = 4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 2: {

                do {
                    Collections.shuffle(alt3);
                    Collections.shuffle(alt3);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : 7X + 2 = 23");
                    System.out.println("a) " + alt3.get(0));
                    System.out.println("b) " + alt3.get(1));
                    System.out.println("c) " + alt3.get(2));
                    System.out.println("d) " + alt3.get(3));
                    System.out.print("Escolha uma resposta: ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt3.get(0).equals("X = 3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt3.get(1).equals("X = 3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt3.get(2).equals("X = 3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt3.get(3).equals("X = 3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
        }
        if (!sc) {
            System.out.println("Você esgotou suas tentativas. O jogo foi encerrado!.");
            System.exit(0);
        }
        return aleat;
    }

    //Função de conta. Segundo grau.
    public static int ContasSg(String name) {
        Random rand = new Random();
        int aleat = rand.nextInt(3);
        Scanner ler = new Scanner(System.in);
        boolean sc = false;
        int vida = 0;
        boolean gameOver = false;
        List<String> alt = new ArrayList<>();
        List<String> alt2 = new ArrayList<>();
        List<String> alt3 = new ArrayList<>();
        
        alt.add("x¹ = 3 e x² = 1");
        alt.add("x¹ = 4 e x² = 2");
        alt.add("x¹ = -1 e x² = 3");
        alt.add("x¹ = 3 e x² = -1");
        
        alt2.add("x¹ = 2 e x² = 1/2");
        alt2.add("x¹ = 1/2 e x² = 3");
        alt2.add("x¹ = 0,75 e x² = 2");
        alt2.add("x¹ = 2 e x² = 1");
        
        alt3.add("x¹ = 2/3 e x² = -3");
        alt3.add("x¹ = 1/3 e x² = 4");
        alt3.add("x¹ = 1/4 e x² = -3");
        alt3.add("x¹ = 2/3 e x² = -3");

        switch (aleat) {
            case 0: {
                do {
                    Collections.shuffle(alt);
                    Collections.shuffle(alt);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : x² -4x + 3 = 0?");
                    System.out.println("a) " + alt.get(0));
                    System.out.println("b) " + alt.get(1));
                    System.out.println("c) " + alt.get(2));
                    System.out.println("d) " + alt.get(3));

                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt.get(0).equals("x¹ = 3 e x² = 1")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt.get(1).equals("x¹ = 3 e x² = 1")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt.get(2).equals("x¹ = 3 e x² = 1")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt.get(3).equals("x¹ = 3 e x² = 1")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 1: {

                do {
                    Collections.shuffle(alt2);
                    Collections.shuffle(alt2);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : 2x² - 5x + 2 = 0?");
                    System.out.println("a) " + alt2.get(0));
                    System.out.println("b) " + alt2.get(1));
                    System.out.println("c) " + alt2.get(2));
                    System.out.println("d) " + alt2.get(3));
                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt2.get(0).equals("x¹ = 2 e x² = 1/2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt2.get(1).equals("x¹ = 2 e x² = 1/2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt2.get(2).equals("x¹ = 2 e x² = 1/2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt2.get(3).equals("x¹ = 2 e x² = 1/2")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 2: {

                do {
                    Collections.shuffle(alt3);
                    Collections.shuffle(alt3);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Qual o resultado dessa equação? : 3x² + 7x - 6 = 0");
                    System.out.println("a) " + alt3.get(0));
                    System.out.println("b) " + alt3.get(1));
                    System.out.println("c) " + alt3.get(2));
                    System.out.println("d) " + alt3.get(3));
                    System.out.print("Escolha uma resposta: ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt3.get(0).equals("x¹ = 2/3 e x² = -3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt3.get(1).equals("x¹ = 2/3 e x² = -3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt3.get(2).equals("x¹ = 2/3 e x² = -3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt3.get(3).equals("x¹ = 2/3 e x² = -3")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
        }
        
        if (!sc) {
            System.out.println("Você esgotou suas tentativas. O jogo foi encerrado!.");
            System.exit(0);
        }
        return aleat;
    }

    //Função de conta. Potenciação.
    public static int ContasPo(String name) {
        Random rand = new Random();
        int aleat = rand.nextInt(3);
        Scanner ler = new Scanner(System.in);
        boolean sc = false;
        int vida = 0;
        boolean gameOver = false;
       List<String> alt = new ArrayList<>();
       List<String> alt2 = new ArrayList<>();
       List<String> alt3 = new ArrayList<>();

       alt.add("125");
       alt.add("120");
       alt.add("115");
       alt.add("135");

       alt2.add("4");
       alt2.add("8");
       alt2.add("2");
       alt2.add("16");

       alt3.add("729");
       alt3.add("695");
       alt3.add("731");
       alt3.add("690");


        switch (aleat) {
            case 0: {
                do {
                    Collections.shuffle(alt);
                    Collections.shuffle(alt);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Quanto é o número 5³?");
                    System.out.println("a) " + alt.get(0));
                    System.out.println("b) " + alt.get(1));
                    System.out.println("c) " + alt.get(2));
                    System.out.println("d) " + alt.get(3));

                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt.get(0).equals("125")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt.get(1).equals("125")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt.get(2).equals("125")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt.get(3).equals("125")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 1: {

                do {
                    Collections.shuffle(alt2);
                    Collections.shuffle(alt2);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Quanto é o número (2²)?");
                    System.out.println("a) " + alt2.get(0));
                    System.out.println("b) " + alt2.get(1));
                    System.out.println("c) " + alt2.get(2));
                    System.out.println("d) " + alt2.get(3));
                    System.out.printf("Escolha uma resposta:\n ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt2.get(0).equals("4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt2.get(1).equals("4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt2.get(2).equals("4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt2.get(3).equals("4")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
            case 2: {

                do {
                    Collections.shuffle(alt3);
                    Collections.shuffle(alt3);
                    System.out.println("Você tem " + (3 - vida) + " tentativa restantes.");
                    System.out.println("Quanto é o número 9³?");
                    System.out.println("a) " + alt3.get(0));
                    System.out.println("b) " + alt3.get(1));
                    System.out.println("c) " + alt3.get(2));
                    System.out.println("d) " + alt3.get(3));
                    System.out.print("Escolha uma resposta: ");
                    String escolha = ler.next();
                    switch (escolha) {
                        case "a":
                        case "A":
                            if (alt3.get(0).equals("729")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "b":
                        case "B":
                            if (alt3.get(1).equals("729")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "c":
                        case "C":
                            if (alt3.get(2).equals("729")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                        case "d":
                        case "D":
                            if (alt3.get(3).equals("729")) {
                                System.out.println("Resposta correta!");
                                sc = true;
                            } else {
                                System.out.println("Resposta errada jogador, tente novamente!");
                                vida++;
                            }
                            break;
                    }
                } while (!sc && vida < 3);
                break;
            }
        }
        if (!sc) {
            System.out.println("Você esgotou suas tentativas. O jogo foi encerrado!.");
            System.exit(0);
        }
        return aleat;
    }
    //Função de conta. Polinomios
    public static void SomaPolinomios() {
     Scanner input = new Scanner(System.in);
     Random random = new Random();
     int option = random.nextInt(3) + 1;
  
        switch (option) {
            case 1:
                System.out.println("Qual é a soma dos polinômios a seguir?");
                System.out.println("1. (3x^2 + 2x + 5) + (4x^2 + 3x - 1)");
                System.out.println("A) 7x^2 + 5x + 4");
                System.out.println("B) 12x^4 + 5x^3 + 6x^2 + 5x - 6");
                System.out.println("C) 12x^4 + 5x^3 +7x^2 + 8x + 4");
                char case_1 = input.next().charAt(0);

                switch (case_1) {
                    case 'a':
                    case 'A':
                        System.out.println("Resposta Correta!");
                        break;
                    case 'b':
                    case 'B':
                    case 'c':
                    case 'C':
                        System.out.println("Resposta Incorreta");
                        System.out.println("Você Foi derrotado.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            case 2:
                System.out.println("Qual é a soma dos polinômios a seguir?");
                System.out.println("1. (2x^3 + 5x^2 - x) + (x^3 - 2x^2 + 3x)");
                System.out.println("A) 3x^3 + 3x^2 + 4x");
                System.out.println("B) 3x^3 + 3x^2 - 3x");
                System.out.println("C) 3x^3 + 5x^2 + 3x");
                char case_2 = input.next().charAt(0);

                switch (case_2) {
                    case 'a':
                    case 'A':
                    case 'c':
                    case 'C':
                        System.out.println("Resposta Incorreta");
                        System.out.println("Você Foi derrotado.");
                        System.exit(0);
                        break;
                    case 'b':
                    case 'B':
                        System.out.println("Resposta Correta!");
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            case 3:
                System.out.println("Qual é a soma dos polinômios a seguir?");
                System.out.println("1. (5x^4 + 2x^3 - 3x^2) + (2x^4 - x^3 + 4x^2)");
                System.out.println("A) 7x^4 + x^3 + x^2");
                System.out.println("B) 7x^4 + 3x^3 + x^2");
                System.out.println("C) 7x^4 + 2x^3 + x^2");
                char case_3 = input.next().charAt(0);

                switch (case_3) {
                    case 'a':
                    case 'A':
                    case 'b':
                    case 'B':
                        System.out.println("Resposta Incorreta");
                        System.out.println("Você Foi derrotado.");
                        System.exit(0);
                        break;
                    case 'c':
                    case 'C':
                        System.out.println("Resposta Correta!");
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

}