package academy.main.javacore.associacao.test;

import academy.main.javacore.associacao.dominio.Escola;
import academy.main.javacore.associacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Engenhas");
        Professor professor2 = new Professor("Guisoly");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("UN", professores);

        escola.imprime();
    }

}
