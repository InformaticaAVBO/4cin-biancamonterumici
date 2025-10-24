import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // prima scrivo dentro il file
        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i=0; i <100; i++) {
            myWriter.write("prima frase del file\n");
        }
        myWriter.close();
        System.out.println("ok ho scritto, ciao");

        //ora leggo cosa c'è nel file
        File f = new File ( "filename.txt");
        Scanner leggi = new Scanner(f);
        while (leggi.hasNextLine()) {
            String s= leggi.nextLine();
            System.out.println(s);
        }
        leggi.close();
    }   
}
