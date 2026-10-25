package academy.main.javacore.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println("===============================");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        mediaSalario();

    }

    public void mediaSalario(){

        if (salarios == null){
            return;
        }


        for (double salario : salarios) {
            media += salario;
            
        }

        System.out.println("\nTotal salário: "+media);
        System.out.printf("Média Salarial: %.2f%n",media / salarios.length);
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public void setSalarios(double[] salarios){
        this.salarios = salarios;

    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getSalarios(){
        return this.salarios;
    }

    public double getMedia(){
        return this.media;
    }








}