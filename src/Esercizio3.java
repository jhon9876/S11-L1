public class Esercizio3 {
    public static void main(String[] args) {
        System.out.println("Perimetro rettangolo: " + perimetro(2.5,4.5));
        System.out.println("Il numero è 0 se pari e 1 se dispari: " + pariDispari(4));
        System.out.println("Area triangolo: " + perimetroTriangolo(2,3));
    }

    public static double perimetro(double base, double altezza){
        return (base*2) + (altezza*2);
    }

    public static int pariDispari(int numero){
        return numero%2==0 ? 0 : 1;
    }

    public static double perimetroTriangolo (double base, double altezza){
        return (base*altezza)/2;
    }
}
