
 class Auxiliar
{
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
}
