import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Subject> population = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Population: (int)");
        Subject.generatePopulation(population, input.nextInt());
        Subject.getSubject(population);
        /*System.out.println("Processes: (int)");
        for(int i = 0; i < input.nextInt(); i++){
            AG(population);
        }*/

    }

    public static void AG(ArrayList<Subject> population){
        System.out.println(population.get(0));
    }

    public static void fitness(Subject subject){
        subject.fitness = Util.accessUrl(Util.setUrl(subject.angles));
        //System.out.println(subject.fitness); //test

    }

    public static void selection(ArrayList<Subject> population){
        Collections.shuffle(population);
        ArrayList<Subject> children = new ArrayList<>();
        Subject[] parents = new Subject[1];
        int size = population.size();

        for(int i = 0; i < size; i+= 2){
            parents[0] = Subject.getSubject(population);
            parents[1] = Subject.getSubject(population);
            Object[] newObject = crossover(parents[0], parents[1]);
            children.add((Subject) newObject[0]);
            children.add((Subject) newObject[1]);
        }
        population.addAll(children);
        survival(population, size);
    }

    public static Object[] crossover(Subject parent1, Subject parent2){
        Random generate = new Random();
        Subject child1 = new Subject(new ArrayList<>()), child2 = new Subject(new ArrayList<>());
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

    public static void survival(ArrayList<Subject> population, int size){
        population.sort(new FitnessComparator());
        if(population.size() > size){
            for(int i = size; i < population.size(); i++){
                population.remove(i);
            }
        }
    }

}
