import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;

public class Gramatica {
    private HashSet<Productie> listaProductie = new HashSet<>();

    Gramatica(){

    }
    public void citesteGramatica(String path){
        try {
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            String linie;
            while ((linie = reader.readLine()) != null) {
                String[] values = linie.split(" ");
                Productie p = new Productie(values[0], values[1]);
                listaProductie.add(p);
            }
        }
        catch(FileNotFoundException e){
            System.out.printf("Fisierul nu a fost gasit!");
        }
        catch(IOException e){
            System.out.printf("Fisierul nu a putut fi citit");
        }
    }

    public HashSet<Productie> getListaProductie() {
        return listaProductie;
    }
}
