package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

@Entity
public class Medicine implements Jsonable {
    @Id
    private long id;
    private String name;
    private String manufacturer;
    public Medicine(){
    }

    public Medicine(long id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
        }
        return writable.toString();
    }

    @Override
    public void toJson(Writer writer) throws IOException {
        JsonObject json = new JsonObject();
        json.put("id", id);
        json.put("name", name);
        json.put("manufactuer", manufacturer);
        json.toJson(writer);
    }

}
