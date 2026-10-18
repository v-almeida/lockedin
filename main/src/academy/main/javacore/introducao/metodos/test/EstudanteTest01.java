package academy.main.javacore.introducao.metodos.test;

import academy.main.javacore.introducao.metodos.dominio.Estudante;
import academy.main.javacore.introducao.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Merab";
        estudante01.idade = 33;
        estudante01.sexo = 'M';

        estudante02.nome = "Yan";
        estudante02.idade = 32;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        

        
        


    }

}
