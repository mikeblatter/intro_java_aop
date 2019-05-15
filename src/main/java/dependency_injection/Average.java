package dependency_injection;

public class Average implements Calculation {
    private Double[] numbers;

    public Average(Double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Double calculate() {
        Double sum = 0.0;

        for (Double number: numbers) {
            sum += number;
        }

        return sum / this.numbers.length;
    }
}
