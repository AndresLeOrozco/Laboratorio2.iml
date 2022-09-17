package ExamplePack;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Vista{
    private JFrame ventana;
    private JMenu menu;
    private JMenuItem item1;
    private JMenuItem item2;
    private JMenuItem item3;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private CardLayout card;
    private JButton bot1;
    private JDialog AcercaDe;
    private JComboBox ejs;
    EjGridBagLO Ej1 = new EjGridBagLO();
    EjCardLO EjCl1 = new EjCardLO();
    EjFlowLO EjFl1 = new EjFlowLO();

    public Vista(){
        ventana = new JFrame("Laboratorio 2");
        ventana.setSize(640,400);
        card = new CardLayout();
        ventana.setLayout(card);
        menu = new JMenu("Menu");
        JMenuBar barra = new JMenuBar();
        barra.setSize(80,20);
        item1 = new JMenuItem("Inicio");
        item2 = new JMenuItem("Ejemplos");
        item3 = new JMenuItem("Acerca de");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        barra.add(menu);

        JLabel txt = new JLabel("Pulse el boton para salir");
        item1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(ventana.getContentPane(),"Inicio");
            }
        });
        panel1 = new JPanel();
        panel1.setSize(50,50);
        panel1.setLayout(new GridLayout(1,0));
        panel1.add(txt);
        bot1 = new JButton("Press");
        bot1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                WindowEvent closeWindow = new WindowEvent(ventana,WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
            }
        });
        panel1.add(bot1);

        JButton bt1 = new JButton("BorderLayout");
        JButton bt2 = new JButton("GridLayout");
        JButton bt3 = new JButton("FlowLayout");
        JButton bt4 = new JButton("GridBabLayout");
        JButton bt5 = new JButton("CardLayout");
        panel2 = new JPanel();
        panel2.setSize(300,300);
        panel2.setLayout(new GridLayout(0,6));
        JLabel ejems = new JLabel("Ejemplos de: ");
        ejems.setForeground(Color.RED);
        ejems.setFont(new Font("Castellar",2,11));
        ejems.setSize(80,30);
        panel2.add(ejems);
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        panel2.add(bt4);
        panel2.add(bt5);
        item2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(ventana.getContentPane(),"Ejemplos");
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {CreaBorderLayout().setVisible(true);}
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {CreaGridLayout().setVisible(true);}
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {EjFl1.setVisible(true);}
        });

        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ej1.setVisible(true);
            }
        });

        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {EjCl1.setVisible(true);}
        });

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,0));
        JLabel txtAD = new JLabel("Integrantes de Grupo");
        txtAD.setForeground(Color.blue);
        JLabel txtAD2 = new JLabel("Andres Leon, "+" "+"Idanny Huertas, "+" "+"Jennifer Quiros");
        panel3.add(txtAD);
        panel3.add(txtAD2);
        AcercaDe = new JDialog();
        AcercaDe.setSize(600,600);
        AcercaDe.setLocationRelativeTo(null);
        AcercaDe.setTitle("Acerca De");
        AcercaDe.setLayout(new GridLayout(1,0));
        AcercaDe.add(panel3);
//        AcercaDe.add(txtAD);
//        AcercaDe.add(txtAD2);
        item3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AcercaDe.setVisible(true);
            }
        });


        JPanel main = new JPanel();
        main.setLayout(new GridLayout(1,0));
        JLabel txt2 = new JLabel("Laboratorio 2");
        txt2.setSize(100,100);
        main.add(txt2);


        ventana.add(panel2,"Ejemplos");
        ventana.add(main,"main");
        ventana.add(panel1,"Inicio");
        ventana.setJMenuBar(barra);
        card.show(ventana.getContentPane(),"main");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JFrame CreaBorderLayout(){
        JTextArea Area_Central =new JTextArea("Comentario");
        JButton sur =new JButton();
        sur.setText("ENVIAR");
        JLabel norte = new JLabel("Deje su comentario:");
        JTextField Text = new JTextField();

        Text.setText("Sur");

        JLabel  ima =new JLabel();


        JLabel  ima2 =new JLabel();
        ImageIcon img2 =new ImageIcon("imagenes/java.png");
        BufferedImage b3 = new BufferedImage(300,300, BufferedImage.TRANSLUCENT);
        Graphics g2 = b3.createGraphics();
        g2.drawImage(img2.getImage(),0,0,300,300,null);
        g2.dispose();;
        img2 = new ImageIcon(b3);
        ima2.setIcon(img2);
        JLabel  ima3 =new JLabel();
        ImageIcon img3 =new ImageIcon("imagenes/java.png");
        BufferedImage b4 = new BufferedImage(300,300, BufferedImage.TRANSLUCENT);
        Graphics g3 = b4.createGraphics();
        g3.drawImage(img2.getImage(),0,0,300,300,null);
        g3.dispose();;
        img3 = new ImageIcon(b3);
        ima3.setIcon(img3);


        return new Borde(Area_Central,sur,norte,ima2,ima3);

    }
    public JFrame CreaGridLayout(){
        return new GridLO();

    }
}
