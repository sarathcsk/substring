/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stsubst;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Stsubst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String s1,s2,s3;
        char c[]=new char[20];
        char c1[]=new char[20];
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st string");
        s1=s.nextLine();
        System.out.println("enter 2nd string");
        s2=s.nextLine();
        int flag=0;
        for(int i=0;i<s1.length();i++)
        {
            c[i]=s1.charAt(i);
        }
        for(int j=0;j<s2.length();j++)
        {
            c1[j]=s2.charAt(j);
        }
        for(int i=0;i<=(s1.length()-1);i++)
        {
            
            for(int j=0;j<=(s2.length()-1);j++)
            {
                if(c[i]==c1[j])
                {
                    
                    if(c[i+1]==c1[j+1])
                    {
                       // System.out.println("true");
                        //System.out.print(c[i]+" --- "+c1[j]+"  ");
                        //flag=1;
                        //break;
                        flag++;
                    }
                            
                   
                }
            }
        }int b=-1;
                //else
                //{
                  //  System.out.println("no sub str pre");
                    //break;
                //}
                if(flag==s2.length())
                {
                   System.out.println(""+flag);
                    
                }
                else
                {
                    System.out.println(""+b);
                }
                
    }
    
}
