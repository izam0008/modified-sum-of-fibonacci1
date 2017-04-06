/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int count=sc.nextInt();
        int n1=0,n2=1,n3;    
        System.out.print(n2+" ");//printing 0 and 1    
    
        for(int i=1;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(n3+" ");    
         n1=n2;    
         n2=n3;    
        }    
    }
}
