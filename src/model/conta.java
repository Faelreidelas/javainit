package model;

public class conta {

    private float saldo;
    public float deposito;
    public float saque;
    public int numeroConta;
    private Boolean isAtiva;

    public void MostrarSaque(){
        System.out.print(saldo);

    }

    public void MostrarAtvConta(){
        System.out.print(isAtiva);

    }

    public void sacar(){
        this.saldo -= saque;
        this.MostrarSaque();
    }
    public void setDeposito(){
        System.out.print(isAtiva);

    }

    public float getSaldo() {
        return this.saldo;
    }

}


