import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        ArrayList<Cursos> listaDeCursos = new ArrayList<>();

        Cursos Inlges = new Cursos(true, "Huertas", "Mañana");
        Cursos Programacion = new Cursos(true, "Medrano", "Noche");
        Cursos Civica = new Cursos(true, "Medrano", "Noche");

        listaDeCursos.add(Inlges);
        listaDeCursos.add(Programacion);
        listaDeCursos.add(Civica);
       

        //LeerYescribir.escribir("Curso.dat");
        LeerYescribir.escribir(listaDeCursos);
        LeerYescribir.leer("Curso.dat");

    }

}
