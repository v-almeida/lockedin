package academy.main.javacore.introducao.classes.dominio.test;

import academy.main.javacore.introducao.classes.dominio.Praticador;

public class Praticadortest {
    public static void main(String[] args) {
        
        Praticador praticador = new Praticador();
        praticador.nome = "neymar jr";
        praticador.idade = 36;
        praticador.sexo = 'M';

        System.out.println(praticador.nome);
        System.out.println(praticador.idade);
        System.out.println(praticador.sexo);
    }

    
}
