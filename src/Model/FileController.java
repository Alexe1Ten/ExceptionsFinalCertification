package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileController {

    public void savePerson(Person person) throws IOException{
        String name = person.getSurname() + ".txt";
        String path = "src/data/";
        File file = new File(path + name);
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(person.toString() + "\n");
            fw.flush();
        }
    }
}
