package factory;

import biscuit.Biscuit;
import biscuit.RichTea;

public class RichTeaFactory extends BiscuitFactory {
    @Override
    Biscuit makeBiscuit() {
        return new RichTea();
    }
}
