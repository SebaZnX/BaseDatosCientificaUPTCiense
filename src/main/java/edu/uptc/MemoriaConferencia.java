package edu.uptc;

public class MemoriaConferencia extends DocumentoAcademico {
    private String nombreCompletoConferencia;
    private String ciudadConferencia;
    private String estadoConferencia;
    private String paginas;

    public MemoriaConferencia(String tituloDocumento, String anhoPubliacion,
                              String inicialesyApellidosAutor, String nombreCompletoConferencia,
                              String ciudadConferencia, String estadoConferencia, String paginas) {
        super(tituloDocumento, anhoPubliacion, inicialesyApellidosAutor);
        this.nombreCompletoConferencia = nombreCompletoConferencia;
        this.ciudadConferencia = ciudadConferencia;
        this.estadoConferencia = estadoConferencia;
        this.paginas = paginas;
    }

    public String getNombreCompletoConferencia() {
        return nombreCompletoConferencia;
    }

    public void setNombreCompletoConferencia(String nombreCompletoConferencia) {
        this.nombreCompletoConferencia = nombreCompletoConferencia;
    }

    public String getCiudadConferencia() {
        return ciudadConferencia;
    }

    public void setCiudadConferencia(String ciudadConferencia) {
        this.ciudadConferencia = ciudadConferencia;
    }

    public String getEstadoConferencia() {
        return estadoConferencia;
    }

    public void setEstadoConferencia(String estadoConferencia) {
        this.estadoConferencia = estadoConferencia;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "MemoriaConferencia{" +
                "nombreCompletoConferencia='" + nombreCompletoConferencia + '\'' +
                "}\n";
    }
}
