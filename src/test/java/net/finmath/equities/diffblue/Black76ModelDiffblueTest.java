package net.finmath.equities.diffblue;

import net.finmath.equities.models.Black76Model;
import net.finmath.exception.CalculationException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Black76ModelDiffblueTest {
	@Test
	public void testOptionPrice() {
		assertEquals(100.0, Black76Model.optionPrice(10.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionPrice(0.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(Double.POSITIVE_INFINITY,
				Black76Model.optionPrice(Double.POSITIVE_INFINITY, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionPrice(10.0, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionPrice(10.0, 10.0, -1.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionPrice(10.0, 10.0, 10.0, 0.0, true, 10.0));
		assertEquals(100.0, Black76Model.optionPrice(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, true, 10.0));
		assertEquals(100.0, Black76Model.optionPrice(10.0, 10.0, 10.0, 10.0, false, 10.0));
		assertEquals(100.0, Black76Model.optionPrice(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, false, 10.0));
	}

	@Test
	public void testOptionDelta() {
		assertEquals(10.0, Black76Model.optionDelta(10.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(10.0, Black76Model.optionDelta(1.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionDelta(0.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(10.0, Black76Model.optionDelta(Double.POSITIVE_INFINITY, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(5.0, Black76Model.optionDelta(10.0, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionDelta(10.0, 10.0, -1.0, 10.0, true, 10.0));
		assertEquals(5.0, Black76Model.optionDelta(10.0, 10.0, 10.0, 0.0, true, 10.0));
		assertEquals(10.0, Black76Model.optionDelta(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, true, 10.0));
		assertEquals(-1.2984035196701909E-55, Black76Model.optionDelta(10.0, 10.0, 10.0, 10.0, false, 10.0));
		assertEquals(0.0, Black76Model.optionDelta(1.0, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(10.0, Black76Model.optionDelta(Double.POSITIVE_INFINITY, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionDelta(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, false, 10.0));
	}

	@Test
	public void testOptionVega() {
		assertEquals(6.517781960574815E-53, Black76Model.optionVega(10.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionVega(10.0, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionVega(10.0, 10.0, -1.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionVega(10.0, 10.0, 10.0, 0.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionVega(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, true, 10.0));
	}

	@Test
	public void testOptionGamma() {
		assertEquals(6.517781960574816E-57, Black76Model.optionGamma(10.0, 10.0, 10.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionGamma(10.0, 10.0, 0.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionGamma(10.0, 10.0, -1.0, 10.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionGamma(10.0, 10.0, 10.0, 0.0, true, 10.0));
		assertEquals(0.0, Black76Model.optionGamma(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, true, 10.0));
	}

	@Test
	public void testOptionTheta() {
		assertEquals(1000.0, Black76Model.optionTheta(10.0, 10.0, 10.0, 10.0, true, 10.0, 10.0));
		assertEquals(Double.NaN, Black76Model.optionTheta(0.0, 10.0, 10.0, 10.0, true, 10.0, 10.0));
		assertEquals(Double.NaN, Black76Model.optionTheta(Double.POSITIVE_INFINITY, 10.0, 10.0, 10.0, true, 10.0, 10.0));
		assertEquals(0.0, Black76Model.optionTheta(10.0, 10.0, 0.0, 10.0, true, 10.0, 10.0));
		assertEquals(0.0, Black76Model.optionTheta(10.0, 10.0, -1.0, 10.0, true, 10.0, 10.0));
		assertEquals(0.0, Black76Model.optionTheta(10.0, 10.0, 10.0, 0.0, true, 10.0, 10.0));
		assertEquals(Double.NaN, Black76Model.optionTheta(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, true, 10.0, 10.0));
		assertEquals(1000.0, Black76Model.optionTheta(10.0, 10.0, 10.0, 10.0, false, 10.0, 10.0));
		assertEquals(Double.NaN, Black76Model.optionTheta(10.0, 10.0, 10.0, Double.POSITIVE_INFINITY, false, 10.0, 10.0));
	}

	@Test
	public void testOptionImpliedVolatility() {
		assertEquals(0.0, Black76Model.optionImpliedVolatility(10.0, 10.0, 10.0, 10.0, true));
		assertEquals(5.350345731202939, Black76Model.optionImpliedVolatility(0.5, 10.0, 10.0, 0.5, true));
		assertEquals(Double.NaN, Black76Model.optionImpliedVolatility(0.5, 10.0, 10.0, 0.0, true));
		assertEquals(0.8467461138721366, Black76Model.optionImpliedVolatility(0.5, 10.0, 10.0, 0.223606797749979, true));
		assertEquals(Double.NaN, Black76Model.optionImpliedVolatility(0.5, Double.POSITIVE_INFINITY, 10.0, 10.0, true));
		assertEquals(0.12541355588642766, Black76Model.optionImpliedVolatility(10.0, 10.0, 10.0, 0.5, true));
		assertEquals(0.1779059387239999, Black76Model.optionImpliedVolatility(6.283185307179586, 10.0, 10.0, 0.5, true));
		assertEquals(0.8470529101927109, Black76Model.optionImpliedVolatility(10.0, 13731.69376550946, 10.0, 0.5, true));
	}

	@org.junit.Test
	public void Test_black76_formula() throws CalculationException
	{
		final var forward = 0.05;
		final var forward2 = 0.1;
		final var strike = 0.01;
		final var strike2 = 0.3;
		final var maturity = 10.0;
		final var volatility = 0.25;
		final var discountFactor = 1.0;

		// regular case
		Assert.assertEquals(0.040128147990592215,
				Black76Model.optionPrice(forward, strike, maturity, volatility, true, discountFactor),
				1E-16);

		// put-call parity
		Assert.assertEquals(
				Black76Model.optionPrice(forward, forward, maturity, volatility, true, discountFactor),
				Black76Model.optionPrice(forward, forward, maturity, volatility, false, discountFactor),
				1E-16);

		// deterministic cases
		Assert.assertEquals(forward - strike, Black76Model.optionPrice(forward, strike, maturity, 0.0, true, discountFactor), 1E-16);
		Assert.assertEquals(strike2 - forward2, Black76Model.optionPrice(forward2, strike2, 0.0, volatility, false, discountFactor), 1E-16);
	}
}

