package lab2;

import java.io.*;

public class SerializeTXT {
    public void serializer(Soldier obj, File file) throws IOException {
        try(FileWriter fw = new FileWriter(file)){
            String str = "Surname = " + obj.getSurName() + ", Name = " + obj.getName() + ", MiddleName = " + obj.getMiddleName() + ", CallDate = " + obj.getCallDate() + ", Age = " + obj.getAge();
            fw.write(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Soldier deserializer(File file) throws IOException {
        try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
            String[] fields = fr.readLine().split(", ");
            Soldier.Builder a = new Soldier.Builder();
            a.withSurname(fields[0].split(" ")[2]);
            a.withName(fields[1].split(" ")[2]);
            a.withMiddleName(fields[2].split(" ")[2]);
            a.callDate(fields[3].split(" ")[2]);
            a.withAge(Integer.parseInt(fields[4].split(" ")[2]));
            return a.build();
        }
        catch (IOException e) {
            throw new RuntimeException("File is empty");
        }
    }
}
