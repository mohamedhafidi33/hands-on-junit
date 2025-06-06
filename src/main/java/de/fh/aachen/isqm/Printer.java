package de.fh.aachen.isqm;

public class Printer {
    private final Ink ink;

    public Printer(Ink ink) {
        this.ink = ink;
    }

    public String print(String message) {
        if (ink.hasInk()) {
            return "Printing: " + message;
        } else {
            return "Cannot print. No ink!";
        }
    }
}
