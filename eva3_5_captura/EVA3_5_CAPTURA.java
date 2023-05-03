/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA3_5_CAPTURA {

    public static void main(String[] args) {
        int x;
        
         
         do{
             try{
                 Scanner input = new Scanner (System.in);
             System.out.println("INTRODUZCA EL VALOR (ENTERO) DE X :");
             x = input.nextInt();
             break;
             }catch(InputMismatchException e){
                 System.out.println("NO SE INTRODUJO UN NÚMERO VÁLIDO. VUELVE A CAPTURAR");
             }
         }while(true);
         System.out.println("VALOR DE X ES IGUAL: "+x);
    }
}
