package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] favMovie = new String[20];
        Scanner input = new Scanner(System.in);
        String control = "";
        int counter=0;
        System.out.println("Please Enter the Tile of your favorite moives");
        favMovie[counter]=(input.nextLine()).toLowerCase();
        do{


            System.out.println("keep Entereing your fav list or press Q if you've exahusted your list ");
            control=(input.nextLine()).toLowerCase();
            if (!control.equals("q"))

             favMovie[counter+1]=control;

            counter++;

        }while(!control.equals("q"));
        System.out.println("THE LIST OF YOUR FAV MOVIES ARE ");
        for(int x=0;x<=counter-1 ;x++){

            System.out.println(favMovie[x]);


        }


    }
}
