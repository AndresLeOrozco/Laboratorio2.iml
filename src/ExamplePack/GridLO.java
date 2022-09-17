package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GridLO extends JFrame {
    private JPanel panelGridL;
    public GridLO() {
        super("Ejemplo GridLayout");
        panelGridL= new JPanel();
        this.setSize(1200,900);
        GridLayout obj = new GridLayout(2,2,15,15);

        panelGridL.setLayout(obj);

        ImageIcon img1 =new ImageIcon("imagenes/facebook.png");
        BufferedImage bi = new BufferedImage(400,400, BufferedImage.TRANSLUCENT);
        Graphics g = bi.createGraphics();
        g.drawImage(img1.getImage(),0,0,400,400,null);
        g.dispose();;
        img1 = new ImageIcon(bi);
        JButton btn1 = new JButton(img1);

        ImageIcon img2 =new ImageIcon("imagenes/twitter.png");
        BufferedImage b2 = new BufferedImage(400,400, BufferedImage.TRANSLUCENT);
        Graphics g1 = b2.createGraphics();
        g1.drawImage(img2.getImage(),0,0,400,400,null);
        g1.dispose();;
        img2 = new ImageIcon(b2);
        JButton btn2 = new JButton(img2);

        ImageIcon img3 =new ImageIcon("imagenes/instagram.png");
        BufferedImage b3 = new BufferedImage(300,300, BufferedImage.TRANSLUCENT);
        Graphics g2 = b3.createGraphics();
        g2.drawImage(img3.getImage(),0,0,300,300,null);
        g2.dispose();;
        img3 = new ImageIcon(b3);
        JButton btn3 = new JButton(img3);

        ImageIcon img4 =new ImageIcon("imagenes/whatsapp.png");
        BufferedImage b4 = new BufferedImage(400,400, BufferedImage.TRANSLUCENT);
        Graphics g3 = b4.createGraphics();
        g3.drawImage(img4.getImage(),0,0,400,400,null);
        g3.dispose();
        img4 = new ImageIcon(b4);
        JButton btn4 = new JButton(img4);
        panelGridL.add(btn1);
        panelGridL.add(btn2);
        panelGridL.add(btn3);
        panelGridL.add(btn4);
        this.setContentPane(panelGridL);



        btn1.setBounds(10,10, 30, 30);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(btn1, "https://es-la.facebook.com/login");}
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(btn2, "https://twitter.com/i/flow/login");}
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(btn3, "https://www.instagram.com/accounts/login/");}
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(btn4, "https://www.whatsapp.com/");}
        });
    }
}
