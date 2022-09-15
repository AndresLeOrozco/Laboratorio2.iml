package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjGridBagLO extends JFrame {

    private JPanel main;
    private JLabel txt;
    private JComboBox seleccioneUnaDeLasComboBox;
    private JButton boton;
    private JLabel txt2;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public EjGridBagLO(){
        this.setSize(1200,400);
        this.setContentPane(this.main);
//
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((String) (seleccioneUnaDeLasComboBox.getSelectedItem()) == "Pizza")
                    JOptionPane.showMessageDialog(boton,"https://www.tripadvisor.es/Restaurants-g2572131-c31-Costa_Rica_State_of_Mato_Grosso_do_Sul.html");
                if((String) (seleccioneUnaDeLasComboBox.getSelectedItem()) == "Hamburguesa")
                    JOptionPane.showMessageDialog(boton,"https://apetitoenlinea.com/las-mejores-hamburguesas-de-costa-rica/");
                if((String) (seleccioneUnaDeLasComboBox.getSelectedItem()) == "Pescado")
                    JOptionPane.showMessageDialog(boton,"https://www.tripadvisor.es/Restaurants-g309293-c33-San_Jose_San_Jose_Metro_Province_of_San_Jose.html");
            }
       });

    }

    public static void main(String[] args) {
        EjGridBagLO ej = new EjGridBagLO();

        ej.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
