package Guia5.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio6 {
    
     public static void imprimirMatriz(int [][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[][] cuadroMagico = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero del 1 al 9 en la matriz");
                int num = consola.nextInt();
                while (num < 0 || num > 10) {
                    System.out.println("Valor incorrecto, ingrese un numero entre el 1 y el 9");
                    num = consola.nextInt();
                }
                cuadroMagico[i][j] = num;
            }
        }
        
        
        
//        imprimirMatriz(cuadroMagico);
    }
}
