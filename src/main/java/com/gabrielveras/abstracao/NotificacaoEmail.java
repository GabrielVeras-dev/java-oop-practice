package com.gabrielveras.abstracao;

public class NotificacaoEmail implements Notificacao {

    private final String email;

    public NotificacaoEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.email = email;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Para: " + email + " | Mensagem: " + mensagem);
    }

    @Override
    public String getCanal() { return "Email (" + email + ")"; }
}