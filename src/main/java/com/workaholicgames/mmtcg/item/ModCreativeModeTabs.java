package com.workaholicgames.mmtcg.item;

import com.workaholicgames.mmtcg.MmTcg;
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

    public static final Supplier<CreativeModeTab> MMTGC_SERIES_1_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_1_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BULBA_STANDARD.get()))
                    .title(Component.translatable("creativetab.mmtcg.series_1"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACTION_67);
                        output.accept(ModItems.ACTION_ASSASSINATION);
                        output.accept(ModItems.ACTION_BITCOINMINING);
                        output.accept(ModItems.ACTION_GAMBLING);
                        output.accept(ModItems.ACTION_GETCRACKED);
                        output.accept(ModItems.ACTION_GHOSTHUNT);
                        output.accept(ModItems.ACTION_JOINMELONS);
                        output.accept(ModItems.ACTION_LOCKIN);
                        output.accept(ModItems.ACTION_NEXTSEASON);
                        output.accept(ModItems.ACTION_NUKES);
                        output.accept(ModItems.ACTION_SECRETSERVICE);
                        output.accept(ModItems.ACTION_SLANDER);
                        output.accept(ModItems.ACTION_SPORTSTALK);
                        output.accept(ModItems.ADAM_GIGABOT);
                        output.accept(ModItems.ADAM_JUMPSCARE);
                        output.accept(ModItems.ADAM_KIRA);
                        output.accept(ModItems.ADAM_LAMB);
                        output.accept(ModItems.ADAM_STANDARD);
                        output.accept(ModItems.ADAM_SUCK87);
                        output.accept(ModItems.ADAM_TV);
                        output.accept(ModItems.BULBA_ACCURATE);
                        output.accept(ModItems.BULBA_ANIME);
                        output.accept(ModItems.BULBA_BEAST);
                        output.accept(ModItems.BULBA_CHESTBOAT);
                        output.accept(ModItems.BULBA_MCDONALDS);
                        output.accept(ModItems.BULBA_MELONCOMMANDER);
                        output.accept(ModItems.BULBA_SANTA);
                        output.accept(ModItems.BULBA_SEEDPLANTER);
                        output.accept(ModItems.BULBA_STANDARD);
                        output.accept(ModItems.BULBA_TERRORIST);
                        output.accept(ModItems.BULBA_TRUETERRARIAN);
                        output.accept(ModItems.BULBA_WIDE);
                        output.accept(ModItems.BULBA_WORKAHOLIC);
                        output.accept(ModItems.CHARLIE_BADEYESIGHT);
                        output.accept(ModItems.CHARLIE_BLAZE);
                        output.accept(ModItems.CHARLIE_DONUTDEV);
                        output.accept(ModItems.CHARLIE_RUSSIAN);
                        output.accept(ModItems.CHARLIE_STANDARD);
                        output.accept(ModItems.GAVIN_COPPERTYRANT);
                        output.accept(ModItems.GAVIN_MELONCOMMANDER);
                        output.accept(ModItems.GAVIN_NUGGIE);
                        output.accept(ModItems.GAVIN_RIZZ);
                        output.accept(ModItems.GAVIN_STANDARD);
                        output.accept(ModItems.GAVIN_TRUEAMERICAN);
                        output.accept(ModItems.GAVIN_VIKING);
                        output.accept(ModItems.GERALD);
                        output.accept(ModItems.ITEM_AMERICANFLAG);
                        output.accept(ModItems.ITEM_BANK);
                        output.accept(ModItems.ITEM_CASINO);
                        output.accept(ModItems.ITEM_ESF);
                        output.accept(ModItems.ITEM_GATE_DE);
                        output.accept(ModItems.ITEM_NUCLEARBUNKER);
                        output.accept(ModItems.ITEM_SALSA);
                        output.accept(ModItems.ITEM_THEEGG);
                        output.accept(ModItems.ITEM_YOURMOM);
                        output.accept(ModItems.JONATHAN_ARRESTED);
                        output.accept(ModItems.JONATHAN_LOCKEDIN);
                        output.accept(ModItems.JONATHAN_MAFIA);
                        output.accept(ModItems.JONATHAN_MELONCOMMANDER);
                        output.accept(ModItems.JONATHAN_MM);
                        output.accept(ModItems.JONATHAN_MODRINTH);
                        output.accept(ModItems.JONATHAN_PILOT);
                        output.accept(ModItems.JONATHAN_POLITICIAN);
                        output.accept(ModItems.JONATHAN_SCARYHEAD);
                        output.accept(ModItems.JONATHAN_STANDARD);
                        output.accept(ModItems.JONATHAN_WORKOUT);
                        output.accept(ModItems.MARK_BEDWARS);
                        output.accept(ModItems.MARK_CHESTBOAT);
                        output.accept(ModItems.MARK_COMMANDER);
                        output.accept(ModItems.MARK_COWBOY);
                        output.accept(ModItems.MARK_KNIGHT);
                        output.accept(ModItems.MARK_ROCKETEER);
                        output.accept(ModItems.MARK_SPACE);
                        output.accept(ModItems.MARK_STANDARD);
                        output.accept(ModItems.MARK_STARE);
                        output.accept(ModItems.ROBERT_ENGINEER);
                        output.accept(ModItems.ROBERT_OPPENHEIMER);
                        output.accept(ModItems.ROBERT_STANDARD);
                        output.accept(ModItems.SAWYER_BITCOIN);
                        output.accept(ModItems.SAWYER_CHEF);
                        output.accept(ModItems.SAWYER_CRASHOUT);
                        output.accept(ModItems.SAWYER_HORNET);
                        output.accept(ModItems.SAWYER_MIKU);
                        output.accept(ModItems.SAWYER_MUSICIAN);
                        output.accept(ModItems.SAWYER_SALTY);
                        output.accept(ModItems.SAWYER_STANDARD);
                        output.accept(ModItems.STEIN);


                    }).build());

    public static final Supplier<CreativeModeTab> MMTGC_SERIES_2_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_2_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BULBA_STANDARD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_1_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_2"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACTION_67);
                        output.accept(ModItems.ACTION_ASSASSINATION);
                        output.accept(ModItems.ACTION_BITCOINMINING);
                        output.accept(ModItems.ACTION_GAMBLING);
                        output.accept(ModItems.ACTION_GETCRACKED);
                        output.accept(ModItems.ACTION_GHOSTHUNT);
                        output.accept(ModItems.ACTION_JOINMELONS);
                        output.accept(ModItems.ACTION_LOCKIN);
                        output.accept(ModItems.ACTION_NEXTSEASON);
                        output.accept(ModItems.ACTION_NUKES);
                        output.accept(ModItems.ACTION_SECRETSERVICE);
                        output.accept(ModItems.ACTION_SLANDER);
                        output.accept(ModItems.ACTION_SPORTSTALK);
                        output.accept(ModItems.ADAM_GIGABOT);
                        output.accept(ModItems.ADAM_JUMPSCARE);
                        output.accept(ModItems.ADAM_KIRA);
                        output.accept(ModItems.ADAM_LAMB);
                        output.accept(ModItems.ADAM_STANDARD);
                        output.accept(ModItems.ADAM_SUCK87);
                        output.accept(ModItems.ADAM_TV);
                        output.accept(ModItems.BULBA_ACCURATE);
                        output.accept(ModItems.BULBA_ANIME);
                        output.accept(ModItems.BULBA_BEAST);
                        output.accept(ModItems.BULBA_CHESTBOAT);
                        output.accept(ModItems.BULBA_MCDONALDS);
                        output.accept(ModItems.BULBA_MELONCOMMANDER);
                        output.accept(ModItems.BULBA_SANTA);
                        output.accept(ModItems.BULBA_SEEDPLANTER);
                        output.accept(ModItems.BULBA_STANDARD);
                        output.accept(ModItems.BULBA_TERRORIST);
                        output.accept(ModItems.BULBA_TRUETERRARIAN);
                        output.accept(ModItems.BULBA_WIDE);
                        output.accept(ModItems.BULBA_WORKAHOLIC);
                        output.accept(ModItems.CHARLIE_BADEYESIGHT);
                        output.accept(ModItems.CHARLIE_BLAZE);
                        output.accept(ModItems.CHARLIE_DONUTDEV);
                        output.accept(ModItems.CHARLIE_RUSSIAN);
                        output.accept(ModItems.CHARLIE_STANDARD);
                        output.accept(ModItems.GAVIN_COPPERTYRANT);
                        output.accept(ModItems.GAVIN_MELONCOMMANDER);
                        output.accept(ModItems.GAVIN_NUGGIE);
                        output.accept(ModItems.GAVIN_RIZZ);
                        output.accept(ModItems.GAVIN_STANDARD);
                        output.accept(ModItems.GAVIN_TRUEAMERICAN);
                        output.accept(ModItems.GAVIN_VIKING);
                        output.accept(ModItems.GERALD);
                        output.accept(ModItems.ITEM_AMERICANFLAG);
                        output.accept(ModItems.ITEM_BANK);
                        output.accept(ModItems.ITEM_CASINO);
                        output.accept(ModItems.ITEM_ESF);
                        output.accept(ModItems.ITEM_GATE_DE);
                        output.accept(ModItems.ITEM_NUCLEARBUNKER);
                        output.accept(ModItems.ITEM_SALSA);
                        output.accept(ModItems.ITEM_THEEGG);
                        output.accept(ModItems.ITEM_YOURMOM);
                        output.accept(ModItems.JONATHAN_ARRESTED);
                        output.accept(ModItems.JONATHAN_LOCKEDIN);
                        output.accept(ModItems.JONATHAN_MAFIA);
                        output.accept(ModItems.JONATHAN_MELONCOMMANDER);
                        output.accept(ModItems.JONATHAN_MM);
                        output.accept(ModItems.JONATHAN_MODRINTH);
                        output.accept(ModItems.JONATHAN_PILOT);
                        output.accept(ModItems.JONATHAN_POLITICIAN);
                        output.accept(ModItems.JONATHAN_SCARYHEAD);
                        output.accept(ModItems.JONATHAN_STANDARD);
                        output.accept(ModItems.JONATHAN_WORKOUT);
                        output.accept(ModItems.MARK_BEDWARS);
                        output.accept(ModItems.MARK_CHESTBOAT);
                        output.accept(ModItems.MARK_COMMANDER);
                        output.accept(ModItems.MARK_COWBOY);
                        output.accept(ModItems.MARK_KNIGHT);
                        output.accept(ModItems.MARK_ROCKETEER);
                        output.accept(ModItems.MARK_SPACE);
                        output.accept(ModItems.MARK_STANDARD);
                        output.accept(ModItems.MARK_STARE);
                        output.accept(ModItems.ROBERT_ENGINEER);
                        output.accept(ModItems.ROBERT_OPPENHEIMER);
                        output.accept(ModItems.ROBERT_STANDARD);
                        output.accept(ModItems.SAWYER_BITCOIN);
                        output.accept(ModItems.SAWYER_CHEF);
                        output.accept(ModItems.SAWYER_CRASHOUT);
                        output.accept(ModItems.SAWYER_HORNET);
                        output.accept(ModItems.SAWYER_MIKU);
                        output.accept(ModItems.SAWYER_MUSICIAN);
                        output.accept(ModItems.SAWYER_SALTY);
                        output.accept(ModItems.SAWYER_STANDARD);
                        output.accept(ModItems.STEIN);


                    }).build());

    public static final Supplier<CreativeModeTab> MMTGC_SERIES_3_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_3_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BULBA_STANDARD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_2_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_3"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACTION_67);
                        output.accept(ModItems.ACTION_ASSASSINATION);
                        output.accept(ModItems.ACTION_BITCOINMINING);
                        output.accept(ModItems.ACTION_GAMBLING);
                        output.accept(ModItems.ACTION_GETCRACKED);
                        output.accept(ModItems.ACTION_GHOSTHUNT);
                        output.accept(ModItems.ACTION_JOINMELONS);
                        output.accept(ModItems.ACTION_LOCKIN);
                        output.accept(ModItems.ACTION_NEXTSEASON);
                        output.accept(ModItems.ACTION_NUKES);
                        output.accept(ModItems.ACTION_SECRETSERVICE);
                        output.accept(ModItems.ACTION_SLANDER);
                        output.accept(ModItems.ACTION_SPORTSTALK);
                        output.accept(ModItems.ADAM_GIGABOT);
                        output.accept(ModItems.ADAM_JUMPSCARE);
                        output.accept(ModItems.ADAM_KIRA);
                        output.accept(ModItems.ADAM_LAMB);
                        output.accept(ModItems.ADAM_STANDARD);
                        output.accept(ModItems.ADAM_SUCK87);
                        output.accept(ModItems.ADAM_TV);
                        output.accept(ModItems.BULBA_ACCURATE);
                        output.accept(ModItems.BULBA_ANIME);
                        output.accept(ModItems.BULBA_BEAST);
                        output.accept(ModItems.BULBA_CHESTBOAT);
                        output.accept(ModItems.BULBA_MCDONALDS);
                        output.accept(ModItems.BULBA_MELONCOMMANDER);
                        output.accept(ModItems.BULBA_SANTA);
                        output.accept(ModItems.BULBA_SEEDPLANTER);
                        output.accept(ModItems.BULBA_STANDARD);
                        output.accept(ModItems.BULBA_TERRORIST);
                        output.accept(ModItems.BULBA_TRUETERRARIAN);
                        output.accept(ModItems.BULBA_WIDE);
                        output.accept(ModItems.BULBA_WORKAHOLIC);
                        output.accept(ModItems.CHARLIE_BADEYESIGHT);
                        output.accept(ModItems.CHARLIE_BLAZE);
                        output.accept(ModItems.CHARLIE_DONUTDEV);
                        output.accept(ModItems.CHARLIE_RUSSIAN);
                        output.accept(ModItems.CHARLIE_STANDARD);
                        output.accept(ModItems.GAVIN_COPPERTYRANT);
                        output.accept(ModItems.GAVIN_MELONCOMMANDER);
                        output.accept(ModItems.GAVIN_NUGGIE);
                        output.accept(ModItems.GAVIN_RIZZ);
                        output.accept(ModItems.GAVIN_STANDARD);
                        output.accept(ModItems.GAVIN_TRUEAMERICAN);
                        output.accept(ModItems.GAVIN_VIKING);
                        output.accept(ModItems.GERALD);
                        output.accept(ModItems.ITEM_AMERICANFLAG);
                        output.accept(ModItems.ITEM_BANK);
                        output.accept(ModItems.ITEM_CASINO);
                        output.accept(ModItems.ITEM_ESF);
                        output.accept(ModItems.ITEM_GATE_DE);
                        output.accept(ModItems.ITEM_NUCLEARBUNKER);
                        output.accept(ModItems.ITEM_SALSA);
                        output.accept(ModItems.ITEM_THEEGG);
                        output.accept(ModItems.ITEM_YOURMOM);
                        output.accept(ModItems.JONATHAN_ARRESTED);
                        output.accept(ModItems.JONATHAN_LOCKEDIN);
                        output.accept(ModItems.JONATHAN_MAFIA);
                        output.accept(ModItems.JONATHAN_MELONCOMMANDER);
                        output.accept(ModItems.JONATHAN_MM);
                        output.accept(ModItems.JONATHAN_MODRINTH);
                        output.accept(ModItems.JONATHAN_PILOT);
                        output.accept(ModItems.JONATHAN_POLITICIAN);
                        output.accept(ModItems.JONATHAN_SCARYHEAD);
                        output.accept(ModItems.JONATHAN_STANDARD);
                        output.accept(ModItems.JONATHAN_WORKOUT);
                        output.accept(ModItems.MARK_BEDWARS);
                        output.accept(ModItems.MARK_CHESTBOAT);
                        output.accept(ModItems.MARK_COMMANDER);
                        output.accept(ModItems.MARK_COWBOY);
                        output.accept(ModItems.MARK_KNIGHT);
                        output.accept(ModItems.MARK_ROCKETEER);
                        output.accept(ModItems.MARK_SPACE);
                        output.accept(ModItems.MARK_STANDARD);
                        output.accept(ModItems.MARK_STARE);
                        output.accept(ModItems.ROBERT_ENGINEER);
                        output.accept(ModItems.ROBERT_OPPENHEIMER);
                        output.accept(ModItems.ROBERT_STANDARD);
                        output.accept(ModItems.SAWYER_BITCOIN);
                        output.accept(ModItems.SAWYER_CHEF);
                        output.accept(ModItems.SAWYER_CRASHOUT);
                        output.accept(ModItems.SAWYER_HORNET);
                        output.accept(ModItems.SAWYER_MIKU);
                        output.accept(ModItems.SAWYER_MUSICIAN);
                        output.accept(ModItems.SAWYER_SALTY);
                        output.accept(ModItems.SAWYER_STANDARD);
                        output.accept(ModItems.STEIN);


                    }).build());

    public static final Supplier<CreativeModeTab> MMTGC_SERIES_4_TAB = CREATIVE_MODE_TAB.register("mmtcg_series_4_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BULBA_STANDARD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MmTcg.MOD_ID, "mmtcg_series_3_tab"))
                    .title(Component.translatable("creativetab.mmtcg.series_4"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACTION_67);
                        output.accept(ModItems.ACTION_ASSASSINATION);
                        output.accept(ModItems.ACTION_BITCOINMINING);
                        output.accept(ModItems.ACTION_GAMBLING);
                        output.accept(ModItems.ACTION_GETCRACKED);
                        output.accept(ModItems.ACTION_GHOSTHUNT);
                        output.accept(ModItems.ACTION_JOINMELONS);
                        output.accept(ModItems.ACTION_LOCKIN);
                        output.accept(ModItems.ACTION_NEXTSEASON);
                        output.accept(ModItems.ACTION_NUKES);
                        output.accept(ModItems.ACTION_SECRETSERVICE);
                        output.accept(ModItems.ACTION_SLANDER);
                        output.accept(ModItems.ACTION_SPORTSTALK);
                        output.accept(ModItems.ADAM_GIGABOT);
                        output.accept(ModItems.ADAM_JUMPSCARE);
                        output.accept(ModItems.ADAM_KIRA);
                        output.accept(ModItems.ADAM_LAMB);
                        output.accept(ModItems.ADAM_STANDARD);
                        output.accept(ModItems.ADAM_SUCK87);
                        output.accept(ModItems.ADAM_TV);
                        output.accept(ModItems.BULBA_ACCURATE);
                        output.accept(ModItems.BULBA_ANIME);
                        output.accept(ModItems.BULBA_BEAST);
                        output.accept(ModItems.BULBA_CHESTBOAT);
                        output.accept(ModItems.BULBA_MCDONALDS);
                        output.accept(ModItems.BULBA_MELONCOMMANDER);
                        output.accept(ModItems.BULBA_SANTA);
                        output.accept(ModItems.BULBA_SEEDPLANTER);
                        output.accept(ModItems.BULBA_STANDARD);
                        output.accept(ModItems.BULBA_TERRORIST);
                        output.accept(ModItems.BULBA_TRUETERRARIAN);
                        output.accept(ModItems.BULBA_WIDE);
                        output.accept(ModItems.BULBA_WORKAHOLIC);
                        output.accept(ModItems.CHARLIE_BADEYESIGHT);
                        output.accept(ModItems.CHARLIE_BLAZE);
                        output.accept(ModItems.CHARLIE_DONUTDEV);
                        output.accept(ModItems.CHARLIE_RUSSIAN);
                        output.accept(ModItems.CHARLIE_STANDARD);
                        output.accept(ModItems.GAVIN_COPPERTYRANT);
                        output.accept(ModItems.GAVIN_MELONCOMMANDER);
                        output.accept(ModItems.GAVIN_NUGGIE);
                        output.accept(ModItems.GAVIN_RIZZ);
                        output.accept(ModItems.GAVIN_STANDARD);
                        output.accept(ModItems.GAVIN_TRUEAMERICAN);
                        output.accept(ModItems.GAVIN_VIKING);
                        output.accept(ModItems.GERALD);
                        output.accept(ModItems.ITEM_AMERICANFLAG);
                        output.accept(ModItems.ITEM_BANK);
                        output.accept(ModItems.ITEM_CASINO);
                        output.accept(ModItems.ITEM_ESF);
                        output.accept(ModItems.ITEM_GATE_DE);
                        output.accept(ModItems.ITEM_NUCLEARBUNKER);
                        output.accept(ModItems.ITEM_SALSA);
                        output.accept(ModItems.ITEM_THEEGG);
                        output.accept(ModItems.ITEM_YOURMOM);
                        output.accept(ModItems.JONATHAN_ARRESTED);
                        output.accept(ModItems.JONATHAN_LOCKEDIN);
                        output.accept(ModItems.JONATHAN_MAFIA);
                        output.accept(ModItems.JONATHAN_MELONCOMMANDER);
                        output.accept(ModItems.JONATHAN_MM);
                        output.accept(ModItems.JONATHAN_MODRINTH);
                        output.accept(ModItems.JONATHAN_PILOT);
                        output.accept(ModItems.JONATHAN_POLITICIAN);
                        output.accept(ModItems.JONATHAN_SCARYHEAD);
                        output.accept(ModItems.JONATHAN_STANDARD);
                        output.accept(ModItems.JONATHAN_WORKOUT);
                        output.accept(ModItems.MARK_BEDWARS);
                        output.accept(ModItems.MARK_CHESTBOAT);
                        output.accept(ModItems.MARK_COMMANDER);
                        output.accept(ModItems.MARK_COWBOY);
                        output.accept(ModItems.MARK_KNIGHT);
                        output.accept(ModItems.MARK_ROCKETEER);
                        output.accept(ModItems.MARK_SPACE);
                        output.accept(ModItems.MARK_STANDARD);
                        output.accept(ModItems.MARK_STARE);
                        output.accept(ModItems.ROBERT_ENGINEER);
                        output.accept(ModItems.ROBERT_OPPENHEIMER);
                        output.accept(ModItems.ROBERT_STANDARD);
                        output.accept(ModItems.SAWYER_BITCOIN);
                        output.accept(ModItems.SAWYER_CHEF);
                        output.accept(ModItems.SAWYER_CRASHOUT);
                        output.accept(ModItems.SAWYER_HORNET);
                        output.accept(ModItems.SAWYER_MIKU);
                        output.accept(ModItems.SAWYER_MUSICIAN);
                        output.accept(ModItems.SAWYER_SALTY);
                        output.accept(ModItems.SAWYER_STANDARD);
                        output.accept(ModItems.STEIN);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
