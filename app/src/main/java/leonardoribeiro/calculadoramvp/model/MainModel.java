package leonardoribeiro.calculadoramvp.model;

public class MainModel {

    public static String primeiroNumero = "0";
    public static String segundoNumero = "0";

    public static double soma(double primeiro, double segundo) {
        return primeiro+segundo;
    }

    public static double subtracao(double primeiro, double segundo) {
        return primeiro-segundo;
    }

    public static double multiplicacao(double primeiro, double segundo) {
        return primeiro*segundo;
    }

    public static double divisao(double primeiro, double segundo) {
        return primeiro/segundo;
    }

}
