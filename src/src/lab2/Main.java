package lab2;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Soldier soldier1 = new Soldier.Builder().withSurname("Prustypa").withName("Taras").withMiddleName("Stepanovuch").withAge(20).callDate("26.05.21").build();
        Soldier soldier2 = new Soldier.Builder().withSurname("Slusar").withName("Mukola").withMiddleName("Olegovuch").withAge(23).callDate("22.05.20").build();
        Soldier soldier3 = new Soldier.Builder().withSurname("Lutvunyk").withName("Ivan").withMiddleName("Mukolaevuch").withAge(21).callDate("06.09.20").build();
        SerializeTXT srzTxt = new SerializeTXT();
        SerializeJSON srzJson = new SerializeJSON();
        SerializeXML srzXml = new SerializeXML();
        File fTxt = new File("soldier.txt");
        File fJson = new File("soldier.json");
        File fXml = new File("soldier.xml");
        try {
            srzTxt.serializer(soldier1, fTxt);
            srzJson.serializer(soldier2, fJson);
            srzXml.serializer(soldier3, fXml);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Soldier animalTxt = new Soldier();
        Soldier animalJson = new Soldier();
        Soldier animalXml = new Soldier();

        try {
            animalTxt = srzTxt.deserializer(fTxt);
            animalJson = srzJson.deserializer(fJson);
            animalXml = srzXml.deserializer(fXml);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(animalTxt);
        System.out.println(animalJson);
        System.out.println(animalXml);
    }
}
