import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Subject> population = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Population: (int)");
        Subject.generatePopulation(population, input.nextInt());

        fitness(population);
    }

    public static void fitness(ArrayList<Subject> population){
        for(Subject current : population){
            current.fitness = Util.accessUrl(Util.setUrl(current.angles));
            //System.out.println(current.fitness); //test
        }
    }

    public static void selection(){

    }

    public static void crossover(){

    }

    public static void mutation(){
        
    }

}
