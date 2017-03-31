package de.janitza.amlr.operations.plus;

import de.janitza.amlr.operations.spi.OperationsProvider;

public class Plus implements OperationsProvider{
	public int compute(final int a, final int b){
		return a+b;
	}
}
