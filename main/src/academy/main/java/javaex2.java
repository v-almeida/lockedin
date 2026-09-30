package academy.main.java;

public class javaex2 {
    public static void main(String[] args) {
        // dado um determinado salario qual o valor de imposto se deve pagar

        double valor = 70000;

        if (valor <= 34712){
            System.out.println(valor * 0.097);
        }else if (valor >= 34713 && valor <= 68507){
            System.out.println(valor * 0.3735);
        }else if (valor >= 68508){
            System.out.println(valor * 0.4950);
        }
    }

}
