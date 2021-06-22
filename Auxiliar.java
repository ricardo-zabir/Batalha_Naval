import java.util.Scanner;

 class Auxiliar
 /**
  * A classe {@code Auxiliar} contém subprogramas que auxiliam no programa MainApp para permitir
  * a realização do jogo Batalha Naval.
  * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.coM0
  * @version 2021-06-21
  * 
  */
{
    /**
     * O método ajusteDaCoordenada realiza uma conversão entre o modelo convencional de entrada de dados no jogo da batalha naval
     * para sua posição adequado no vetor do tabuleiro
     * @param eixoHorizontal a letra na qual representa qual coluna o jogador está se referindo
     * @param eixoVertical o número no qual representa qual linha o jogador está se referindo
     * @return a coordenada adequada do tabuleiro
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
    /**
     * O método mostrar tem como função mostrar o tabuleiro, podendo esse ser do jogador 1, jogador 2, tabuleiro do jogador 2 pela
     * perspectiva do jogador 1 e o tabuleiro do jogador 1 pela perspectiva do jogador 2.
     * @param tabuleiro refere-se ao tabuleiro que deve ser mostrado
     * @param player refere-se ao jogador a qual aquele tabuleiro pertence
     */
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
    /**
     * O método preencher serve para formar o tabuleiro do jogador
     * @param tabuleiro representa o tabuleiro qual deve ser preenchido
     */
    public static void preencher(String[][]tabuleiro){
        int i;
        int j;
        for( i =0; i<10;i++){
               for(j=0;j<10;j++){tabuleiro[i][j]="_";
                }
        }
    }
    /**
     * O método preencherAdv serve para o formar o tabuleiro do jogador adversário
     * @param tabuleiroadv o tabuleiro no qual vai ser preenchido
     */
    public static void preencherAdv(String[][]tabuleiroadv){
        int i;
        int j;
        for( i =0; i<10;i++){
               for(j=0;j<10;j++){tabuleiroadv[i][j]="?";
                }
        }
    }
    /**
     * O método posicionarBarcoDeDois tem como função o posicionamento de barcos de tamanho duas posições
     * @param tabuleiro o tabuleiro no qual esses barcos serão inseridos
     * @param player a identificação do jogador que está posicionando os barcos
     * @param input o scanner para entrada das coordenadas do barco
     */
    public static void posicionarBarcoDeDois(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<4;cont++){
        System.out.println("Insira as duas coordenadas para colocar seu barco de 2 peças. As duas coordenadas devem ser próximas umas das outras");
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
    /**
     * O método entradaEixoHorizontal realiza a entrada da letra que representa a coluna e a verificação
     * da validade desse dado. É de grande utilidade para corrigir caso o usuário insira ela junto do eixoVertical, o que geraria
     * problemas no funcionamento caso não corrigido.
     * @param input o scanner para permitir a entrada de dados
     * @return o string adequado
     */
    public static String entradaEixoHorizontal(Scanner input){
        String eixoHorizontal=input.next();
        while(eixoHorizontal.length()>1){
        System.out.println("Coordenada inadequada. Lembre-se de deixar um espaço entre a letra e o número e insira novamente");
        eixoHorizontal=input.next();
        } 
        return eixoHorizontal;
    }
    /**
     * O método entradaEixoVertical realiza a entrada do número inteiro que corresponde a linha e a verificação
     * da validade do dado. Verifica se está entre o intervalo válido.
     * @param input o scanner para permitir a entrada de dados
     * @param eixoHorizontal para que seja exibido na mensagem de erro em qual coluna o jogador escolheu para que ele reajuste a linha que quer
     * @return o número verificado e adequado
     */
    public static int entradaEixoVertical(Scanner input,String eixoHorizontal){
        int eixoVertical=input.nextInt();
        while(eixoVertical<1 || eixoVertical>10){
        System.out.println("Valores válidos = de 1 a 10. Insira novamente o número da linha que você quer ocupar da coluna "+eixoHorizontal);
        eixoVertical=input.nextInt();
        }
        return eixoVertical;
    }
    /**
     * O método ocupacaoCheck verifica se a coordenada em questão está ocupada já e se esse for o caso, pede a repetição da entrada 
     * da coordenada
     * @param coord a coordenada que será verificada
     * @param tabuleiro o tabuleiro no qual será verificada a ocupação
     * @param input o scanner para permitir a entrada de uma coordenada nova caso a anterior já esteja ocupada
     * @return uma coordenada que não está ocupada e portanto é válida.
     */
    public static int[] ocupacaoCheck(int[]coord,String[][]tabuleiro,Scanner input){
        boolean verificacaoDeOcupacao= tabuleiro[coord[0]][coord[1]].equals("&");
        while(verificacaoDeOcupacao==true){
        System.out.println("Coordenada já ocupada. Favor selecionar outra");
        String eixoHorizontal=entradaEixoHorizontal(input); 
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        verificacaoDeOcupacao= tabuleiro[coord[0]][coord[1]].equals("&");
        }
        return coord;
    }
    /**
     * O método conexaoBarcoDois checa se as duas coordenadas para o barco de duas posições estão conectadas e são portanto, válidas.
     * @param coord1 a primeira coordenada do barco
     * @param coord2 a segunda coordenada do barco
     * @param tabuleiro o tabuleiro no qual os barcos serão posicionados quando forem válidos
     * @param input o scanner para permitir a realização de uma reentrada caso a primeira combinação de coordenada não seja válida
     */
    public static void conexaoBarcoDois(int[]coord1,int[]coord2,String[][]tabuleiro,Scanner input){
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        boolean validezCoordenada = ((conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1))&&
        (coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1);
        //Loop para validar as coordenadas
        while(validezCoordenada==false){
        System.out.println("Coordenada inválida, favor informar duas coordenadas que estejam conectadas.");
        String eixoHorizontal=entradaEixoHorizontal(input); 
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord1=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord1=ocupacaoCheck(coord1,tabuleiro,input);
        eixoHorizontal=entradaEixoHorizontal(input);
        eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        coord2=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        coord2=ocupacaoCheck(coord2,tabuleiro,input);
        conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        validezCoordenada = ((conexaoCoord1eCoord2==1) || (conexaoCoord1eCoord2==-1))&&
        (coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1);
        }
        tabuleiro[coord1[0]][coord1[1]]="&";
        tabuleiro[coord2[0]][coord2[1]]="&";
    }
    /**
     * O método posicionarBarcoDeTres tem como função o posicionamento de barcos de tamanho três posições
     * @param tabuleiro o tabuleiro no qual esses barcos serão inseridos
     * @param player a identificação do jogador que está posicionando os barcos
     * @param input o scanner para entrada das coordenadas do barco
     */
    public static void posicionarBarcoDeTres(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<3;cont++){
        System.out.println("Insira as três coordenadas para colocar seu barco de 3 peças. As três coordenadas devem ser próximas umas das outras");
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
    /**
     * O método conexaoBarcoDeTres checa se as três coordenadas para o barco de três posições estão conectadas e são portanto, válidas.
     * @param coord1 a primeira coordenada do barco
     * @param coord2 a segunda coordenada do barco
     * @param coord3 a terceira coordenada do barco
     * @param tabuleiro o tabuleiro no qual os barcos serão posicionados quando forem válidos
     * @param input o scanner para permitir a realização de uma reentrada caso a primeira combinação de coordenada não seja válida
     */
    public static void conexaoBarcoDeTres(int[]coord1,int[]coord2,int[]coord3,String[][]tabuleiro,Scanner input){
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        boolean validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1)) 
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1));
        while(validezCoordenada==false){
        System.out.println("Coordenada inválida, favor informar três coordenadas que estejam conectadas.");
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
    /**
     * O método posicionarBarcoDeQuatro tem como função o posicionamento de barcos de tamanho quatro posições
     * @param tabuleiro o tabuleiro no qual esses barcos serão inseridos
     * @param player a identificação do jogador que está posicionando os barcos
     * @param input o scanner para entrada das coordenadas do barco
     */
    public static void posicionarBarcoDeQuatro(String[][]tabuleiro,String player,Scanner input){
        int eixoVertical;
        String eixoHorizontal;
        int cont;
        for(cont=0;cont<2;cont++){
        System.out.println("Insira as quatro coordenadas para colocar seu barco de 4 peças. As quatro coordenadas devem ser próximas umas das outras");
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
    /**
     * O método conexaoBarcoDeQuatro checa se as quatro coordenadas para o barco de quatro posições estão conectadas e são portanto, válidas.
     * @param coord1 a primeira coordenada do barco
     * @param coord2 a segunda coordenada do barco
     * @param coord3 a terceira coordenada do barco
     * @param coord4 a quarta coordenada do barco
     * @param tabuleiro o tabuleiro no qual os barcos serão posicionados quando forem válidos
     * @param input o scanner para permitir a realização de uma reentrada caso a primeira combinação de coordenada não seja válida
     */
    public static void conexaoBarcoDeQuatro(int[]coord1,int[]coord2,int[]coord3,int[]coord4,String[][]tabuleiro,Scanner input)
    {
        int conexaoCoord1eCoord2=(coord1[0]-coord2[0]) + (coord1[1]-coord2[1]);
        int conexaoCoord2eCoord3= (coord2[0]-coord3[0]) + (coord2[1]-coord3[1]);
        int conexaoCoord3eCoord4=(coord3[0]-coord4[0]) + (coord3[1]-coord4[1]);
        boolean validezCoordenada=((conexaoCoord1eCoord2==1 || conexaoCoord1eCoord2==-1) && (conexaoCoord2eCoord3==1 || conexaoCoord2eCoord3==-1) && (conexaoCoord3eCoord4==1 || conexaoCoord3eCoord4==-1))
        && ((coord1[0]-coord2[0]>=-1 && coord1[0]-coord2[0]<=1) && (coord1[1]-coord2[1]>=-1 && coord1[1]-coord2[1]<=1) 
        && (coord2[0]-coord3[0]>=-1 && coord2[0]-coord3[0]<=1)&&(coord2[1]-coord3[1]>=-1 &&coord2[1]-coord3[1]<=1)
        && (coord3[0]-coord4[0]>=-1 && coord3[0]-coord4[0]<=1)&&(coord3[1]-coord4[1]>=-1 &&coord3[1]-coord4[1]<=1));
        while(validezCoordenada==false){
        System.out.println("Coordenada inválida, favor informar quatro coordenadas que estejam conectadas.");
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
    /**
     * O método posicionarBarcoDeCinco tem como função o posicionamento de barcos de tamanho cinco posições
     * @param tabuleiro o tabuleiro no qual esses barcos serão inseridos
     * @param player a identificação do jogador que está posicionando os barcos
     * @param input o scanner para entrada das coordenadas do barco
     */
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
    /**
     * O método conexaoBarcoDeCinco checa se as cinco coordenadas para o barco de cinco posições estão conectadas e são portanto, válidas.
     * @param coord1 a primeira coordenada do barco
     * @param coord2 a segunda coordenada do barco
     * @param coord3 a terceira coordenada do barco
     * @param coord4 a quarta coordenada do barco
     * @param coord5 a quinta coordenada do barco
     * @param tabuleiro o tabuleiro no qual os barcos serão posicionados quando forem válidos
     * @param input o scanner para permitir a realização de uma reentrada caso a primeira combinação de coordenada não seja válida
     */
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
        while(validezCoordenada==false){
        System.out.println("Coordenada inválida, favor informar cinco coordenadas que estejam conectadas.");
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
    /**
     * O método ataque é responsável por realizar a entrada da coordenada do adversário que o jogador quer atacar
     * @param input o scanner para realizar a entrada
     * @return a coordenada do ataque do jogador
     */
    public static int[] ataque(Scanner input){
        String eixoHorizontal=entradaEixoHorizontal(input);
        int eixoVertical=entradaEixoVertical(input,eixoHorizontal);
        int[]palpite=Auxiliar.ajusteDaCoordenada(eixoHorizontal,eixoVertical);
        return palpite;
    }
    /**
     * O método ataqueCheck confere se a coordenada atacada continha barco ou não, e transfere para os tabuleiros o resultado disso
     * @param tabuleiro o próprio tabuleiro do jogador
     * @param tabuleiroAdv o tabuleiro do adversário pela ótica do próprio jogador
     * @param input o scanner para realizar a entrada
     * @param palpite a coordenada atacad
     * @param barcosDetonados para atualizar a contagem de barcosDetonados se for o caso
     * @return o número atualizado de barcos detonados
     */
    public static int ataqueCheck(String[][]tabuleiro,String[][]tabuleiroAdv,Scanner input,int[]palpite,int barcosDetonados){
        if(tabuleiro[palpite[0]][palpite[1]].equals("&")){tabuleiroAdv[palpite[0]][palpite[1]]="!";tabuleiro[palpite[0]][palpite[1]]="*";barcosDetonados=barcosDetonados+1;
        }
        else{tabuleiroAdv[palpite[0]][palpite[1]]="X";tabuleiro[palpite[0]][palpite[1]]="*";
        }
        return barcosDetonados;
    }
}    
