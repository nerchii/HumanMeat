package mod.human_meat;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static final String MOD_ID = "human_meat"; // Your mod ID

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Create an Identifier for the block
        Object FabricDocsReference;
        Identifier id = Identifier.of(FabricDocsReference.MOD_ID, name);


        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

}


public static final Item human_skin = register(
        new Item(new Item.Settings()),
        "human_skin"
);