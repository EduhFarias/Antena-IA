import java.util.*;

public class Util {

    static String setUrl(ArrayList<Integer> angles){
         return "http://localhost:8080/antenna/simulate?phi1=" + Integer.toString(angles.get(0)) +
                "&theta1=" + Integer.toString(angles.get(1)) + "&phi2=" + Integer.toString(angles.get(2)) +
                "&theta2=" + Integer.toString(angles.get(3)) + "&phi3=" + Integer.toString(angles.get(4)) +
                "&theta3=" + Integer.toString(angles.get(5));
    }

}
