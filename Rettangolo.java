public class Rettangolo extends Forma{

    //proprietà del rettangolo
    private double base;
    private double altezza;

    //definisco costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //definisco getters e setters
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

    //calcola area del rettangolo
    public double calcolaArea () {
        double area = base * altezza;
        System.out.print("L'area del rettangolo è ");
        return area;
    }
}
