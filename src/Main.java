import java.util.*;
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args){

        ArrayList<String> url = new ArrayList<>();
        Util.urlBase(url);

        ArrayList<Integer> angles = new ArrayList<>();
        Util.getIn(angles);

        Subject newSubject = new Subject(angles);

        String out = Util.setUrl(url, newSubject.getAngles());

        System.out.println(out);
    }

}
