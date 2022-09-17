package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjCardLO extends JFrame {
    private JFrame jFrame1;

    private JPanel jPanel1;
    private JPanel jPanel2;

    private JPanel jPanel11;
    private CardLayout card;

    private JTabbedPane jTabbedPane;

    private JButton b1;
    private JButton b2;
    private JOptionPane jOptionPane;

    private JTextArea jTextArea;

    private JList<String> animelist;

    private JLabel jLabel;

    public EjCardLO() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("CardLayout");

        jTabbedPane = new JTabbedPane();

        card = new CardLayout();

        jPanel11 = new JPanel();
        jPanel11.add( b1 = new JButton("Gratitude"));
        jPanel11.add( b2 = new JButton("Suggestions"));

        jPanel1 = new JPanel();
        jPanel1.setLayout(card);

        jPanel1.add("First", jPanel11);
        card.show(jPanel1, "First");
        card.first(jPanel1);

        jPanel2 = new JPanel();
        jLabel = new JLabel("Extra. Animes you really need to watch before you die, I think");
        jPanel2.add(jLabel);

        String[] animes = { "Shadows House", "Shuumatsu no Valkyrie", "Akatsuki no Yona", "Ao no Exorcist", "Hunter x Hunter"};
        animelist = new JList(animes);
        jPanel2.add(animelist);

        jTabbedPane.add("Page 1", jPanel1);
        jTabbedPane.add("Page 2", jPanel2);

        getContentPane().add(jTabbedPane);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jOptionPane.showMessageDialog(null, "Thanks to read this");
            }
        });

        jFrame1 = new JFrame("Suggestions");
        jFrame1.setBounds(0,0,540,400);
        jTextArea = new JTextArea();
        jTextArea.setBounds(10,50,400,300);
        jFrame1.add(jTextArea);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        EjCardLO ej = new EjCardLO();
        ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

