package sobrecarga;

public class Calculadora{
    public long somar(long a, long b){
        return a+b;
    }
    public long somar(String a, String b){
        return Long.parseLong(a)+Long.parseLong(b);
    }
    public long somar(long a, long b, long c){
        return a+b+c;
    }
    public long somar(String a, long b){
        return Long.parseLong(a)+b;
    }
    public long somar(long a, String b){
        return somar(b, a);
    }
}