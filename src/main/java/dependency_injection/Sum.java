package dependency_injection;

public class Sum implements Calculation {
    private Double[] numbers;

    public Sum(Double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Double calculate() {
        Double sum = 0.0;

        for (Double number: numbers) {
            sum += number;
        }

        return sum;
    }
}
