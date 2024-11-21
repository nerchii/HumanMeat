package mod.human_meat;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class HumanMeatFoodComponent {
    public static final FoodComponent HUMAN_EYE = new FoodComponent.Builder()
            .alwaysEdible().snack().meat().hunger(2).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 0.5F)
            .build();
}
