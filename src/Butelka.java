public class Butelka {
    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(5, 15);
        butelka[1] = new Butelka(8, 15);
        butelka[2] = new Butelka(10, 16);


        butelka[1].przelej(9, butelka[2]);
        butelka[0].przelej(5, butelka[1]);

        butelka[1].wylej(7);
        butelka[1].wlej(15);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
    }

    private double ileLitrow;
    private double Pojemnosc;

    Butelka(double ileLitrow, double Pojemnosc) {

        this.ileLitrow = ileLitrow;
        this.Pojemnosc = Pojemnosc - ileLitrow;
    }


    double getIleLitrow() {
        return ileLitrow;
    }

    double getPojemnosc() {
        return Pojemnosc;
    }

    boolean wlej(double ilosc) {
        if (Pojemnosc >= ilosc) {
            this.ileLitrow += ilosc;
            this.Pojemnosc = Pojemnosc - ilosc;
        } else
            System.out.println("butelka ma za mala pojemnosc");
        return false;
    }

    boolean wylej(double ilosc) {
        if (ilosc <= ileLitrow) {
            this.ileLitrow -= ilosc;
            this.Pojemnosc = Pojemnosc + ilosc;
        } else
            System.out.println("chcesz wylac wiecej niz jest w butelce");
        return false;

    }

    boolean przelej(double ilosc, Butelka gdziePrzelac) {
        if (ilosc <= Pojemnosc) {
            this.wylej(ilosc);
            gdziePrzelac.wlej(ilosc);
        } else
            System.out.println("nie ma miejsca w butelce na tyle litrow");
        return false;
    }
}
