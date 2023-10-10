import cartago.Artifact;
import cartago.OPERATION;
import cartago.OpFeedbackParam;

public class CalculatorSolution extends Artifact {

    @OPERATION
    void add(final double firstAddend, final double secondAddend, final OpFeedbackParam<Double> sum) {
        sum.set(firstAddend + secondAddend);
    }

    @OPERATION
    void sub(final double minuend, final double subtrahend, final OpFeedbackParam<Double> difference) {
        difference.set(minuend - subtrahend);
    }
}
