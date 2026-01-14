public class Games {
    private String cim;
    private String mufaj;
    private String kiado;
    private int ertekeles;
    private float eladottpel;
    private int evjarat;
    private int koltseg;
    private int bevetel;
    private int jatekosok;

    public Games(String cim, String mufaj, String kiado, int ertekeles, float eladottpel,
                 int evjarat, int koltseg, int bevetel, int jatekosok) {
        this.cim = cim;
        this.mufaj = mufaj;
        this.kiado = kiado;
        this.ertekeles = ertekeles;
        this.eladottpel = eladottpel;
        this.evjarat = evjarat;
        this.koltseg = koltseg;
        this.bevetel = bevetel;
        this.jatekosok = jatekosok;
    }

    public String toString() {
        return cim + " (" + mufaj + ", " + evjarat + ")";
    }
}
