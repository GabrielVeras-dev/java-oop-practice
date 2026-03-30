package com.gabrielveras.polimorfismo;

public class Circulo extends Forma {

    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) throw new IllegalArgumentException("Raio deve ser positivo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getNome() { return "Circulo (raio=" + raio + ")"; }
}