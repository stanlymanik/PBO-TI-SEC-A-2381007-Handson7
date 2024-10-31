package Pewarisan;

public class Kendaraan {
    private String merek;
    private String model;
    private String tahunProduksi;

    public Kendaraan(final String merek,final String model,final String tahunProduksi){
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void infoKendaraan(){
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}