/**
 *
 */
package net.finmath.randomnumbers;

import java.io.Serializable;
import java.util.function.DoubleSupplier;

/**
 * Interface for a 1-dimensional random number generator
 * generating a sequence of vectors sampling the space [0,1]
 *
 * @author Christian Fries
 * @version 1.0
 */
public interface RandomNumberGenerator1D extends RandomNumberGenerator, DoubleSupplier, Serializable {

	double nextDouble();

	@Override
	default double[] getNext() {
		return new double[] { nextDouble() };
	}

	@Override
	default int getDimension() {
		return 1;
	}

	// Alias to function a <code>DoubleSupplier</code>
	@Override
	default double getAsDouble() {
		return nextDouble();
	}
}
