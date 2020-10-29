package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinimum{
    ArrayList<Integer> numbers;
    Scanner sc = new Scanner(System.in);
    int count ;
    int max = 0;
    int min = 10000;
    int maxPlace = 0;
    int minPlace = 0;
    public MaxMinimum(){
        
        count = sc.nextInt();
        numbers = new ArrayList<Integer>(count);
        input();
        findPlace();
        print();
        
    }
    public void input(){
        for(int i = 0; i < count; i++){
            numbers.add(sc.nextInt());
            if(numbers.get(i) > max) max = numbers.get(i);
            else if(numbers.get(i) <= min) min = numbers.get(i);
        }
    }
    public void findPlace(){
        
            maxPlace = numbers.indexOf(max);
            minPlace = numbers.indexOf(min); 
        
    }
    public void print(){
        maxPlace += 1;
        minPlace += 1;
        System.out.println(maxPlace +  " : " + max );
        System.out.println(minPlace +  " : " + min );
    }
}