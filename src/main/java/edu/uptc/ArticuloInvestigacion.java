package edu.uptc;

public class ArticuloInvestigacion extends DocumentoAcademico {
    private String tituloRevista;
    private String volumen;
    private String numero;
    private String paginas;
    private String mes;

    public ArticuloInvestigacion(String tituloDocumento, String anhoPubliacion,
                                 String inicialesyApellidosAutor, String tituloRevista, String volumen, String numero,
                                 String paginas, String mes) {
        super(tituloDocumento, anhoPubliacion, inicialesyApellidosAutor);
        this.tituloRevista = tituloRevista;
        this.volumen = volumen;
        this.numero = numero;
        this.paginas = paginas;
        this.mes = mes;
    }

    public String getTituloRevista() {
        return tituloRevista;
    }

    public void setTituloRevista(String tituloRevista) {
        this.tituloRevista = tituloRevista;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "ID: " + idDocumentoAcademico + " | Artículo: " + tituloDocumento + "\n";
    }
}
