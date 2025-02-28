package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Punto", 2015, 5, "Gasolina", "Hatch");
        Caminhao caminhao = new Caminhao("Iveco", "Stralis", 2014, 2, "Diesel", 12);
        Onibus onibus = new Onibus("Irisbus", "Magelys", 2013, 50, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Fiat", "500e", 2015, 4, "Elétrico", "Hatch", 24); // Fiat 500e é um carro elétrico italiano
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Iveco", "Eurocargo", 2012, 2, "Diesel", 8, -18);

        System.out.println("        Carro       ");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km");

        System.out.println("\n      Caminhão      ");
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km");

        System.out.println("\n      Ônibus      ");
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km");

        System.out.println("\n      Carro Elétrico      ");
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km");

        System.out.println("\n      Caminhão Refrigerado        ");
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km");
    }
}