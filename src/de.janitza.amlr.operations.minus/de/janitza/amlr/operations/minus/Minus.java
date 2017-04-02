package de.janitza.amlr.operations.minus;

import de.janitza.amlr.operations.spi.Operation;

public class Minus implements Operation{
	public int compute(final int a, final int b){
		return a-b;
	}
}
