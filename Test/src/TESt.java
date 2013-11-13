import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Dec 01 17:17:20 COT 2012
 */



/**
 * @author sony rios
 */
public class TESt extends JPanel {
	public TESt() {
		initComponents();
	}

	private void button1MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - sony rios
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//---- label1 ----
		label1.setText("ANALIZADOR DE CODIGO DE SENTENCIAS SQL");
		add(label1);
		label1.setBounds(new Rectangle(new Point(155, 50), label1.getPreferredSize()));

		//---- label2 ----
		label2.setText("Codigo a evaluar");
		add(label2);
		label2.setBounds(32, 127, 118, label2.getPreferredSize().height);
		add(textField1);
		textField1.setBounds(145, 125, 305, textField1.getPreferredSize().height);

		//---- label3 ----
		label3.setText("Carga tu archivo TXT");
		add(label3);
		label3.setBounds(new Rectangle(new Point(40, 195), label3.getPreferredSize()));

		//---- button1 ----
		button1.setText("CARGAR ARCHIVO");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button1MouseClicked(e);
			}
		});
		add(button1);
		button1.setBounds(250, 185, 145, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setText("EJECUTAR");
		add(button2);
		button2.setBounds(new Rectangle(new Point(120, 260), button2.getPreferredSize()));

		//---- button3 ----
		button3.setText("CERRAR");
		add(button3);
		button3.setBounds(new Rectangle(new Point(395, 260), button3.getPreferredSize()));

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < getComponentCount(); i++) {
				Rectangle bounds = getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			setMinimumSize(preferredSize);
			setPreferredSize(preferredSize);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - sony rios
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
