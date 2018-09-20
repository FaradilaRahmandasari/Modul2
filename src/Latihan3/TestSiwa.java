
package Latihan3;

public class TestSiwa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Manda");
        siswa.setAge(22);
        siswa.setAddress("Malang");
        
        System.out.print("Name  : " + siswa.getName() 
        + " Absen    : " + siswa.getAbsen()
        + " Address  : " + siswa.getAddress());
    }
    
}
