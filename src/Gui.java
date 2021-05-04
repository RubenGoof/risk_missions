import generation.Distributor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JSlider slider1;
    private JButton showButton;
    private JButton clearButton;
    private JLabel card;
    private JButton generateButton;
    private JPanel Panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui");
        frame.setContentPane(new Gui().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Gui() {
        Distributor distributor = new Distributor();
        Panel.setPreferredSize(new Dimension(400, 400));
        Panel.revalidate();
        Panel.repaint();

        slider1.setMajorTickSpacing(1);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintTicks(true);

        generateButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                distributor.generate(slider1.getMaximum());
                card.setText("Distributed cards.");
            }
        });

        showButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if(distributor.getCard(slider1.getValue()) != null){
                    card.setText(distributor.getCard(slider1.getValue()).getDescription());
                } else {
                    card.setText("No available cards.");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                card.setText("");
            }
        });

    }


}
