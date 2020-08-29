package factory;

import biscuit.Biscuit;
import biscuit.ShortBread;

public class ShortBreadFactory extends BiscuitFactory {
    @Override
    Biscuit makeBiscuit() {
        return new ShortBread();
    }
}
