public class Partecipante {
    private String name;
    private String surname;

    public Partecipante(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return name + " " + surname;
    }
}
