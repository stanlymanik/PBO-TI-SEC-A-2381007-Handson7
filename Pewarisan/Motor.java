package Pewarisan;

public class Motor extends Kendaraan {
    private int kapasitasMesin;
    private String jenisTransmisi;

    public Motor(String merek, String model, String tahunProduksi,int kapasitasMesin, String jenisTransmisi) {
        super(merek, model, tahunProduksi);
        this.kapasitasMesin = kapasitasMesin;
        this.jenisTransmisi = jenisTransmisi;
    }

    public void infoMotor(){
        super.infoKendaraan();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }
}