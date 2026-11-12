package academy.main.javacore.associacaoatividade.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos){
        this.titulo = titulo;
        this.alunos = alunos;

    }

    public void imprime(){
        if(alunos == null){
            return;
        }
        for (Aluno aluno2 : alunos) {
            System.out.println(aluno2.getNome());
        }
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] alunos) {
        this.alunos = alunos;
    }

    

}
