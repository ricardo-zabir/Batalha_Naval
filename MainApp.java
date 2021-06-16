
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
        String[][]tabuleiroP1=new String[10][10];int i=0; int j=0; int k=1;
        //Impressão do tabuleiro do jogador
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){tabuleiroP1[i][j]="_";
            }
        }
        System.out.println("       tabuleiro P1");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
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
        boolean verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        //Validez das coordenadas
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        boolean validezCoordenada = (conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar duas coordenadas que estejam conectadas.");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        int conexaoEntre1e2= (coord1[0]-coord1[1])+(coord1[0]-coord1[1]);
        validezCoordenada = (conexaoEntre1e2 ==1) || (conexaoEntre1e2==-1);
        }
        //Posicionamento do barco
        tabuleiroP1[coord1[0]][coord1[1]]="&";
        tabuleiroP1[coord2[0]][coord2[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P1");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
            ;}
            System.out.println();
            k++;
        
        }
        }
        //Barcos de três posições
        for(cont=0;cont<3;cont++){System.out.println("Insira as três coordenadas para colocar seu barco de 3 peças. As três coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        boolean verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
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
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1);
        }
        //Posicionamento do barco
        tabuleiroP1[coord1[0]][coord1[1]]="&";
        tabuleiroP1[coord2[0]][coord2[1]]="&";
        tabuleiroP1[coord3[0]][coord3[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P1");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        }
        //Barco de quatro posições
        for(cont=0;cont<2;cont++){
        System.out.println("Insira as quatro coordenadas para colocar seu barco de 4 peças. As quatro coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        boolean verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        int[]coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        }
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        int conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        boolean validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1);
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar quatro coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1);
         }
        //Posicionamento do barco
        tabuleiroP1[coord1[0]][coord1[1]]="&";
        tabuleiroP1[coord2[0]][coord2[1]]="&";
        tabuleiroP1[coord3[0]][coord3[1]]="&";
        tabuleiroP1[coord4[0]][coord4[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P1");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        }
        System.out.println("Insira as cinco coordenadas para colocar seu barco de 5 peças. As cinco coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        boolean verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da quarta coordenada
        int[]coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        }
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        int[]coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= tabuleiroP1[coord5[0]][coord5[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord5[0]][coord5[1]].equals("&");
        }
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        int conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        int conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
        boolean validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1) && (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1);
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar cinco coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord4[0]][coord4[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord5[0]][coord5[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiroP1[coord5[0]][coord5[1]].equals("&");
         }
         conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
         validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1) && (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1);
        }
        
         //Posicionamento do barco
        tabuleiroP1[coord1[0]][coord1[1]]="&";
        tabuleiroP1[coord2[0]][coord2[1]]="&";
        tabuleiroP1[coord3[0]][coord3[1]]="&";
        tabuleiroP1[coord4[0]][coord4[1]]="&";
        tabuleiroP1[coord5[0]][coord5[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P1");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(tabuleiroP1[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        
        //Inicialização das variáveis
        k=0;
        String[][]p2Tabuleiro=new String[10][10];
        //Impressão do tabuleiro do jogador
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){p2Tabuleiro[i][j]="_";
            }
        }
        System.out.println("       tabuleiro P2");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        //Entradas das primeiras coordenadas
        
        //Entrada dos barcos de duas posições
        for(cont=0;cont<4;cont++){System.out.println("Insira as duas coordenadas para colocar seu barco de 2 peças. As duas coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        //Validez das coordenadas
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar duas coordenadas que estejam conectadas.");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        int conexaoEntre1e2= (coord1[0]-coord1[1])+(coord1[0]-coord1[1]);
        validezCoordenada = (conexaoEntre1e2 ==1) || (conexaoEntre1e2==-1);
        }
        //Posicionamento do barco
        p2Tabuleiro[coord1[0]][coord1[1]]="&";
        p2Tabuleiro[coord2[0]][coord2[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P2");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;
        
        }
        }
        //Barcos de três posições
        for(cont=0;cont<3;cont++){System.out.println("Insira as três coordenadas para colocar seu barco de 3 peças. As três coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        //Validez das coordenadas
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar três coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1);
        }
        //Posicionamento do barco
        p2Tabuleiro[coord1[0]][coord1[1]]="&";
        p2Tabuleiro[coord2[0]][coord2[1]]="&";
        p2Tabuleiro[coord3[0]][coord3[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P2");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        }
        //Barco de quatro posições
        for(cont=0;cont<2;cont++){
        System.out.println("Insira as quatro coordenadas para colocar seu barco de 4 peças. As quatro coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1);
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar quatro coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1);
         }
        //Posicionamento do barco
        p2Tabuleiro[coord1[0]][coord1[1]]="&";
        p2Tabuleiro[coord2[0]][coord2[1]]="&";
        p2Tabuleiro[coord3[0]][coord3[1]]="&";
        p2Tabuleiro[coord4[0]][coord4[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P2");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        }
        System.out.println("Insira as cinco coordenadas para colocar seu barco de 5 peças. As cinco coordenadas devem ser próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da segunda coordenada
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da terceira coordenada
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        //Ajuste da quarta coordenada
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Verificação de ocupação da segunda coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        }
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        //Ajuste da primeira coordenada
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        //Loop para verificação de ocupação da coordenada
        verificacaoDeOcupacao= p2Tabuleiro[coord5[0]][coord5[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord5[0]][coord5[1]].equals("&");
        }
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
        validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1) && (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1);
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar cinco coordenadas que sejam próximas umas das outras");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord1[0]][coord1[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord2[0]][coord2[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord3[0]][coord3[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord4[0]][coord4[1]].equals("&");
        }
        eixoHorizontal=input.next();
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord5[0]][coord5[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= p2Tabuleiro[coord5[0]][coord5[1]].equals("&");
         }
         conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
         validezCoordenada = (conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1) && (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1);
        }
        
         //Posicionamento do barco
        p2Tabuleiro[coord1[0]][coord1[1]]="&";
        p2Tabuleiro[coord2[0]][coord2[1]]="&";
        p2Tabuleiro[coord3[0]][coord3[1]]="&";
        p2Tabuleiro[coord4[0]][coord4[1]]="&";
        p2Tabuleiro[coord5[0]][coord5[1]]="&";
        //Impressão do tabuleiro
        System.out.println("       tabuleiro P2");
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(p2Tabuleiro[i][j]+"|");
            ;}
            System.out.println();
            k++;
        }
        int barcosDetonadosPeloP1=0;
        int barcosDetonadosPeloP2=0;
        String[][]tabuleiroAdvP1=new String[10][10];
        k=1;
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){tabuleiroAdvP1[i][j]="?";
            }
        }
         String[][]tabuleiroAdvP2=new String[10][10];
        k=1;
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){tabuleiroAdvP2[i][j]="?";
            }
        }
        boolean endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        while(endgame==false){
        //Inicio dos turnos
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
        
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]palpite=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        if(p2Tabuleiro[palpite[0]][palpite[1]].equals("&")){tabuleiroAdvP1[palpite[0]][palpite[1]]="!";
        }
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
            if(tabuleiroAdvP1[i][j].equals("!")){barcosDetonadosPeloP1=barcosDetonadosPeloP1+1;}
            }
        
        }
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
        eixoHorizontal=input.next(); 
        eixoVertical=input.nextInt();
        int[]palpiteP2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        if(tabuleiroP1[palpiteP2[0]][palpiteP2[1]].equals("&")){tabuleiroAdvP2[palpiteP2[0]][palpiteP2[1]]="!";
        }
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
            if(tabuleiroAdvP2[i][j].equals("!")){barcosDetonadosPeloP2=barcosDetonadosPeloP2+1;}
            }
        
        }
        endgame=endgame=(barcosDetonadosPeloP1==30) || (barcosDetonadosPeloP2==30);
        }
        }
}
    

