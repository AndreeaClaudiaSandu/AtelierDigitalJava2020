package lab2.ch2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }
}
