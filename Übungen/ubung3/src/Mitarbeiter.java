public class Mitarbeiter {
    private static int first_id = 1;
    private int id;
    private String name;

    public Mitarbeiter(String name) {
        id = first_id++;
        this.name = name;
    }

    public int getID() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ", " + name;
    }

    boolean istKleiner(Mitarbeiter m) {
        return name.compareTo(m.name) < 0;
    }

    public String getName () {
        return name;
    }
}







