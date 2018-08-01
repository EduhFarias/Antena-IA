import java.util.*;

public class Subject {
    public ArrayList<Integer> angles = new ArrayList<>();
    public double fitness;

    public Subject(ArrayList<Integer> angles) {
        this.angles = angles;
    }

    public static Subject generateSubject(){
        ArrayList<Integer> angles = new ArrayList<>();
        Random generator = new Random();

        for(int i = 0; i < 6; i++){
            angles.add(generator.nextInt(361));
        }
        Subject newSubject = new Subject(angles);
        Main.fitness(newSubject);
        return newSubject;
    }

    public static void generatePopulation(ArrayList<Subject> population, int n){
        for(int i = 0; i < n; i++){
            population.add(generateSubject());
        }
    }
}
