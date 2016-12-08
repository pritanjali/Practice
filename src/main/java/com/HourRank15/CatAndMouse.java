package com.HourRank15;

import java.util.Scanner;

/**
 * Created by eplisgh on 07/12/2016.
 */
public class CatAndMouse {
    public static void solve (int x,int y,int z){
        int a= Math.abs(z-x);
        int b=Math.abs(z-y);

        if(a==b){
            System.out.println("Mouse run away");
        }
        else if(a>b){
            System.out.println("Cat A");
        }
        else{
            System.out.println("Cat B");
        }
    }
    public static void main(String args[]){
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        while(limit!=0){
             x=sc.nextInt();
             y=sc.nextInt();
             z=sc.nextInt();
            solve(x,y,z);
        }

    }

}
