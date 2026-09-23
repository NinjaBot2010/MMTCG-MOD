package com.workaholicgames.mmtcg.item;

import com.workaholicgames.mmtcg.MmTcg;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MmTcg.MOD_ID);

    public static final DeferredItem<Item> BULBA_STANDARD = ITEMS.register("bulba_standard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
