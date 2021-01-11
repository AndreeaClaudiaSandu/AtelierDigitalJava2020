package lab2.ch2;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
}
