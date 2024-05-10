public abstract class Abrechnung {
    private int periode;
    private Mitarbeiter mitarbeiter;

    public Abrechnung(int periode, Mitarbeiter m) {
        this.periode = periode;
        mitarbeiter = m;
    }

    public int getPeriode() {
        return periode;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public abstract double getVerdienst();

    public String toString() {
        return periode + ", " + mitarbeiter.getName() + ", " + getVerdienst();
    }

}
     class GehaltsAbrechnung extends Abrechnung {
        private double gehalt;
        public GehaltsAbrechnung (int periode, Mitarbeiter m, double gehalt) {
            super(periode, m);
            this.gehalt = gehalt;
        }
        public double getVerdienst() {
            return gehalt;
        }
    }



     class LohnAbrechnung extends Abrechnung {
        private double stundenLohn;
        private double anzahlStunden;

        public LohnAbrechnung (int periode, Mitarbeiter m, double stundenLohn, double anzahlStunden) {
            super(periode, m);
            this.stundenLohn = stundenLohn;
            this.anzahlStunden = anzahlStunden;

        }

        public double getVerdienst() {
            return stundenLohn * anzahlStunden;
        }
    }

