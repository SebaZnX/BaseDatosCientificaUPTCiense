package edu.uptc;

public class LibroAcademico extends DocumentoAcademico {
    private String edicion;
    private String lugarPublicacion;
    private String editorial;

    public LibroAcademico(String tituloDocumento, String anhoPubliacion,
                          String inicialesyApellidosAutor, String edicion, String lugarPublicacion, String editorial) {
        super(tituloDocumento, anhoPubliacion, inicialesyApellidosAutor);
        this.edicion = edicion;
        this.lugarPublicacion = lugarPublicacion;
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public void setLugarPublicacion(String lugarPublicacion) {
        this.lugarPublicacion = lugarPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "ID: " + idDocumentoAcademico + " | Libro: " + tituloDocumento + "\n";
    }
}
