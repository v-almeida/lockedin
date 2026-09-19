package academy.main.java;

public class java3 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebidas alcólicas");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebias alcolicas");
        }
        
    }

}
