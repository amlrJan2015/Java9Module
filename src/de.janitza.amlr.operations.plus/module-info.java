module de.janitza.amlr.operations.plus {
	requires de.janitza.amlr.operations;
	provides de.janitza.amlr.operations.spi.Operation
	with de.janitza.amlr.operations.plus.Plus;
}
