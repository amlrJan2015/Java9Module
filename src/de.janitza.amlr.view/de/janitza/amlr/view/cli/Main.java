package de.janitza.amlr.view.cli;

import de.janitza.amlr.operations.spi.Operation;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        final int a = 1, b = 2;
        final ServiceLoader<Operation> serviceLoader =
        ServiceLoader.load(Operation.class);
        serviceLoader.forEach(op -> {
            System.out.println(op.compute(a,b));
        });
    }
}
