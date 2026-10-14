package academy.main.javacore.introducao.test;

import academy.main.javacore.introducao.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Opala";
        carro1.modelo = "Sedã";
        carro1.ano = 2015;

        carro2.nome = "BYD";
        carro2.modelo = "Seal";
        carro2.ano = 2025;

        System.out.println("Nome: " + carro1.nome + " " + "Modelo: " + carro1.modelo + " " + "Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " " + "Modelo: " + carro2.modelo + " " + "Ano: " + carro2.ano);
    }


}
