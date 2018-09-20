package TugasPraktikum2;

class Bola {

    private double jarijari = 14;
    private double diameter;
    private double luaspermukaan;
    private double volume;

    public void setJari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        this.diameter = 2 * jarijari;
    }

    public void showLuasPermukaan() {
        this.luaspermukaan = 4 * Math.PI * jarijari * jarijari;
    }

    public void showVolume() {
        this.volume = (4 * Math.PI * jarijari * jarijari * jarijari) / 3;
    }

    public void cetak() {
        System.out.println("Jari-jari : " + jarijari + " cm   ");
        System.out.println("Diameter  : " + diameter + " cm   ");
        System.out.println("______________________________ ");
        System.out.println("Luas      : " + luaspermukaan + " cm^2");
        System.out.println("Volume    : " + volume + " cm^3");
    }
}
