package mod.human_meat.villager;

import com.google.common.collect.ImmutableSet;
import mod.human_meat.HumanMeat;
import mod.human_meat.HumanMeatBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class HumanMeatVillagers {
    public static final RegistryKey<PointOfInterestType> SKINNER_POI_KEY = poiKey("skinnerpoi");
    public static final PointOfInterestType SKINNER_POI = registerPoi("skinnerpoi", HumanMeatBlocks.SKIN_MASK);

    public static final VillagerProfession SKINNER = registerProfession("skinner", SKINNER_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(HumanMeat.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER)); // TODO - Replace with evil laugh sound
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(HumanMeat.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(HumanMeat.MOD_ID, name));
    }

    public static void initialize() {}
}
