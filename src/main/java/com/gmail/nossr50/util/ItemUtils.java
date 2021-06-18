package com.gmail.nossr50.util;

import com.gmail.nossr50.config.Config;
import com.gmail.nossr50.config.experience.ExperienceConfig;
import com.gmail.nossr50.config.party.ItemWeightConfig;
import com.gmail.nossr50.datatypes.skills.SkillType;
import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.mcMMO;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;

public final class ItemUtils {
    private ItemUtils() {}

    /**
     * Checks if the item is a bow.
     *
     * @param item Item to check
     * @return true if the item is a bow, false otherwise
     */
    public static boolean isBow(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isBow(type) || mcMMO.getModManager().isCustomBow(type);
    }

    /**
     * Checks if the item is a sword.
     *
     * @param item Item to check
     * @return true if the item is a sword, false otherwise
     */
    public static boolean isSword(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isSword(type) || mcMMO.getModManager().isCustomSword(type);
    }

    /**
     * Checks if the item is a hoe.
     *
     * @param item Item to check
     * @return true if the item is a hoe, false otherwise
     */
    public static boolean isHoe(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isHoe(type) || mcMMO.getModManager().isCustomHoe(type);
    }

    /**
     * Checks if the item is a shovel.
     *
     * @param item Item to check
     * @return true if the item is a shovel, false otherwise
     */
    public static boolean isShovel(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isShovel(type) || mcMMO.getModManager().isCustomShovel(type);
    }

    /**
     * Checks if the item is an axe.
     *
     * @param item Item to check
     * @return true if the item is an axe, false otherwise
     */
    public static boolean isAxe(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isAxe(type) || mcMMO.getModManager().isCustomAxe(type);
    }

    /**
     * Checks if the item is a pickaxe.
     *
     * @param item Item to check
     * @return true if the item is a pickaxe, false otherwise
     */
    public static boolean isPickaxe(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isPickAxe(type) || mcMMO.getModManager().isCustomPickaxe(type);
    }

    /**
     * Checks if the item counts as unarmed.
     *
     * @param item Item to check
     * @return true if the item counts as unarmed, false otherwise
     */
    public static boolean isUnarmed(ItemStack item) {
        if (Config.getInstance().getUnarmedItemsAsUnarmed()) {
            return !isMinecraftTool(item);
        }

        return item.getType() == Material.AIR;
    }

    /**
     * Checks to see if an item is a wearable armor piece.
     *
     * @param item Item to check
     * @return true if the item is armor, false otherwise
     */
    public static boolean isArmor(ItemStack item) {
        Material type = item.getType();
        return mcMMO.getMaterialMapStore().isArmor(type) || mcMMO.getModManager().isCustomArmor(type);
    }

    /**
     * Checks to see if an item is a leather armor piece.
     *
     * @param item Item to check
     * @return true if the item is leather armor, false otherwise
     */
    public static boolean isLeatherArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isLeatherArmor(item.getType());
    }

    /**
     * Checks to see if an item is a gold armor piece.
     *
     * @param item Item to check
     * @return true if the item is gold armor, false otherwise
     */
    public static boolean isGoldArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isGoldArmor(item.getType());
    }

    /**
     * Checks to see if an item is an iron armor piece.
     *
     * @param item Item to check
     * @return true if the item is iron armor, false otherwise
     */
    public static boolean isIronArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isIronArmor(item.getType());
    }

    /**
     * Checks to see if an item is a diamond armor piece.
     *
     * @param item Item to check
     * @return true if the item is diamond armor, false otherwise
     */
    public static boolean isDiamondArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isDiamondArmor(item.getType());
    }

    public static boolean isNetheriteArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isNetheriteArmor(item.getType());
    }

    /**
     * Checks to see if an item is a chainmail armor piece.
     *
     * @param item Item to check
     * @return true if the item is chainmail armor, false otherwise
     */
    public static boolean isChainmailArmor(ItemStack item) {
        return mcMMO.getMaterialMapStore().isChainmailArmor(item.getType());
    }

    /**
     * Checks to see if an item is a *vanilla* tool.
     *
     * @param item Item to check
     * @return true if the item is a tool, false otherwise
     */
    public static boolean isMinecraftTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isTool(item.getType());
    }

    /**
     * Checks to see if an item is a stone tool.
     *
     * @param item Item to check
     * @return true if the item is a stone tool, false otherwise
     */
    public static boolean isStoneTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isStoneTool(item.getType());
    }

    /**
     * Checks to see if an item is a wooden tool.
     *
     * @param item Item to check
     * @return true if the item is a wooden tool, false otherwise
     */
    public static boolean isWoodTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isWoodTool(item.getType());
    }

    /**
     * Checks to see if an item is a string tool.
     *
     * @param item Item to check
     * @return true if the item is a string tool, false otherwise
     */
    public static boolean isStringTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isStringTool(item.getType());
    }

    /**
     * Checks to see if an item is a gold tool.
     *
     * @param item Item to check
     * @return true if the item is a stone tool, false otherwise
     */
    public static boolean isGoldTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isGoldTool(item.getType());
    }

    /**
     * Checks to see if an item is an iron tool.
     *
     * @param item Item to check
     * @return true if the item is an iron tool, false otherwise
     */
    public static boolean isIronTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isIronTool(item.getType());
    }

    /**
     * Checks to see if an item is a diamond tool.
     *
     * @param item Item to check
     * @return true if the item is a diamond tool, false otherwise
     */
    public static boolean isDiamondTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isDiamondTool(item.getType());
    }

    public static boolean isNetheriteTool(ItemStack item) {
        return mcMMO.getMaterialMapStore().isNetheriteTool(item.getType());
    }

    /**
     * Checks to see if an item is enchantable.
     *
     * @param item Item to check
     * @return true if the item is enchantable, false otherwise
     */
    public static boolean isEnchantable(ItemStack item) {
        return mcMMO.getMaterialMapStore().isEnchantable(item.getType());
    }

    public static boolean isSmeltable(ItemStack item) {
        return item != null && ExperienceConfig.getInstance().isSkillBlock(SkillType.SMELTING, item.getType());
    }

    public static boolean isSmelted(ItemStack item) {
        if (item == null) {
            return false;
        }

        for (Recipe recipe : mcMMO.p.getServer().getRecipesFor(item)) {
            if (recipe instanceof FurnaceRecipe && ((FurnaceRecipe) recipe).getInput().getType().isBlock() && MaterialUtils.isOre(((FurnaceRecipe) recipe).getInput().getType())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Check if an item is sharable.
     *
     * @param item Item that will get shared
     * @return True if the item can be shared.
     */
    public static boolean isSharable(ItemStack item) {
        if (item == null || item.getType() == Material.AIR) {
            return false;
        }

        return isMiningDrop(item) || isWoodcuttingDrop(item) || isMobDrop(item) || isHerbalismDrop(item) || isMiscDrop(item);
    }

    /**
     * Checks to see if an item is a mining drop.
     *
     * @param item Item to check
     * @return true if the item is a mining drop, false otherwise
     */
    public static boolean isMiningDrop(ItemStack item) {
        switch (item.getType()) {
            case COAL:
            case COAL_ORE:
            case DIAMOND:
            case DIAMOND_ORE:
            case EMERALD:
            case EMERALD_ORE:
            case GOLD_ORE:
            case IRON_ORE:
            case LAPIS_ORE:
            case REDSTONE_ORE: // Should we also have Glowing Redstone Ore here?
            case REDSTONE:
            case GLOWSTONE_DUST: // Should we also have Glowstone here?
            case QUARTZ:
            case NETHER_QUARTZ_ORE:
            case LAPIS_LAZULI:
                return true;

            default:
                return false;
        }
    }

    /**
     * Checks to see if an item is a herbalism drop.
     *
     * @param item Item to check
     * @return true if the item is a herbalism drop, false otherwise
     */
    public static boolean isHerbalismDrop(ItemStack item) {
        switch (item.getType()) {
            case WHEAT:
            case WHEAT_SEEDS:
            case CARROT:
            case CHORUS_FRUIT:
            case CHORUS_FLOWER:
            case POTATO:
            case BEETROOT:
            case BEETROOT_SEEDS:
            case NETHER_WART:
            case BROWN_MUSHROOM:
            case RED_MUSHROOM:
            case ROSE_BUSH:
            case DANDELION:
            case CACTUS:
            case SUGAR_CANE:
            case MELON:
            case MELON_SEEDS:
            case PUMPKIN:
            case PUMPKIN_SEEDS:
            case LILY_PAD:
            case VINE:
            case TALL_GRASS:
            case COCOA_BEANS:
                return true;

            default:
                return false;
        }
    }

    /**
     * Checks to see if an item is a mob drop.
     *
     * @param item Item to check
     * @return true if the item is a mob drop, false otherwise
     */
    public static boolean isMobDrop(ItemStack item) {
        switch (item.getType()) {
            case STRING:
            case FEATHER:
            case CHICKEN:
            case COOKED_CHICKEN:
            case LEATHER:
            case BEEF:
            case COOKED_BEEF:
            case PORKCHOP:
            case COOKED_PORKCHOP:
            case WHITE_WOOL:
            case BLACK_WOOL:
            case BLUE_WOOL:
            case BROWN_WOOL:
            case CYAN_WOOL:
            case GRAY_WOOL:
            case GREEN_WOOL:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_WOOL:
            case LIME_WOOL:
            case MAGENTA_WOOL:
            case ORANGE_WOOL:
            case PINK_WOOL:
            case PURPLE_WOOL:
            case RED_WOOL:
            case YELLOW_WOOL:
            case IRON_INGOT:
            case SNOWBALL:
            case BLAZE_ROD:
            case SPIDER_EYE:
            case GUNPOWDER:
            case ENDER_PEARL:
            case GHAST_TEAR:
            case MAGMA_CREAM:
            case BONE:
            case ARROW:
            case SLIME_BALL:
            case NETHER_STAR:
            case ROTTEN_FLESH:
            case GOLD_NUGGET:
            case EGG:
            case ROSE_BUSH:
            case COAL:
                return true;

            default:
                return false;
        }
    }

    /**
     * Checks to see if an item is a woodcutting drop.
     *
     * @param item Item to check
     * @return true if the item is a woodcutting drop, false otherwise
     */
    public static boolean isWoodcuttingDrop(ItemStack item) {
        switch (item.getType()) {
            case ACACIA_LOG:
            case BIRCH_LOG:
            case DARK_OAK_LOG:
            case JUNGLE_LOG:
            case OAK_LOG:
            case SPRUCE_LOG:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_OAK_LOG:
            case STRIPPED_SPRUCE_LOG:
            case ACACIA_SAPLING:
            case SPRUCE_SAPLING:
            case BIRCH_SAPLING:
            case DARK_OAK_SAPLING:
            case JUNGLE_SAPLING:
            case OAK_SAPLING:
            case ACACIA_LEAVES:
            case BIRCH_LEAVES:
            case DARK_OAK_LEAVES:
            case JUNGLE_LEAVES:
            case OAK_LEAVES:
            case SPRUCE_LEAVES:
            case APPLE:
                return true;

            default:
                return false;
        }
    }

    /**
     * Checks to see if an item is a miscellaneous drop. These items are read from the config file
     *
     * @param item Item to check
     * @return true if the item is a miscellaneous drop, false otherwise
     */
    public static boolean isMiscDrop(ItemStack item) {
        return ItemWeightConfig.getInstance().getMiscItems().contains(item.getType());
    }

    public static boolean isMcMMOItem(ItemStack item) {
        if (!item.hasItemMeta()) {
            return false;
        }

        ItemMeta itemMeta = item.getItemMeta();
        return itemMeta.hasLore() && itemMeta.getLore().contains("mcMMO Item");
    }

    public static boolean isChimaeraWing(ItemStack item) {
        if (!isMcMMOItem(item)) {
            return false;
        }

        ItemMeta itemMeta = item.getItemMeta();
        return itemMeta.hasDisplayName() && itemMeta.getDisplayName().equals(ChatColor.GOLD + LocaleLoader.getString("Item.ChimaeraWing.Name"));
    }

    public static boolean isFluxPickaxe(ItemStack item) {
        if (!isMcMMOItem(item)) {
            return false;
        }

        ItemMeta itemMeta = item.getItemMeta();
        return itemMeta.hasDisplayName() && itemMeta.getDisplayName().equals(ChatColor.GOLD + LocaleLoader.getString("Item.FluxPickaxe.Name"));
    }
}
