 class Auxiliar
{
    public static int[] ajusteDaCoordenada(String vert, int horz){
        int[]coord=new int[2];
        if(vert.equals("a")||vert.equals("A")){coord[0]=0;}
        if(vert.equals("b")||vert.equals("B")){coord[0]=1;}
        if(vert.equals("c")||vert.equals("C")){coord[0]=2;}
        if(vert.equals("d")||vert.equals("D")){coord[0]=3;}
        if(vert.equals("e")||vert.equals("E")){coord[0]=4;}
        if(vert.equals("f")||vert.equals("F")){coord[0]=5;}
        if(vert.equals("g")||vert.equals("G")){coord[0]=6;}
        if(vert.equals("h")||vert.equals("H")){coord[0]=7;}
        if(vert.equals("i")||vert.equals("I")){coord[0]=8;}
        if(vert.equals("j")||vert.equals("J")){coord[0]=9;}
        coord[1]=horz-1;
        return coord;
    
    }
    
   
}
