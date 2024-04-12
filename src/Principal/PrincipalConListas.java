package Principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(6);
        var peligabo = new Pelicula("el senior de los anillos",2000);
        peligabo.evalua(10);
        Serie lost = new Serie("Lost",2000);

        Pelicula p1 = peligabo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peligabo);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listDeArtista = new ArrayList<>();
        listDeArtista.add("Penelelope Cruz");
        listDeArtista.add("Antonio Banderas");
        listDeArtista.add("Ricardo Darin");

        System.out.println(listDeArtista);

        Collections.sort(listDeArtista);
        System.out.println("lista de artistas ordenda: " + listDeArtista);
    }
}
