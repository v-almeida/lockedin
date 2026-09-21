package academy.main.java;

public class java4 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 12;
        String categoria = null;

        if (idade < 15){
            categoria = "Categoria infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else if (idade >= 18){
           categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }

}
