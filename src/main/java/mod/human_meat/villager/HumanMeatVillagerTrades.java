package mod.human_meat.villager;

import mod.human_meat.HumanMeatBlocks;
import mod.human_meat.HumanMeatItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class HumanMeatVillagerTrades {
    public static void initialize() {
        TradeOfferHelper.registerVillagerOffers(HumanMeatVillagers.SKINNER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(HumanMeatItems.HUMAN_EYE, 4),
                            new ItemStack(Items.EMERALD, 1),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(HumanMeatVillagers.SKINNER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(HumanMeatBlocks.SKIN_MASK, 1),
                            2, 12, 0.075f));
                });
    }
}
