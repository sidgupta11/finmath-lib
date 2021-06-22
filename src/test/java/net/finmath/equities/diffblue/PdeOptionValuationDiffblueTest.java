package net.finmath.equities.diffblue;

import net.finmath.equities.marketdata.AffineDividend;
import net.finmath.equities.marketdata.AffineDividendStream;
import net.finmath.equities.marketdata.FlatYieldCurve;
import net.finmath.equities.models.BuehlerDividendForwardStructure;
import net.finmath.equities.models.FlatVolatilitySurface;
import net.finmath.equities.pricer.EquityValuationRequest;
import net.finmath.equities.pricer.PdeOptionValuation;
import net.finmath.equities.products.AmericanOption;
import net.finmath.equities.products.EuropeanOption;
import net.finmath.time.daycount.DayCountConvention;
import net.finmath.time.daycount.DayCountConvention_30E_360;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PdeOptionValuationDiffblueTest {
	@Test
	public void testCalculate() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		EquityValuationRequest request = new EquityValuationRequest(option,
				new ArrayList<EquityValuationRequest.CalculationRequestType>());

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate2() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new EuropeanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate3() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofYearDay(1, 1);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate4() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 31, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new EuropeanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate5() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		EquityValuationRequest request = new EquityValuationRequest(option,
				new ArrayList<EquityValuationRequest.CalculationRequestType>());

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate6() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new EuropeanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate7() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofYearDay(1, 1);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testCalculate8() {
		// TODO: This test is incomplete.
		//   Reason: No meaningful assertions found.
		//   To help Diffblue Cover to find assertions, please add getters to the
		//   class under test that return fields written by the method under test.
		//   See https://diff.blue/R004

		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 31, 1,
				new DayCountConvention_30E_360(true), true, true);

		ArrayList<EquityValuationRequest.CalculationRequestType> calculationRequestTypeList = new ArrayList<EquityValuationRequest.CalculationRequestType>();
		calculationRequestTypeList.add(EquityValuationRequest.CalculationRequestType.Price);
		EquityValuationRequest request = new EquityValuationRequest(
				new EuropeanOption(LocalDate.ofEpochDay(1L), 10.0, true), calculationRequestTypeList);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.calculate(request, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
	}

	@Test
	public void testGetPrice() {
		DayCountConvention dayCountConvention = mock(DayCountConvention.class);
		when(dayCountConvention.getDaycountFraction((LocalDate) any(), (LocalDate) any())).thenReturn(10.0);
		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1, dayCountConvention, true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		assertEquals(Double.NaN,
				pdeOptionValuation.getPrice(option, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0)));
		verify(dayCountConvention).getDaycountFraction((LocalDate) any(), (LocalDate) any());
	}

	@Test
	public void testGetPrice2() {
		DayCountConvention dayCountConvention = mock(DayCountConvention.class);
		when(dayCountConvention.getDaycountFraction((LocalDate) any(), (LocalDate) any())).thenReturn(10.0);
		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 31, 1, dayCountConvention, true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		assertEquals(-0.0,
				pdeOptionValuation.getPrice(option, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0)));
		verify(dayCountConvention).getDaycountFraction((LocalDate) any(), (LocalDate) any());
	}

	@Test
	public void testGetPdeSensis() {
		DayCountConvention dayCountConvention = mock(DayCountConvention.class);
		when(dayCountConvention.getDaycountFraction((LocalDate) any(), (LocalDate) any())).thenReturn(10.0);
		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 1, 1, dayCountConvention, true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		pdeOptionValuation.getPdeSensis(option, forwardStructure, discountCurve, new FlatVolatilitySurface(10.0));
		verify(dayCountConvention).getDaycountFraction((LocalDate) any(), (LocalDate) any());
	}

	@Test
	public void testGetPdeSensis2() {
		DayCountConvention dayCountConvention = mock(DayCountConvention.class);
		when(dayCountConvention.getDaycountFraction((LocalDate) any(), (LocalDate) any())).thenReturn(10.0);
		PdeOptionValuation pdeOptionValuation = new PdeOptionValuation(1.0E-5, 10.0, 31, 1, dayCountConvention, true, true);
		AmericanOption option = new AmericanOption(LocalDate.ofEpochDay(1L), 10.0, true);

		LocalDate valuationDate = LocalDate.ofEpochDay(1L);
		LocalDate curveDate = LocalDate.ofEpochDay(1L);
		FlatYieldCurve repoCurve = new FlatYieldCurve(curveDate, 10.0, new DayCountConvention_30E_360(true));

		AffineDividendStream dividendStream = new AffineDividendStream(
				new AffineDividend[]{new AffineDividend(LocalDate.ofEpochDay(1L), 10.0, 10.0)});
		BuehlerDividendForwardStructure forwardStructure = new BuehlerDividendForwardStructure(valuationDate, 10.0,
				repoCurve, dividendStream, new DayCountConvention_30E_360(true));

		LocalDate curveDate1 = LocalDate.ofEpochDay(1L);
		FlatYieldCurve discountCurve = new FlatYieldCurve(curveDate1, 10.0, new DayCountConvention_30E_360(true));

		double[] actualPdeSensis = pdeOptionValuation.getPdeSensis(option, forwardStructure, discountCurve,
				new FlatVolatilitySurface(10.0));
		assertEquals(4, actualPdeSensis.length);
		assertEquals(-0.0, actualPdeSensis[0]);
		assertEquals(Double.NaN, actualPdeSensis[1]);
		assertEquals(Double.NaN, actualPdeSensis[2]);
		assertEquals(0.0, actualPdeSensis[3]);
		verify(dayCountConvention).getDaycountFraction((LocalDate) any(), (LocalDate) any());
	}
}

