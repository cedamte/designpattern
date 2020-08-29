package factory;

import biscuit.Biscuit;

abstract public class BiscuitFactory {
    abstract Biscuit makeBiscuit();

    public void description() {
        Biscuit biscuit = makeBiscuit();
        biscuit.description();
    }
}
