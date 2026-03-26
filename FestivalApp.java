import java.util.*;

public class FestivalApp {
    private HashSet<Biglietto> ticketCodex;
    private HashMap<Biglietto, Partecipante> relazioneBigliettoPartecipante;

    public FestivalApp(){
        ticketCodex = new HashSet<Biglietto>();
    }

    public boolean scansionaBiglietto(Biglietto biglietto){
        if(ticketCodex.add(biglietto)){
            relazioneBigliettoPartecipante
        };
    }

    public int numeroPartecipanti(){
        return ticketCodex.size();
    }
}
