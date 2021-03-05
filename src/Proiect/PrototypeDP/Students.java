package Proiect.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
    private List<String> stud;
    public Students(){
        stud=new ArrayList<String>();
    }

    public Students(List<String> list){
        this.stud=list;
    }

    public void add(){
        stud.add("Ana");
        stud.add("Maria");
        stud.add("Paula");
    }

    public List<String> getStud(){
        return stud;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> stud1= new ArrayList<String>();
        for(String s: this.getStud()){
            stud1.add(s);
        }
        return new Students(stud1);
    }
}
