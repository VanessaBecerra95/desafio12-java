import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio1");
        Marcas marcas1 = new Marcas();
        //agregamos las marcas de bebidas
        marcas1.addMarcas(Arrays.asList("Pepsi", "Coca Cola", "Fanta", "Sprite", "7up", "Bilz y Pap", "Canada Dry", "Mirinda", "Crush", "Limón Soda"));
        System.out.println(marcas1);
        //agregamos las marcas que menciona la amiga
        marcas1.addMarcas(Arrays.asList("Blokbaster", "Carrefour", "Jetix"));
        System.out.println(marcas1);
        //cambiar blokbaster por blockbuster
        marcas1.replaceMarca("Blokbaster", "Blockbuster");
        System.out.println(marcas1);
        //remover Carrefour
        marcas1.removeMarca("Carrefour");
        System.out.println(marcas1);
        //agregar posibles marcas
        Marcas posiblesMarcas = new Marcas();
        posiblesMarcas.addMarcas(Arrays.asList("Inka cola","dr pepper"));
        marcas1.addMarcas(posiblesMarcas.getMarcas());
        System.out.println(marcas1);
        //contar marcas1
        System.out.println("Cantidad de marcas: " + marcas1.contarMarcas());
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio2");
        Invitados invitados = new Invitados();
        //agregamos a los invitados
        invitados.addInvitados(new TreeSet<>(Arrays.asList("Daniel", "Paola", "Facundo", "Pedro","Jacinta", "Florencia","Juan Pablo")));
        System.out.println(invitados);
        //agregamos a los posibles invitados
        Invitados posiblesInvitados = new Invitados();
        posiblesInvitados.addInvitados(new TreeSet<>(Arrays.asList("Jorge", "Francisco", "Marcos")));
        invitados.addInvitados(posiblesInvitados.getInvitados());
        System.out.println(invitados);
        //removemos a Jorge
        invitados.removeInvitado("Jorge");
        System.out.println(invitados);
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio3");
        Golosinas golosinas = new Golosinas();
        //agregamos las golosinas
        golosinas.agregarGolosinas(Map.of(
                "Chocman", 100,
                "Trululú", 100,
                "Centella", 100,
                "Kilate", 50,
                "Miti-miti", 30,
                "Traga Traga", 150,
                "Tabletón", 5
        ));
        System.out.println(golosinas);
        //filtrar golosinas que costaban menos de 100
        golosinas.filtrarGolosinas(100);
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio4");
        Juegos juegos = new Juegos();
        //agregamos los juegos
        juegos.addJuegos(new LinkedList<>(Arrays.asList("Tombo", "Congelado", "Quemaditas", "Cachipún", "Pillarse")));
        System.out.println(juegos);
        //contar la cantidad de juegos
        juegos.contarJuegos();

    }

}