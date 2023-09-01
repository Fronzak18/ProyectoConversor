/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura.Frames;

import conversoralura.Eventos.EventosFrameSecundario;
import java.io.InputStream;
import java.io.IOException;
import javax.swing.Icon;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class FrameSecundario extends JFrame
{
    private FramePrincipal marco;
    private JComboBox listaDivisas;
    private JComboBox listaMedidas;
    private JComboBox listaTemperatura;
    private JComboBox listaMedidas2;
    private JPanel lamina;
    private JTextField valorIngresado;
    private JTextField resultado;
    private EventosFrameSecundario eventos;
    private JLabel texto1;
    private JLabel texto2;
    private JButton convertir;
    private JButton cambiar;
    private Color color;
    int ancho;
    int altura;
    
    public FrameSecundario(final FramePrincipal marco1) {
        this.marco = marco1;
        this.ancho = this.marco.getAnchoPantalla();
        this.altura = this.marco.getAlturaPantalla();
        this.eventos = new EventosFrameSecundario(this, this.marco);
        this.convertir = new JButton();
        this.valorIngresado = new JTextField();
        this.resultado = new JTextField();
    }
    
    public void marcoConversorDivisas() {
        this.listaDivisas = new JComboBox();
        agregadorDeItemsD();
        color = new Color(173, 216, 153);
        setBounds((int)(this.ancho * 1.1), (int)(this.altura * 1.1), (int)(this.ancho / 1.3), (int)(this.altura / 1.3));
        convertir.setBounds((int)(this.ancho * 0.32), (int)(this.altura * 0.25), (int)(this.ancho * 0.1), (int)(this.altura * 0.1));
        listaDivisas.setBounds((int)(this.ancho * 0.2), (int)(this.altura * 0.1), (int)(this.ancho * 0.35), (int)(this.altura * 0.1));
        valorIngresado.setBounds((int)(this.ancho * 0.12), (int)(this.altura * 0.25), (int)(this.ancho * 0.15), (int)(this.altura * 0.1));
        resultado.setBounds((int)(this.ancho * 0.48), (int)(this.altura * 0.25), (int)(this.ancho * 0.15), (int)(this.altura * 0.1));
        convertir.setBackground(Color.red);
        convertir.addActionListener((ActionListener)this.eventos);
        convertir.setBackground(this.color);
        insertarIcono();
        add(this.valorIngresado);
        add(this.listaDivisas);
        add(this.convertir);
        add(this.resultado);
        add(this.crearLamina(this.color));
        valorIngresado.setEnabled(true);
        setVisible(true);
        setDefaultCloseOperation(1);
        setResizable(false);
        setTitle("Conversor De Divisas");
    }
    
    public void marcoConverTemperatura() {
        this.listaTemperatura = new JComboBox();
        this.color = new Color(245, 200, 150);
        agregadorDeItemsT();
        setBounds((int)(this.ancho * 1.1), (int)(this.altura * 1.1), (int)(this.ancho / 1.3), (int)(this.altura / 1.3));
        convertir.setBounds((int)(this.ancho * 0.32), (int)(this.altura * 0.25), (int)(this.ancho * 0.1), (int)(this.altura * 0.1));
        valorIngresado.setBounds((int)(this.ancho * 0.09), (int)(this.altura * 0.25), (int)(this.ancho * 0.2), (int)(this.altura * 0.1));
        resultado.setBounds((int)(this.ancho * 0.45), (int)(this.altura * 0.25), (int)(this.ancho * 0.2), (int)(this.altura * 0.1));
        listaTemperatura.setBounds((int)(this.ancho * 0.2), (int)(this.altura * 0.1), (int)(this.ancho * 0.35), (int)(this.altura * 0.1));
        insertarIcono();
        convertir.addActionListener((ActionListener)this.eventos);
        convertir.setBackground(this.color);
        add(this.valorIngresado);
        add(this.listaTemperatura);
        add(this.convertir);
        add(this.resultado);
        add(this.crearLamina(this.color));
        valorIngresado.setEditable(true);
        setDefaultCloseOperation(1);
        setResizable(false);
        setVisible(true);
        setTitle("Conversor de Temperatura");
    }
    
    public void marcoConverMedidas() {
        this.listaMedidas = new JComboBox();
        this.listaMedidas2 = new JComboBox();
        this.cambiar = new JButton();
        ImageIcon icono = new ImageIcon("src/intercambio.png");
       color = new Color(245, 245, 220);
        agregarItemsM();
        setBounds((int)(this.ancho * 1.1), (int)(this.altura * 1.1), (int)(this.ancho / 1.3), (int)(this.altura / 1.3));
        convertir.setBounds((int)(this.ancho * 0.32), (int)(this.altura * 0.4), (int)(this.ancho * 0.1), (int)(this.altura * 0.1));
        listaMedidas.setBounds((int)(this.ancho * 0.1), (int)(this.altura * 0.15), (int)(this.ancho * 0.18), (int)(this.altura * 0.1));
        listaMedidas2.setBounds((int)(this.ancho * 0.45), (int)(this.altura * 0.15), (int)(this.ancho * 0.18), (int)(this.altura * 0.1));
        cambiar.setBounds((int)(this.ancho * 0.32), (int)(this.altura * 0.15), (int)(this.ancho * 0.1), (int)(this.altura * 0.1));
        valorIngresado.setBounds((int)(this.ancho * 0.12), (int)(this.altura * 0.4), (int)(this.ancho * 0.15), (int)(this.altura * 0.1));
        resultado.setBounds((int)(this.ancho * 0.46), (int)(this.altura * 0.4), (int)(this.ancho * 0.15), (int)(this.altura * 0.1));
        insertarIcono();
        insertarIcono(this.cambiar);
        cambiar.setBackground(this.color);
        cambiar.addActionListener((ActionListener)this.eventos);
        convertir.addActionListener((ActionListener)this.eventos);
        convertir.setBackground(color);
        add(this.listaMedidas);
        add(this.cambiar);
        add(this.listaMedidas2);
        add(this.valorIngresado);
        add(this.convertir);
        add(this.resultado);
        add(this.crearLamina(this.color));
        setTitle("Conversor de Medidas");
        setVisible(true);
        setDefaultCloseOperation(1);
        setResizable(false);
    }
    
    public JPanel crearLamina(final Color color) {
        lamina = new JPanel();
        texto1 = new JLabel();
        texto2 = new JLabel();
        lamina.setBounds((int)(this.ancho * 1.1), (int)(this.altura * 1.1), (int)(this.ancho / 1.3), (int)(this.altura / 1.3));
        texto1.setBounds((int)(this.ancho * 0.12), (int)(this.altura * 0.15), (int)(this.ancho * 0.15), (int)(this.altura * 0.5));
        texto2.setBounds((int)(this.ancho * 0.46), (int)(this.altura * 0.15), (int)(this.ancho * 0.15), (int)(this.altura * 0.5));
        add(this.texto1);
        add(this.texto2);
        lamina.setBackground(color);
        return this.lamina;
    }
    
    public void agregadorDeItemsD() {
        listaDivisas.addItem("Pesos Argentinos a Dolar");
        listaDivisas.addItem("Pesos Argentinos a Euros");
        listaDivisas.addItem("Pesos Argentinos a Libras Esterlinas");
        listaDivisas.addItem("Pesos Argentinos a Won Sul Coreano");
        listaDivisas.addItem("Pesos Argentinos a Yen");
        listaDivisas.addItem("Dolar a Pesos Argentinos");
        listaDivisas.addItem("Euros a Pesos Argentinos");
        listaDivisas.addItem("Libras Esterlinas a Pesos Argentinos");
        listaDivisas.addItem("Won Sul Coreano a Pesos Argentinos");
        listaDivisas.addItem("Yen a Pesos Argentinos");
    }
    
    public void agregadorDeItemsT() {
        listaTemperatura.addItem("Fahreinheit a Grados Celsius");
        listaTemperatura.addItem("Fahreinheit a Grados Kelvin");
        listaTemperatura.addItem("Grados Celsius a Fahreinheit");
        listaTemperatura.addItem("Grados Celsius a Grados Kelvin");
        listaTemperatura.addItem("Grados Kelvin a Fahreinheit");
        listaTemperatura.addItem("Grados Kelvin a Grados Celcius");
    }
    
    public void agregarItemsM() {
        final String[] medidasLista = { "Kilometro", "Metro", "Centimetro", "Milimetro", "Milla", "Yarda", "Pie", "Pulgada", "Milla Nautica" };
        for (int i = 0; i < medidasLista.length; ++i) {
            listaMedidas.addItem(medidasLista[i]);
            listaMedidas2.addItem(medidasLista[i]);
        }
    }
    
    public void insertarIcono() {
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/convertir.png");
            try {
                if (inputStream != null) {
                    final ImageIcon icono = new ImageIcon(ImageIO.read(inputStream));
                    final Image imagen = icono.getImage();
                    final Image imagenReajustada = imagen.getScaledInstance(this.convertir.getWidth(), this.convertir.getHeight(), 4);
                    final ImageIcon iconoReajustado = new ImageIcon(imagenReajustada);
                    convertir.setIcon(iconoReajustado);
                }
                else {
                    System.out.println("No se pudo cargar el icono.");
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException t) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        catch (IOException e) {
            
        }
    }
    
    public void insertarIcono(final JButton cambiar) {
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/intercambiar.png");
            try {
                if (inputStream != null) {
                    final ImageIcon icono = new ImageIcon(ImageIO.read(inputStream));
                    final Image imagen = icono.getImage();
                    final Image imagenReajustada = imagen.getScaledInstance(cambiar.getWidth(), cambiar.getHeight(), 4);
                    final ImageIcon iconoReajustado = new ImageIcon(imagenReajustada);
                    cambiar.setIcon(iconoReajustado);
                }
                else {
                    System.out.println("No se pudo cargar el icono.");
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException t) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        catch (IOException e) {
        }
    }
    
    public JButton getConvertir() {
        return this.convertir;
    }
    
    public void setConvertir(final JButton convertir) {
        this.convertir = convertir;
    }
    
    public FramePrincipal getMarco() {
        return this.marco;
    }
    
    public void setMarco(final FramePrincipal marco) {
        this.marco = marco;
    }
    
    public JComboBox getListaDivisas() {
        return this.listaDivisas;
    }
    
    public void setListaDivisas(final JComboBox listaDivisas) {
        this.listaDivisas = listaDivisas;
    }
    
    public JComboBox getListaMedidas() {
        return this.listaMedidas;
    }
    
    public void setListaMedidas(final JComboBox listaMedidas) {
        this.listaMedidas = listaMedidas;
    }
    
    public JComboBox getListaTemperatura() {
        return this.listaTemperatura;
    }
    
    public void setListaTemperatura(final JComboBox listaTemperatura) {
        this.listaTemperatura = listaTemperatura;
    }
    
    public JPanel getLamina() {
        return this.lamina;
    }
    
    public void setLamina(final JPanel lamina) {
        this.lamina = lamina;
    }
    
    public int getAncho() {
        return this.ancho;
    }
    
    public void setAncho(final int ancho) {
        this.ancho = ancho;
    }
    
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura(final int altura) {
        this.altura = altura;
    }
    
    public JTextField getValorIngresado() {
        return this.valorIngresado;
    }
    
    public void setValorIngresado(final JTextField valorIngresado) {
        this.valorIngresado = valorIngresado;
    }
    
    public JTextField getResultado() {
        return this.resultado;
    }
    
    public JButton getCambiar() {
        return this.cambiar;
    }
    
    public void setCambiar(final JButton cambiar) {
        this.cambiar = cambiar;
    }
    
    public void setResultado(final JTextField resultado) {
        this.resultado = resultado;
    }
    
    public JLabel getTexto1() {
        return this.texto1;
    }
    
    public void setTexto1(final JLabel texto1) {
        this.texto1 = texto1;
    }
    
    public JLabel getTexto2() {
        return this.texto2;
    }
    
    public void setTexto2(final JLabel texto2) {
        this.texto2 = texto2;
    }
    
    public JComboBox getListaMedidas2() {
        return this.listaMedidas2;
    }
    
    public void setListaMedidas2(final JComboBox listaMedidas2) {
        this.listaMedidas2 = listaMedidas2;
    }
    
 

    @Override
    public String toString() {
        return "InterfazN2{" + "marco=" + marco + ", listaDivisas=" + listaDivisas + ", listaMedidas=" + listaMedidas + ", listaTemperatura=" + listaTemperatura + ", listaMedidas2=" + listaMedidas2 + ", lamina=" + lamina + ", valorIngresado=" + valorIngresado + ", resultado=" + resultado + ", eventos=" + eventos + ", texto1=" + texto1 + ", texto2=" + texto2 + ", convertir=" + convertir + ", cambiar=" + cambiar + ", color=" + color + ", ancho=" + ancho + ", altura=" + altura + '}';
    }
  
}