package Latihan2;

public class UjiBus {

    public static void main(String[] args) {

        // Membuat objek busBesar dari class Bus
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();

        // Penambahan penumpang
        busBesar.addPenumpang(15); // Menambahkan 15 penumpang
        busBesar.cetak();

        // Penambahan penumpang
        busBesar.addPenumpang(5); // Menambahkan 5 penumpang
        busBesar.cetak();

        // Penambahan penumpang
        busBesar.addPenumpang(26); // Menambahkan 26 penumpang
        busBesar.cetak();

    }

}
