/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.logica;

import conversoralura.Frames.FrameSecundario;
import java.text.DecimalFormat;

/**
 *
 * @author Elias
 */
public class LogicaConversorLongitud {

    private final FrameSecundario interfaz;

    public LogicaConversorLongitud(final FrameSecundario interfaz) {
        this.interfaz = interfaz;
    }

    public void calculoDeLongitud() {
        String valorIng = interfaz.getValorIngresado().getText();
        String listaDesp = (String) interfaz.getListaMedidas().getSelectedItem();
        double valorCasteado = Double.parseDouble(valorIng);

        switch (listaDesp) {
            case "Kilometro": {
                calculo(listaDesp, valorCasteado);
            }
            case "Metro": {
                calculo(listaDesp, valorCasteado);
            }
            case "Centimetro": {
                calculo(listaDesp, valorCasteado);
            }
            case "Milimetro": {
                calculo(listaDesp, valorCasteado);
            }
            case "Milla": {
                calculo(listaDesp, valorCasteado);
            }
            case "Yarda": {
                calculo(listaDesp, valorCasteado);
            }
            case "Pie": {
                calculo(listaDesp, valorCasteado);
            }
            case "Pulgada": {
                calculo(listaDesp, valorCasteado);
            }
            case "Milla Nautica": {
                calculo(listaDesp, valorCasteado);
                break;
            }
        }
    }
// Método para cambiar de listas desplegables cuando ambas tienen la misma unidad seleccionada
    public void cambioDeListas() {
        int listaPrin = interfaz.getListaMedidas().getSelectedIndex();
        int listaSecun = interfaz.getListaMedidas2().getSelectedIndex();
        int longitudLista = interfaz.getListaMedidas().getItemCount() - 1;
        if (listaPrin == listaSecun && listaPrin <  longitudLista && listaSecun < longitudLista) {
            ++listaPrin;
            interfaz.getListaMedidas().setSelectedIndex(listaPrin);
        } else if (listaPrin == listaSecun && listaPrin == longitudLista && listaSecun == longitudLista) {
            --listaPrin;
            interfaz.getListaMedidas().setSelectedIndex(listaPrin);
        }
    }
// Método para realizar cálculos de conversión basados en la unidad de medida de origen
    public void calculo(String listaDesp, double valorCasteado) {
        String listaDesp2 = (String) interfaz.getListaMedidas2().getSelectedItem();
        // Crea un objeto DecimalFormat para formatear el resultado
        DecimalFormat df = new DecimalFormat("#.######");

        switch (listaDesp) {
            case "Kilometro": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        // Si la unidad de destino es igual a la de origen, realiza un cambio de listas
                        cambioDeListas();
                    }
                    case "Metro": {
                         String valorRetornado = String.valueOf(valorCasteado * 1000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 100000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1000000.0);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1609.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(valorCasteado * 1094.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(valorCasteado * 3281.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(valorCasteado * 39370.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1852.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }

                break;
            }
            case "Metro": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1000.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        cambioDeListas();
                    }
                    case "Centimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 100.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1000.0);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1609.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(valorCasteado * 1094.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(valorCasteado * 3281.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(valorCasteado * 39.37);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1852.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }
                break;
            }
            case "Centimetro": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(valorCasteado / 100000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(valorCasteado / 100.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                        cambioDeListas();
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 10.0);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(valorCasteado / 160900.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 91.44));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 30.48));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 2.54));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(valorCasteado / 185200.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }

                }
                break;
            }
            case "Milimetro": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(valorCasteado / 1000000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1000.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 10.0));
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milimetro": {
                        cambioDeListas();
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(valorCasteado / 1609000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 914.4));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 304.8));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 25.4));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(valorCasteado / 1852000.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }

                break;
            }

            case "Milla": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1.609);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1609.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                         String valorRetornado = String.valueOf(valorCasteado * 160900.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1609000.0);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        cambioDeListas();
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(valorCasteado * 1760.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(valorCasteado * 5280.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(valorCasteado * 63360.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1.151));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }
                break;
            }
            case "Yarda": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1094.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1.094));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 91.44);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 914.4);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 1760.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        cambioDeListas();
                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(valorCasteado * 3.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(valorCasteado * 36.0);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 2025.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }

                break;
            }
            case "Pie": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 3281.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 3.281));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Centimetro": {
                         String valorRetornado = String.valueOf(valorCasteado * 30.48);
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 304.8);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 5280.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 3.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Pie": {
                        cambioDeListas();
                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado * 12.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 6076.0));
                        interfaz.getResultado().setText(valorRetornado);
                        break;
                    }
                }

                break;
            }

            case "Pulgada": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(valorCasteado / 39370.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 39.37));
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Centimetro": {
                         String valorRetornado = String.valueOf(df.format(valorCasteado * 2.54));
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 25.4);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(valorCasteado / 63360.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 36.0));
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(df.format(valorCasteado / 12.0));
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Pulgada": {
                        cambioDeListas();
                    }
                    case "Milla Nautica": {
                        String valorRetornado = String.valueOf(valorCasteado / 72910.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                }
                break;
            }

            case "Milla Nautica": {
                switch (listaDesp2) {
                    case "Kilometro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1.852);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Metro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1852.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Centimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 185200.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Milimetro": {
                        String valorRetornado = String.valueOf(valorCasteado * 1852000.0);
                        interfaz.getResultado().setText(valorRetornado);
                    }
                    case "Milla": {
                        String valorRetornado = String.valueOf(valorCasteado * 1.151);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Yarda": {
                        String valorRetornado = String.valueOf(valorCasteado * 2025.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Pie": {
                        String valorRetornado = String.valueOf(valorCasteado * 6076.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Pulgada": {
                        String valorRetornado = String.valueOf(valorCasteado * 72910.0);
                        interfaz.getResultado().setText(valorRetornado);

                    }
                    case "Milla Nautica": {
                        cambioDeListas();
                        break;
                    }
                }
                break;
            }

        }
    }
}
