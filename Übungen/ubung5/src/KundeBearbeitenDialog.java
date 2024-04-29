import javax.swing.*;

public class KundeBearbeitenDialog extends JDialog {

    public KundeBearbeitenDialog(JFrame parent) {
        super(parent);

        setModal(true);
        setTitle("Kunde bearbeiten");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
