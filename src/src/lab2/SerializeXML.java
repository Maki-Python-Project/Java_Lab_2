package lab2;

import com.fasterxml.jackson.dataformat.xml.*;

import java.io.File;
import java.io.IOException;

public class SerializeXML {
    XmlMapper mapper;

    public SerializeXML() {
        mapper = new XmlMapper();
    }

    public void serializer(Soldier obj, File file) throws IOException {
        try {
            mapper.writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Soldier deserializer(File file) throws RuntimeException {
        try {
            return mapper.readValue(file, Soldier.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
