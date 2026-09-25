package com.workaholicgames.mmtcg.item;

import com.workaholicgames.mmtcg.MmTcg;
import com.workaholicgames.mmtcg.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MmTcg.MOD_ID);

    public static final Supplier<CreativeModeTab> MMTCG_OTHER_TAB = CREATIVE_MODE_TAB.register("mmtcg_other_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.MAXIMITE_ORE.get()))
                    .title(Component.translatable("creativetab.mmtcg.other_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MAXIMITE_ORE);
                        output.accept(ModBlocks.MAXIMITE_BLOCK);
                        output.accept(ModBlocks.RAW_MAXIMITE_BLOCK);
                        output.accept(ModItems.RAW_MAXIMITE);
                        output.accept(ModItems.MAXIMITE_INGOT);
                        output.accept(ModItems.MAXIMIZED_PAPER);
                        output.accept(ModItems.CAPTIN_BOOSTER_ITEM);
                        output.accept(ModItems.CUBE_OF_RUIN);
                        output.accept(ModItems.DELL);
                        output.accept(ModItems.GERALD);
                        output.accept(ModItems.MOLDY_BREAD);
                        output.accept(ModItems.STEIN);
                    }).build());

    public static final Supplier<CreativeModeTab> MMTCG_SERIES_1_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_1_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SERIES_ONE_BOOSTER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_other_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_1"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SERIES_ONE_BOOSTER);
                        output.accept(ModItems.ACTION_BITCOINMINING);
                        output.accept(ModItems.ACTION_GAMBLING);
                        output.accept(ModItems.ACTION_JOINMELONS);
                        output.accept(ModItems.ACTION_LOCKIN);
                        output.accept(ModItems.ACTION_NEXTSEASON);
                        output.accept(ModItems.ACTION_NUKES);
                        output.accept(ModItems.ADAM_JUMPSCARE);
                        output.accept(ModItems.ADAM_STANDARD);
                        output.accept(ModItems.ADAM_SUCK87);
                        output.accept(ModItems.BULBA_ACCURATE);
                        output.accept(ModItems.BULBA_MELONCOMMANDER);
                        output.accept(ModItems.BULBA_STANDARD);
                        output.accept(ModItems.BULBA_TRUETERRARIAN);
                        output.accept(ModItems.BULBA_WORKAHOLIC);
                        output.accept(ModItems.GAVIN_COPPERTYRANT);
                        output.accept(ModItems.GAVIN_MELONCOMMANDER);
                        output.accept(ModItems.GAVIN_STANDARD);
                        output.accept(ModItems.GAVIN_TRUEAMERICAN);
                        output.accept(ModItems.ITEM_AMERICANFLAG);
                        output.accept(ModItems.ITEM_GATE_DE);
                        output.accept(ModItems.ITEM_MELONSLICER);
                        output.accept(ModItems.ITEM_SALSA);
                        output.accept(ModItems.ITEM_THEEGG);
                        output.accept(ModItems.JONATHAN_LOCKEDIN);
                        output.accept(ModItems.JONATHAN_MELONCOMMANDER);
                        output.accept(ModItems.JONATHAN_MODRINTH);
                        output.accept(ModItems.JONATHAN_STANDARD);
                        output.accept(ModItems.MARK_COMMANDER);
                        output.accept(ModItems.MARK_STANDARD);
                        output.accept(ModItems.MARK_STARE);
                        output.accept(ModItems.SAWYER_BITCOIN);
                        output.accept(ModItems.SAWYER_GAMINGSESSION);
                        output.accept(ModItems.SAWYER_STANDARD);
                    }).build());

    public static final Supplier<CreativeModeTab> MMTCG_SERIES_2_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_2_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SERIES_TWO_BOOSTER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_1_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_2"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SERIES_TWO_BOOSTER);
                        output.accept(ModItems.ACTION_ASSASSINATION);
                        output.accept(ModItems.ACTION_GHOSTHUNT);
                        output.accept(ModItems.ACTION_SPORTSTALK);
                        output.accept(ModItems.ADAM_GIGABOT);
                        output.accept(ModItems.ADAM_LAMB);
                        output.accept(ModItems.ADAM_TV);
                        output.accept(ModItems.BULBA_CHESTBOAT);
                        output.accept(ModItems.BULBA_SANTA);
                        output.accept(ModItems.BULBA_TERRORIST);
                        output.accept(ModItems.GAVIN_NUGGIE);
                        output.accept(ModItems.GAVIN_VIKING);
                        output.accept(ModItems.ITEM_BANK);
                        output.accept(ModItems.ITEM_CASINO);
                        output.accept(ModItems.ITEM_YOURMOM);
                        output.accept(ModItems.JONATHAN_MAFIA);
                        output.accept(ModItems.JONATHAN_MM);
                        output.accept(ModItems.JONATHAN_PILOT);
                        output.accept(ModItems.JONATHAN_POLITICIAN);
                        output.accept(ModItems.MARK_CHESTBOAT);
                        output.accept(ModItems.MARK_ROCKETEER);
                        output.accept(ModItems.MARK_SPACE);
                        output.accept(ModItems.SAWYER_CHEF);
                        output.accept(ModItems.SAWYER_CRASHOUT);
                        output.accept(ModItems.SAWYER_SALTY);
                    }).build());

    public static final Supplier<CreativeModeTab> MMTCG_SERIES_3_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_3_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SERIES_THREE_BOOSTER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_2_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_3"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SERIES_THREE_BOOSTER);
                        output.accept(ModItems.ACTION_67);
                        output.accept(ModItems.ACTION_GETCRACKED);
                        output.accept(ModItems.ACTION_SECRETSERVICE);
                        output.accept(ModItems.ACTION_SLANDER);
                        output.accept(ModItems.ADAM_KIRA);
                        output.accept(ModItems.BULBA_ANIME);
                        output.accept(ModItems.BULBA_BEAST);
                        output.accept(ModItems.BULBA_MCDONALDS);
                        output.accept(ModItems.BULBA_SEEDPLANTER);
                        output.accept(ModItems.BULBA_WIDE);
                        output.accept(ModItems.CHARLIE_BADEYESIGHT);
                        output.accept(ModItems.CHARLIE_BLAZE);
                        output.accept(ModItems.CHARLIE_DONUTDEV);
                        output.accept(ModItems.CHARLIE_RUSSIAN);
                        output.accept(ModItems.CHARLIE_STANDARD);
                        output.accept(ModItems.GAVIN_RIZZ);
                        output.accept(ModItems.ITEM_ESF);
                        output.accept(ModItems.ITEM_NUCLEARBUNKER);
                        output.accept(ModItems.JONATHAN_ARRESTED);
                        output.accept(ModItems.JONATHAN_SCARYHEAD);
                        output.accept(ModItems.JONATHAN_WORKOUT);
                        output.accept(ModItems.MARK_BEDWARS);
                        output.accept(ModItems.MARK_COWBOY);
                        output.accept(ModItems.MARK_KNIGHT);
                        output.accept(ModItems.ROBERT_ENGINEER);
                        output.accept(ModItems.ROBERT_OPPENHEIMER);
                        output.accept(ModItems.ROBERT_STANDARD);
                        output.accept(ModItems.SAWYER_HORNET);
                        output.accept(ModItems.SAWYER_MIKU);
                        output.accept(ModItems.SAWYER_MUSICIAN);
                    }).build());

    public static final Supplier<CreativeModeTab> MMTCG_SERIES_4_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_4_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SERIES_FOUR_BOOSTER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_3_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_4"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SERIES_FOUR_BOOSTER);
                        output.accept(ModItems.ADAM_SAYGIGA);
                        output.accept(ModItems.ADAM_SIDEKICK);
                        output.accept(ModItems.BULBA_BULBIKA);
                        output.accept(ModItems.CHARLIE_CHARLESUKI);
                        output.accept(ModItems.CHARLIE_SNIPER);
                        output.accept(ModItems.DIEGO_HORSELORD);
                        output.accept(ModItems.DIEGO_SOUPSERVER);
                        output.accept(ModItems.DIEGO_STANDARD);
                        output.accept(ModItems.GAVIN_BLIMPBLOWER);
                        output.accept(ModItems.GAVIN_COPPERTINE);
                        output.accept(ModItems.GAVIN_DWARF);
                        output.accept(ModItems.GAVIN_GRUVIN);
                        output.accept(ModItems.JONATHAN_OILRIGGER);
                        output.accept(ModItems.ROBERT_PIRATE);
                        output.accept(ModItems.SAWYER_SAWYURI);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
