import java.util.Scanner;

 class Auxiliar
 /**
  * A classe {@code Auxiliar} contém subprogramas que auxiliam no programa MainApp para permitir
  * a realização do jogo Batalha Naval.
  * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.coM0
  * @version 2021-06-18
  * 
  */
{
    /**
     * O método ajusteDaCoordenada realiza uma conversão entre o modelo convencional de entrada de dados no jogo da batalha naval
     * para sua posição adequado no vetor do tabuleiro
     * @param eixoHorizontal a letra na qual 
     */
    public static int[] ajusteDaCoordenada(String eixoHorizontal, int eixoVertical){
        int[]coord=new int[2];
        if(eixoHorizontal.equals("a")||eixoHorizontal.equals("A")){coord[1]=0;}
        if(eixoHorizontal.equals("b")||eixoHorizontal.equals("B")){coord[1]=1;}
        if(eixoHorizontal.equals("c")||eixoHorizontal.equals("C")){coord[1]=2;}
        if(eixoHorizontal.equals("d")||eixoHorizontal.equals("D")){coord[1]=3;}
        if(eixoHorizontal.equals("e")||eixoHorizontal.equals("E")){coord[1]=4;}
        if(eixoHorizontal.equals("f")||eixoHorizontal.equals("F")){coord[1]=5;}
        if(eixoHorizontal.equals("g")||eixoHorizontal.equals("G")){coord[1]=6;}
        if(eixoHorizontal.equals("h")||eixoHorizontal.equals("H")){coord[1]=7;}
        if(eixoHorizontal.equals("i")||eixoHorizontal.equals("I")){coord[1]=8;}
        if(eixoHorizontal.equals("j")||eixoHorizontal.equals("J")){coord[1]=9;}
        coord[0]=eixoVertical-1;
        return coord;
    }
    public static void mostrar(String[][]tabuleiro, String player){
        int k;
        int i;
        int j;
        System.out.println("       tabuleiro  "+player); 
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        k=1;
            for( i =0; i<10;i++){
                if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
                System.out.print("|");
               for(j=0;j<10;j++){System.out.print(tabuleiro[i][j]+"|");
                }
                System.out.println();
                k++;
            }
    }
    public static void preencher(String[][]tabuleiro){
        int i;
        int j;
        for( i =0; i<10;i++){
               for(j=0;j<10;j++){tabuleiro[i][j]="_";
                }
            }
    }
    public static void posicionarBarcoDeDois(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<4;cont++){System.out.println("Insira as duas coordenadas para colocar seu barco de 2 peças. As duas coordenadas devem ser próximas umas das outras");
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        conexaoBarcoDois(coord1,coord2,tabuleiro,input);
        mostrar(tabuleiro,player);
        }
        }
    public static String entradaEixoHorizontal(Scanner input){
        String eixoHorizontal=input.next();
        while(eixoHorizontal.length()>1){System.out.println("Coordenada inadequada. Lembre-se de deixar um espaço entre a letra e o número e insira novamente");
        eixoHorizontal=input.next();} 
        return eixoHorizontal;
    }
    public static int entradaEixoVertical(Scanner input,String eixoHorizontal){
    int eixoVertical=input.nextInt();
        while(eixoVertical<1 || eixoVertical>10){System.out.println("Valores válidos= de 0 a 10. Insira novamente o número da linha que você quer ocupar da coluna "+eixoHorizontal);
        eixoVertical=input.nextInt();}
        return eixoVertical;
    }
    public static int[] ocupacaoCheck(int[]coord,String[][]tabuleiro,Scanner input){
        boolean verificacaoDeOcupacao= tabuleiro[coord[0]][coord[1]].equals("&");
        while(verificacaoDeOcupacao==true){System.out.println("Coordenada já ocupada. Favor selecionar outra");
        String eixoHorizontal=entradaEixoHorizontal(input); 
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiro[coord[0]][coord[1]].equals("&");
        }
        return coord;
    }
    public static void conexaoBarcoDois(int[]coord1,int[]coord2,String[][]tabuleiro,Scanner input){
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        boolean validezCoordenada = ((conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1))&&
        (coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar duas coordenadas que estejam conectadas.");
        String eixoHorizontal=entradaEixoHorizontal(input);
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        conexaoCoord1eCoord2= (coord1[0]-coord2[0])+(coord1[1]-coord2[1]);
        validezCoordenada = ((conexaoCoord1eCoord2 ==1) || (conexaoCoord1eCoord2==-1))
        &&
        (coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1);
        }
        tabuleiro[coord1[0]][coord1[1]]="&";
        tabuleiro[coord2[0]][coord2[1]]="&";
    }
    public static void posicionarBarcoDeTres(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<3;cont++){System.out.println("Insira as três coordenadas para colocar seu barco de 3 peças. As três coordenadas devem ser próximas umas das outras");
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        conexaoBarcoDeTres(coord1,coord2,coord3,tabuleiro,input);
        mostrar(tabuleiro,player);
        }
    }
    public static void conexaoBarcoDeTres(int[]coord1,int[]coord2,int[]coord3,String[][]tabuleiro,Scanner input){
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        boolean validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1)) 
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1));
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar três coordenadas que estejam conectadas.");
        String eixoHorizontal=entradaEixoHorizontal(input);
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1)) 
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1));
        }
        tabuleiro[coord1[0]][coord1[1]]="&";
        tabuleiro[coord2[0]][coord2[1]]="&";
        tabuleiro[coord3[0]][coord3[1]]="&";
    }
    public static void posicionarBarcoDeQuatro(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<2;cont++){System.out.println("Insira as quatro coordenadas para colocar seu barco de 4 peças. As quatro coordenadas devem ser próximas umas das outras");
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord4=ocupacaoCheck(coord4,tabuleiro,input);
        conexaoBarcoDeQuatro(coord1,coord2,coord3,coord4,tabuleiro,input);
        mostrar(tabuleiro,player);
        }
    }
    public static void conexaoBarcoDeQuatro(int[]coord1,int[]coord2,int[]coord3,int[]coord4,String[][]tabuleiro,Scanner input)
    {
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        int conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        boolean validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1))
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1)
        && (coord3[0]-coord4[0]>=-1 && coord3[0]-coord4[0]<=1)&&(coord3[1]-coord4[1]>=-1 &&coord3[1]-coord4[1]<=1));
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar quatro coordenadas que estejam conectadas.");
        String eixoHorizontal=entradaEixoHorizontal(input);
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord4=ocupacaoCheck(coord4,tabuleiro,input);
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0])+(coord3[1]-coord4[1]);
        validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1))
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1)
        && (coord3[0]-coord4[0]>=-1 && coord3[0]-coord4[0]<=1)&&(coord3[1]-coord4[1]>=-1 &&coord3[1]-coord4[1]<=1));
        }
        tabuleiro[coord1[0]][coord1[1]]="&";
        tabuleiro[coord2[0]][coord2[1]]="&";
        tabuleiro[coord3[0]][coord3[1]]="&";
        tabuleiro[coord4[0]][coord4[1]]="&";
    }
    public static void posicionarBarcoDeCinco(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        System.out.println("Insira as cinco coordenadas para colocar seu barco de 5 peças. As cinco coordenadas devem ser próximas umas das outras");
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord4=ocupacaoCheck(coord4,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input); 
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord5=ocupacaoCheck(coord5,tabuleiro,input);
        conexaoBarcoDeCinco(coord1,coord2,coord3,coord4,coord5,tabuleiro,input);
        mostrar(tabuleiro,player);
    }
    public static void conexaoBarcoDeCinco(int[]coord1,int[]coord2,int[]coord3,int[]coord4,int[]coord5,String[][]tabuleiro,Scanner input){
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        int conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        int conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
        boolean validezCoordenada =((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1)&& (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1))
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1)
        && (coord3[0]-coord4[0]>=-1 && coord3[0]-coord4[0]<=1)&&(coord3[1]-coord4[1]>=-1 &&coord3[1]-coord4[1]<=1)
        && (coord4[0]-coord5[0]>=-1 && coord4[0]-coord5[0]<=1)&&(coord4[1]-coord5[1]>=-1 &&coord4[1]-coord5[1]<=1));
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar cinco coordenadas que estejam conectadas.");
        String eixoHorizontal=entradaEixoHorizontal(input);
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord3=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord3=ocupacaoCheck(coord3,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord4=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord4=ocupacaoCheck(coord4,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord5=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord5=ocupacaoCheck(coord5,tabuleiro,input);
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        conexaoCoord4eCoord5=(coord4[0]-coord5[0]) + (coord4[1]-coord5[1]);
        validezCoordenada =((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1)&& (conexaoCoord4eCoord5==1 || conexaoCoord4eCoord5==-1))
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1)
        && (coord3[0]-coord4[0]>=-1 && coord3[0]-coord4[0]<=1)&&(coord3[1]-coord4[1]>=-1 &&coord3[1]-coord4[1]<=1)
        && (coord4[0]-coord5[0]>=-1 && coord4[0]-coord5[0]<=1)&&(coord4[1]-coord5[1]>=-1 &&coord4[1]-coord5[1]<=1));
        }
        tabuleiro[coord1[0]][coord1[1]]="&";
        tabuleiro[coord2[0]][coord2[1]]="&";
        tabuleiro[coord3[0]][coord3[1]]="&";
        tabuleiro[coord4[0]][coord4[1]]="&";
        tabuleiro[coord5[0]][coord5[1]]="&";
    }
}    
