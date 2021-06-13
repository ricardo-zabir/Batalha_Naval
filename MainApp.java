//Primeiro esboço do projeto BatalhaNaval. O programa imprime um tabuleiro composto por um vetor 10x10 e pede a entrada 
//do usuário de duas coordenadas para o posicionamento de um barco de tamanho duas posições. Após isso, é impresso o tabuleiro atualizado
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
        String vert;
        int horz;
        String[][]meuTabuleiro=new String[10][10];int i=0; int j=0; int k=1;
        for( i =0; i<10;i++){
           for(j=0;j<10;j++){meuTabuleiro[i][j]="_";
            }
        }
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(meuTabuleiro[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Insira as duas coordenadas para colocar seu barco de 2 peças. As duas coordenadas devem ser próximas umas das outras");
        vert=input.next(); 
        horz=input.nextInt();
        int[]coord=Auxiliar.ajusteDaCoordenada(vert,horz);
        vert=input.next();
        horz=input.nextInt();
        int[]coord2=Auxiliar.ajusteDaCoordenada(vert,horz);
        boolean validezCoordenada = ((coord[0]==coord2[0]) && ((coord[1]==coord2[1]-1)||(coord[1]==coord2[1]+1))) || 
        ((coord[1]==coord[1]) && ((coord[0]==coord2[0]-1)||(coord[0]==coord2[0]+1)));
        while(validezCoordenada==false){System.out.println("Coordenada inválida, favor informar duas coordenadas que sejam próximas umas das outras");
        vert=input.next(); 
        horz=input.nextInt();
        coord=Auxiliar.ajusteDaCoordenada(vert,horz);
        vert=input.next();
        horz=input.nextInt();
        coord2=Auxiliar.ajusteDaCoordenada(vert,horz);
        validezCoordenada = ((coord[0]==coord2[0]) && ((coord[1]==coord2[1]-1)||(coord[1]==coord2[1]+1))) || 
        ((coord[1]==coord[1]) && ((coord[0]==coord2[0]-1)||(coord[0]==coord2[0]+1)));}
        meuTabuleiro[coord[0]][coord[1]]="&";
        meuTabuleiro[coord2[0]][coord2[1]]="&";
        System.out.println("   |A|B|C|D|E|F|G|H|I|J|");
        for( i =0; i<10;i++){
            if(k<10){System.out.print(k+"  ");}else{System.out.print(k+" ");}
            System.out.print("|");
           for(j=0;j<10;j++){System.out.print(meuTabuleiro[i][j]+"|");
            }
            System.out.println();
            k++;
        }
        
    
    }
}
