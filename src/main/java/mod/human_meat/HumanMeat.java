package mod.human_meat;

import net.fabricmc.api.ModInitializer;

public class HumanMeat implements ModInitializer {

    public static final String MOD_ID = "human_meat";

    @Override
    public void onInitialize() {
        HumanMeatItems.initialize();
        HumanMeatBlocks.initialize();
    }
}
