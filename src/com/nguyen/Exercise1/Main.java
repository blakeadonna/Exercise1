//Johnny Nguyen, Exercise 1, 19/01/17
package com.nguyen.Exercise1;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your city name?");
        String city = input.nextLine();

        float div = 0;
        System.out.println("What is your zip?");
        int zip = Integer.parseInt(input.nextLine());

        int temp[] = {32, 25, 27, 40, 45};
        float sum = 0;
        for (int i = 0; i <= 4; i++){
            float sum1 = sum += temp[i];
            div = sum1/5;
        }
        System.out.println("Average High:" + div);


        System.out.println("City:" + " " + city);
        System.out.println("Zip:" + " " + zip);
    }
}
