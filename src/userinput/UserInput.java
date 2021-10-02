/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner obj =new Scanner (System.in);
        //int
        System.out.println("Enter Your Name:");
        String name= obj.nextLine();
        System.out.println("Enter your age in words:");
        String age= obj.nextLine();
        //String sum= num+num2;
        System.out.println("My name is "+name.toUpperCase());
        System.out.println("My age in word  is "+age.toUpperCase());
        //System.out.println("The sum is  "+sum);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
