package academy.main.javacore.introducao.metodos.test;


import academy.main.javacore.introducao.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Charles do Brox");
        funcionario.setIdade(36);
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});


        
        funcionario.imprime();

    }


}
