/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Star1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int sum=0;
        boolean c=true;
        int i=0;
        int z;
        ArrayList <Integer> d = new ArrayList <Integer> ();
        File x= new File("c://number.txt");
        Scanner sc=new Scanner(x);
        while(sc.hasNextLine()){
            int y=sc.nextInt();
            //System.out.println(y);
            sum=sum+y;
            d.add(sum);
            i=i+1;
        }
        /*System.out.println(sum);
        System.out.println(d);*/
        int [] star=new int[i];
        for(int m=0;m<i;m++){
            star[m]=d.get(m);
        }
        while(c==true){
            star[0]=sum;
            for(int m=1;m<i;m++){
                star[m]=star[m]+star[m-1];
            }
            for(int m=0;m<i;m++){
                sum=sum+star[m];
            }
            for(int a=0; a<i;a++){
               // System.out.println(star[a]);
                for(int b=0;b<i;b++){
                    if(a!=b){
                        if(star[a]==star[b]){
                            c=false;
                            System.out.println(star[a]);
                            break;
                        }
                    }
                }
            }
        }
        
        
        
    }
    
}
