package academy.main.java;

public class java5 {

    public static void main(String[] args) {
        // doar se salario > 5000
        // operador ternario (condicao ? verdadeiro : facil)

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devdojo";
        String mensagemNaoDoar = "Ainda não tenho condição mas, vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


    }

}
