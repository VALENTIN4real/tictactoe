import javax.swing.*;

public class toto extends JDialog {
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
    int i = 0; // tourJoueur()
    boolean fin = false;
    static int x;
    static int o;

    public toto(){
        setContentPane(contentPane);
        setModal(true);
        //perso
        init();
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
    }

    private void xInCase(JButton bt) {
        bt.setText("X");
    }

    private void oInCase(JButton bt) {
        bt.setText("O");
    }

    private void tourJoueur(JButton bt) {

        if (i%2==0) {
            xInCase(bt);
            bt.setEnabled(false);
        } else {
            oInCase(bt);
            bt.setEnabled(false);
        }
        finDePartie();
        i++;
    }

    private void finDePartie() {
        // Détermination des cas qui engendrent une fin de partie

        String bouton00 = button00.getText();
        String bouton01 = button01.getText();
        String bouton02 = button02.getText();
        String bouton10 = button10.getText();
        String bouton11 = button11.getText();
        String bouton12 = button12.getText();
        String bouton20 = button20.getText();
        String bouton21 = button21.getText();
        String bouton22 = button22.getText();

        boolean testBouton00 = button00.isEnabled();
        boolean testBouton01 = button01.isEnabled();
        boolean testBouton02 = button02.isEnabled();
        boolean testBouton10 = button10.isEnabled();
        boolean testBouton11 = button11.isEnabled();
        boolean testBouton12 = button12.isEnabled();
        boolean testBouton20 = button20.isEnabled();
        boolean testBouton21 = button21.isEnabled();
        boolean testBouton22 = button22.isEnabled();

        // XXX
        // ???
        // ???

        boolean fin;
        if ((bouton00.equals("X") && bouton01.equals("X") && bouton02.equals("X")) || (bouton00.equals("O") && bouton01.equals("O") && bouton02.equals("O"))) {
            if (bouton00.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        // X??
        // ?X?
        // ??X

        else if ((bouton00.equals("X") && bouton11.equals("X") && bouton22.equals("X")) || (bouton00.equals("O") && bouton11.equals("O") && bouton22.equals("O"))) {
            if (bouton00.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            X??
            X??
            X??
        */

        else if ((bouton00.equals("X") && bouton10.equals("X") && bouton20.equals("X")) || (bouton00.equals("O") && bouton10.equals("O") && bouton20.equals("O"))) {
            if (bouton00.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            ???
            XXX
            ???
        */

        else if ((bouton10.equals("X") && bouton11.equals("X") && bouton12.equals("X")) || (bouton10.equals("O") && bouton11.equals("O") && bouton12.equals("O"))) {
            if (bouton10.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            ?X?
            ?X?
            ?X?
        */

        else if ((bouton01.equals("X") && bouton11.equals("X") && bouton21.equals("X")) || (bouton01.equals("O") && bouton11.equals("O") && bouton21.equals("O"))) {
            if (bouton01.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            ??X
            ??X
            ??X
        */

        else if ((bouton02.equals("X") && bouton12.equals("X") && bouton22.equals("X")) || (bouton02.equals("O") && bouton12.equals("O") && bouton22.equals("O"))) {
            if (bouton02.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            ??X
            ?X?
            X??
        */

        else if ((bouton02.equals("X") && bouton11.equals("X") && bouton20.equals("X")) || (bouton02.equals("O") && bouton11.equals("O") && bouton20.equals("O"))){
            if (bouton02.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }

        /*
            ???
            ???
            XXX
        */

        else if ((bouton20.equals("X") && bouton21.equals("X") && bouton22.equals("X")) || (bouton20.equals("O") && bouton21.equals("O") && bouton22.equals("O"))){
            if (bouton20.equals("X")) {
                System.out.println("Fin de partie, X a gagné !");
                scoreX();
            } else {
                System.out.println("Fin de partie, O a gagné !");
                scoreO();
            }
            fin = true;
            endGame();
        }



        else if ((!testBouton00 && !testBouton01 && !testBouton02 && !testBouton10 && !testBouton11 && !testBouton12 && !testBouton20 && !testBouton21 && !testBouton22)) {
            System.out.println("Egalité, pas de gagnant.");
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

            dispose();
            replay.main(null);
        }
    }

    public static void scoreX() {
        x++;
        System.out.println(x);
    }

    public static void scoreO() {
        o++;
        System.out.println(o);
    }


    public static void main(String[] args) {

        toto dialog = new toto();
        dialog.pack();
        dialog.setVisible(true);
    }

}
