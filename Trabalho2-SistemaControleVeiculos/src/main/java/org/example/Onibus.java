package org.example;

public class Onibus extends Veiculo {
    private int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("Ônibus deve ter entre 6 e 8 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        double tanque = 200;
        double consumo = 5;
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}