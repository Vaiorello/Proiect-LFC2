import java.io.*;
import java.util.HashSet;

public class FileUpload {
    private File file;
    boolean is_set;
    public FileUpload() {

    }
    public FileUpload(String fileName) throws Exception{
        String packageName = new FileUpload().getClass().getPackage().getName();
        String path = "/Users/vio/IdeaProjects/Proiect LFC 2/src/com/company/Gramatica.txt";
        this.file = new File(path);
        this.is_set= file.exists();
        if(!this.is_set)
            throw new IllegalArgumentException("Fisierul specificat nu exista! \nFisierul trebuie sa se afle in directorul curent si sa fie cu extensia .txt");

    }

    public Gramatica constructGramatica() throws IOException {
        int stop=0;
        if(!this.is_set || !this.file.canRead()) {
            return new Gramatica();
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(this.file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String row ;
        char start_cond='#';
        HashSet<Productie> productii =  new HashSet <Productie>();
        HashSet <Character> terminale = new HashSet <Character>();
        HashSet <Character> neterminale = new HashSet <Character>();
        row = br.readLine();

        start_cond = row.charAt(0);

        while(stop < 3001 && ((row = br.readLine())!=null)) {
            String b[] = row.split("->");
            productii.add(new Productie(b[0].charAt(0),b[1]));
            neterminale.add(b[0].charAt(0));

            for(int i=0;i<b[1].length();i++) {
                if(b[1].charAt(i) >= 'a' && b[1].charAt(i) <= 'z' )
                    terminale.add(b[1].charAt(i));
            }
            stop++;
        }

        br.close();
        return new Gramatica();
    }
}
