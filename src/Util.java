import java.util.*;

public class Util {
    static void urlBase(ArrayList<String> url){
        url.add("http://localhost:8080/antenna/simulate?phi1=");
        url.add("&theta1=");
        url.add("&phi2=");
        url.add("&theta2=");
        url.add("&phi3=");
        url.add("&theta3=");
    }

    static String setUrl(ArrayList<String> url, ArrayList<Integer> angles){
        String out = new String();
        int angle;
        for(int i = 0; i < 6; i++){
            out += url.get(i);
            angle = angles.get(i);
            out += Integer.toString(angle);
        }
        return out;
    }

    static void getIn(ArrayList<Integer> angles){
        Scanner input = new Scanner(System.in);
        System.out.println("Input: Phi Theta Phi Theta Phi Theta");

        for(int i = 0; i < 6; i++){
            angles.add(input.nextInt());
        }
    }
}
