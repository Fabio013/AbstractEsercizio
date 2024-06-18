public class Rettangolo extends Forma{

    public Rettangolo (double base, double altezza) {
        super(base, altezza);  //avendo costruttore in genitore, devo accedere ai suoi parametri
    }
    @Override
    public double calcolaArea() {
        return getBase() * getAltezza(); //avendole definite dentro Forma devo usare il getter
    }
    @Override
    public String toString() {                 //sovrascrive il metodo del genitore
        return super.toString()                //richiama il ritorno del metodo del genitore
               + " l'area del rettangolo è: "; //aggiunge stringa personale
    }
}
