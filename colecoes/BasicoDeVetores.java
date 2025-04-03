package colecoes;

public class BasicoDeVetores {
    public static void main(String[] args) {
        int [] v1 = {3,2,6,9};
        var media = 0d;

        for(int i=0;i<v1.length;i++) media += v1[i];
        
        media /= 4;

        System.out.println(media);
    }
}