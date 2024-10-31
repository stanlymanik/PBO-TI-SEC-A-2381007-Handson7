package Enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount PodaAlvienDamanik = new BankAccount(100);

        PodaAlvienDamanik.withDraw(10);
        System.out.println("Current balance is: " + PodaAlvienDamanik.getBalance() );
    }
}