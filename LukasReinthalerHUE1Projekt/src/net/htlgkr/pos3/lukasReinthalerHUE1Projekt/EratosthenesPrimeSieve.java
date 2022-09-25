package net.htlgkr.pos3.lukasReinthalerHUE1Projekt;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public String primes = "";

    @Override
    public boolean isPrime(int p) {
        if (p < 2) {
            return false;
        }
        if(p == 2){
            primes = primes + p + ", ";
            return true;
        }
        for (long i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        primes = primes + p +", ";
        return true;
    }

    @Override
    public void printPrimes() {
        System.out.println("Die Primzahlen lauten:");
        System.out.println(primes);
    }
}
