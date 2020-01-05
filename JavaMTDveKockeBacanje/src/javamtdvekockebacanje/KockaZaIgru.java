package javamtdvekockebacanje;

class KockaZaIgru {

    public int broj;

    public KockaZaIgru() {
    }

    public KockaZaIgru(int n) {
        broj = n;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void baci() {
        broj = (int) (Math.random() * 6) + 1;
    }

}
