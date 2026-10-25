package academy.main.javacore.test;

import academy.main.javacore.dominio.Estudante;


public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Merab";
        estudante01.idade = 33;
        estudante01.sexo = 'M';

        estudante02.nome = "Yan";
        estudante02.idade = 32;
        estudante02.sexo = 'M';

        estudante01.Imprime();
        estudante02.Imprime();

        
    }

}
