package ImplementsClass;

import Interface.OperasiBangunDatar;

public class SegiPanjang implements OperasiBangunDatar {
    private double panjang;
    private double lebar;

    public SegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double getKeliling() {

        double keliling = 0;

        keliling = (2*getPanjang()) + (2*getLebar());

        return keliling;

    }

    @Override
    public double getLuas() {
        double luas = 0;

        luas = getPanjang() * getLebar();

        return luas;
    }
}
