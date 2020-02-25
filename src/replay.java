import javax.swing.*;
import java.awt.event.*;

public class replay extends JDialog {
    private JPanel contentPane2;
    private JButton ouiButton;
    private JButton nonButton;

    public replay() {
        setContentPane(contentPane2);
        setModal(true);
        init();
    }


    private void init() {
        ouiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                toto.main(null);

            }
        });

        nonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }



    public static JFrame main(String[] args) {
        replay dialog = new replay();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
        return null;
    }
}
