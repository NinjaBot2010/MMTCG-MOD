package com.workaholicgames.mmtcg.datagen;

import com.workaholicgames.mmtcg.MmTcg;
import com.workaholicgames.mmtcg.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MmTcg.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.MAXIMITE_INGOT.get());
        basicItem(ModItems.MAXIMIZED_PAPER.get());
        basicItem(ModItems.RAW_MM.get());

        basicItem(ModItems.CAPTIN_BOOSTER_ITEM.get());
        basicItem(ModItems.SERIES_ONE_BOOSTER.get());
        basicItem(ModItems.SERIES_TWO_BOOSTER.get());
        basicItem(ModItems.SERIES_THREE_BOOSTER.get());
        basicItem(ModItems.SERIES_FOUR_BOOSTER.get());

        basicItem(ModItems.CUBE_OF_RUIN.get());
        basicItem(ModItems.DELL.get());
        basicItem(ModItems.GERALD.get());
        basicItem(ModItems.MOLDY_BREAD.get());
        basicItem(ModItems.STEIN.get());

        basicItem(ModItems.ACTION_67.get());
        basicItem(ModItems.ACTION_ASSASSINATION.get());
        basicItem(ModItems.ACTION_BITCOINMINING.get());
        basicItem(ModItems.ACTION_GAMBLING.get());
        basicItem(ModItems.ACTION_GETCRACKED.get());
        basicItem(ModItems.ACTION_GHOSTHUNT.get());
        basicItem(ModItems.ACTION_JOINMELONS.get());
        basicItem(ModItems.ACTION_LOCKIN.get());
        basicItem(ModItems.ACTION_NEXTSEASON.get());
        basicItem(ModItems.ACTION_NUKES.get());
        basicItem(ModItems.ACTION_SECRETSERVICE.get());
        basicItem(ModItems.ACTION_SLANDER.get());
        basicItem(ModItems.ACTION_SPORTSTALK.get());

        basicItem(ModItems.ADAM_GIGABOT.get());
        basicItem(ModItems.ADAM_JUMPSCARE.get());
        basicItem(ModItems.ADAM_KIRA.get());
        basicItem(ModItems.ADAM_LAMB.get());
        basicItem(ModItems.ADAM_SAYGIGA.get());
        basicItem(ModItems.ADAM_SIDEKICK.get());
        basicItem(ModItems.ADAM_STANDARD.get());
        basicItem(ModItems.ADAM_SUCK87.get());
        basicItem(ModItems.ADAM_TV.get());

        basicItem(ModItems.BULBA_ACCURATE.get());
        basicItem(ModItems.BULBA_ANIME.get());
        basicItem(ModItems.BULBA_BEAST.get());
        basicItem(ModItems.BULBA_BULBIKA.get());
        basicItem(ModItems.BULBA_CHESTBOAT.get());
        basicItem(ModItems.BULBA_MCDONALDS.get());
        basicItem(ModItems.BULBA_MELONCOMMANDER.get());
        basicItem(ModItems.BULBA_SANTA.get());
        basicItem(ModItems.BULBA_SEEDPLANTER.get());
        basicItem(ModItems.BULBA_STANDARD.get());
        basicItem(ModItems.BULBA_TERRORIST.get());
        basicItem(ModItems.BULBA_TRUETERRARIAN.get());
        basicItem(ModItems.BULBA_WIDE.get());
        basicItem(ModItems.BULBA_WORKAHOLIC.get());

        basicItem(ModItems.CHARLIE_BADEYESIGHT.get());
        basicItem(ModItems.CHARLIE_BLAZE.get());
        basicItem(ModItems.CHARLIE_CHARLESUKI.get());
        basicItem(ModItems.CHARLIE_DONUTDEV.get());
        basicItem(ModItems.CHARLIE_RUSSIAN.get());
        basicItem(ModItems.CHARLIE_SNIPER.get());
        basicItem(ModItems.CHARLIE_STANDARD.get());

        basicItem(ModItems.DIEGO_HORSELORD.get());
        basicItem(ModItems.DIEGO_SOUPSERVER.get());
        basicItem(ModItems.DIEGO_STANDARD.get());

        basicItem(ModItems.GAVIN_BLIMPBLOWER.get());
        basicItem(ModItems.GAVIN_COPPERTINE.get());
        basicItem(ModItems.GAVIN_COPPERTYRANT.get());
        basicItem(ModItems.GAVIN_DWARF.get());
        basicItem(ModItems.GAVIN_GRUVIN.get());
        basicItem(ModItems.GAVIN_MELONCOMMANDER.get());
        basicItem(ModItems.GAVIN_NUGGIE.get());
        basicItem(ModItems.GAVIN_RIZZ.get());
        basicItem(ModItems.GAVIN_STANDARD.get());
        basicItem(ModItems.GAVIN_TRUEAMERICAN.get());
        basicItem(ModItems.GAVIN_VIKING.get());

        basicItem(ModItems.ITEM_AMERICANFLAG.get());
        basicItem(ModItems.ITEM_BANK.get());
        basicItem(ModItems.ITEM_CASINO.get());
        basicItem(ModItems.ITEM_ESF.get());
        basicItem(ModItems.ITEM_GATE_DE.get());
        basicItem(ModItems.ITEM_MELONSLICER.get());
        basicItem(ModItems.ITEM_NUCLEARBUNKER.get());
        basicItem(ModItems.ITEM_SALSA.get());
        basicItem(ModItems.ITEM_THEEGG.get());
        basicItem(ModItems.ITEM_YOURMOM.get());

        basicItem(ModItems.JONATHAN_ARRESTED.get());
        basicItem(ModItems.JONATHAN_LOCKEDIN.get());
        basicItem(ModItems.JONATHAN_MAFIA.get());
        basicItem(ModItems.JONATHAN_MELONCOMMANDER.get());
        basicItem(ModItems.JONATHAN_MM.get());
        basicItem(ModItems.JONATHAN_MODRINTH.get());
        basicItem(ModItems.JONATHAN_OILRIGGER.get());
        basicItem(ModItems.JONATHAN_PILOT.get());
        basicItem(ModItems.JONATHAN_POLITICIAN.get());
        basicItem(ModItems.JONATHAN_SCARYHEAD.get());
        basicItem(ModItems.JONATHAN_STANDARD.get());
        basicItem(ModItems.JONATHAN_WORKOUT.get());

        basicItem(ModItems.MARK_BEDWARS.get());
        basicItem(ModItems.MARK_CHESTBOAT.get());
        basicItem(ModItems.MARK_COMMANDER.get());
        basicItem(ModItems.MARK_COWBOY.get());
        basicItem(ModItems.MARK_KNIGHT.get());
        basicItem(ModItems.MARK_ROCKETEER.get());
        basicItem(ModItems.MARK_SPACE.get());
        basicItem(ModItems.MARK_STANDARD.get());
        basicItem(ModItems.MARK_STARE.get());

        basicItem(ModItems.ROBERT_ENGINEER.get());
        basicItem(ModItems.ROBERT_OPPENHEIMER.get());
        basicItem(ModItems.ROBERT_PIRATE.get());
        basicItem(ModItems.ROBERT_STANDARD.get());

        basicItem(ModItems.SAWYER_BITCOIN.get());
        basicItem(ModItems.SAWYER_CHEF.get());
        basicItem(ModItems.SAWYER_CRASHOUT.get());
        basicItem(ModItems.SAWYER_GAMINGSESSION.get());
        basicItem(ModItems.SAWYER_HORNET.get());
        basicItem(ModItems.SAWYER_MIKU.get());
        basicItem(ModItems.SAWYER_MUSICIAN.get());
        basicItem(ModItems.SAWYER_SALTY.get());
        basicItem(ModItems.SAWYER_SAWYURI.get());
        basicItem(ModItems.SAWYER_STANDARD.get());

    }
}
