package semana12.ejercicios.ej7;

public class Material {
    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Material: " + titulo;
    }
}

