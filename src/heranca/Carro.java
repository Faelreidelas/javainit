package heranca;

public class Carro extends Transporte {

    private final int LIMITE_VELOCIDADE = 460;

    public Carro(String nome, double motorizacao, int capacidade, String cor, String modelo, String marca, int limite, double preco, boolean isLigado) {

        super(nome, motorizacao, capacidade, cor, modelo, marca, limite, preco, isLigado);
    }

    @Override
    public void acelerar(){
    System.out.printf("a velomax e {} " ,LIMITE_VELOCIDADE);
    super.acelerar();

    }

    public void decolar(){

        System.out.print("decolandoooo");
    }

    public void pousar(){

        System.out.print("pousandoooooo");
    }
}
