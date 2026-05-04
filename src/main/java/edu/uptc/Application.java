package edu.uptc;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        GestionSistema gestionSistema = new GestionSistema();

        String menuPrincipal = """
                -------------------------------------
                --------------UPTCiense--------------
                1. Crear un documento academico.
                2. Ver documentos academicos.
                3. Actualizar documento academico.
                4. Eliminar un documento academico.
                5. Generar referencia bibliografica
                6. Salir.
                -------------------------------------
                """;
        String menuDocumentos = """
                -------------------------------------
                1. Articulo cientifico
                2. Libros academicos
                3. Memorias de conferencia
                -------------------------------------
                """;

        int op = 0;
        while (op != 6) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
            switch (op) {
                case 1:
                    int opCase1 = 0;
                    opCase1 = Integer.parseInt(JOptionPane.showInputDialog("¿Que documento desea crear?\n" + menuDocumentos));

                    if ((opCase1 < 1) || (opCase1 > 3)) {
                        JOptionPane.showMessageDialog(null, "La opcion no esta disponible, intente de nuevo");
                    } else {
                        String tituloDocumentoAcademico = null;
                        String inicialesyApellidosAutor = null;
                        String anhoPubliacion = null;
                        boolean creado = false;
                        switch (opCase1) {
                            case 1:
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo del articulo cientifico");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos del articulo cientifico");
                                String tituloRevista = JOptionPane.showInputDialog("Ingrese el titulo de la revista abreviado");
                                String volumen = JOptionPane.showInputDialog("Ingrese el volumen del articulo cientifico");
                                String numero = JOptionPane.showInputDialog("Ingrese el numero del articulo cientifico");
                                String paginas = JOptionPane.showInputDialog("Ingrese las paginas del articulo cientifico");
                                String mes = JOptionPane.showInputDialog("Ingrese el mes del articulo cientifico");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de publicacion del articulo cientifico");


                                creado = gestionSistema.crearArticuloInvestigacion(tituloDocumentoAcademico,
                                        anhoPubliacion, inicialesyApellidosAutor, tituloRevista, volumen, numero,
                                        paginas, mes);

                                if (creado) {
                                    JOptionPane.showMessageDialog(null, "Articulo cienfico creado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Articulo cienfico no fue creado");
                                }
                                break;
                            case 2:
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo del libro");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos del autor del libro");
                                String edicion = JOptionPane.showInputDialog("Ingrese la edicion del libro");
                                String lugarPublicacion = JOptionPane.showInputDialog("Ingrese el lugar de la publicacion del libro");
                                String editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de publicacion del libro");

                                creado = gestionSistema.crearLibroAcademico(tituloDocumentoAcademico, anhoPubliacion,
                                        inicialesyApellidosAutor, edicion, lugarPublicacion, editorial);

                                if (creado) {
                                    JOptionPane.showMessageDialog(null, "Libro academico creado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Libro academico no fue creado");
                                }
                                break;
                            case 3:
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo de la memoria de la conferencia");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos de la memoria de la conferencia");
                                String nombreCompletoConferencia = JOptionPane.showInputDialog("Ingrese el nombre completo de la memoria de la conferencia");
                                String ciudadConferencia = JOptionPane.showInputDialog("Ingrese la ciudad de la memoria de la conferencia");
                                String estadoConferencia = JOptionPane.showInputDialog("Ingrese el estado de la memoria de la conferencia");
                                String paginasConferencia = JOptionPane.showInputDialog("Ingrese las paginas de la memoria de la conferencia");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de la memoria de la conferencia ");

                                creado = gestionSistema.crearMemoriaConferencia(tituloDocumentoAcademico,
                                        anhoPubliacion, inicialesyApellidosAutor, nombreCompletoConferencia,
                                        ciudadConferencia, estadoConferencia, paginasConferencia);
                                if (creado) {
                                    JOptionPane.showMessageDialog(null, "Libro academico creado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Libro academico no fue creado");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "LISTA ARTICULO CIENFIFICO\n" + gestionSistema.mostrarArticulosInvestigacion());
                    JOptionPane.showMessageDialog(null, "LISTA LIBROS ACADEMICOS\n" + gestionSistema.mostrarLibrosAcademicos());
                    JOptionPane.showMessageDialog(null, "LISTA MEMORIAS DE CONFERENCIAS\n" + gestionSistema.mostrarMemoriasConferencias());

                    break;
                case 3:
                    String idBuscarActualizacion = JOptionPane.showInputDialog("Ingrese el id a actualizar");
                    boolean encontradoIdActualizar = gestionSistema.buscarIdDocumento(idBuscarActualizacion);
                    if (encontradoIdActualizar) {
                        int opHashMapModificar = gestionSistema.asignacionParaActualizar(idBuscarActualizacion);
                        String tituloDocumentoAcademico = null;
                        String inicialesyApellidosAutor = null;
                        String anhoPubliacion = null;
                        boolean modificado = false;
                        switch (opHashMapModificar) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "ACTUALIZACION DE UN ARTICULO CIENTIFICO\n INGRESE LOS SIGUIENTES DATOS");
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo del articulo cientifico");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos del articulo cientifico");
                                String tituloRevista = JOptionPane.showInputDialog("Ingrese el titulo de la revista abreviado");
                                String volumen = JOptionPane.showInputDialog("Ingrese el volumen del articulo cientifico");
                                String numero = JOptionPane.showInputDialog("Ingrese el numero del articulo cientifico");
                                String paginas = JOptionPane.showInputDialog("Ingrese las paginas del articulo cientifico");
                                String mes = JOptionPane.showInputDialog("Ingrese el mes del articulo cientifico");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de publicacion del articulo cientifico");

                                modificado = gestionSistema.actualizarInfoArticuloInvestigacion(idBuscarActualizacion, tituloDocumentoAcademico,
                                        anhoPubliacion, inicialesyApellidosAutor, tituloRevista, volumen, numero,
                                        paginas, mes);
                                if (modificado) {
                                    JOptionPane.showMessageDialog(null, "Articulo cientifico actualizado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Articulo cientifico no modificado");
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "ACTUALIZACION DE UN LIBRO ACADEMICO\n INGRESE LOS SIGUIENTES DATOS");
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo del libro");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos del autor del libro");
                                String edicion = JOptionPane.showInputDialog("Ingrese la edicion del libro");
                                String lugarPublicacion = JOptionPane.showInputDialog("Ingrese el lugar de la publicacion del libro");
                                String editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de publicacion del libro");

                                modificado = gestionSistema.actualizarInfoLibrosAcademico(idBuscarActualizacion, tituloDocumentoAcademico, anhoPubliacion,
                                        inicialesyApellidosAutor, edicion, lugarPublicacion, editorial);
                                if (modificado) {
                                    JOptionPane.showMessageDialog(null, "Libro academico actualizado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Libro academico no modificado");
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "ACTUALIZACION DE UN MEMORIAS DE CONFERENCIA\n INGRESE LOS SIGUIENTES DATOS");
                                tituloDocumentoAcademico = JOptionPane.showInputDialog("Ingrese el titulo de la memoria de la conferencia");
                                inicialesyApellidosAutor = JOptionPane.showInputDialog("Ingrese las iniciales y apellidos de la memoria de la conferencia");
                                String nombreCompletoConferencia = JOptionPane.showInputDialog("Ingrese el nombre completo de la memoria de la conferencia");
                                String ciudadConferencia = JOptionPane.showInputDialog("Ingrese la ciudad de la memoria de la conferencia");
                                String estadoConferencia = JOptionPane.showInputDialog("Ingrese el estado de la memoria de la conferencia");
                                String paginasConferencia = JOptionPane.showInputDialog("Ingrese las paginas de la memoria de la conferencia");
                                anhoPubliacion = JOptionPane.showInputDialog("Ingrese el año de la memoria de la conferencia ");

                                modificado = gestionSistema.actualizarMemoriaConferencia(idBuscarActualizacion, tituloDocumentoAcademico,
                                        anhoPubliacion, inicialesyApellidosAutor, nombreCompletoConferencia,
                                        ciudadConferencia, estadoConferencia, paginasConferencia);
                                if (modificado) {
                                    JOptionPane.showMessageDialog(null, "Memorias de conferencia actualizado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Memorias de conferencia no modificado");
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe es Id");
                    }
                    break;
                case 4:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese el id a eliminar");
                    boolean existeIdEliminar = gestionSistema.buscarIdDocumento(idEliminar);
                    if (existeIdEliminar) {
                        boolean fueEliminado = gestionSistema.eliminarDocumentoAcademico(idEliminar);
                        if (fueEliminado) {
                            JOptionPane.showMessageDialog(null, "Documento academico eliminado");
                        } else {
                            JOptionPane.showMessageDialog(null, "No fue posible eliminar el documento academico");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El id no existe");
                    }
                    break;
                case 5:
                    int opGenerarRefenciaBibliografica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la refencia bibliografica a generar\n" + menuDocumentos));
                    switch (opGenerarRefenciaBibliografica) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
