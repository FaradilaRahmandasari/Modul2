package Latihan1;

public class UjiBus {
    public static void main(String[] args){
        //  Membuat objek busMini dari kelas Bus
        Bus1 busmini = new Bus1();
        //  Memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busmini.penumpang = 5 ;
        busmini.maxPenumpang = 15 ;
        // Memanggil method cetak pada kelas Bus
        busmini.cetak();
        
        //  Menambahkan penumpang pada busMini
        busmini.penumpang = busmini.penumpang + 5 ;
        //  Memanggil method cetak pada kelas Bus
        busmini.cetak();
        
        //  Mengurangi jumlah penumpang pada busMini
        busmini.penumpang = busmini.penumpang - 2 ;
        busmini.cetak();
        
        //  Menambahkan jumlah penumpang pada busMini
        busmini.penumpang = busmini.penumpang + 5 ;
        busmini.cetak();
        
    }
    
}
