/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Star2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file= new File("c://star2.txt");
        Scanner sc=new Scanner(file);
        String [] letters = null;
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        int count2=0;
        int count3=0;
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            letters=line.split("");
           // System.out.println(Arrays.toString(letters));
        
            for (String letter : letters) {
                if(map.containsKey(letter)){
                    map.put(letter,map.get(letter)+1);
                }
                else{
                    map.put(letter,1);
                }
            }
            System.out.println(map);
            if(map.containsValue(2)){
                count2=count2+1;
            }
            if(map.containsValue(3)){
                count3=count3+1;
            }
            System.out.println(count2+", "+count3);
            map.clear();
        }
        int checksum=count2*count3;
        System.out.println(checksum);
    }
    
}
