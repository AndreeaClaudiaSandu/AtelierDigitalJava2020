package lab4.Visitor;

public class Book implements Element{
    private int numerOfPages;
    private String name;

    public Book(int numerOfPages, String name) {
        this.numerOfPages = numerOfPages;
        this.name = name;
    }

    public int getNumerOfPages() {
        return numerOfPages;
    }

    public void accept (Visitor v) {
        v.visit(this);
    }

    public String getName() {
        return name;
    }
}
