/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.Frames;

import conversoralura.Eventos.EventosFramePrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame {

    private JPanel laminaLista;
    private JPanel lamina;
    private JComboBox listaConvertibilidad;
    private Toolkit pantalla;
    private Dimension dimension;
    private JLabel textoPrincipal;
    private JLabel medidas;
    private JLabel divisas;
    private JLabel temperatura;
    private JLabel texto;
    private JLabel texto2;
    private int anchoPantalla;
    private int alturaPantalla;
    private EventosFramePrincipal eventos;

    public void FramePrincipal() {
        this.pantalla = Toolkit.getDefaultToolkit();
        this.dimension = this.pantalla.getScreenSize();
        this.listaConvertibilidad = new JComboBox();
        this.divisas = new JLabel();
        this.temperatura = new JLabel();
        this.medidas = new JLabel();
        this.eventos = new EventosFramePrincipal(this);
        this.textoPrincipal = new JLabel();
        this.lamina = new JPanel();
        this.temperatura = new JLabel();
        this.texto = new JLabel();
        this.texto2 = new JLabel();
        this.anchoPantalla = this.dimension.width / 3;
        this.alturaPantalla = this.dimension.height / 3;
    }

    public void crearMarco() {
        ajustarMarco();
        crearLamina();
        add(this.texto);
        add(this.texto2);
        add(this.divisas);
        add(this.temperatura);
        add(this.medidas);
        add(this.medidas);
        add(this.lamina);
        setTitle("Dconver");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
    }

    // Método para ajustar las propiedades de la ventana y los componentes
    public void ajustarMarco() {
        setBounds(anchoPantalla, alturaPantalla, anchoPantalla, alturaPantalla);
        divisas.setBounds((int) (anchoPantalla * 0.1), (int) (alturaPantalla * 0.3), (int) (anchoPantalla * 0.2), (int) (alturaPantalla * 0.3));
        temperatura.setBounds((int) (anchoPantalla * 0.4), (int) (alturaPantalla * 0.3), (int) (anchoPantalla * 0.15), (int) (alturaPantalla * 0.3));
        medidas.setBounds((int) (anchoPantalla * 0.7), (int) (alturaPantalla * 0.25), (int) (anchoPantalla * 0.2), (int) (alturaPantalla * 0.4));
        texto.setBounds((int) (anchoPantalla * 0.2), (int) (alturaPantalla * 0.05), (int) (anchoPantalla * 0.9), (int) (alturaPantalla * 0.12));
        texto2.setBounds((int) (anchoPantalla * 0.1), (int) (alturaPantalla * 0.1), (int) (anchoPantalla * 0.9), (int) (alturaPantalla * 0.2));
        texto.setText("<html><u>CONVERSOR DE UNIDAD DCONVER</u></html>");
        texto2.setText("Bienvenido al conversor DCONVER, porfavor elija la conversion que mas desee.");
        texto.setFont(new Font("Helvetica Neue", 1, 20));
        texto2.setFont(new Font("Helvetica Neue", 2, 14));
        insertarIconos();
    }
 // Método para insertar iconos en algunas etiquetas
    public void insertarIconos() {
        ImageIcon iconoTemperatura = new ImageIcon("src/alta-temperatura.png");
        ImageIcon iconoDivisas = new ImageIcon("src/cambio-de-divisas.png");
        ImageIcon iconoMedidas = new ImageIcon("src/gobernante.png");
        Image iconoReajustadaDivivsas = iconoDivisas.getImage().getScaledInstance(100, 100, 4);
        Image iconoReajustadaTemperatura = iconoTemperatura.getImage().getScaledInstance(100, 100, 4);
        Image iconoReajustadaMedidas = iconoMedidas.getImage().getScaledInstance(100, 100, 4);
        ImageIcon imagenReajustadaDivisas = new ImageIcon(iconoReajustadaDivivsas);
        ImageIcon imagenReajustadaTemperatura = new ImageIcon(iconoReajustadaTemperatura);
        ImageIcon imagenReajustadaMedidas = new ImageIcon(iconoReajustadaMedidas);
        divisas.setIcon(imagenReajustadaDivisas);
        temperatura.setIcon(imagenReajustadaTemperatura);
        medidas.setIcon(imagenReajustadaMedidas);
        temperatura.addMouseListener((MouseListener) eventos);
        divisas.addMouseListener((MouseListener) eventos);
        medidas.addMouseListener((MouseListener) eventos);
    }

    public void crearLamina() {
        lamina.setSize(anchoPantalla, alturaPantalla);
        textoPrincipal.setBounds((int) (anchoPantalla * 0.2), (int) (alturaPantalla * 0.15), (int) (anchoPantalla * 0.4), (int) (alturaPantalla * 0.3));
        Color colorLamina = new Color(255, 200, 150);
        lamina.setBackground(colorLamina);
        add(textoPrincipal);
        listaConvertibilidad.addItem("divisas");
        listaConvertibilidad.addItem("Temperatura");
        listaConvertibilidad.addItem("Medidas");
    }

    public JPanel getLaminaLista() {
        return this.laminaLista;
    }

    public void setLaminaLista(JPanel laminaLista) {
        this.laminaLista = laminaLista;
    }

    public JPanel getLamina() {
        return this.lamina;
    }

    public void setLamina(JPanel lamina) {
        this.lamina = lamina;
    }

    public JComboBox getListaConvertibilidad() {
        return this.listaConvertibilidad;
    }

    public void setListaConvertibilidad(JComboBox listaConvertibilidad) {
        this.listaConvertibilidad = listaConvertibilidad;
    }

    public Toolkit getPantalla() {
        return this.pantalla;
    }

    public void setPantalla(Toolkit pantalla) {
        this.pantalla = pantalla;
    }

    public JLabel getLabel() {
        return this.temperatura;
    }

    public JLabel getDivisas() {
        return this.divisas;
    }

    public void setDivisas(JLabel divisas) {
        this.divisas = divisas;
    }

    public JLabel getTexto() {
        return this.texto;
    }

    public void setTexto(JLabel texto) {
        this.texto = texto;
    }

    public JLabel getTexto2() {
        return this.texto2;
    }

    public void setTexto2(JLabel texto2) {
        this.texto2 = texto2;
    }

    public void setLabel(JLabel temperatura) {
        this.temperatura = temperatura;
    }

    public int getAnchoPantalla() {
        return this.anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public int getAlturaPantalla() {
        return this.alturaPantalla;
    }

    public void setAlturaPantalla(int alturaPantalla) {
        this.alturaPantalla = alturaPantalla;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public JLabel getTextoPrincipal() {
        return this.textoPrincipal;
    }

    public void setTextoPrincipal(JLabel textoPrincipal) {
        this.textoPrincipal = textoPrincipal;
    }

    public JLabel getMedidas() {
        return this.medidas;
    }

    public void setMedidas(JLabel medidas) {
        this.medidas = medidas;
    }

    public JLabel getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(JLabel temperatura) {
        this.temperatura = temperatura;
    }

    public EventosFramePrincipal getEventos() {
        return this.eventos;
    }

    public void setEventos(EventosFramePrincipal eventos) {
        this.eventos = eventos;
    }
}
