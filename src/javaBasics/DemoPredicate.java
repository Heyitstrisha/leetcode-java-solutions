package javaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employe{
    public int id;
    public String name;
    public String city;
    public int sal;

    public Employe(int id, String name, String city, int sal) {
        this.id = id;
        this.name= name;
        this.city=city;
        this.sal=sal;
    }
}
public class DemoPredicate {
    public static void main(String[] args) {

        Employe e1 = new Employe(101,"Pallavi","NAgpur",400000);
        Employe e2 = new Employe(102,"Pallu","pune",300000);
        Employe e3 = new Employe(103,"Rakesh","mumbai",200000);
        Employe e4 = new Employe(104,"Aastha","NAgpur",600000);
        Employe e5 = new Employe(105,"Payal","pune",40000);
        Employe e6 = new Employe(106,"Parul","Hydrabad",20000);

        List<Employe> li = Arrays.asList(e1,e2,e3,e4,e5,e6);

        Predicate<Employe> p1 = (Employe e)->e.name.startsWith("P");
        Predicate<Employe> p2 = (Employe e)->e.sal>=200000;

        Predicate<Employe> p = p1.and(p2);

        for (Employe e : li){
            if(p.test(e)){
                System.out.println(e.name+" "+e.sal+" "+e.city);
            }
        }

    }
}
