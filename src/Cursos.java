import java.io.Serializable;

public class Cursos implements Serializable{

    private static final long serial = 1L;
    private Boolean estado;
    private String profesorCargo;
    private String turno;


    public Cursos(Boolean estado, String profesorCargo, String turno) {
        this.estado = estado;
        this.profesorCargo = profesorCargo;
        this.turno = turno;
    }


    @Override
    public String toString() {
        return "Cursos [estado=" + estado + ", profesorCargo=" + profesorCargo + ", turno=" + turno + "]";
    }


    public static long getSerial() {
        return serial;
    }


    public Boolean getEstado() {
        return estado;
    }


    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public String getProfesorCargo() {
        return profesorCargo;
    }


    public void setProfesorCargo(String profesorCargo) {
        this.profesorCargo = profesorCargo;
    }


    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }



    
    
  



    
}
