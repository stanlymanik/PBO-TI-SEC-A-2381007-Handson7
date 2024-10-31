package Pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota","Avanza","2022",4,"Pertalite");
        Motor motorku = new Motor("Honda","CBR250RR","2021",400,"Manual");

        mobilku.infoKendaraan();
        mobilku.infoMobil();

        motorku.infoKendaraan();
        motorku.infoMotor();
    }
}