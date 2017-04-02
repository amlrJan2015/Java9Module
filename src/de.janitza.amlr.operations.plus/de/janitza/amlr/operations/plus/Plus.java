package de.janitza.amlr.operations.plus;

import de.janitza.amlr.operations.spi.Operation;

public class Plus implements Operation{
	public int compute(final int a, final int b){
		return a+b;
	}
}
