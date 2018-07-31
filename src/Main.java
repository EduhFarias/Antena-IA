import java.util.*;
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> angles = new ArrayList<>();
        Util.getIn(angles);

        Subject newSubject = new Subject(angles);

        String out = Util.setUrl(newSubject.getAngles());

        System.out.println(out);


    }

}
