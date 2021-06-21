
import java.util.Scanner;

/**
 * A classe {@code MainApp} contém um programa que replica o famoso jogo de tabuleiro batalha naval
 *
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @version 2021-06-18
 */
public class MainApp
{
    /**
     * O método trocadeturno serve para limpar a tela, impedindo a visualização do tabuleiro do adversário
     */
    public static void trocadeturno(){
        int limpatela;
        for(limpatela=0;limpatela<100;limpatela++){
            System.out.println();
        }
    }
    public static void main(){
        String eixoHorizontal;
        int eixoVertical;
        String[][]tabuleiroP1=new String[10][10];
        int i=0; 
        int j=0;
        int k=1;
        Auxiliar.preencher(tabuleiroP1);
        Auxiliar.mostrar(tabuleiroP1,"P1");
        Scanner input=new Scanner(System.in);
        int cont=0;
        Auxiliar.posicionarBarcoDeDois(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeTres(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeQuatro(tabuleiroP1,"P1",input);
        Auxiliar.posicionarBarcoDeCinco(tabuleiroP1,"P1",input);
        //Troca de turno
        int trocaTurno;
        System.out.println("Digite um pra passar a vez");
        trocaTurno=input.nextInt();
        while(trocaTurno!=1){trocaTurno=input.nextInt();}
        trocadeturno();
        //Inicialização das variáveis
        System.out.println("Jogador 2: Aperte 2 para prosseguir");
        trocaTurno=input.nextInt();
        while(trocaTurno!=2){trocaTurno=input.nextInt();}
        
        String[][]p2Tabuleiro=new String[10][10];
        //Impressão do tabuleiro do jogador
        Auxiliar.preencher(p2Tabuleiro);
        Auxiliar.mostrar(p2Tabuleiro,"P2");
        Auxiliar.posicionarBarcoDeDois(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeTres(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeQuatro(p2Tabuleiro,"P2",input);
        Auxiliar.posicionarBarcoDeCinco(p2Tabuleiro,"P2",input);
        
        //Troca de turno
        System.out.println("Digite 2 para encerrar o turno");
        trocaTurno=input.nextInt();
        while(trocaTurno!=2){trocaTurno=input.nextInt();}
        trocadeturno();
        //Inicialização das variáveis que vão contar quantos barcos foram destruídos
        int barcosDetonadosPeloP1=0;
        int barcosDetonadosPeloP2=0;
        //Inicialização dos tabuleiros que serão vistos pela perspectiva do adversário
        String[][]tabuleiroAdvP1=new String[10][10];
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){tabuleiroAdvP1[i][j]="?";
            }
        }
        String[][]tabuleiroAdvP2=new String[10][10];
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){tabuleiroAdvP2[i][j]="?";
            }
        }
        //Criação do loop que determina os ataques e o eventual fim do jogo
        boolean endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        while(endgame==false){System.out.println("Jogador 1: Digite 1 para começar o turno");
        trocaTurno=input.nextInt();
        while(trocaTurno!=1){trocaTurno=input.nextInt();}
        trocadeturno();
        //Inicio dos turnos
        System.out.println("       meu tabuleiro");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        System.out.println("BARCOS DESTRUIDOS: ");
        System.out.println(barcosDetonadosPeloP2);
        System.out.println("BARCOS RESTANTES: ");
        System.out.println(30-barcosDetonadosPeloP2);
        System.out.println("       tabuleiro INIMIGO(Rodada do p1)");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroAdvP1[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        //Criação do ataque
        eixoHorizontal=input.next(); 
        while(eixoHorizontal.length()>1){System.out.println("Coordenada inadequada. Lembre-se de deixar um espaço entre a letra e o número e insira novamente");
        eixoHorizontal=input.next();}
        eixoVertical=input.nextInt();
        while(eixoVertical<1 || eixoVertical>10){System.out.println("Valores válidos= de 0 a 10. Insira novamente o número da linha que você quer ocupar da coluna "+eixoHorizontal);
        eixoVertical=input.nextInt();}
        int[]palpite=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        if(p2Tabuleiro[palpite[0]][palpite[1]].equals("&")){tabuleiroAdvP1[palpite[0]][palpite[1]]="!";p2Tabuleiro[palpite[0]][palpite[1]]="*";
            barcosDetonadosPeloP1=barcosDetonadosPeloP1+1;
        }
        else{tabuleiroAdvP1[palpite[0]][palpite[1]]="X";p2Tabuleiro[palpite[0]][palpite[1]]="*";}
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroAdvP1[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        System.out.println("Jogador 1: Digite 1 para encerrar o turno");
        trocaTurno=input.nextInt();
        while(trocaTurno!=1){trocaTurno=input.nextInt();}
        trocadeturno();
        System.out.println("Jogador 2: Digite 2 para começar o turno");
        trocaTurno=input.nextInt();
        while(trocaTurno!=2){trocaTurno=input.nextInt();}
        trocadeturno();
        System.out.println("       meu tabuleiro");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        System.out.println("BARCOS DESTRUIDOS: ");
        System.out.println(barcosDetonadosPeloP1);
        System.out.println("BARCOS RESTANTES: ");
        System.out.println(30-barcosDetonadosPeloP1);
        System.out.println("       tabuleiro INIMIGO(Rodada do p2)");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroAdvP2[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        //Criação do ataque do P2
        eixoHorizontal=input.next(); 
        while(eixoHorizontal.length()>1){System.out.println("Coordenada inadequada. Lembre-se de deixar um espaço entre a letra e o número e insira novamente");
        eixoHorizontal=input.next();}
        eixoVertical=input.nextInt();
        while(eixoVertical<1 || eixoVertical>10){System.out.println("Valores válidos= de 0 a 10. Insira novamente o número da linha que você quer ocupar da coluna "+eixoHorizontal);
        eixoVertical=input.nextInt();}
        int[]palpiteP2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        if(tabuleiroP1[palpiteP2[0]][palpiteP2[1]].equals("&")){tabuleiroAdvP2[palpiteP2[0]][palpiteP2[1]]="!";tabuleiroP1[palpiteP2[0]][palpiteP2[1]]="*";
            barcosDetonadosPeloP2=barcosDetonadosPeloP2+1;
        }else{tabuleiroAdvP2[palpiteP2[0]][palpiteP2[1]]="X";tabuleiroP1[palpiteP2[0]][palpiteP2[1]]="*";}
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroAdvP2[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        System.out.println("Digite 2 para encerrar o turno");
        trocaTurno=input.nextInt();
        while(trocaTurno!=2){trocaTurno=input.nextInt();}
        trocadeturno();
        endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        }
    }
}