/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL;

/**
 *
 * @author ACER
 */
public class buatBintang {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");      
            
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");               
            }
            System.out.println("");
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
                           }
            System.out.println("");          
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < i + 4; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}
