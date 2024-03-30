package Model;

import java.io.FileWriter;
import java.io.IOException;

public class FileController {
    private String path;

    public void savePerson(Person person) throws IOException{
        this.path = "data/" + person.getSurname() + ".txt";
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(person.toString() + "\n");
            fw.flush();
        }
    }
}
