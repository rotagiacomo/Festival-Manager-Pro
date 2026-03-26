import java.util.LinkedList;

public class Cantante {
    private String name;
    private String surname;
    private LinkedList<Canzone> canzoni;

    public Cantante(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void addCanzone(Canzone canzone){
        if(canzoni == null){
            canzoni = new LinkedList<Canzone>();
        }
        canzoni.add(canzone);
    }

    public LinkedList<Canzone> getCanzoni(){
        return canzoni;
    }

    public String toString(){
        return name + " " + surname;
    }
}
