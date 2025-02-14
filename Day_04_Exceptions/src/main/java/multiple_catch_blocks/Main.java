package multiple_catch_blocks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int [] arr= {10,15,20,30,50,20};
         //arr=null;     //to generate null pointer exception
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index to retrieve : ");
        int index=sc.nextInt();
         MultipleCatchDemo.generateException(arr,index);
    }
}
