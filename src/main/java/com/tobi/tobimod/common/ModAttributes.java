package com.tobi.tobimod.common;

import com.tobi.tobimod.TobiMod;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;

public class ModAttributes {

    // Attribute modifier IDs
    private static final ResourceLocation HEALTH_MODIFIER_ID =
            ResourceLocation.fromNamespaceAndPath(TobiMod.MOD_ID, "tobi_health");
    private static final ResourceLocation DAMAGE_MODIFIER_ID =
            ResourceLocation.fromNamespaceAndPath(TobiMod.MOD_ID, "tobi_damage");
    // ... other modifier IDs

    public static void applyTobiBuffs(Player player) {
        // +20 HP (10 hearts)
        player.getAttribute(Attributes.MAX_HEALTH).addOrUpdateTransientModifier(
                new AttributeModifier(HEALTH_MODIFIER_ID, 20.0, AttributeModifier.Operation.ADD_VALUE)
        );

        // +8 attack damage
        player.getAttribute(Attributes.ATTACK_DAMAGE).addOrUpdateTransientModifier(
                new AttributeModifier(DAMAGE_MODIFIER_ID, 8.0, AttributeModifier.Operation.ADD_VALUE)
        );

        // +20% movement speed
        player.getAttribute(Attributes.MOVEMENT_SPEED).addOrUpdateTransientModifier(
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(TobiMod.MOD_ID, "tobi_speed"),
                        0.02,
                        AttributeModifier.Operation.ADD_VALUE
                )
        );

        // Continue with other attributes...
    }
}