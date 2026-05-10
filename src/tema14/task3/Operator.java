package tema14.task3;

import java.util.ArrayList;

public class Operator {
    private ArrayList<Taxpayer> taxpayers;

    public Operator(ArrayList<Taxpayer> taxpayers){
        this.taxpayers = taxpayers;
    }

    public int calculateTax(Property property){
        if(property instanceof Building building) return 500 * building.getSurface();
        if(property instanceof Field field) return (350 * field.getSurface()) / field.getRang().getValue();
        return -1;
    }

    public String printPropertyInfo(Property property) {
        String str = "\t" + property.getPropertyType() + ":\tStrada " + property.getAddress() +
                "\n\t\t\t\tSuprafata:" + property.getSurface();
        if(property instanceof Field field) str += ", Rang:" + field.getRang().getValue();
        str += "\n\t\t\t\tCost: " + this.calculateTax(property) + "\n";
        return str;
    }

    public int calculateAllTaxes(ArrayList<Property> properties){
        int res = 0;
        for(Property property : properties){
            res += calculateTax(property);
        }
        return res;
    }
    public String printTicket(String searchRequest){
        for(Taxpayer taxpayer : taxpayers){
            if(taxpayer.getName().equals(searchRequest) || taxpayer.getCnp().equals(searchRequest)) return printTicket(taxpayer);
        }
        return "";
    }
    public String printTicket(Taxpayer taxpayer){
        String str = "Contribuabil: " + taxpayer.getName() + "\n\n";
        str += "Proprietati\n";
        for(Property property : taxpayer.getProperties()){
            str += printPropertyInfo(property) + "\n";
        }
        str += "\nSuma totala: " + calculateAllTaxes(taxpayer.getProperties()) + "\n";
        return str;
    }
}
