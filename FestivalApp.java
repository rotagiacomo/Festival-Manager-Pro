import java.util.*;

public class FestivalApp {
    private HashSet<Biglietto> ticketCodex;
    private HashMap<Biglietto, Partecipante> relazioneBigliettoPartecipante;
    private FestivalManager festivalManager;

    public FestivalApp(FestivalManager festivalManager){
        ticketCodex = new HashSet<Biglietto>();
        relazioneBigliettoPartecipante = new HashMap<Biglietto, Partecipante>();
        this.festivalManager = festivalManager;
    }

    public boolean registraBiglietto(Biglietto biglietto, Partecipante partecipante){
        if(ticketCodex.add(biglietto)){
            relazioneBigliettoPartecipante.put(biglietto, partecipante);
            return true;
        }
        return false;
    }

    public int numeroPartecipanti(){
        return ticketCodex.size();
    }

    public String cercaBiglietto(Biglietto biglietto){
        if(relazioneBigliettoPartecipante.containsKey(biglietto)){
            Partecipante partecipante = relazioneBigliettoPartecipante.get(biglietto);
            return "Benvenuto " + partecipante;
        }
        return "Accesso negato";
    }

    public FestivalManager getFestivalManager(){
        return festivalManager;
    }

    public String elencoPartecipanti(){
        Iterator<Biglietto> iterator = ticketCodex.iterator();
        String string = "";
        while (iterator.hasNext()) {
            Biglietto biglietto = iterator.next();
            string += biglietto + ": " + relazioneBigliettoPartecipante.get(biglietto) + "\n";
        }
        return string;
    }
}
