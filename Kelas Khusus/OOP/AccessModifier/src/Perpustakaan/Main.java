package Perpustakaan;

public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java untuk programmer","Sianipar, R.H");


        System.out.println("Judul Buku : " + buku.getJudul());
        System.out.println("Pengarang : " + buku.getPengarang());
    }
}
