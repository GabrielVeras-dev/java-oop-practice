package com.gabrielveras.polimorfismo;

// Classe abstrata — define contrato para todas as formas geometricas.
// Polimorfismo: cada forma calcula area e perimetro de forma diferente mas pode ser tratada genericamente como Forma.
public abstract class Forma {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract String getNome();

    @Override
    public String toString() {
        return String.format("%s | Area: %.2f | Perimetro: %.2f",
                getNome(), calcularArea(), calcularPerimetro());
    }
}