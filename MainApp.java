
import java.util.Scanner;

/**
 * A classe {@code MainApp} contém um programa que replica o famoso jogo de tabuleiro batalha naval
 * O jogo é composto por dois tabuleiros e é jogador por dois jogadores, esses dois jogadores
 * posicionam barcos nos seus tabuleiros - que não é visível para o oponente - e após isso, começa os turnos de ataque
 * onde um jogador ataca uma coordenada do oponente, que se tiver barco então esse será afundado
 * 
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @version 2021-06-21
 */
public class MainApp
{
    /**
     * O método trocadeturno serve para o jogador inserir seu número de identificação para ou iniciar ou encerrar o turno, prevenindo
     * que o adversário veja seu tabuleiro e vice-versa
     * @param trocaturno trata-se de um número inteiro que representa o número que deve ser digitado pelo jogador
     * para a progressão do jogo
     * @param input o scanner para permitir a entrada de dados 
     */
    public static void trocadeturno(int trocaturno,Scanner input){
        int trocaturnox=input.nextInt();  
        while(trocaturnox!=trocaturno){
        trocaturnox=input.nextInt();
        }
        System.out.print("\f");
            
    }
    /**
     * O método regras detalha as características do jogo, explicando as regras e instruções para o funcionamento adequado
     * do programa
     * 
     */
    public static void regras(){
        System.out.println("BEM VINDO A BATALHA NAVAL!!!");
        System.out.println("REGRAS : ");
        System.out.println("Cada jogador contém: ");
        System.out.println("- Quatro barcos de tamanho de duas posições");
        System.out.println("- Três barcos de tamanho de três posições");
        System.out.println("- Dois barcos de tamanho de quatro posições");
        System.out.println("- Um barco de tamanho de cinco posições");
        System.out.println("Para o posicionamento dos barcos, deve ser digitado uma coordenada por linha, contendo um espaço entre o eixo horizontal e o eixo vertical");
        System.out.println("Exemplo errado: a1   Exemplo correto: a 1");
        System.out.println("Os barcos podem possuir qualquer formato, apenas deve ser totalmente conectado, então cuide para que a coordenada atual esteja conectada com a ");
        System.out.println("coordenada anterior");
        System.out.println("O jogo tem seu fim quando algum jogador derruba todos os navios do adversário, podendo haver um improvável empate caso na mesma rodada os ");
        System.out.println("jogadores acabem com todas as tropas inimigas, fato esse que retira a vantagem do primeiro jogador a jogar");
        System.out.println("Representações Visuais: ");
        System.out.println("_ um território vazio do seu tabuleiro");
        System.out.println("& um território onde possui barco seu");
        System.out.println("? um território do inimigo que você ainda não bombardeou");
        System.out.println("X um território do inimigo que você bombardeou e que não tinha barco");
        System.out.println("* um território seu que foi bombardeado, seja esse com ou sem barco");
        System.out.println("! um território que você atacou e possuía barco");
        System.out.println("Entendido as regras digite 0 para continuar com a progressão do jogo");
    }
    /**
     * O método main contém o programa propriamente dito. Possui conexões com diversos métodos da classe auxiliar para
     * não ficar muito extenso.
     */
    public static void main(){
        String eixoHorizontal;
        int eixoVertical;
        Scanner input=new Scanner(System.in);
        regras();
        trocadeturno(0,input);
        String[][]tabuleiroP1=new String[10][10];
        int i=0; 
        int j=0;
        int k=1;
        Auxiliar.preencher(tabuleiroP1);
        Auxiliar.mostrar(tabuleiroP1,"P1");
        int cont=0;
        Auxiliar.posicionarBarcoDeDois(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeTres(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeQuatro(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeCinco(tabuleiroP1,"P1",input);
        int trocaTurno;
        System.out.println("Digite um pra passar a vez");
        trocadeturno(1,input);
        System.out.println("Jogador 2: Aperte 2 para prosseguir");
        trocadeturno(2,input);
        String[][]p2Tabuleiro=new String[10][10];
        Auxiliar.preencher(p2Tabuleiro);
        Auxiliar.mostrar(p2Tabuleiro,"P2");
        Auxiliar.posicionarBarcoDeDois(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeTres(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeQuatro(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeCinco(p2Tabuleiro,"P2",input);
        System.out.println("Digite 2 para encerrar o turno");
        trocadeturno(2,input);
        int barcosDetonadosPeloP1=0;
        int barcosDetonadosPeloP2=0;
        String[][]tabuleiroAdvP1=new String[10][10];
        Auxiliar.preencherAdv(tabuleiroAdvP1);
        String[][]tabuleiroAdvP2=new String[10][10];
        Auxiliar.preencherAdv(tabuleiroAdvP2);
        boolean endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        while(endgame==false){System.out.println("Jogador 1: Digite 1 para começar o turno");
        trocadeturno(1,input);
        Auxiliar.mostrar(tabuleiroP1,"P1");
        System.out.println("TROPAS DESTRUIDAS: ");
        System.out.println(barcosDetonadosPeloP2);
        System.out.println("TROPAS RESTANTES: ");
        System.out.println(30-barcosDetonadosPeloP2);
        System.out.println("       tabuleiro INIMIGO(Rodada do p1)");
        Auxiliar.mostrar(tabuleiroAdvP1,"P2");
        int[]palpite=Auxiliar.ataque(input);
        barcosDetonadosPeloP1=Auxiliar.ataqueCheck(p2Tabuleiro,tabuleiroAdvP1,input,palpite,barcosDetonadosPeloP1);
        Auxiliar.mostrar(tabuleiroAdvP1,"P2");
        System.out.println("Jogador 1: Digite 1 para encerrar o turno");
        trocadeturno(1,input);
        System.out.println("Jogador 2: Digite 2 para começar o turno");
        trocadeturno(2,input);
        Auxiliar.mostrar(p2Tabuleiro,"P2");
        System.out.println("TROPAS DESTRUIDAS: ");
        System.out.println(barcosDetonadosPeloP1);
        System.out.println("TROPAS RESTANTES: ");
        System.out.println(30-barcosDetonadosPeloP1);
        Auxiliar.mostrar(tabuleiroAdvP2,"P1");
        int[]palpiteP2=Auxiliar.ataque(input);
        barcosDetonadosPeloP2=Auxiliar.ataqueCheck(tabuleiroP1,tabuleiroAdvP2,input,palpiteP2,barcosDetonadosPeloP2);
        Auxiliar.mostrar(tabuleiroAdvP2,"P2");
        System.out.println("Digite 2 para encerrar o turno");
        trocadeturno(2,input);
        endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        }
        if(barcosDetonadosPeloP1==30){System.out.println("Vitória do jogador 1 !");
        }
        if(barcosDetonadosPeloP2==30){System.out.println("Vitória do jogador 2 !");
        }
        if(barcosDetonadosPeloP1==30 && barcosDetonadosPeloP2==30){System.out.println("Empate");
        }
    }
}