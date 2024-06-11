import java.util.Map;
import java.util.TreeMap;

public class Golosinas {
    private Map<String, Integer> golosinas = new TreeMap<>();

    public Golosinas() {
    }

    public Golosinas(Map<String, Integer> golosinas) {
        this.golosinas = golosinas;
    }

    public Map<String, Integer> getGolosinas() {
        return golosinas;
    }

    public void setGolosinas(Map<String, Integer> golosinas) {
        this.golosinas = golosinas;
    }

    public void agregarGolosinas(Map<String, Integer> golosinas) {
        this.golosinas.putAll(golosinas);
    }

    public void filtrarGolosinas(int cantidad) {
        golosinas.entrySet().stream()
                .filter(entry -> entry.getValue() < cantidad)
                .forEach(entry -> System.out.printf("golosina: %s - valor: %d \n", entry.getKey(), entry.getValue()));
    }

    @Override
    public String toString() {
        return "Golosinas: " + golosinas;
    }
}
