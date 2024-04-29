import jdk.swing.interop.DispatcherWrapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KundenVerwaltung extends JFrame {

    public KundenVerwaltung () {

        setTitle("Kundenverwaltung");
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    // Aufgabe 3
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu menu;
        JMenuItem mi;

        menubar.add(menu = new JMenu("Datei"));

        menu.add(mi = new JMenuItem("Kunde bearbeiten"));
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KundeBearbeitenDialog(KundenVerwaltung.this);
            }
        });

        menu.add(new JSeparator());

        menu.add(mi = new JMenuItem("Beenden"));
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Fenster anzeigen
        setVisible(true);
    }
}