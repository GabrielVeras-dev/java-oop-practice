package com.gabrielveras.abstracao;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoService {

    private final List<Notificacao> canais = new ArrayList<>();

    public void adicionarCanal(Notificacao notificacao) {
        canais.add(notificacao);
    }

    // Polimorfismo + Abstracao: envia para todos os canais sem saber se sao Email, SMS ou qualquer outra implementacao

    public void enviarParaTodos(String mensagem) {
        System.out.println("Enviando para " + canais.size() + " canal(is):");
        canais.forEach(canal -> canal.enviar(mensagem));
    }

    public void listarCanais() {
        canais.stream()
                .map(Notificacao::getCanal)
                .forEach(System.out::println);
    }
}