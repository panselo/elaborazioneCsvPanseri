import java.io.*;
import java.util.*;

public class LeggiCSV {
    public static void main(String[] args) {


        try {

            File nomeFile = new File("panseri.csv");
            File mioVal = new File("mioValore.cvs");
            BufferedReader br = new BufferedReader(new FileReader(nomeFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mioValore.csv", true));
            String next = "";
            List<String> righe = new ArrayList<>();
            int campi;
            int num = (int) Math.floor(Math.random()*20);
            int cont = 0;
            int risposta = 0;
            Scanner in = new Scanner (System.in);

            do{

                System.out.println("----MODIFICHE FILE CSV----");
                System.out.println("0. EXIT!!");
                System.out.println("1. Aggiungere, in coda ad ogni record, un campo chiamato \"miovalore\"");
                System.out.println("2. contare il numero dei campi che compongono il record");
                System.out.println("3. calcolare la lunghezza massima dei record presenti");
                System.out.println("4. inserire in ogni record un numero di spazi necessari");
                System.out.println("5. Aggiungere un record in coda");
                System.out.println("6. Visualizzare dei dati mostrando tre campi significativi a scelta");
                System.out.println("7. Ricercare un record per campo chiave a scelta");
                System.out.println("8. Modificare  un record");
                System.out.println("9. Cancellare logicamente un record");
                System.out.println("Inserisci la tua scelta qua (0-9): ");
                risposta = in.nextInt();

                switch (risposta){

                    case 0:
                        break;

                    case 1:
                        while(br.readLine() != null){
                            next = br.readLine();
                            if(cont == 0){
                                cont++;
                                next+=";MioValore";
                            } else {
                                next+=";" + num;
                            }
                            bw.write(next);
                            break;
                        }

                    case 2:
                        campi = next.split(";").length;
                        break;

                    case 3:
                        int maxLunghezza = 0;
                        for (int i = 0; i < righe.size(); i++) {
                            next = righe.get(i);
                            if (next.length() > maxLunghezza){
                                maxLunghezza = next.length();
                            }
                        }
                        System.out.println("Lunghezza massima: " + maxLunghezza);
                        break;

                    case 4:
                        int lunghezzaMassima = 0;
                        for (int i = 0; i < righe.size(); i++) {
                            if (righe.get(i).length() > lunghezzaMassima) lunghezzaMassima = righe.get(i).length();
                        }
                        for (int i = 0; i < righe.size(); i++) {
                            next = righe.get(i);
                            int spaziNecessari = lunghezzaMassima - next.length();
                            righe.set(i, next + " ".repeat(spaziNecessari));
                        }
                        break;

                    case 5:
                        System.out.print("Inserisci nuovo record: ");
                        String nuovoRecord = in.nextLine();
                        righe.add(nuovoRecord);
                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    case 8:
                        break;

                    case 9:
                        break;

                    default:
                        break;


                }

            }while(next != null);


            br.close();
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file!!!!!!");
            e.printStackTrace();
        }
    }
}
