package academy.main.javacore.introducao.metodos.test;


import academy.main.javacore.introducao.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();


        funcionario.nome = "Charles do Brox";
        funcionario.idade = 36;
        double[] salario = {1200, 987.32, 2000};


        
        funcionario.imprime();
        funcionario.mediaSalario(salario);
        funcionario.mostrarSalarios(salario);

    }


}
