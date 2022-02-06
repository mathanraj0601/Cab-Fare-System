package com.mathan;
//cab fare System

import java.util.Scanner;

class Cab {
    int fare;
    void showFare()
    {
        System.out.println("the fare amount is"+" "+ fare);
    }
}

class RideCab
{
    public static void main(String[] args) {
        Cab id = new Cab();
        int d;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Travel distance in km");

        d = sc.nextInt();
        id.fare = 10 * d ;
        id.showFare();

    }
}

//Reservation charge involved that is payable after we cancelled