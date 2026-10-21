package academy.main.javacore.introducao.metodos.test;

import academy.main.javacore.introducao.metodos.dominio.Pessoa;

public class PessoaTeste01 {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Merab");
        pessoa.setIdade(35);
        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());




    }

}
