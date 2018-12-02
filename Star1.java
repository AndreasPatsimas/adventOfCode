/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star1;

import java.io.File;
import java.io.FileNotFoundException;
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
        File x= new File("c://number.txt");
        Scanner sc=new Scanner(x);
        while(sc.hasNextLine()){
            int y=sc.nextInt();
            System.out.println(y);
            sum=sum+y;
        }
        System.out.println(sum);
    }
    
}
