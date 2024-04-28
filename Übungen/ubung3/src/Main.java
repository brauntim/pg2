public class Main {

    public static void main(String[] args) {
        PersonalVerwaltung pv = new PersonalVerwaltung();
        Mitarbeiter m1 = new Mitarbeiter("Josef Maier");
        pv.addMitarbeiter(m1);
        Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
        pv.addMitarbeiter(m2);
        Mitarbeiter m3 = new Mitarbeiter("Werner Müller");
        pv.addMitarbeiter(m3);

        pv.listMitarbeiter();
        pv.sortMitarbeiter();
        pv.listMitarbeiter();



    }
}
