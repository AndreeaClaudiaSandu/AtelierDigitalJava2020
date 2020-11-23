package lab2.ch3;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish(){
        super(0);
    }
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("play like a fish");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.print(" like a fish");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print(" like a fish");
    }
}
