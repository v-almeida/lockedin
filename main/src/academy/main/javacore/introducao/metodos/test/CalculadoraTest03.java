package academy.main.javacore.introducao.metodos.test;

import academy.main.javacore.introducao.metodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(0, 2);
        System.out.println(calculadora.divideDoisNumeros02(0, 2));
        System.out.println(result);

        System.out.println("-------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }

}
