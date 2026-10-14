package academy.main.javacore.introducao.classes.dominio.test;

import academy.main.javacore.introducao.classes.dominio.Professor;

public class Professortest {

    public static void main(String[] args) {
        
        Professor professor = new Professor();

        professor.nome = "engenheiro";
        professor.sexo = 'M';
        professor.idade = 35;

        System.out.println(professor.nome + " " + professor.sexo + " " + professor.idade);
    }

}
