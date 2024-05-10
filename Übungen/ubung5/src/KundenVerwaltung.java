import jdk.swing.interop.DispatcherWrapper;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KundenVerwaltung extends JFrame {

    private KundeTableModel kundeTableModel;
    private ListSelectionModel kundeSelectionModel;
    private JMenuItem miKundeBearbeiten;

    public KundenVerwaltung(Kunde[] kunden) {

        setTitle("Kundenverwaltung");
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu menu;
        JMenuItem mi;

        menubar.add(menu = new JMenu("Datei"));

        miKundeBearbeiten = new JMenuItem("Kunde bearbeiten");
        menu.add(miKundeBearbeiten);
        miKundeBearbeiten.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editKunde();
            }
        });

        menu.add(new JSeparator());

        menu.add(mi = new JMenuItem("Beenden"));
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        kundeTableModel = new KundeTableModel(kunden);
        JTable table = new JTable(kundeTableModel);
        kundeSelectionModel = table.getSelectionModel();
        kundeSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        kundeSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

            }
        });



        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent event) {
                if (event.getClickCount() == 2) editKunde();
            }
        });

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollpane = new JScrollPane(table);
        JPanel titlepane = new JPanel();
        titlepane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tabellenansicht"));
        titlepane.setLayout(new BorderLayout());
        titlepane.add(scrollpane);

        add(titlepane);



        setVisible(true);
    }

    private void editKunde() {
        int row = kundeSelectionModel.getMinSelectionIndex();
        if (row < 0) return;
        new KundeBearbeitenDialog(this, kundeTableModel.getKunde(row));
        kundeTableModel.fireTableRowsUpdated(row, row);
    }
}