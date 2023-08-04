/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
/*
Program Pertama
public class Mavenproject1 {

    public static void main(String[] args) {     
      
    }
}

class Lingkaran {
    
}
*/

public class Mavenproject1 {

    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Anda ");
        bil = input.nextInt();
        if(bil >= 0){
            System.out.println("Bilangan Boleh dimasukkan");
        }
        if(bil == 1){
            System.out.println("Bilangan Boleh dimasukkan");
        }
        else{
            System.out.println("Bilangan Anda Ganjil");
        }
    }
}

