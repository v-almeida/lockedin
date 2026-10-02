package academy.main.java;

public class javaex4 {
    // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {

        double valorCarro = 40000;

        for (int i = 1; i <= valorCarro; i++){
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000){
                break;
            }

            System.out.println("Parcela " + i+ "R$ "+ valorParcela);

        }
        
    }

}
