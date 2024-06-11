import java.util.ArrayList;
import java.util.List;

public class Marcas {
    private ArrayList<String> marcas = new ArrayList<>();

    public Marcas() {
    }
    
    public Marcas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }
    
    public ArrayList<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }

    public void addMarcas(List<String> list) {
        marcas.addAll(list);
    }

    public void removeMarca(String marca) {
        marcas.remove(marca);
    }

    public void replaceMarca(String aReemplazar, String reemplazo) {
        if (marcas.contains(aReemplazar)) {
            marcas.set(marcas.indexOf(aReemplazar), reemplazo);
        }
    }

    public int contarMarcas() {
        return marcas.size();
    }


    @Override
    public String toString() {
        return "Marcas: " + marcas;
    }
}
