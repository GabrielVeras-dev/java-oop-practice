package com.gabrielveras;

import com.gabrielveras.encapsulamento.ContaBancaria;
import com.gabrielveras.encapsulamento.ContaService;
import com.gabrielveras.heranca.Desenvolvedor;
import com.gabrielveras.heranca.FuncionarioService;
import com.gabrielveras.heranca.Gerente;
import com.gabrielveras.polimorfismo.Circulo;
import com.gabrielveras.polimorfismo.Retangulo;
import com.gabrielveras.polimorfismo.Triangulo;
import com.gabrielveras.polimorfismo.CalculadoraFormas;
import com.gabrielveras.abstracao.NotificacaoEmail;
import com.gabrielveras.abstracao.NotificacaoSMS;
import com.gabrielveras.abstracao.NotificacaoService;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== ENCAPSULAMENTO =====");
        ContaBancaria conta1 = new ContaBancaria("Gabriel", new BigDecimal("1000.00"));
        ContaBancaria conta2 = new ContaBancaria("Ana", new BigDecimal("500.00"));
        ContaService contaService = new ContaService();
        contaService.depositar(conta1, new BigDecimal("500.00"));
        contaService.sacar(conta1, new BigDecimal("200.00"));
        contaService.transferir(conta1, conta2, new BigDecimal("300.00"));
        contaService.exibirExtrato(conta1);
        contaService.exibirExtrato(conta2);

        System.out.println("\n===== HERANCA =====");
        Gerente gerente = new Gerente("Carlos", new BigDecimal("8000.00"), "TI");
        Desenvolvedor dev = new Desenvolvedor("Bianca", new BigDecimal("6000.00"), "Java");
        FuncionarioService funcService = new FuncionarioService();
        funcService.exibirDetalhes(gerente);
        funcService.exibirDetalhes(dev);
        funcService.listarFuncionarios(List.of(gerente, dev));

        System.out.println("\n===== POLIMORFISMO =====");
        CalculadoraFormas calc = new CalculadoraFormas();
        calc.adicionarForma(new Circulo(5.0));
        calc.adicionarForma(new Retangulo(4.0, 6.0));
        calc.adicionarForma(new Triangulo(3.0, 4.0, 5.0));
        calc.exibirFormas();
        calc.exibirAreaTotal();

        System.out.println("\n===== ABSTRACAO =====");
        NotificacaoService notifService = new NotificacaoService();
        notifService.adicionarCanal(new NotificacaoEmail("gabriel@email.com"));
        notifService.adicionarCanal(new NotificacaoSMS("+55 61 99999-9999"));
        notifService.enviarParaTodos("Seu pagamento foi aprovado!");
    }
}