package com.gabrielveras.abstracao;

public class NotificacaoSMS implements Notificacao {

    private final String telefone;

    public NotificacaoSMS(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone invalido");
        }
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Para: " + telefone + " | Mensagem: " + mensagem);
    }

    @Override
    public String getCanal() { return "SMS (" + telefone + ")"; }
}