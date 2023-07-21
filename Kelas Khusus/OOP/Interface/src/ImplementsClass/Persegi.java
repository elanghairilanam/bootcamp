package ImplementsClass;

import Interface.OperasiBangunDatar;

public class Persegi implements OperasiBangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getKeliling() {
        double keliling;

        keliling = 4 * getSisi();

        return keliling;
    }

    @Override
    public double getLuas() {
        double luas;

        luas = getSisi() * getSisi();

        return luas;
    }
}
