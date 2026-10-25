package academy.main.javacore.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void Imprime (){
        System.out.println("================================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
