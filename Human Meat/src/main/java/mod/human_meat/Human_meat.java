package mod.human_meat;

import net.fabricmc.api.ModInitializer;

public class Human_meat implements ModInitializer {

    @Override
    public void onInitialize() {
        HumanMeatItems.initialize();
    }
}
