import java.util.*;
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Subject> population = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Population: (int)");
        Subject.generatePopulation(population, input.nextInt());

        for(Subject current : population){
            System.out.println(Util.setUrl(current.angles));
        }

    }

}
