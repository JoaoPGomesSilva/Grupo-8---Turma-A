package com.mycompany.jogorpg;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rpg_grupo8 {

    static int temp_dialog = 20, temp_narrativa = 60, temp_instrucoes = 15; 

    public static String principal() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println(".::::::::::::::::: MATHEMATICAL MINDS :::::::::::::::::.\n");
        System.out.println("Bem-vindo Guardião, como você gostaria de ser chamado?\n");
        name = input.nextLine();
        Texto("\nCerto, Guardião " + name + ".\n\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        return name;
    }

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
            System.out.println("                  Mathematical minds");

            System.out.println("\n[1] - Jogar.  [2] - Créditos.  [3] - Instruções.  [4] - Sair.\n");
            System.out.println(".::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.");
            opcao = input.nextInt();
            if (opcao > 4 || opcao < 1) {
                System.out.println("Opções Inválidas!");
            }
        } while (opcao > 4 || opcao < 1); 

        return opcao;
    }

    public static void menu(int opcao, String name) throws InterruptedException {
        do {
            switch (opcao) {
                case 1:
                    historia(name);
                    break;
                case 2:
                    creditos("");
                    break;
                case 3:
                    intrucoes("");
                    break;    
                case 4:
                    sair("");
                    break;
                default:
                    System.out.println("Opção inválida."); 
                    break;
            }
        } while (opcao == 1 || opcao == 2 || opcao == 3);
    }

    static void historia(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int cap;
    
      Texto("\nHISTORIA\n\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("NARRADOR : Em uma ilha chamada Algebraria, a matemática reina suprema sob o sábio Rei Totalis.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("No entanto, um dragão maligno conhecido como \"Error\" ameaça a cidade, buscando desequilibrar as equações.\n", TimeUnit.MILLISECONDS, temp_dialog);
      Texto("Para proteger Algebraria, foi preciso chamar os Guardiões matemáticos, representando operações matemáticas fundamentais.\n", TimeUnit.MILLISECONDS, temp_dialog);
Texto("\nE para ajudar esses guardiões, surgiu um novo Protetor na ilha de Algebraria, um mero morador local, chamado " + name + " .\n", TimeUnit.MILLISECONDS, temp_dialog);
Texto("Cada região da cidade é governada por um Guardião Elemental, mas todos trabalham juntos para manter o equilíbrio.\n", TimeUnit.MILLISECONDS, temp_dialog);
Texto("Com a ameaça crescente de Error, os Guardiões e o Rei Totalis se unem para proteger a cidade do caos iminente,\n", TimeUnit.MILLISECONDS, temp_dialog);
Texto("desencadeando uma grande aventura onde a batalha entre a ordem e o caos é travada nos campos da matemática e do coração humano.\n", TimeUnit.MILLISECONDS, temp_dialog);
        do {
            System.out.println("\nSelecione o capítulo que você gostaria de jogar :");
            System.out.println("\n[1] Capítulo 1 - O COMEÇO. \n[2] Capítulo 2\n[3] Capítulo 3 "); 
            cap = input.nextInt();
        } while (cap < 1 || cap > 3);

        if (cap == 1) {
            capitulo_1(name);
        }
    }

    static void capitulo_1(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int dialog, dialog_2, dialog_3, dialog_4, dialog_5, dialog_6, dialog_7, dialog_8, dialog_9, dialog_10, dialog_11 , dica_1, aviso;
        Texto("\n--------CASTELO DO REI TOTALIS--------\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Olá, Addictus!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Olá, Guardião, por acaso seria você o " + name + " ?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name +" : Sim, eu vim para ajudar vocês a derrotarem esse vilão\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Que bom ter você aqui para nos ajudar! Você está bem?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Sim \n[2] Mais ou menos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog = input.nextInt();

        switch (dialog) {
            case 1 ->{
                Texto(name +" : Sim. Estou empenhado a derrotar este vilão!\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Que ótimo! Vamos, precisamos nos apressar.\n", TimeUnit.MILLISECONDS, temp_dialog);
                  }
            case 2 ->{
                Texto (name +" : Na verdade não, estou meio triste com essa situação.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto(Addictus : Se alegre meu guerreiro, temos que combater esse ERROR, que está a nós ameaçar.\n", TimeUnit.MILLISECONDS, temp_dialog);
                   }
            default ->{
                Texto (name +" : {...}\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Opá amigo, vejo que você não está em um dia muito bom. mas iremos continuar avançando na nossa missão!\n", TimeUnit.MILLISECONDS, temp_dialog);
                 }
        }
        Texto("Me chamo Addictus, sou um dos guardiões que cuida do reino. Hoje é um dia muito importante.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Todos os guardiões foram convocados para vir até o palácio falar com o rei! Vamos nos sentar todos\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("com o Rei Totalis para discutir sobre essa ameaça!\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("\nAddictus : Você já sabe quem são os guardiões?", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n[1] Sim. \n[2] Não.\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
    dialog_2 = input.nextInt();

    switch (dialog_2) {
        case 1 -> {
            Texto(name +" : Sim, eu já os conheço. Os Guardiões são guerreiros fantásticos!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Addictus : A que ótimo! Aliás, quem não os conhece rsrs.", TimeUnit.MILLISECONDS, temp_dialog);
                 }
        case 2 -> {
            Texto(name +" : Tenho apenas um conhecimento superficial sobre vocês.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Addictus : Os guardiões são formados por 4 Guerreiros, irei Falar de cada um! \n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Dividus, o guardião da divisão. \nMultiplucus, o guardião da multiplicação.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Subtractus, o guardião da subtração. \nAddicus, Vulgo eu. Sou o guardião da adição;\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("...\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
        default -> Texto("Caro jogador, digite uma opção válido!\n", TimeUnit.MILLISECONDS, temp_dialog);
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

        do {
            dialog_3 = input.nextInt();
            switch (dialog_3) {
                case 1 ->
                    Texto("\nBom Dia, Majestade!\n", TimeUnit.MILLISECONDS, temp_dialog);
                case 2 ->{
                    Texto(name + " : Olá, Majestade.\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus : Desculpe magestade, ele é novo aqui!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto( "{...}\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto("Addictus :" + name + ", você deveria responder \"Bom Dia, Majestade.\"\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Texto(name + " : Bom dia, Majestade!.\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
                default ->
                    Texto("\nCaro jogador, digite uma opção válido!\n", TimeUnit.MILLISECONDS, temp_dialog);
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

        do {
    dialog_4 = input.nextInt();
    
    switch (dialog_4) {
        case 1 -> {
            Texto(name +" : Estou disposto a ajudar no que for preciso majestade! Pode contar comigo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Rei Totális: Ótimo escutar isso " + name + "! Muito Obrigado em ajudar na defesa do nosso reino.\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
        case 2 -> {
            Texto(name + " : Não estou muito confiante. Será uma boa ideia enfrentar ele?\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("\nRei Totális : Mas é claro guerreiro! Estamos com os mais fortes e corajosos guerreiros!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Você está com a responsabilidade de guiá-los com sua inteligência.", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Se acalme, tudo vai dar certo, e vamos sair vitoriosos!\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
        default -> Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
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

        do {
    dialog_5 = input.nextInt();
    
    switch (dialog_5) {
        case 1 -> Texto(name + " : Ok, Vamos nessa!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        default -> Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
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

        do {
    dialog_6 = input.nextInt();

    switch (dialog_6) {
        case 1 -> {
            Texto(name + " : Muito obrigado pelas informações!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Divíduos : Em que direção o monstro foi?\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Residente : Sentido a praça central.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Divíduos : Certo, iremos atrás dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Residente : Por favor, Resolvam isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
        case 2 -> {
            Texto(name + " : Você teria mais alguma informação?.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto("Residente : Ele foi sentido a praça central.\n", TimeUnit.MILLISECONDS, temp_dialog);
            Texto(name + " : Certo, Obrigado. iremos fazer o máximo para derrotar esse monstro.\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
        default -> Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
    }
} while (dialog_6 != 1 && dialog_6 !=2);
        
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

        do {
    dialog_7 = input.nextInt();

    switch (dialog_7) {
        case 1 -> Texto(name + " : Pessoal, FOCO! Precisamos detê-lo. \nse ficarmos falando aqui sobre as habilidades dele e não formos atrás. Ele vai destruir cada vez mais coisas!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        case 2 -> Texto("...", TimeUnit.MILLISECONDS, temp_dialog);
        default -> Texto("Caro jogador, digite uma opção válido!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
        Texto("(Discrepância surge diante dos guardiões, envolto em suas ilusões matemáticas)\n\n2"
                + "", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Discrepância : Ah, os valentes Guardiões Elementais! Que surpresa encontrá-los aqui.\nEstão prontos para serem derrotados pelas minhas habilidades?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : Não subestime o poder da matemática, Discrepância! Estamos aqui para restaurar o equilíbrio em Algebraria.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Suas ilusões não nos intimidam! Vamos mostrar a ele o poder da multiplicação!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Prepare-se para ser neutralizado, Discrepância! Nossos cálculos estão afiados como lâminas.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Você pode distorcer os números, mas não pode distorcer a determinação dos Guardiões Elementais!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Narrador : (A batalha se intensifica, com os guardiões usando suas habilidades matemáticas para contra-atacar as ilusões de Discrepância)\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus :" + name + ", você tem o conhecimento sobre equação de 1º? precisamos resolver esse problema para dar dano no Discrepância\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Já tenho conhecimento de equação de 1º GRAU. \n[2] Gostaria de saber como funciona a equação de 1º.\n", TimeUnit.MILLISECONDS, temp_dialog);
        dica_1 = input.nextInt();
        
        switch(dica_1){
            case 1 :
                Texto(name+ " : Eu consigo enfraquecer o Discrepância!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            case 2:
                Texto(name+ " : EU NÃO SEI COMO RESOLVER ESSE PROBLEMA!.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus :" + name + ", fique calmo, irei te dar um exemplo de como fazer.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                do{
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
                if(dica_1 == 1){
                Texto(name+ " : Sim, muito obrigado, Addictus. Agora conseguirei enfraquecer o Discrepância!\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : É isso ai!"+name+"!\n" , TimeUnit.MILLISECONDS, temp_dialog);
                }else if (dica_1 == 2){
                Texto(name+ " : Desculpa Addictus, não consegui entender.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Addictus : Não tem problema "+name+", vamos tentar mais uma vez!\n\n" , TimeUnit.MILLISECONDS, temp_dialog);
                }
                }while(dica_1 !=1);           
              
        }
        Texto("Multiplus : Vamos "+name+" Nos ajude a dar dano nele. Precisamos resolver essa conta de Equação 1ºGRAU!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+ " : Pode deixar comigo Multiplus!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("Caro Jogador, você terá um limite de 3 tentativas \nSe você utilzar todas as tentativas o jogo retornará será finalizado.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Continuar [2] Desistir\n", TimeUnit.MILLISECONDS, temp_dialog);
        aviso = input.nextInt();
        
        do{
        switch(aviso){
            case 1:
                Texto("O game continuará\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            case 2: 
                sair(name); 
               break;
            default:
                Texto("Caro jogador, digite uma opção válida!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
        }
        }while(aviso !=1 && aviso !=2);
        
        contas();
        Texto("Discrepância : Ah Seus maldito! irei acabar com todos vocês! \n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : O "+name+" Conseguiu!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("\n\nAddictus : Ele está enfraquecendo! Não podemos recuar agora!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Vamos concentrar nossos esforços! Juntos, podemos superá-lo!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Sintam a força da subtração! Cada equação resolvida é um golpe em direção à vitória!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Não vamos parar até que o equilíbrio seja restaurado em Algebraria!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name + " : Vamos resolver mais essa equação!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        contas();
        Texto("Discrepância : (coff, coff, coff) Não é possível, fui derrotado por esses pivetes.\nSeus bastardos, meu mestre irá acabar com vocês e essa Algebraria irá cair em ruínas.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
       
        Texto("Addictus : Conseguimos! Algebraria está a salvo mais uma vez.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : A matemática sempre prevalece sobre o caos!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : Nossa união e determinação foram fundamentais para essa vitória.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Que essa batalha sirva como exemplo de que juntos somos invencíveis!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Muito bem pessoal! \n[2] Não se animem!\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_9 = input.nextInt();
        do{
        switch(dialog_9){
            case 1:
                 Texto(name + " : Muito bem pessoal, Conseguimos!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            case 2:
                Texto(name + " : Não se animem pessoal, ainda temos muito pela frente.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Multiplus : O " +name+ " tem razão, temo que manter o foco.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Texto("Divíduos : Concordo!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            default:
            System.out.println("\nCaro jogador, digite uma opção válida!\n");
            break;
          }
        }while(dialog_9 != 1 && dialog_9 != 2);
        
        Texto("\n\nNarrador : O monstro deu seu último suspiro e se desfez em pó, os Guardiões conseguiram proteger a cidade.\nAs pessoas gritaram com alegria com a vitória de seus guardiões.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Mas não foi muito longe, pois no mesmo momento houve um estrondo na cidade e começou um terremoto, a \nAlgebraria se estremece e a poeira fica no ar, mulheres e crianças gritam por socorro.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("\"THUD!\" \"THUD!\" \"THUD!\"\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Addictus : QUE ESTRONDO FOI ESSE?!.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Subtract : EU NÃO SEI!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Multiplus : Algo está errado, nunca senti uma tremor tão forte em Algebraria!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Divíduos : Concordo, isso é muito estranho. Devemos descobrir o que está acontecendo imediatamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("[1] Ir ajudar os moradores \n[2]procurar por pistas", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_11 = input.nextInt();
        
        switch (dialog_11) {
    case 1:
        Texto(name + " : Primeiro devemos ajudar os moradores.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(" Narrador : Os Guardiões decide ir ajudar os moradores. Correndo pelas ruas, eles veem casas danificadas e pessoas assustadas.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("Algumas pessoas estão presas sob os escombros, e outras estão tentando conter incêndios que começaram após o terremoto.\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        break;
    case 2:
        Texto(name+ ": Vamos averiguar pessoal. Alguma coisa me diz que esse tremor tem a ver com ERROR.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("Narrador: O grupo decide procurar por pistas sobre a origem do estrondo. Enquanto investigam os arredores, encontram \nUm rastro de destruição que parece ter sido causado por alguma entidade poderosa.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("Fragmentos de pedra e destroços estão espalhados pelo chão, e marcas estranhas adornam as paredes das construções próximas.\n", TimeUnit.MILLISECONDS, temp_dialog);
    Texto("Há indícios de que algo muito maior do que um simples terremoto aconteceu aqui. O grupo decide seguir as pistas e descobrir o que está por trás desse evento.\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        break;
    default:
        Texto("Opção inválida! Você fica parado, sem saber o que fazer diante da situação.\n", TimeUnit.MILLISECONDS, temp_dialog);
        // Outras ações a serem tomadas em caso de escolha inválida...
        break;
}
        
        Texto("Narrador : De repente surge um alguém coberto de poeira, que se dirige aos Guardiões.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("Subtract : Olhem, Alguém está vindo ai.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Texto(name+ " : Parece ser o Mensageiro\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("Mensageiro: Meus senhores, acabamos de receber informações do reino do Leste. Esse ataque foi causado pelas tropas de um dos aliados do Error, onde nossos\nEspiões conseguiram identificar que o inimigo está marchando em direção a eles.\n", TimeUnit.MILLISECONDS, temp_dialog);
Texto("Foi informado que é o \"EQUATROM!\", este é o braço direito do DRAGÃO ERROR!\nSe ele conseguir tomar a cidade do Leste, estaremos em sérios apuros, pois a estrada principal do reino passa por lá.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        
        Texto("[1] Continuar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        dialog_10 = input.nextInt();

        do{
        switch(dialog_10){ 
            case 1:
                 Texto(name + " : Vamos Nessa Pessoal, precisamos derrotar Equatrom para chegar até Error.\n\n", TimeUnit.MILLISECONDS, temp_dialog); 
                break;
            default:
            System.out.println("\nCaro jogador, digite uma opção válida!\n");
            break;
          }
        }while(dialog_10 != 1);
        
        Texto("Narrador : Os Guardiões, ao escutarem a mensagem, foram pegar seus pertences e suas montarias, e seguiram em disparada para o Leste.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Texto("CONTINUA NO CAPÍTULO 2...", TimeUnit.MILLISECONDS, temp_dialog);
        Texto("", TimeUnit.MILLISECONDS, temp_dialog); 
        System.exit(0);
    }

    static void creditos(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int menu;
        Texto("Centro Universitário Senac - Santo Amaro.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Projeto Integrador - Prof. Dr. Eduardo Takeo Ueda.\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("Projeto Semestral - 2024.\n\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto(".:::::::: Desenvolvedores ::::::::.", TimeUnit.MILLISECONDS, temp_instrucoes);
        Texto("\n1 João Paulo Gomes Silva \n2 Alex Araújo Reis \n3 Gabriel Oliveira Quintino \n4 Rafael Oliveira Quintino \n5 Rodrigo Pereira Gama\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        System.out.println("");
        Texto("[1] - Retornar ao Menu\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        menu = input.nextInt();
        do{
        switch (menu) { 
            case 1:
                int escolha = menu_Escolha(name);
                menu(escolha, name);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        }while(menu !=1);

    }
    
    static void intrucoes(String name) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int menu1;
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
     Texto("O jogo começa com uma introdução onde você é saudado por Addictus, um dos guardiões do reino.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
     
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
        Texto("[1] - Retornar ao Menu\n", TimeUnit.MILLISECONDS, temp_instrucoes);
        
        
        menu1 = input.nextInt();
        do{
        switch (menu1) {
            case 1:
                int escolha = menu_Escolha(name);
                menu(escolha, name);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
       }while(menu1 !=1);
     }

    static void sair(String name) {
        System.out.println("Obrigado por jogar, " + name + "! Até a próxima.");
        System.exit(0);
    }

    public static void main(String[] args) throws InterruptedException {
        String nome = principal();
        int escolha = menu_Escolha(nome);
        menu(escolha, nome);
        int opcao2;
    }

    public static void Texto(String texto, TimeUnit unit, long tempo_texto) throws InterruptedException {
        for (char caractere : texto.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_texto);
        }

    }

    public static int contas() {
        Random rand = new Random();
        int aleat = rand.nextInt(3);
        Scanner ler = new Scanner(System.in);
        boolean sc = false;
        int vida = 0;
        boolean gameOver = false;
        List alt = new ArrayList(); List alt2 = new ArrayList();List alt3 = new ArrayList();
        alt.add("X = 2");alt2.add("X = 4");alt3.add("X = 3");
        alt.add("X = 5");alt2.add("X = 2");alt3.add("X = 4");
        alt.add("X = 1");alt2.add("X = 3");alt3.add("X = 5");
        alt.add("X = 3");alt2.add("X = 5");alt3.add("X = 2");
      
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

}




