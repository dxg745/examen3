package pe.edu.upeu.matrices;

import java.util.Scanner;

public class Examen {
       static Scanner cs=new Scanner(System.in);
   
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    public static int[][] transformada07(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for(int j = 0; j <dim; j++){
            for (int i = 0; dim-1-i >=0+j; i++) {
                M[j][i]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] transformada29(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
            for (int c = 0; c < dim/2; c++) {
                for (int ld = c; ld < dim-1-c; ld++) {
                    M[c][ld]=numInit;
                    numInit++;
                }
                for (int li = c; li <dim-1-c; li++) {
                    M[li][dim-1-c]=numInit;
                    numInit++;
                }
                for (int liz = dim-1-c; liz > c; liz--) {
                    M[dim-1-c][liz]=numInit;
                    numInit++;
                }
                for (int ls = dim-1-c; ls > c; ls--) {
                    M[ls][c]=numInit;
                    numInit++;
                }
            }
            if(dim%2!=0);{
            M[dim/2][dim/2]=numInit;
        }      
        return M;
    }

    public static void main(String[] args) {
        //imprimirMatriz(transformada07());
        imprimirMatriz(transformada29());
    }
}
