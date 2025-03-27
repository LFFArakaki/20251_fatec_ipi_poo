package sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        long l1 = 2, l2 = 3, l3 = 5;
        String s1 = "2", s2 = "3";
        var calc = new Calculadora();

        System.out.println(calc.somar(l1, l2));
        System.out.println(calc.somar(s1, s2));
        System.out.println(calc.somar(l1, l2, l3));
        System.out.println(calc.somar(s1, l2));
        System.out.println(calc.somar(l1, s2));
    }
}
