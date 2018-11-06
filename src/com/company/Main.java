package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        //Pedimos el numero y lo asignamos a la variable
        System.out.println("Introduzca un número entre 0 y 9.999:\n");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();
        //Comprobamos que el número introducido esta en el rango que hemos definido, y si no lo esta, volvemos a pedir un número por consola
        while(numero<0||numero>9999) {
            System.out.println("Introduzca un número entre 0 y 9.999:\n");
            numero = sc.nextInt();
        }
        //A cada cifra del número introducido, le daremos una posición, dividiendo el numero entre 10 y quedandonos con el resto, y repitiendo por cada cifra.
        int pos4, pos3, pos2, pos1;
        pos4=numero%10;
        numero=numero/10;
        pos3=numero%10;
        numero=numero/10;
        pos2=numero%10;
        numero=numero/10;
        pos1=numero;

        //Imprimimos las cifras en orden opuesto, utilizando el if para evitar que se añadan ceros si el número tiene menos de cuatro cifras.
        if(pos3==0){
            System.out.printf("%d", pos4);
        }else{
            if(pos2==0){
                System.out.printf("%d%d", pos4,pos3);
            }else{
                if(pos1==0){
                    System.out.printf("%d%d%d", pos4, pos3, pos2);
                }else{
                    System.out.printf("%d%d%d%d", pos4,pos3,pos2,pos1);
                }
            }
        }
        //Cerramos el scanner.
        sc.close();
    }
}
