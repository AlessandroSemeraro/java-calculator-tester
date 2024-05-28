public class Calculator {

    public static float somma(float n1, float n2) {
        return n1 + n2;
    }

    public static float sottrazione(float n1, float n2) {
        return n1 - n2;
    }

    public static float divisione(float n1, float n2) throws ArithmeticException{
        if (n2 == 0) {
            throw new ArithmeticException("non divisibile per 0");
        }
        return n1 / n2;
    }

    public static float moltiplicazione(float n1, float n2) {
        return n1 * n2;
    }

}