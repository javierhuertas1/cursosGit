import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerYescribir {
    public static void escribir(/*String nombreArchivo*/ ArrayList<Cursos> listaCursos ) {

        try {
            String nombreArchivo = "Curso.dat";
            FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(listaCursos);
            System.out.println("Objeto escrito en el archivo: " + nombreArchivo);

        } catch (Exception e) {
            System.out.println("Un error escribiendo el objeto " + e.getMessage());
        }

    }
    public static void leer(String nombreArchivo) {

        try {
            FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ArrayList<Cursos> listaCursos = (ArrayList<Cursos>) ois.readObject();

            for (Cursos cursos : listaCursos) {
                System.out.println("Objeto leído del archivo: " + cursos);
            }

        } catch (Exception e) {

            System.out.println("Error al leer el curso " + e.getMessage());
        }

    }

}
