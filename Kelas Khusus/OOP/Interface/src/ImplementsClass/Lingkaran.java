package ImplementsClass;

import Interface.OperasiBangunDatar;
import Interface.PiInterface;

public class Lingkaran implements OperasiBangunDatar, PiInterface {

    private double radius;

    private final double piValue = PI_Value;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPiValue() {
        return piValue;
    }

    @Override
    public double getKeliling() {
        double keliling;

        keliling = 2 * getPiValue() * getRadius();

        return keliling;
    }

    @Override
    public double getLuas() {
        double luas;

        luas = getPiValue() * getRadius() * getRadius();

        return luas;
    }
}
