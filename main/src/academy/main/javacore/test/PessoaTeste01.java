package academy.main.javacore.test;

import academy.main.javacore.dominio.Pessoa;

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
