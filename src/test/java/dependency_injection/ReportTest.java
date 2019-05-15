package dependency_injection;

import org.junit.Assert;
import org.junit.Test;

public class ReportTest {
    @Test
    public void sumOutput() {
        Calculation calculation = new Sum(new Double[] {1.0, 2.0});
        Report report = new Report(calculation);

        Assert.assertEquals("3.0", report.output());
    }

    @Test
    public void averageOutput() {
        Calculation calculation = new Average(new Double[] {1.0, 2.0});
        Report report = new Report(calculation);

        Assert.assertEquals("1.5", report.output());
    }

    @Test
    public void mockedOutput() {
        Calculation calculation = new CalculationMock();
        Report report = new Report(calculation);

        Assert.assertEquals("1.0", report.output());
    }

    // Mock
    private class CalculationMock implements Calculation{
        @Override
        public Double calculate() {
            return 1.0;
        }
    }



}
