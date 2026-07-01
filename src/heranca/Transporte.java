package heranca;

public class Transporte {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;
    private double motorizacao;
    private Boolean isLigado;
    private int anofabricacao;
    private int limite;
    private double preco;


    public Transporte (String nome, double motorizacao, int capacidade, String cor, String modelo, String marca, int limite, float preco, boolean isLigado) {
        this.nome = nome;
        this.motorizacao = motorizacao;
        this.capacidade = capacidade;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.limite = limite;
        this.isLigado = isLigado;
    }

    public double preco() {
        return preco;
    }

    public int getlimite() {
        return limite;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getAnofabricacao() {
        return anofabricacao;
    }

    public Boolean getLigado() {
        return isLigado;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar(){
       this.isLigado = true;
        System.out.println("ligando");

    }

    public void desligar(){
        this.isLigado = false;
        System.out.println("desligando");

    }

    public void acelerar(){
        System.out.println("aceleraçao maxima km por hora");

    }

    public void frear(){
        System.out.println("freando");

    }

    public double calcularSeguro(double preco){
        return preco*0.1;

    }


}
