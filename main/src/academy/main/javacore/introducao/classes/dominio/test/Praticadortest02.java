package academy.main.javacore.introducao.classes.dominio.test;

import academy.main.javacore.introducao.classes.dominio.Praticador;

public class Praticadortest02 {
    public static void main(String[] args) {
        
        Praticador praticador = new Praticador();
        Praticador praticador2 = new Praticador();
        
        System.out.println(praticador.idade);
        System.out.println(praticador.sexo);
        System.out.println(praticador.nome);



        System.out.println(praticador2.idade);
        System.out.println(praticador2.sexo);
        System.out.println(praticador2.nome);
    }
    
}
