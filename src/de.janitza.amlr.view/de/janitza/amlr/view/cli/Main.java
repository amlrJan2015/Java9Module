package de.janitza.amlr.view.cli;

import de.janitza.amlr.operations.plus.Plus;

public class Main {
    public static void main(String[] args) {
        System.out.println("CLI View:" + Plus.compute(1, 2));
    }
}
