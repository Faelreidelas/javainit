package model;

public class Caneta {

    public int  tamanho;
    public String  marca;
    public int valor;

    public Caneta(int tamanho, String marca, int valor) {
        this.tamanho = tamanho;
        this.marca = marca;
        this.valor = valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public int getValor() {
        return valor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}


