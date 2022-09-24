package net.htlgkr.pos3.lukasReinthalerHUE1Projekt;

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Bis wohin sollen die Primzahlen berechnet werden?");
        int n = s.nextInt();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve();
        e.sieveOfEratosthenes(n);
    }
}
