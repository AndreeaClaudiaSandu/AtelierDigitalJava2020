package Proiect.BuilderDP;

public class Main {
    public static void main(String[] args) {
        Builder.Car car1 = new Builder.Car.CarBuilder("Ford","Fiesta").setEngine(1).setHorsepower(100).setFuel("benzine").setYear(2020).build();
        System.out.print(car1.getBrand() + " " + car1.getModel()+" "+ car1.getEngine() + "L "+car1.getHorsepower()+"HP " +car1.getFuel()+" "+ car1.getYear());

    }
}
/*Builder Design Pattern rezolva problema cand exista un numar mare de parametri optionali.
 Exista clasa Car si clasa CarBuilder.
 CarBuilder are un constructor public cu toate atributele, metode pentru setarea
 parametrilor optionali si returneaza acelasi obiect dupa setarea atributului optional.

 Metoda build va returna obiectul necesar.

 Clasa Car are doar getter => putem obtine un obiect Car doar folosindu-ne de CarBuilder.

 */