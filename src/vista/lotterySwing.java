package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Lottery;

public class lotterySwing {
	
	private static JLabel jL;
	
	public static void main(String[] args) {
		
		interfazLottery();
		
	}
	
	public static void interfazLottery() {
	
		JFrame jF = null;
		JButton jB = null;
		JPanel jP1 = null;
		JPanel jP2 = null;
		
		jF = new JFrame("Lottery");
		jB = new JButton("Generar");
		jP1 = new JPanel();
		jP2 = new JPanel();
		
	    jB.addActionListener(new ActionListener() {
	        	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            	String resultado = Lottery.generateLotteryNumber();
	            	jL.setText(resultado);
	                
	            }
	            
	        });
	
		/*jF.getContentPane().add(jB, BorderLayout.SOUTH);
		jF.getContentPane().add(jL, BorderLayout.CENTER);
		*/
	    jF.setSize(700, 400);
		jF.setVisible(true);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jP1.add(jL);
		jP2.add(jB);
		jF.add(jP1, BorderLayout.NORTH);
		jF.add(jP2, BorderLayout.SOUTH);
		
	    
	/* // Panel principal con BoxLayout en eje Y
        Box mainPanel = new Box(BoxLayout.Y_AXIS);
        mainPanel.add(Box.createVerticalGlue()); // Espacio vertical al inicio
        mainPanel.add(jL); // Agregar JLabel al panel principal
        jL.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar texto verticalmente
        mainPanel.add(Box.createVerticalGlue()); // Espacio vertical al final
        mainPanel.add(jB); // Agregar JButton al panel principal

        jF.getContentPane().add(mainPanel, BorderLayout.CENTER); // Agregar panel principal al centro
        */

		
	}
		

}
