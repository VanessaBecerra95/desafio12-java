import java.util.TreeSet;

public class Invitados {
    private TreeSet<String> invitados;

    public Invitados() {
        this.invitados = new TreeSet<>();
    }

    public Invitados(TreeSet<String> invitados) {
        this.invitados = invitados;
    }

    public TreeSet<String> getInvitados() {
        return invitados;
    }

    public void setInvitados(TreeSet<String> invitados) {
        this.invitados = invitados;
    }

    public void addInvitados(TreeSet<String> invitados) {
        this.invitados.addAll(invitados);
    }

    public void removeInvitado(String invitado) {
        invitados.remove(invitado);
    }

    @Override
    public String toString() {
        return "Invitados: " + invitados;
    }
}