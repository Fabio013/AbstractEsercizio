public abstract class Forma {

    private double base;
    private double altezza;

    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public abstract double calcolaArea(); //abstract, quindi non avviene effettivamente un override

    @Override
    public String toString() { //in una classe astratta si possono anche avere metodi non astratti
        return "Data una base di " + base + " e un altezza di " + altezza;
    }
}
