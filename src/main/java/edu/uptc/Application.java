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
        String menuCase1 = """
                -------------------------------------
                ¿Que tipo de documento quiere crear?
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
                    opCase1 = Integer.parseInt(JOptionPane.showInputDialog(menuCase1));

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
                    JOptionPane.showMessageDialog(null, gestionSistema.toString());

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }

    }
}
