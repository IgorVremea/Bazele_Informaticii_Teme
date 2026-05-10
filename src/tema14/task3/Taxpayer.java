package tema14.task3;

import java.sql.Array;
import java.util.ArrayList;

public class Taxpayer {
    private String name;
    private String cnp;
    private ArrayList<Property> properties;

    public Taxpayer(String name, String cnp){
        this(name, cnp, new ArrayList<>());
    }

    public Taxpayer(String name, String cnp, ArrayList<Property> properties) {
        this.name = name;
        this.cnp = cnp;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    public ArrayList<Property> getProperties(){
        return properties;
    }

}
