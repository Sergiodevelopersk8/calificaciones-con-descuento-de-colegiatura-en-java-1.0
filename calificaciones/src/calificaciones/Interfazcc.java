package calificaciones;

import java.awt.event.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Image;
import javax.swing.*;
public class Interfazcc extends JFrame {
	ImageIcon imagen;
	Icon icono;
	JFrame f;
	
	public JLabel numero1;
	public JLabel numero2;
	public JLabel numero3;
	public JLabel numero4;
	public JTextField caja1;
	public JTextField caja2;
	public JTextField caja3;
	public JTextField caja4;
	public JButton calcular;
	public JComboBox combo;
	
	public JRadioButton radio1;
	
	public JCheckBox che;
	
	public JTextField promedio;
    public JTextField credito;
	public JTextField colegiatura;
	public JTextField numematerias;
	
	public JLabel lblpromedio;

	public JLabel lblcolegiatura;
	public JLabel lblnumematerias;
    public JLabel lblnombre;
    public JLabel etiqueta=new JLabel();
   
	public Interfazcc() {
		
		 
		JRadioButton radio1 = new JRadioButton("hola",false);
		
		JCheckBox che = new JCheckBox("desaparecer",false);
		JCheckBox che2 = new JCheckBox("ver", false);
		combo = new JComboBox();
		numero1 = new JLabel("Ingresar costo por materia: ");
		numero2 = new JLabel("Ingresar numero de materias cursando: ");
		numero3 = new JLabel("Ingresar promedio de el ultimo periodo: ");
		numero4 = new JLabel("Total a pagar: ");
		caja1 = new JTextField();
		caja2 = new JTextField();
		caja3 = new JTextField();
		caja4 = new JTextField();
		calcular = new JButton ("Calcular");
		
		
		
		numero1.setBounds(30,50,200,20);
		numero2.setBounds(30,80,250,20);
		numero4.setBounds(245,150,250,20);
		numero3.setBounds(30,110,250,20);
		caja1.setBounds(290,50,50,20);
		caja2.setBounds(290,80,50,20);
		caja3.setBounds(290,110,50,20);
		calcular.setBounds(245,260,100,20);
		 combo.setBounds(20,300,160,30);
		 radio1.setBounds(490,100,180,130);
		
		 che.setBounds(490,50,200,20);
	     che2.setBounds(490,70, 80,30);
		
		
		add(numero1);
		add(numero2);
		add(numero3);
		add(numero4);
		add(caja1);
		add(caja2);
		add(caja3);
		add(calcular);
		ButtonGroup organizar = new ButtonGroup();
		combo.addItem("uno");
		combo.addItem("dos");
		combo.addItem("tres");
		add(che);
		add(che2);
		add(combo);
		add(radio1);
		
		
		
		setSize(700,400);
	    setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	   /* combo.addActionListener(new ActionListener()*/
	    /* if(radio1.isSelected()) {
			lblhola1.setText(" ");*/
	    
	    calcular.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		float promedio = Float.parseFloat(caja3.getText());
				float materias = Float.parseFloat(caja2.getText());
				float materiasC = Float.parseFloat(caja1.getText());
				Creditos calcu= new Creditos();
				float pagos = calcu.calcularPago(materiasC , materias);
				float Tpago = 0;
				
				
				
				if(promedio >= 9)
				{
					
			    float restar = calcu.calcularDescuento();
			    float preciofin = pagos-restar;
				numero3.setText("Total a pagar: "+preciofin);
				
				}
				else
				{
			float sumar =calcu.calcularCostoDiez();
			float preciosum = pagos + sumar;
			numero3.setText("Total a pagar: "+ preciosum);
				}
	    		
	    	}
	    });
			
	}

	
 
 public static void main(String[] args) {
 // TODO code application logic here
 new Interfazcc();
 }
 
}