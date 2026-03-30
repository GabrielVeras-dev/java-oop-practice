package com.gabrielveras.polimorfismo;

public class Triangulo extends Forma {

    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("Lados devem ser positivos");
        }
        // Validacao da desigualdade triangular
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new IllegalArgumentException("Os lados nao formam um triangulo valido");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Formula de Heron
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public String getNome() {
        return "Triangulo (" + ladoA + ", " + ladoB + ", " + ladoC + ")";
    }
}