import java.util.ArrayList;

public class FestivalManager {
    private ArrayList<Cantante> cantantiArr;

    public FestivalManager(){
        cantantiArr = new ArrayList<Cantante>();
    }

    public void addCantante(int posizioneInScaletta, Cantante cantante){
        cantantiArr.add(posizioneInScaletta-1, cantante);
    }

    public void removeCantante(int posizioneInScaletta){
        cantantiArr.remove(posizioneInScaletta-1);
    }

    public String toString(){
        String string = "";
        for(int i = 0; i<cantantiArr.size(); i++){
            string += i+1 + ") " + cantantiArr.get(i) + "\n";
        }
        return string;
    }
}
