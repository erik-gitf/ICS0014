package assessment;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.singletonList;
import java.util.Collections;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Toy> toy1 = new ArrayList<>();
        List<Toy> toy2 = new ArrayList<>();
        List<Toy> toy3 = new ArrayList<>();
        cats.add(new Cat("Sabi", "Persian", "yellow", "blue", toy1));
        cats.add(new Cat("Jason", "Maine Coon", "black", "purple", toy2));
        cats.add(new Cat("Johnny", "Siamese", "white", "red", toy3));

        System.out.println(cats);
    }
}