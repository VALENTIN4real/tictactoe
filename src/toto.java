import javax.swing.*;
import java.awt.*;

public class toto extends JDialog {
    ImageIcon croix = new ImageIcon("images/croix.png");
    ImageIcon rond = new ImageIcon("images/rond.png");
    private JPanel contentPane;
    private JButton button00;
    private JButton button02;
    private JButton button01;
    private JButton button11;
    private JButton button10;
    private JButton button12;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JLabel titreJeu;
    static int x;
    static int o;
    private JLabel scorex;
    private JLabel scoreo;
    private JButton buttonNon;
    private JButton buttonOui;
    private JLabel rejouer;
    private JPanel tableau;
    int i = 0; // tourJoueur()
    boolean fin = false;
    static String turn = "";

    public toto(){
        setContentPane(contentPane);
        setModal(true);
        //perso
        init();
        initButtons();
        scorex.setText("X : " + x);
        scoreo.setText("O : " + o);
        rejouer.setVisible(false);
        buttonNon.setVisible(false);
        buttonOui.setVisible(false);
    }

    private void initBoutons(JButton bt) {
        bt.setBackground(new Color(204, 153, 255));
    }

    private void initButtons() {
        initBoutons(button00);
        initBoutons(button01);
        initBoutons(button02);
        initBoutons(button10);
        initBoutons(button11);
        initBoutons(button12);
        initBoutons(button20);
        initBoutons(button21);
        initBoutons(button22);
    }

    private void init() {
        button00.addActionListener(e -> tourJoueur(button00));

        button01.addActionListener(e -> tourJoueur(button01));

        button02.addActionListener(e -> tourJoueur(button02));

        button10.addActionListener(e -> tourJoueur(button10));

        button11.addActionListener(e -> tourJoueur(button11));

        button12.addActionListener(e -> tourJoueur(button12));

        button20.addActionListener(e -> tourJoueur(button20));

        button21.addActionListener(e -> tourJoueur(button21));

        button22.addActionListener(e -> tourJoueur(button22));

        buttonOui.addActionListener(e -> {
            dispose();
            toto.main(null);
        });

        buttonNon.addActionListener(e -> System.exit(0));
        this.setResizable(false);
    }

    private void xInCase(JButton bt) {
        bt.setDisabledIcon(croix);
        bt.setIcon(croix);
    }

    private void oInCase(JButton bt) {
        bt.setDisabledIcon(rond);
        bt.setIcon(rond);
    }

    private void tourJoueur(JButton bt) {
        if (turn.equals("X") || turn.equals("")) {
            if (i % 2 == 0) {
                xInCase(bt);
            } else {
                oInCase(bt);
            }
        } else if (turn.equals("O")){
            if (i % 2 != 0) {
                xInCase(bt);
            } else {
                oInCase(bt);
            }
        }
        bt.setEnabled(false);
        finDePartie();
        i++;
    }

    private void finDePartie() {
        // Détermination des cas qui engendrent une fin de partie

        boolean testBouton00 = button00.isEnabled();
        boolean testBouton01 = button01.isEnabled();
        boolean testBouton02 = button02.isEnabled();
        boolean testBouton10 = button10.isEnabled();
        boolean testBouton11 = button11.isEnabled();
        boolean testBouton12 = button12.isEnabled();
        boolean testBouton20 = button20.isEnabled();
        boolean testBouton21 = button21.isEnabled();
        boolean testBouton22 = button22.isEnabled();

        Icon bouton00 = button00.getIcon();
        Icon bouton01 = button01.getIcon();
        Icon bouton02 = button02.getIcon();
        Icon bouton10 = button10.getIcon();
        Icon bouton11 = button11.getIcon();
        Icon bouton12 = button12.getIcon();
        Icon bouton20 = button20.getIcon();
        Icon bouton21 = button21.getIcon();
        Icon bouton22 = button22.getIcon();
        // XXX
        // ???
        // ???

        boolean fin;

        if ((bouton00 == croix && bouton01 == croix && bouton02 == croix) || (bouton00 == rond && bouton01 == rond && bouton02 == rond)) {
            if (bouton00 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        // X??
        // ?X?
        // ??X

        else if ((bouton00 == croix && bouton11 == croix && bouton22 == croix) || (bouton00 == rond && bouton11 == rond && bouton22 == rond)) {
            if (bouton00 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            X??
            X??
            X??
        */

        else if ((bouton00 == croix && bouton10 == croix && bouton20 == croix) || (bouton00 == rond && bouton10 == rond && bouton20 == rond)) {
            if (bouton00 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            ???
            XXX
            ???
        */

        else if ((bouton10 == croix && bouton11 == croix && bouton12 == croix) || (bouton10 == rond  && bouton11 == rond && bouton12 == rond)) {
            if (bouton10 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            ?X?
            ?X?
            ?X?
        */

        else if ((bouton01 == croix && bouton11 == croix && bouton21 == croix) || (bouton01 == rond && bouton11 == rond && bouton21 == rond)) {
            if (bouton01 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            ??X
            ??X
            ??X
        */

        else if ((bouton02 == croix && bouton12 == croix && bouton22 == croix) || (bouton02 == rond && bouton12 == rond && bouton22 == rond)) {
            if (bouton02 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            ??X
            ?X?
            X??
        */

        else if ((bouton02 == croix && bouton11 == croix && bouton20 == croix) || (bouton02 == rond && bouton11 == rond && bouton20 == rond)){
            if (bouton02 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }

        /*
            ???
            ???
            XXX
        */

        else if ((bouton20 == croix && bouton21 == croix && bouton22 == croix) || (bouton20 == rond && bouton21 == rond && bouton22 == rond)){
            if (bouton20 == croix) {
                scoreX();
                rejouer.setText("X a gagné ! Rejouer ?");
            } else {
                scoreO();
                rejouer.setText("O a gagné ! Rejouer ?");
            }
            fin = true;
            endGame();
        }



        else if ((!testBouton00 && !testBouton01 && !testBouton02 && !testBouton10 && !testBouton11 && !testBouton12 && !testBouton20 && !testBouton21 && !testBouton22)) {
            rejouer.setText("Egalité... Rejouer ?");
            fin = true;
            endGame();
        }

    }

    private void endGame() {
        if (fin = true) {
            button00.setEnabled(false);
            button01.setEnabled(false);
            button02.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);

            rejouer.setVisible(true);
            buttonOui.setVisible(true);
            buttonNon.setVisible(true);
        }
    }

    private void scoreX() {
        x++;
        turn = "X";
    }

    private void scoreO() {
        o++;
        turn = "O";
    }

    public static void main(String[] args) {
        toto dialog = new toto();
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
