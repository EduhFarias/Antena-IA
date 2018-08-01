import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Subject> population = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Population: (int)");
        Subject.generatePopulation(population, input.nextInt());
        System.out.println("Processes: (int)");

        for(int i = 0; i < input.nextInt(); i++){
            run(population);
        }
        //Collections.sort(population, new FitnessComparator());
        //population.sort(new FitnessComparator());

    }

    public static void run(ArrayList<Subject> population){

    }

    public static void fitness(Subject subject){
            subject.fitness = Util.accessUrl(Util.setUrl(subject.angles));
            //System.out.println(subject.fitness); //test

    }

    public static void selection(ArrayList<Subject> population){
        Collections.shuffle(population);
        ArrayList<Subject> children = new ArrayList<>();
        for(int i = 0; i < population.size(); i+= 2){
            Object[] newObject = crossover(population);
            children.add((Subject) newObject[0]);
            children.add((Subject) newObject[1]);
        }
    }

    public static Object[] crossover(Subject parent1, Subject parent2){
        Random generate = new Random();
        Subject child1 = null, child2 = null;
        Object[] newObject = new Objects[1];

        for(int i = 0; i < 6; i++){
            if(generate.nextInt(2) > 0){
                child1.angles.add(i, parent1.angles.get(i));
                child2.angles.add(i, parent2.angles.get(i));
            } else{
                child1.angles.add(i, parent2.angles.get(i));
                child2.angles.add(i, parent1.angles.get(i));
            }
        }

        newObject[0] = mutation(child1);
        newObject[1] = mutation(child2);
        return newObject;
    }

    public static Subject mutation(Subject subject){
        Random random = new Random();
        if(random.nextInt(11) > 3){
            int i = random.nextInt(7);
            int newAngle = random.nextInt(361);
            subject.angles.set(i, newAngle);
        }
        fitness(subject);
        return subject;
    }

}
