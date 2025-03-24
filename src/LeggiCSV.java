import java.io.*;
import java.util.*;

public class LeggiCSV {
    public static void main(String[] args) {


        try {

            File nomeFile = new File("panseri.csv");
            File mioVal = new File("mioValore.cvs");
            BufferedReader br = new BufferedReader(new FileReader(nomeFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mioValore.csv"));
            String next;
            int campi;
            int num = (int) Math.floor(Math.random()*20);
            int cont = 0;

            do{

                //PRIMA RICHIESTA
                next = br.readLine();
                if(cont == 0){
                    cont++;
                    next+=";MioValore";
                } else {
                    next+=";" + num;
                }
                bw.write(next);

                //SECONDA RICHIESTA
                campi = next.split(";").length;

                //TERZA RICHIESTA (NON AVANZATO)
                campi = next.length();

                //QUARTA RICHIESTA


            }while(next != null);

            // in questo modo chiudiamo il file
            br.close();
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file!!!!!!");
            e.printStackTrace();
        }
    }
}
