package academy.main.javacore.introducao.metodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double salario;

    public void imprime(){
        System.out.println("===============================");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("===============================");
    }

    public void mediaSalario(double[] salario){

        if (salario == null){
            return;
        }


        double media = 0;
        for (double valor : salario) {
            media += valor;
            
        }

        System.out.println("Total salário: "+media);
        System.out.printf("Média Salarial: %.2f%n",media / salario.length);
    }

    public void mostrarSalarios (double[] salario){
        for (double valores : salario) {
            System.out.println("Salario: "+valores);
        }

        System.out.println("=============================");
    }





}
