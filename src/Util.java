import java.util.*;
import java.net.*;
import java.io.*;

public class Util {

    public static String setUrl(ArrayList<Integer> angles){
        return "http://localhost:8080/antenna/simulate?phi1=" + Integer.toString(angles.get(0)) +
                "&theta1=" + Integer.toString(angles.get(1)) + "&phi2=" + Integer.toString(angles.get(2)) +
                "&theta2=" + Integer.toString(angles.get(3)) + "&phi3=" + Integer.toString(angles.get(4)) +
                "&theta3=" + Integer.toString(angles.get(5));
    }
    //Função ainda teste
    public static double accessUrl(String url){

        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuilder stringBuilder = null;
        String line = null;
        URL serverAddress = null;
        double fitness = 0;

        try{
            serverAddress = new URL(url);
            connection = (HttpURLConnection)serverAddress.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setReadTimeout(10000);

            connection.connect();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            stringBuilder = new StringBuilder();

            while((line = reader.readLine()) != null){
                stringBuilder.append(line + '\n');
            }

            System.out.println(stringBuilder.toString());

            String aux = stringBuilder.toString().substring(0,16);
            fitness = Double.parseDouble(aux);

            //System.out.println(fitness);

            connection.disconnect();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return fitness;
    }

}
