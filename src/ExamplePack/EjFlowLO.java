package ExamplePack;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EjFlowLO extends JFrame{
    private JTabbedPane jTabbedPane;
    private JButton  animalsbutton;
    private JButton  sportsbutton;
    private JButton  foodbutton;
    private JLabel etiqueta;

    private JFrame jFrame1;
    private JFrame jFrame2;
    private JFrame jFrame3;

    private JList<String> animalslist;
    private JList<String> sportslist;
    private JList<String> foodlist;
    public EjFlowLO() {


        setLayout(new FlowLayout());

        animalsbutton = new JButton("Animals");
        sportsbutton = new JButton("Sports");
        foodbutton = new JButton("Food");
        etiqueta= new JLabel("Choose a button");

        add(etiqueta);
        add(animalsbutton);
        add(sportsbutton);
        add(foodbutton);

        pack();

        jFrame1 = new JFrame();
        String[] animals = { "Dogs", "Cats", "Rabbits"};
        animalslist = new JList(animals);
        jFrame1.add(animalslist);
        jFrame1.pack();

        jFrame2 = new JFrame();
        String[] sports = { "Soccer", "Basketball", "Volleyball"};
        sportslist = new JList(sports);
        jFrame2.add(sportslist);
        jFrame2.pack();

        jFrame3 = new JFrame();
        String[] food = { "Sushi", "Pizza", "Taco"};
        foodlist = new JList(food);
        jFrame3.add(foodlist);
        jFrame3.pack();

        animalsbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame1.setVisible(true);
            }
        });

        sportsbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame2.setVisible(true);
            }
        });

        foodbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame3.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        EjFlowLO ej = new EjFlowLO();
        ej.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
