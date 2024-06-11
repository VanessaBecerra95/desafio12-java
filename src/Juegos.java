import java.util.LinkedList;
import java.util.Queue;

public class Juegos {
    private Queue<String> juegos = new LinkedList<>();

    public Juegos() {
    }

    public Juegos(Queue<String> juegos) {
        this.juegos = juegos;
    }

    public Queue<String> getJuegos() {
        return juegos;
    }

    public void setJuegos(Queue<String> juegos) {
        this.juegos = juegos;
    }

    public void addJuegos(Queue<String> juegos) {
        this.juegos.addAll(juegos);
    }

    public void contarJuegos() {
        System.out.printf("Cantidad de juegos: %d \n", juegos.size());
    }

    @Override
    public String toString() {
        return "Juegos: " + juegos;
    }
}
