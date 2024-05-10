import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KundeBearbeitenDialog extends JDialog {

    class MyOkHandler implements ActionListener {
        public void actionPerformed (ActionEvent e){
            kunde.setNachname(txtNachname.getText());
            kunde.setVorname(txtVorname.getText());
            dispose();
        }
    }

    class MyCancelHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        dispose();
        }
    }

    private Kunde kunde;
    private JTextField txtNachname;
    private JTextField txtVorname;

    public KundeBearbeitenDialog(JFrame parent, Kunde kunde) {
        super(parent);
        this.kunde = kunde;

        setModal(true);
        setTitle("Kunde bearbeiten");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3,2));

        // Nachname-Überschrift und Textfeld
        add(new JLabel("Nachname:"));
        if (kunde !=null) {
            add(txtNachname = new JTextField(kunde.getNachname()));
        } else {
            add(txtNachname = new JTextField());
        }
        // Vorname-Überschrift und Textfeld
        add(new JLabel("Vorname:"));
        if (kunde != null) {
            add(txtVorname = new JTextField(kunde.getVorname()));
        } else {
            add(txtNachname = new JTextField());
        }

        JButton cmdok = new JButton("OK");
        add(cmdok);
        JButton cmdcancel = new JButton("Abbrechen");
        add(cmdcancel);

        cmdok.addActionListener(new MyOkHandler());
        cmdcancel.addActionListener(new MyCancelHandler());

        pack();
        setVisible(true);

    }
}
