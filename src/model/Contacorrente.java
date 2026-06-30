package model;

    public class Contacorrente extends conta{

        public int agencia;

        public Contacorrente(int agencia, int numeroConta) {
            this.agencia = agencia;
            this.numeroConta = numeroConta;
            this.saldo = 0.0f;
            this.isAtiva = true;
        }
    }
