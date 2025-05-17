/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author kavin
 */
public class ExceptionExample {
 
    public static void main(String[] args) throws EvenException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        if(n%2==0){
            throw new EvenException("only enter odd number");
        }
        else{
            System.out.println("odd number");
        }
        
    }
}
