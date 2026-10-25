package academy.main.javacore.construtores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int eps;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int eps, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.eps = eps;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int eps, String genero, String estudio){
        this(nome, tipo, eps, genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Sem argumentos dentro do construtor");
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.eps);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEps(int eps){
        this.eps = eps;
    }

    public int getEps(){
        return this.eps;
    }

}
