public class test {
    static float altura;
    static float base;

    static void numbers() {
        altura = 1.68f;
        base = 5.22f;
    }

    public static void main(String[] args) {
        numbers();
        System.out.println("Calculando a área:" + altura * base);

    }
}
