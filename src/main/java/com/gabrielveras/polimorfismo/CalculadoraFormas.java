package com.gabrielveras.polimorfismo;

import java.util.ArrayList;
import java.util.List;

// Polimorfismo em acao: trabalha com List<Forma> sem saber qual tipo especifico de forma esta sendo processado
public class CalculadoraFormas {

    private final List<Forma> formas = new ArrayList<>();

    public void adicionarForma(Forma forma) {
        formas.add(forma);
    }

    public void exibirFormas() {
        formas.forEach(System.out::println);
    }

    public void exibirAreaTotal() {
        double total = formas.stream()
                .mapToDouble(Forma::calcularArea)
                .sum();
        System.out.printf("Area total de todas as formas: %.2f%n", total);
    }
}