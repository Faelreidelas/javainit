package model;

public class produto {

    public int quantidade;
    public String nome;
    public Double valor;
    public int quantidadeEstoque;


    public void mostraEstoque() {
        System.out.println("nome:" + this.nome);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque);
        System.out.println("Valor  " + this.valor);
        System.out.println("Quantidade: " + this.quantidade);

    }


    public void adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
        this.mostraEstoque();


    }
    // public Produto (){} (construtor vazio)

    public produto (String nome,Double valor, int quantidade,int quantidadeEstoque){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome(){
        return this.nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }



}
