/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.logica;

import conversoralura.Frames.FramePrincipal;
import conversoralura.Frames.FrameSecundario;

public class LogicaConversorTemperatura {

    private FrameSecundario ev;
    private FramePrincipal ev2;

    public LogicaConversorTemperatura(FrameSecundario ev) {
        this.ev = ev;
    }

    public void ConversorTemperatura() {
        String valorIngresado = ev.getValorIngresado().getText();
        double textoCasteado = Double.parseDouble(valorIngresado);
        calculoTemperatura(textoCasteado);
    }

    public void calculoTemperatura(double cantidad) {

        String lista = (String) ev.getListaTemperatura().getSelectedItem();
        switch (lista) {
            case "Fahreinheit a Grados Celsius": {
                double farenAcelcius = Math.round((cantidad - 32.0) * 5.0 / 9.0);
                String resultadoCasteadoCelcius = String.valueOf(farenAcelcius);
                ev.getResultado().setText(resultadoCasteadoCelcius);
                texto("Fahreinheit", "Grados Celcius");

                break;
            }
            case "Fahreinheit a Grados Kelvin": {
                double farenAkevin = Math.round(cantidad - 32.0) * 5L / 9L + 273.15;
                String resultadoCasteadoKevin = String.valueOf(farenAkevin);
                ev.getResultado().setText(resultadoCasteadoKevin);
                texto("Fahreinheit", "Grados Kelvin");

                break;
            }
            case "Grados Celsius a Fahreinheit": {
                double celciusAfaren =  (Math.round(cantidad * 9.0 / 5.0) + 32L);
                String resultadoCasteadoFaren = String.valueOf(celciusAfaren);
                ev.getResultado().setText(resultadoCasteadoFaren);
                texto("Grados Celcius", "Fahreinheit");

                break;
            }
            case "Grados Celsius a Grados Kelvin": {
                double celciusAkevin =  Math.round(cantidad + 273.15);
                String resultadoCasteadoKevin2 = String.valueOf(celciusAkevin);
                ev.getResultado().setText(resultadoCasteadoKevin2);
                texto("Grados Celcius", "Grados Kelvin");

                break;
            }
            case "Grados Kelvin a Fahreinheit": {
                double kevinAfaren = (Math.round(cantidad - 273.15) * 9L / 5L + 32L);
                String resultadoCasteadoFaren2 = String.valueOf(kevinAfaren);
                ev.getResultado().setText(resultadoCasteadoFaren2);
                texto("Grados Kelvin", "Fahreinheit");

                break;
            }
            case "Grados Kelvin a Grados Celcius": {
                double kevinAcelcius =  Math.round(cantidad - 273.15);
                String resultadoCasteadoCelcius2 = String.valueOf(kevinAcelcius);
                ev.getResultado().setText(resultadoCasteadoCelcius2);
                texto("Grados Kelvin", "Grados Celcius");

                break;
            }
        }
    }

    public void texto(String textoIzq, String textoDer) {
        ev.getTexto1().setText(textoIzq);
        ev.getTexto2().setText(textoDer);

    }
}
