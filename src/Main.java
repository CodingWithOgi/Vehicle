import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> l = new ArrayList<Car>();
        l.add(new Car("bmw","m3",2018));
        l.add(new Car("Ferrari","Alonso",2005));
        l.add(new Car("Toyota","Yaris",2010));
        l.add(new Car("Audi","r8",2003));


        Collections.sort(l);

        int br=0;
        for(Car c:l){
            br++;
            System.out.println(c.toString(br));
        }
    }
}
