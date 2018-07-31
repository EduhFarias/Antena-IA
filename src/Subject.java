import java.util.*;

public class Subject {
    public ArrayList<Integer> angles = new ArrayList<>();
    public int generation;
    public double fitness;

    public Subject(ArrayList<Integer> angles) {
        this.angles = angles;
    }

    public static Subject generateSubject(){
        ArrayList<Integer> angles = new ArrayList<>();
        Random generator = new Random();

        for(int i = 0; i < 6; i++){
            angles.add(generator.nextInt(360) + 1);
        }
        return new Subject(angles);
    }

    public static void generatePopulation(ArrayList<Subject> population, int n){
        for(int i = 0; i < n; i++){
            population.add(generateSubject());
        }
    }
}
