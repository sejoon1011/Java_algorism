

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Set{
    int [] set1  ;
    int []set2 ;
    int count1;
    int count2;
    ArrayList <Integer> intersection  ;
    ArrayList <Integer> union ;
    Scanner sc = new Scanner(System.in);
    Set(){
        count1 = sc.nextInt();
        set1 = new int[count1];
        set1();
        count2 = sc.nextInt();
        set2 =  new int[count2];
        intersection = new ArrayList<Integer>(count1);
        union = new ArrayList<Integer>(count2);
        set2(); 
        calc();
        Arrays.sort(set1);
        Arrays.sort(set2);
    
        
    }
    public void set1(){
        for(int i = 0; i < set1.length; i++){
            System.out.print("배열 값 입력:");  
            set1[i] = sc.nextInt();
        }
    }
    public void set2(){
        for(int i = 0; i < set2.length; i++){
             System.out.print("배열 값 입력:");  
            set2[i] = sc.nextInt();
        }
    }
    
    public void calc(){
        int k = 0;
        //교집합 배열 생성
        for(int i = 0; i < set1.length; i++){
            for(int j = 0; j < set2.length; j++){
                if(set1[i] == set2[j]) {
                    System.out.println("test" + k);
                    intersection.add(set1[i]);
                    System.out.println(intersection.get(k));
                    k++;
                }
            }
            //합집합 배열 생성
        
        for(int j = 0; j < set2.length; j++){
                
               if(set1[i] == set2[j]) { 
                 union.add(set1[j]);
                    continue;
                }
            
                union.add(set1[j]);
                k++;
                union.add(set2[j]);
                k++;
                
            }
        
        }
    }
    public void print(){
        System.out.println("교집합");
        for(int num : intersection){
            System.out.print(num + " ");
        }
        System.out.println("합집합");
        for(int num : union){
            System.out.print(num + " ");
        }
    }
    
    
}