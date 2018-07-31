import java.util.*;

public class Subject {
    private ArrayList<Integer> angles = new ArrayList<>();

    public Subject(ArrayList<Integer> angles) {
        this.angles = angles;
    }

    public ArrayList<Integer> getAngles() {
        return angles;
    }

    public void setAngles(ArrayList<Integer> angles) {
        this.angles = angles;
    }
}
