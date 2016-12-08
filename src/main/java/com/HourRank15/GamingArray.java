package com.HourRank15;

import java.util.Scanner;

/**
 * Created by eplisgh on 07/12/2016.
 */
public class GamingArray {
    public static int solution(int[] value){
        int max=0;
        int count=0;
        for(int i=0;i<value.length;i++){
            if(value[i]>max){
                max=value[i];
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int elements=sc.nextInt();
        int[] value=new int[elements];
        for(int i=0;i<elements;i++){
            value[i]=sc.nextInt();
        }
        int turn=solution(value);
        System.out.println( ((turn & 1) == 0) ? "ANDY" : "BOB" );
    }
}


