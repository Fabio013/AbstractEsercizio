public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo( 5.25,7.5);
        Triangolo triangolo = new Triangolo( 3.35 , 7);

        Forma[] forme = new Forma[2];
        forme[0] = rettangolo;
        forme[1] = triangolo;

        for (Forma figli : forme) {  //termine 'figli' a rappresentare le varie sottoclassi-forme aggiunte
            System.out.println(figli.toString() + figli.calcolaArea());
        }
    }
}