
package matricula;


public class Materias {
    
    private String nombremateria;

    public Materias(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    public String getNombremateria() {
        return nombremateria;
    }

    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    @Override
    public String toString() {
        return nombremateria ;
    }
    
    
    
}
