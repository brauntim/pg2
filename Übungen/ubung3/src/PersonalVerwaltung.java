import java.sql.SQLOutput;

public class PersonalVerwaltung {

    private MitarbeiterListe maListe;
    private AbrechnungenListe abListe;
    public PersonalVerwaltung() {
        maListe = new MitarbeiterListe(8);
    }

    public void addMitarbeiter (Mitarbeiter m) {
        maListe.add(m);
    }

    public void rmvMitarbeiter (Mitarbeiter m) {
        maListe.rmv(m);
    }

    public void listMitarbeiter () {
        System.out.println("\nMitarbeiter");
        for (int i = 0; i < maListe.getSize(); i++) {
            System.out.println(maListe.getMa(i));
        }
    }
    public void sortMitarbeiter() {
        for (int i = 1; i < maListe.getSize(); i++) {
            for (int j = maListe.getSize(); j >= i; j--) {
                if (maListe.getMa(j).istKleiner(maListe.getMa(j - 1))) {
                    Mitarbeiter tmp = maListe.getMa(j - 1);
                    maListe.setMa(j - 1, maListe.getMa(j));
                    maListe.setMa(j, tmp);
                }
            }
        }
    }

    public void listAbrechnungen (int periode) {
        System.out.println("Abrechnungen\n");
    }

}


//  i = 1; i < 10 ++
//          j = 3; 3 >= 1; --
//       j=2:
//          2 < 1
//        Franz < Josef (check)
//         m = Josef
//          1 = Franz
//          2 = m (Josef)

// 1 Franz, 2 Josef, 3 Werner
