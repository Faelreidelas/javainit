package model;

public class produto {

    public int quantidade;
    public String nome;
    public Double valor;
    public int quantidadeEstoque;


    public void mostraEstoque() {
        System.out.println("nome:" + this.nome);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque);
    }


    public void adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
        this.mostraEstoque();


    }



}
