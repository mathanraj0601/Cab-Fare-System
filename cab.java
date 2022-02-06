package com.mathan;
//cab fare System
//reservation charge is Rs.40
//Per kilometer charge is Rs.10
//more than 5 kilometer charge 10 Rs per km
import java.util.Scanner;

class Cab {
    int fare;
    Cab() {
        this.fare = 40;
    }
    Cab(int d_user)
    {
        this.fare=40+10*(d_user-5);
    }
    void showFare()
    {
        System.out.println("the fare amount is"+" "+ fare);
    }
}
//constructor will initialize data member of the objects
class RideCab
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        Cab id = new Cab();
        int d;//distance travelled by the user
        int d_user;
        System.out.println("Enter the distance of cab from the user");
        d_user = sc.nextInt();
        if(d_user<=5)
        {
            Cab id = new Cab();//Local object
            System.out.println("Enter the Travel distance in km");
            d = sc.nextInt();
            id.fare += 10 * d ;
            id.showFare();
        }
        else {
            Cab id = new Cab(d_user);//local objects
            System.out.println("Enter the Travel distance in km");
            d = sc.nextInt();
            id.fare += 10 * d;
            id.showFare();
        }

    }
}

//Reservation charge involved that is payable even after we cancelled
