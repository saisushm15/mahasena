/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasena;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class Mahasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt(); 
        for(int i=0;i<n1;i++)
        {  
          if(n1%2==0)
          {
              n2++;
          }
          else
          {
              n1++;
          }
        }
        if(n2>n1)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }
    }
}

   
    

