package dependency_injection;

public class Report {
    private Calculation calculation;

    public Report(Calculation calculation) {
        this.calculation = calculation;
    }

    public String output() {
        return this.calculation.calculate().toString();
    }
}
