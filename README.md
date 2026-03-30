# Java OOP Practice ☕🚀

Projeto desenvolvido para praticar os **4 pilares da Orientação a Objetos** em Java puro, sem dependências externas.

## 🧠 Conceitos aplicados

- **Encapsulamento** — ContaBancaria com saldo protegido e acesso controlado via métodos
- **Herança** — Funcionario (abstrato) com Gerente e Desenvolvedor sobrescrevendo calcularBonus()
- **Polimorfismo** — Forma (abstrata) com Circulo, Retangulo e Triangulo tratados genericamente
- **Abstração** — Interface Notificacao com implementações Email e SMS intercambiáveis
- Classes abstratas e interfaces
- Validações no construtor (fail fast)
- Streams e Lambdas
- BigDecimal para valores monetários
- Collections (List)
- Imutabilidade com final

## Estrutura do projeto
```
src/main/java/com/gabrielveras/
├── Main.java
├── encapsulamento/
│   ├── ContaBancaria.java
│   └── ContaService.java
├── heranca/
│   ├── Funcionario.java
│   ├── Gerente.java
│   ├── Desenvolvedor.java
│   └── FuncionarioService.java
├── polimorfismo/
│   ├── Forma.java
│   ├── Circulo.java
│   ├── Retangulo.java
│   ├── Triangulo.java
│   └── CalculadoraFormas.java
└── abstracao/
    ├── Notificacao.java
    ├── NotificacaoEmail.java
    ├── NotificacaoSMS.java
    └── NotificacaoService.java
```

## ▶️ Executando o projeto

Via IDE (IntelliJ / VS Code): Execute a classe `Main`

Via terminal:
```bash
javac -d out src/main/java/com/gabrielveras/**/*.java src/main/java/com/gabrielveras/Main.java
java -cp out com.gabrielveras.Main
```

📌 Projeto utiliza armazenamento em memória — foco em lógica, design e boas práticas POO, sem dependências externas.
