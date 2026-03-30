package com.gabrielveras.abstracao;

// Interface — define o contrato sem implementacao.
// Abstracao: quem usa NotificacaoService nao precisa saber se é email, SMS ou push notification.

public interface Notificacao {

    void enviar(String mensagem);
    String getCanal();
}