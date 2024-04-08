public class Rettangolo extends Forma{

    //proprietà del rettangolo
    private int base;
    private int altezza;

    //calcola area del rettangolo
    public void calcolaArea (int base, int altezza) {
        int area = base * altezza;
        System.out.println(area);
    }
}
