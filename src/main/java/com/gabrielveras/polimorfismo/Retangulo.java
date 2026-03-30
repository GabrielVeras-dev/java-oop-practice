package com.gabrielveras.polimorfismo;

public class Retangulo extends Forma {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Dimensoes devem ser positivas");
        }
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String getNome() {
        return "Retangulo (" + largura + "x" + altura + ")";
    }
}