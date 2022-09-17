package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borde extends JFrame {
    private JPanel panelBorderL;
    public Borde(Component centro, JButton sur, Component norte, Component este, Component oeste) {
        super("Ejemplo Borderlayout");
        panelBorderL = new JPanel();
        this.setSize(1200,400);
        BorderLayout obj = new BorderLayout();
        panelBorderL.setLayout(obj);
        panelBorderL.add("Center", centro);
        panelBorderL.add("South", sur);
        panelBorderL.add("North", norte);
        panelBorderL.add("East", este);
        panelBorderL.add("West", oeste);
        this.setContentPane(panelBorderL);

        sur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(sur, "Su comentario se envió con exito");}
        });
    }

};