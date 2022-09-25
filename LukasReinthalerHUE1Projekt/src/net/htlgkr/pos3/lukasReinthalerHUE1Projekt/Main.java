package net.htlgkr.pos3.lukasReinthalerHUE1Projekt;

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve();
        Scanner s = new Scanner(System.in);
        System.out.println("Bis wohin sollen die Primzahlen berechnet werden?");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            e.isPrime(i);
        }
        e.printPrimes();
    }
}
