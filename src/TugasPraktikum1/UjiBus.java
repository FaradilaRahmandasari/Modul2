
package TugasPraktikum1;


public class UjiBus {
       public static void main(String[]args){
           System.out.println("Faradila Rahmandasari/ XR6 / 22");
          //membuat objek busBesar dari class Bus
         
          busBesar busBesar = new busBesar(40);
         
          busBesar.getPenumpang(15);
          busBesar.getPenumpang(5);
          busBesar.getPenumpang(26);
          busBesar.getAverage();
       }
}

