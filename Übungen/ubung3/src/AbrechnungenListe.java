public class AbrechnungenListe {
    private int size;
    private Mitarbeiter [] mitarbeiterArray;
    private int periode;

    public int getPeriode() {
        return periode;
    }

    public AbrechnungenListe(int maxSize) {
        mitarbeiterArray = new Mitarbeiter[maxSize];
        size = 0;
    }
    public int getSize() {
        return size;
    }
    boolean add (Mitarbeiter m) {
        if (mitarbeiterArray.length == size) return false;

        mitarbeiterArray[size] = m;
        size++;
        return true;
    }

    Mitarbeiter getMa (int index) {
        if (index < 0 || index >= size) return null;

        return mitarbeiterArray[index];
    }

    Mitarbeiter setMa (int index, Mitarbeiter m) {
        if (index < 0 || index >= size) return null;

        Mitarbeiter lastAdded = mitarbeiterArray[index];
        mitarbeiterArray[index] = m;
        return lastAdded;
    }

    boolean rmv (Mitarbeiter m) {
        for (int i= 0; i < size; i++) {

            if (mitarbeiterArray[i] == m) {

                size--;
                for (; i < size; i++) {
                    mitarbeiterArray[i] = mitarbeiterArray[i+1];
                }
                return true;
            }
        }
        return false;
    }
}