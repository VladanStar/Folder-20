package javamtdvekockebacanje;

public class JavaMTDveKockeBacanje {

    public static void main(String[] args) {
        System.out.println("Zbir dve kocke   Prosecan broj bacanja");
        System.out.println("--------------   ---------------------");
        for (int i = 2; i < 13; i++) {
            System.out.printf("%7d %24.2f\n", i, prosekZaZbir(i));
        }

    }

    public static int baciZaZbir(int zbir) {
        int brojBacanja = 0;
        KockaZaIgru kocka1 = new KockaZaIgru();
        KockaZaIgru kocka2 = new KockaZaIgru();
        do {
            kocka1.baci();
            kocka2.baci();
            brojBacanja++;

        } while ((kocka1.broj + kocka2.broj) != zbir);
        return brojBacanja;

    }

    public static double prosekZaZbir(int zbir) {
        final int BROJ_PONAVLJANJA = 10000;
        int ukupnoBacanja = 0;
        for (int i = 0; i < BROJ_PONAVLJANJA; i++) {
            ukupnoBacanja = ukupnoBacanja + baciZaZbir(zbir);

        }
        return (double) ukupnoBacanja / BROJ_PONAVLJANJA;

    }

}
