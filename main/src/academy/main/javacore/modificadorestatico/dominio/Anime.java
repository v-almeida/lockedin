package academy.main.javacore.modificadorestatico.dominio;

public class Anime {

    private String nome;
    private static int[] eps;
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memória para objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for pedido
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("bloco de inicialização 1");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++){
            eps[i] = i+1;
        }
    }
    static {
        System.out.println("bloco de inicialização 2");
    }
    static {
        System.out.println("bloco de inicialização 3");
    }
    {
        System.out.println("bloco de inicialização não estático");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    
    public Anime() {

        for (int eps : Anime.eps) {
            System.out.print(eps + " ");
        }

        System.out.println();
    }


    public String getNome() {
        return nome;
    }


    public int[] getEps() {
        return eps;
    }

    

}
