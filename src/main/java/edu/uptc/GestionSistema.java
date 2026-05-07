package edu.uptc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionSistema {
    private HashMap<String, ArticuloInvestigacion> articulosInvestigacion;
    private HashMap<String, LibroAcademico> librosAcademicos;
    private HashMap<String, MemoriaConferencia> memoriasConferencias;


    public GestionSistema() {
        this.articulosInvestigacion = new HashMap<>();
        this.librosAcademicos = new HashMap<>();
        this.memoriasConferencias = new HashMap<>();
    }

    public boolean crearArticuloInvestigacion(String tituloDocumento, String anhoPubliacion,
                                              String inicialesyApellidosAutor, String tituloRevista,
                                              String volumen, String numero, String paginas, String mes) {
        ArticuloInvestigacion nuevoArticuloInvestigacion = new ArticuloInvestigacion(
                tituloDocumento, anhoPubliacion, inicialesyApellidosAutor, tituloRevista, volumen, numero, paginas, mes);
        this.articulosInvestigacion.put(nuevoArticuloInvestigacion.getIdDocumentoAcademico(), nuevoArticuloInvestigacion);
        return true;
    }

    public boolean crearLibroAcademico(String tituloDocumento, String anhoPubliacion, String inicialesyApellidosAutor,
                                       String edicion, String lugarPublicacion, String editorial) {
        LibroAcademico nuevolibroAcademico = new LibroAcademico(tituloDocumento, anhoPubliacion,
                inicialesyApellidosAutor, edicion, lugarPublicacion, editorial);
        this.librosAcademicos.put(nuevolibroAcademico.getIdDocumentoAcademico(), nuevolibroAcademico);
        return true;
    }

    public boolean crearMemoriaConferencia(String tituloDocumento, String anhoPubliacion, String inicialesyApellidosAutor,
                                           String nombreCompletoConferencia, String ciudadConferencia,
                                           String estadoConferencia, String paginas) {
        MemoriaConferencia nuevaMemoriaConferencia = new MemoriaConferencia(tituloDocumento, anhoPubliacion,
                inicialesyApellidosAutor, nombreCompletoConferencia, ciudadConferencia, estadoConferencia, paginas);

        this.memoriasConferencias.put(nuevaMemoriaConferencia.getIdDocumentoAcademico(), nuevaMemoriaConferencia);
        return true;
    }

    public String mostrarArticulosInvestigacion() {
        if (articulosInvestigacion.isEmpty()) {
            return "No hay articulos de investigacion";
        } else {
            return this.articulosInvestigacion.toString();
        }
    }

    public String mostrarLibrosAcademicos() {
        if (librosAcademicos.isEmpty()) {
            return "No hay libros academicos";
        } else {
            return this.librosAcademicos.toString();
        }
    }

    public String mostrarMemoriasConferencias() {
        if (memoriasConferencias.isEmpty()) {
            return "No hay memorias de conferencia";
        } else {
            return this.memoriasConferencias.toString();
        }
    }


    public boolean actualizarInfoArticuloInvestigacion(String idDocumentoAcademico, String tituloDocumento, String anhoPubliacion,
                                                       String inicialesyApellidosAutor, String tituloRevista,
                                                       String volumen, String numero, String paginas, String mes) {
        articulosInvestigacion.get(idDocumentoAcademico).setTituloDocumento(tituloDocumento);
        articulosInvestigacion.get(idDocumentoAcademico).setAnhoPubliacion(anhoPubliacion);
        articulosInvestigacion.get(idDocumentoAcademico).setInicialesyApellidosAutor(inicialesyApellidosAutor);
        articulosInvestigacion.get(idDocumentoAcademico).setTituloRevista(tituloRevista);
        articulosInvestigacion.get(idDocumentoAcademico).setVolumen(volumen);
        articulosInvestigacion.get(idDocumentoAcademico).setNumero(numero);
        articulosInvestigacion.get(idDocumentoAcademico).setPaginas(paginas);
        articulosInvestigacion.get(idDocumentoAcademico).setMes(mes);

        return true;
    }

    public boolean actualizarInfoLibrosAcademico(String idDocumentoAcademico, String tituloDocumento, String anhoPubliacion,
                                                 String inicialesyApellidosAutor, String edicion, String lugarPublicacion,
                                                 String editorial) {
        librosAcademicos.get(idDocumentoAcademico).setTituloDocumento(tituloDocumento);
        librosAcademicos.get(idDocumentoAcademico).setAnhoPubliacion(anhoPubliacion);
        librosAcademicos.get(idDocumentoAcademico).setInicialesyApellidosAutor(inicialesyApellidosAutor);
        librosAcademicos.get(idDocumentoAcademico).setEdicion(edicion);
        librosAcademicos.get(idDocumentoAcademico).setLugarPublicacion(lugarPublicacion);
        librosAcademicos.get(idDocumentoAcademico).setEditorial(editorial);

        return true;
    }

    public boolean actualizarMemoriaConferencia(String idDocumentoAcademico, String tituloDocumento, String anhoPubliacion,
                                                String inicialesyApellidosAutor, String nombreCompletoConferencia,
                                                String ciudadConferencia, String estadoConferencia, String paginas) {
        memoriasConferencias.get(idDocumentoAcademico).setTituloDocumento(tituloDocumento);
        memoriasConferencias.get(idDocumentoAcademico).setAnhoPubliacion(anhoPubliacion);
        memoriasConferencias.get(idDocumentoAcademico).setInicialesyApellidosAutor(inicialesyApellidosAutor);
        memoriasConferencias.get(idDocumentoAcademico).setNombreCompletoConferencia(nombreCompletoConferencia);
        memoriasConferencias.get(idDocumentoAcademico).setCiudadConferencia(ciudadConferencia);
        memoriasConferencias.get(idDocumentoAcademico).setEstadoConferencia(estadoConferencia);
        memoriasConferencias.get(idDocumentoAcademico).setPaginas(paginas);

        return true;
    }


  /*  public boolean eliminarArticuloInvestigacionPorId(String idDocumentoAcademico) {
        articulosInvestigacion.remove(idDocumentoAcademico);
        return true;
    }

    public boolean eliminarLibroAcademico(String idDocumentoAcademico) {
        librosAcademicos.remove(idDocumentoAcademico);
        return true;
    }

    public boolean eliminarMemoriaConferencia(String idDocumentoAcademico) {
        memoriasConferencias.remove(idDocumentoAcademico);
        return true;
    }
*/
    // No se pueden eliminar dos objetos ya que todos tiene un id diferente independientemente si estan en diferente hashmap.
    // Al ser un idGlobal no hay un id que se repita

    public boolean eliminarDocumentoAcademico(String idDocumento) {
        articulosInvestigacion.remove(idDocumento);
        librosAcademicos.remove(idDocumento);
        memoriasConferencias.remove(idDocumento);
        return true;
    }

    public boolean buscarIdDocumento(String idBuscar) {
        if (articulosInvestigacion.containsKey(idBuscar)) {
            return true;
        } else if (librosAcademicos.containsKey(idBuscar)) {
            return true;
        } else if (memoriasConferencias.containsKey(idBuscar)) {
            return true;
        } else {
            return false;
        }
    }

    public int asignacionParaActualizar(String idAsignar) {
        if (articulosInvestigacion.containsKey(idAsignar)) {
            return 1;
        } else if (librosAcademicos.containsKey(idAsignar)) {
            return 2;
        } else if (memoriasConferencias.containsKey(idAsignar)) {
            return 3;
        } else {
            return 0;
        }
    }


    public List<DocumentoAcademico> buscarPorTituloId(String palabraBuscado) {
        List<DocumentoAcademico> resultadosGlobales = new ArrayList<>();
        String palabraBuscadaMinuscula = palabraBuscado.toLowerCase();

        for (ArticuloInvestigacion articuloInvestigacion : articulosInvestigacion.values()) {
            if (articuloInvestigacion.getTituloDocumento().toLowerCase().contains(palabraBuscadaMinuscula)) {
                resultadosGlobales.add(articuloInvestigacion);
            }
        }
        for (LibroAcademico libroAcademico : librosAcademicos.values()) {
            if (libroAcademico.getTituloDocumento().toLowerCase().contains(palabraBuscadaMinuscula)) {
                resultadosGlobales.add(libroAcademico);
            }
        }

        for (MemoriaConferencia memoriaConferencia : memoriasConferencias.values()) {
            if (memoriaConferencia.getTituloDocumento().toLowerCase().contains(palabraBuscadaMinuscula)) {
                resultadosGlobales.add(memoriaConferencia);
            }
        }
        return resultadosGlobales;
    }

    public String generarReferenciaBibliografica(String idDocumentoAcademico) {
        int tipoDocumento = asignacionParaActualizar(idDocumentoAcademico);
        StringBuilder referenciaBibliografica = new StringBuilder();

        switch (tipoDocumento) {
            case 1:
                ArticuloInvestigacion articuloInvestigacion = articulosInvestigacion.get(idDocumentoAcademico);
                referenciaBibliografica.append(articuloInvestigacion.getInicialesyApellidosAutor()).append(", ");
                referenciaBibliografica.append('"').append(articuloInvestigacion.getTituloDocumento()).append('"').append(", ");
                referenciaBibliografica.append(articuloInvestigacion.getTituloRevista()).append(", ");
                referenciaBibliografica.append("vol. ").append(articuloInvestigacion.getVolumen()).append(", ");
                referenciaBibliografica.append("no. ").append(articuloInvestigacion.getNumero()).append(", ");
                referenciaBibliografica.append("pp. ").append(articuloInvestigacion.getPaginas()).append(", ");
                referenciaBibliografica.append(articuloInvestigacion.getMes()).append(' ').
                        append(articuloInvestigacion.getAnhoPubliacion()).append('.');
                break;
            case 2:
                LibroAcademico libroAcademico = librosAcademicos.get(idDocumentoAcademico);
                referenciaBibliografica.append(libroAcademico.getInicialesyApellidosAutor()).append(", ");
                referenciaBibliografica.append(libroAcademico.getTituloDocumento()).append(". ");
                referenciaBibliografica.append(libroAcademico.getEdicion()).append(". ");
                referenciaBibliografica.append(libroAcademico.getLugarPublicacion()).append(": ");
                referenciaBibliografica.append(libroAcademico.getEditorial()).append(", ");
                referenciaBibliografica.append(libroAcademico.getAnhoPubliacion()).append(".");
                break;
            case 3:
                MemoriaConferencia memoriaConferencia = memoriasConferencias.get(idDocumentoAcademico);
                referenciaBibliografica.append(memoriaConferencia.getInicialesyApellidosAutor()).append(", ");
                referenciaBibliografica.append('"').append(memoriaConferencia.getTituloDocumento()).append('"').
                        append(" in ");
                referenciaBibliografica.append(memoriaConferencia.getNombreCompletoConferencia()).append(", ");
                referenciaBibliografica.append(memoriaConferencia.getCiudadConferencia()).append(", ");
                referenciaBibliografica.append(memoriaConferencia.getEstadoConferencia()).append(", ");
                referenciaBibliografica.append(memoriaConferencia.getAnhoPubliacion()).append(", ");
                referenciaBibliografica.append("pp. ").append(memoriaConferencia.getPaginas()).append(".");
                break;

            default:
                break;
        }
        return  referenciaBibliografica.toString();
    }
}

