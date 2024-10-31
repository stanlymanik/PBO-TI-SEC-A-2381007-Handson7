package Abstraksi;

public class Main {
    public static void main(String[] args) {
        abstraksi.Perahu perahuMerah = new abstraksi.Perahu("Merah");
        abstraksi.Mobil mobilMerah = new abstraksi.Mobil("Merah");

        perahuMerah.bergerak();
        mobilMerah.bergerak();
    }
}