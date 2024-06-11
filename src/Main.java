import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio1");
        Marcas marcas1 = new Marcas();
        System.out.println("Agregamos las 10 marcas de bebidas");
        marcas1.addMarcas(Arrays.asList("Pepsi", "Coca Cola", "Fanta", "Sprite", "7up", "Bilz y Pap", "Canada Dry", "Mirinda", "Crush", "Limón Soda"));
        System.out.println(marcas1);
        System.out.println("Agregamos las marcas que menciona la amiga");
        marcas1.addMarcas(Arrays.asList("Blokbaster", "Carrefour", "Jetix"));
        System.out.println(marcas1);
        System.out.println("Reemplazamos Blokbaster por Blockbuster");
        marcas1.replaceMarca("Blokbaster", "Blockbuster");
        System.out.println(marcas1);
        System.out.println("Removemos Carrefour");
        marcas1.removeMarca("Carrefour");
        System.out.println(marcas1);
        System.out.println("Agregamos posibles marcas a la lista");
        Marcas posiblesMarcas = new Marcas();
        posiblesMarcas.addMarcas(Arrays.asList("Inka cola","dr pepper"));
        marcas1.addMarcas(posiblesMarcas.getMarcas());
        System.out.println(marcas1);
        System.out.println("Contamos la cantidad de marcas");
        System.out.println("Cantidad de marcas: " + marcas1.contarMarcas());
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio2");
        Invitados invitados = new Invitados();
        System.out.println("Agregamos los 7 invitados");
        invitados.addInvitados(new TreeSet<>(Arrays.asList("Daniel", "Paola", "Facundo", "Pedro","Jacinta", "Florencia","Juan Pablo")));
        System.out.println(invitados);
        System.out.println("Agregamos los posibles invitados");
        Invitados posiblesInvitados = new Invitados();
        posiblesInvitados.addInvitados(new TreeSet<>(Arrays.asList("Jorge", "Francisco", "Marcos")));
        invitados.addInvitados(posiblesInvitados.getInvitados());
        System.out.println(invitados);
        System.out.println("Removemos a Jorge");
        invitados.removeInvitado("Jorge");
        System.out.println(invitados);
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio3");
        Golosinas golosinas = new Golosinas();
        System.out.println("Agregamos las golosinas");
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
        System.out.println("Filtramos las golosinas que tienen menos de 100 unidades");
        golosinas.filtrarGolosinas(100);
        System.out.println("------------------------------------------------------");
        System.out.println("Ejercicio4");
        Juegos juegos = new Juegos();
        System.out.println("Agregamos los juegos");
        juegos.addJuegos(new LinkedList<>(Arrays.asList("Tombo", "Congelado", "Quemaditas", "Cachipún", "Pillarse")));
        System.out.println(juegos);
        System.out.println("Contamos la cantidad de juegos");
        juegos.contarJuegos();

    }

}