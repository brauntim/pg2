public class Main {
    public static void main(String[] args) {
        // VERSION 1, (remove super and jframe parent, in class kundebearbeitendialog)
        //new KundeBearbeitenDialog();

        Kunde kunden[] = new Kunde [3];
        kunden[0] = new Kunde ("Meier", "Josef");
        kunden[1] = new Kunde ("Huber", "Franziska");
        kunden[2] = new Kunde ("Schmidt", "Helmut");

        new KundenVerwaltung(kunden);
    }
}