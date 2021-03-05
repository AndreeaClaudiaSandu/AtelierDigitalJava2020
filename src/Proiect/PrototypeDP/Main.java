package Proiect.PrototypeDP;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Students stud= new Students();
        stud.add();

        Students stud1= (Students) stud.clone();
        List<String> list= stud1.getStud();
        list.add("Andreea");

        System.out.println("Stud List: "+ stud.getStud());
        System.out.println("Stud1 List: "+ stud1.getStud());
    }
}
/*Prototype design pattern se foloseste atunci cand crearea obiectelor este costisitoare,
necesitand mult timp si resurse si exista deja un obiect similar.

Se copiaza obiectul existent intr-un nou obiect si se modifica in functie de necesitati.
Se foloseste clonarea java pentru copierea obiectului.

Am presupus ca se face citirea din baza de date a prenumelor studentilor.
Prin clonarea obiectului existent se evita preluarea datelor din baza de date de fiecare data
si nu se consuma la fel de mult timp si resurse.
 */
