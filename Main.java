public class Main {
    public static void main(){
        FestivalManager festivalManager = new FestivalManager();
        festivalManager.addCantante(1, new Cantante("Marco", "Rossi"));
        festivalManager.addCantante(2, new Cantante("Lorenzo", "Menga"));
        festivalManager.addCantante(3, new Cantante("Ronaldo", "Casas"));
        festivalManager.addCantante(4, new Cantante("Giacomo", "Mitri"));
        festivalManager.removeCantante(3);
        festivalManager.addCantante(2, new Cantante("Cantante", "sorpresa"));

        System.out.println(festivalManager);
    }
}