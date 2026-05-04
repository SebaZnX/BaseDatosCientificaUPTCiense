package edu.uptc;

public class DocumentoAcademico {
    private static int contador = 0;
    protected String idDocumentoAcademico;
    protected String tituloDocumento;
    protected String anhoPubliacion;
    protected String inicialesyApellidosAutor;

    public DocumentoAcademico(String tituloDocumento, String anhoPubliacion,
                              String inicialesyApellidosAutor) {
        contador++;
        this.idDocumentoAcademico = "" + contador;
        this.tituloDocumento = tituloDocumento;
        this.anhoPubliacion = anhoPubliacion;
        this.inicialesyApellidosAutor = inicialesyApellidosAutor;
    }

    public DocumentoAcademico() {
    }

    public String getIdDocumentoAcademico() {
        return idDocumentoAcademico;
    }

    public void setIdDocumentoAcademico(String idDocumentoAcademico) {
        this.idDocumentoAcademico = idDocumentoAcademico;
    }

    public String getTituloDocumento() {
        return tituloDocumento;
    }

    public void setTituloDocumento(String tituloDocumento) {
        this.tituloDocumento = tituloDocumento;
    }

    public String getAnhoPubliacion() {
        return anhoPubliacion;
    }

    public void setAnhoPubliacion(String anhoPubliacion) {
        this.anhoPubliacion = anhoPubliacion;
    }

    public String getInicialesyApellidosAutor() {
        return inicialesyApellidosAutor;
    }

    public void setInicialesyApellidosAutor(String inicialesyApellidosAutor) {
        this.inicialesyApellidosAutor = inicialesyApellidosAutor;
    }


}
