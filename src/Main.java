import java.util.*;

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

    public static void fitness(ArrayList<Subject> population){
        for(Subject current : population){
            //double fitness -> recebe o valor da função accessUrl
            Util.accessUrl(Util.setUrl(current.angles));
        }
    }

}
