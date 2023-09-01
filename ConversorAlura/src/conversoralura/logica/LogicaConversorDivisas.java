/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.logica;

import conversoralura.Frames.FrameSecundario;
import java.text.DecimalFormat;

public class LogicaConversorDivisas {

    private FrameSecundario ev;

    public LogicaConversorDivisas(FrameSecundario ev) {
        this.ev = ev;
    }

    public void PesoAextranjeras() {
        String valor = ev.getValorIngresado().getText();
        double resu = Double.parseDouble(valor);
       calculoDeMoneda(resu);
    }

    public void calculoDeMoneda(double cantidad) {
        final String opcionesLista = (String) ev.getListaDivisas().getSelectedItem();
        final DecimalFormat df = new DecimalFormat("#.####");
      
        switch (opcionesLista) {
            case "Pesos Argentinos a Dolar": {
                double dolar = cantidad * 0.0029;
                String resultado = String.valueOf(df.format(dolar));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Pesos Argentinos a Euros": {
                double Euro =  Math.round(cantidad * 0.0026);
                String resultado = String.valueOf(df.format(Euro));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Pesos Argentinos a Libras Esterlinas": {
                double Libras =  Math.round(cantidad * 0.0023);
                String resultado = String.valueOf(df.format(Libras));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Pesos Argentinos a Won Sul Coreano": {
                double Yen =  Math.round(cantidad * 3.79);
                String resultado = String.valueOf(df.format(Yen));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Pesos Argentinos a Yen": {
                double Won =  Math.round(cantidad * 0.42);
                String resultado = String.valueOf(df.format(Won));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Dolar a Pesos Argentinos": {
                double dol = Math.round(cantidad * 260.97);
                String resultado = String.valueOf(df.format(dol));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Euros a Pesos Argentinos": {
                double euros =  Math.round(cantidad * 378.25);
                String resultado = String.valueOf(df.format(euros));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Libras Esterlinas a Pesos Argentinos": {
                double libras =  Math.round(cantidad * 440.83);
                String resultado = String.valueOf(df.format(libras));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Won sul Coreano a Pesos Argentinos": {
                double won =  Math.round(cantidad * 0.26);
                String resultado = String.valueOf(df.format(won));
                ev.getResultado().setText(resultado);
                break;
            }
            case "Yen a Pesos Argentinos": {
                double yen =  Math.round(cantidad * 2.39);
                String resultado = String.valueOf(df.format(yen));
                ev.getResultado().setText(resultado);
                break;
            }
        }
    }
}
