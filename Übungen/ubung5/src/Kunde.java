public class Kunde {
    private String vorname;
    private String nachname;
    public Kunde (String nachname, String vorname) {
        this.setNachname(nachname);
        this.setVorname(vorname);
    }

    public String getNachname () {
        return nachname;
    }
    public String getVorname () {
        return vorname;
    }

    public void setVorname (String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
