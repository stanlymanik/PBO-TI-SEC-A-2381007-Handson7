package Abstraksiv2;

public class Printer implements abstraksiv2.Cetak {
    @Override
    public void print(){
        System.out.println("Mencetak Dokumen..........");
    }

    @Override
    public void scan(){
        System.out.println("Memindai Dokumen..........");
    }
}