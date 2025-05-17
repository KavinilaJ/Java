/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author kavin
 */
public class EvenException extends Exception{
    public EvenException(String message){
        super(message);
        System.out.println("Even Exception");
                
    }
}
