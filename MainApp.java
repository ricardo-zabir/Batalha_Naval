
import java.util.Scanner;

/**
 * O jogo de tabuleiro Batalha Naval
 *
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @version (a version number or a date)
 */
public class MainApp
{
    public static void main(){
        //Inicialização das variáveis
        String eixoHorizontal;
        int eixoVertical;
        String[][]meuTabuleiro=new String[10][10];int i=0; int j=0; int k=1;
        //Impressão do tabuleiro do jogador
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){meuTabuleiro[i][j]="_";
            }
        }
        System.out.println("       MEU TABULEIRO");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(meuTabuleiro[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        //Entradas das primeiras coordenadas
        Scanner input=new Scanner(System.in);int cont=0;
        //Entrada dos barcos de duas posições
        for(cont=0;cont<4;cont++){System.out.println("Insira as duas coordenadas para colocar seu barco de 2 peças. As duas coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        boolean verificacaoDeOcupacao= meuTabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]coord1Ajustada=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= meuTabuleiro[coord1Ajustada[0]][coord1Ajustada[1]].equals("&");
        coord1[0]=coord1Ajustada[0];
        coord1[1]=coord1Ajustada[1];
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= meuTabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]coord2Ajustada=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= meuTabuleiro[coord2Ajustada[0]][coord2Ajustada[1]].equals("&");
        coord2[0]=coord2Ajustada[0];
        coord2[1]=coord2Ajustada[1];
        }
        //Validez das coordenadas
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        boolean validezCoordenada = (conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar duas coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        validezCoordenada = ((coord1[0]-coord2[0]) + (coord1[1]-coord2[1])==1)||((coord1[0]-coord2[0]) + (coord1[1]-coord2[1])==-1);}
        //Posicionamento do barco
        meuTabuleiro[coord1[0]][coord1[1]]="&";
        meuTabuleiro[coord2[0]][coord2[1]]="&";}
        //Impressão do tabuleiro
        System.out.println("       Meu tabuleiro");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(meuTabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;
        
        }
        for(cont=0;cont<3;cont++){System.out.println("Insira as três coordenadas para colocar seu barco de 3 peças. As três coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        boolean verificacaoDeOcupacao= meuTabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]coord1Ajustada=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= meuTabuleiro[coord1Ajustada[0]][coord1Ajustada[1]].equals("&");
        coord1[0]=coord1Ajustada[0];
        coord1[1]=coord1Ajustada[1];
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= meuTabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]coord2Ajustada=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= meuTabuleiro[coord2Ajustada[0]][coord2Ajustada[1]].equals("&");
        coord2[0]=coord2Ajustada[0];
        coord2[1]=coord2Ajustada[1];
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= meuTabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]coord3Ajustada=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= meuTabuleiro[coord3Ajustada[0]][coord3Ajustada[1]].equals("&");
        coord3[0]=coord3Ajustada[0];
        coord3[1]=coord3Ajustada[1];
        }
        //Validez das coordenadas
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        boolean validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar três coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1);}
        //Posicionamento do barco
        meuTabuleiro[coord1[0]][coord1[1]]="&";
        meuTabuleiro[coord2[0]][coord2[1]]="&";
        meuTabuleiro[coord3[0]][coord3[1]]="&";
    
    }
        //Impressão do tabuleiro
        System.out.println("       Meu tabuleiro");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(meuTabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;}
        
        
    
    }
}
