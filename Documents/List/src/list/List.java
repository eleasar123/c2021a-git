/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 2ndyrGroupA
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> words=new ArrayList<String>();
        words.add("Ambrad");
        words.add("Belda");
        words.add("Baterna");
        words.set(1, "Patot");
        words.remove(0);
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.get(1));
        System.out.println(words.isEmpty());
        
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums.size());
//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.iterator());
//        }

        String[] stringarray={"a","a","b","c","d","b"};
        Set<String> stringset=new HashSet<String>(Arrays.asList(stringarray));
        System.out.println(stringset);
        Map<String, String> names=new HashMap<String, String>();
        names.put("name","Ean");
        names.put("name","Eleasar");
        names.put("age","20");
        System.out.println(names.get("name"));
        Set<Integer> num2=new HashSet<Integer>();
        System.out.println(num2.isEmpty());
        System.out.println(num2.size());
    }
    
}
