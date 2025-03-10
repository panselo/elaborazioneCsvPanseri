import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeggiCSV {
    public static void main(String[] args) {
        String nomeFile = "panseri.csv";

        try {
            // in questo modo si apre il file
            BufferedReader br = new BufferedReader(new FileReader(nomeFile));
            String linea;

            // così leggiamo la prima riga, ovvero l'intestazione
            if ((linea = br.readLine()) != null) {
                System.out.println("Intestazione: " + linea);
            }

            // così leggtiamo e stampiamo le prima 5 righe
            int contatore = 0;
            while ((linea = br.readLine()) != null && contatore < 5) {
                System.out.println("Record: " + linea);
                contatore++;
            }

            // in questo modo chiudiamo il file
            br.close();
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file!!!!!!!!");
            e.printStackTrace();
        }
    }
}
