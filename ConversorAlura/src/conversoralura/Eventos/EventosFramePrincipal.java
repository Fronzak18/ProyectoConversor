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
import java.awt.event.MouseEvent;

import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventosFramePrincipal extends MouseAdapter {

    private FrameSecundario frameSecun;
    private FramePrincipal frame;
    private boolean verificacionDivisas;
    private boolean verificacionTemperatura;
    private boolean verificacionMedidas;

    public EventosFramePrincipal(FramePrincipal frame) {
        this.frame = frame;
    }
// Método que se ejecuta cuando se hace clic en un componente con el que está asociado este manejador de eventos
    @Override
    public void mouseClicked(final MouseEvent e) {
       // Verifica qué componente se hizo clic y realiza las acciones correspondientes
        if (e.getSource() == frame.getDivisas()) {
            verificacionFrame(frame.getDivisas());
            frameSecun = new FrameSecundario(frame);
            frameSecun.marcoConversorDivisas();
            verificacionDivisas = true;
        } else if (e.getSource() == frame.getTemperatura()) {
            verificacionFrame(frame.getTemperatura());
            frameSecun = new FrameSecundario(frame);
            frameSecun.marcoConverTemperatura();
            verificacionTemperatura = true;
        } else if (e.getSource() == frame.getMedidas()) {
            verificacionFrame(frame.getMedidas());
            frameSecun = new FrameSecundario(frame);
            frameSecun.marcoConverMedidas();
            verificacionMedidas = true;
        }
    }
 // Método para verificar y cerrar el FrameSecundario si es necesario
    public void verificacionFrame(JLabel verificacion) {
        if (frameSecun != null && verificacion == frame.getDivisas()) {

            frameSecun.dispose();
            verificacionMedidas = false;
            verificacionTemperatura = false;

        } else if (frameSecun != null && verificacion == frame.getTemperatura()) {
            frameSecun.dispose();
            verificacionDivisas = false;
            verificacionMedidas = false;

        }
        if (frameSecun != null && verificacion == frame.getMedidas()) {
            frameSecun.dispose();
            verificacionTemperatura = false;
            verificacionDivisas = false;
        }

    }

    public boolean isVerificacionDivisas() {
        return this.verificacionDivisas;
    }

    public void setVerificacionDivisas(boolean verificacionDivisas) {
        this.verificacionDivisas = verificacionDivisas;
    }

    public boolean isVerificacionTemperatura() {
        return this.verificacionTemperatura;
    }

    public void setVerificacionTemperatura(boolean verificacionTemperatura) {
        this.verificacionTemperatura = verificacionTemperatura;
    }

    public boolean isVerificacionMedidas() {
        return this.verificacionMedidas;
    }

    public void setVerificacionMedidas(boolean verificacionMedidas) {
        this.verificacionMedidas = verificacionMedidas;
    }

    public FrameSecundario getInterfaz2() {
        return this.frameSecun;
    }

    public void setInterfaz2(FrameSecundario interfaz2) {
        this.frameSecun = interfaz2;

    }
}
