/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evensum;

/**
 *
 * @author 19j01acs039
 */
public class EvenSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=10;i=i+2){
            sum=sum+i;
        }
     System.out.println("sum of even numbers ="+sum);
    }
    
}
