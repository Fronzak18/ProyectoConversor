/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.Eventos;

/**
 *
 * @author Elias
 */
import conversoralura.Frames.FramePrincipal;
import conversoralura.Frames.FrameSecundario;
import conversoralura.logica.LogicaConversorDivisas;

import conversoralura.logica.LogicaConversorLongitud;
import conversoralura.logica.LogicaConversorTemperatura;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class EventosFrameSecundario implements ActionListener {

    private FrameSecundario frameSecun;
    private FramePrincipal frame;
    private LogicaConversorDivisas divisas;
    private LogicaConversorTemperatura temperatura;
    private LogicaConversorLongitud longitud;

    public EventosFrameSecundario(FrameSecundario frameSecun, FramePrincipal frame) {
        this.frameSecun = frameSecun;
        this.frame = frame;
    }

    public EventosFrameSecundario() {
    }

    // Método que se ejecuta cuando se realiza una acción en la interfaz
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean divisasframe = frame.getEventos().isVerificacionDivisas();
        boolean temperaturaframe = frame.getEventos().isVerificacionTemperatura();
        boolean medidasframe = frame.getEventos().isVerificacionMedidas();
       // Verificar qué botón se ha presionado
        if (e.getSource() == frameSecun.getConvertir()) {
            String valor = frameSecun.getValorIngresado().getText();
            // Verificar si el campo de entrada está vacío
            if (frameSecun.getValorIngresado().getText().isEmpty()) {
                mostrarMensajeError("Porfavor introduzca una cantidad a convertir");
                     // Verificar si el valor ingresado es un número válido
            } else if (!esNumero(valor)) {
                mostrarMensajeError("No es posible convertir letras o caracteres especiales a numeros");
                // Realizar la conversión según la opción seleccionada en FramePrincipal
            } else if (divisasframe) {
                divisas = new LogicaConversorDivisas(frameSecun);
                divisas.PesoAextranjeras();
                mostrarMensajeExito("La conversion fue exitosa");
                
            } else if (temperaturaframe) {
                temperatura = new LogicaConversorTemperatura(frameSecun);
                temperatura.ConversorTemperatura();
                mostrarMensajeExito("La conversion fue exitosa");
                
            } else if (medidasframe) {
                longitud = new LogicaConversorLongitud(frameSecun);
                longitud.calculoDeLongitud();
                mostrarMensajeExito("La conversion fue exitosa");
            
            }
        } else if (e.getSource() == frameSecun.getCambiar()) {
            cambioPosicionDeListas();
        }
    }
 // Método para cambiar la posición de las listas desplegables
    public void cambioPosicionDeListas() {
        int aux = frameSecun.getListaMedidas().getSelectedIndex();
        frameSecun.getListaMedidas().setSelectedIndex(frameSecun.getListaMedidas2().getSelectedIndex());
        frameSecun.getListaMedidas2().setSelectedIndex(aux);
    }
// Método para verificar si una cadena es un número válido
    public static boolean esNumero(String valor) {
        int puntoEncontrado = 0;
        for (final char c : valor.toCharArray()) {
            if (c == '.') {
                ++puntoEncontrado;
            }
            if (!Character.isDigit(c) || puntoEncontrado > 1) {
                return false;
            }
        }
        return true;
    }
    // Método para mostrar un mensaje de error
    private void mostrarMensajeError(final String mensaje) {
        JOptionPane.showMessageDialog(frame, mensaje, "Error", 0);
    }

    private void mostrarMensajeExito(final String mensaje) {
        JOptionPane.showMessageDialog(frame, mensaje, "Exito", 1);
    }
}
