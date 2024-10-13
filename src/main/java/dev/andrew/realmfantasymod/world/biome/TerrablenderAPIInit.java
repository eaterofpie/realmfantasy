package dev.andrew.realmfantasymod.world.biome;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import dev.andrew.realmfantasymod.world.biome.suface.MaterialRulesInit;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class TerrablenderAPIInit  implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new OverworldRegionInit(Identifier.of(RealmfantasyMod.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, RealmfantasyMod.MOD_ID, MaterialRulesInit.makeRules());
    }

}

