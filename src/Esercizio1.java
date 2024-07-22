

public class Esercizio1 {
    public static void main(String[] args) {
        int risultatoProdotto=moltiplicazione(2,5);
        System.out.println("Il risultato del prodotto è: " + risultatoProdotto);

        String concatenazione=concatena("ciao" , 2);
        System.out.println("Il risultato della concatenazione è: " + concatenazione);

        String[] arr = {"Pippo","Alessio","Pluto","Giovanni","Aldo"};
        String x="Sofia";

        String[] inserimentoInArray=inserisciInArray(arr,x);
        for (int i = 0; i < inserimentoInArray.length; i++) {
            System.out.println(inserimentoInArray[i]);
        }

    }

    public static int moltiplicazione(int numero1, int numero2){
        return numero1*numero2;
    }

    public static String concatena(String x, int numero1){
        return x +" " + numero1;
    }

    public static String[] inserisciInArray(String[] arr, String x){
        String[] newArr= new String[5];
        newArr[0] =arr[0];
        newArr[1]=arr[1];
        newArr[2]=x;
        newArr[3]=arr[2];
        newArr[4]=arr[3];
        return newArr;
    }
}
