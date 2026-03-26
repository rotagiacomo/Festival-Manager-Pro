public class Cantante {
    private String name;
    private String surname;

    public Cantante(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return name + " " + surname;
    }
}
