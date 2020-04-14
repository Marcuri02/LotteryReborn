package me.idlibrary.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.Material;

public class IDList {
    private final Map<String, Material> list = new HashMap();

    public IDList() {
        try {
            this.list.put("68:0", Material.valueOf("WALL_SIGN"));
        } catch (IllegalArgumentException var312) {
        }

        try {
            this.list.put("72:1", Material.valueOf("SPRUCE_PRESSURE_PLATE"));
        } catch (IllegalArgumentException var311) {
        }

        try {
            this.list.put("72:2", Material.valueOf("BIRCH_PRESSURE_PLATE"));
        } catch (IllegalArgumentException var310) {
        }

        try {
            this.list.put("72:3", Material.valueOf("JUNGLE_PRESSURE_PLATE"));
        } catch (IllegalArgumentException var309) {
        }

        try {
            this.list.put("72:4", Material.valueOf("ACACIA_PRESSURE_PLATE"));
        } catch (IllegalArgumentException var308) {
        }

        try {
            this.list.put("72:5", Material.valueOf("DARK_OAK_PRESSURE_PLATE"));
        } catch (IllegalArgumentException var307) {
        }

        try {
            this.list.put("75:0", Material.valueOf("REDSTONE_WALL_TORCH"));
        } catch (IllegalArgumentException var306) {
        }

        try {
            this.list.put("96:1", Material.valueOf("SPRUCE_TRAPDOOR"));
        } catch (IllegalArgumentException var305) {
        }

        try {
            this.list.put("96:2", Material.valueOf("BIRCH_TRAPDOOR"));
        } catch (IllegalArgumentException var304) {
        }

        try {
            this.list.put("96:3", Material.valueOf("JUNGLE_TRAPDOOR"));
        } catch (IllegalArgumentException var303) {
        }

        try {
            this.list.put("96:4", Material.valueOf("ACACIA_TRAPDOOR"));
        } catch (IllegalArgumentException var302) {
        }

        try {
            this.list.put("96:5", Material.valueOf("DARK_OAK_TRAPDOOR"));
        } catch (IllegalArgumentException var301) {
        }

        try {
            this.list.put("104:1", Material.valueOf("ATTACHED_PUMPKIN_STEM"));
        } catch (IllegalArgumentException var300) {
        }

        try {
            this.list.put("105:1", Material.valueOf("ATTACHED_MELON_STEM"));
        } catch (IllegalArgumentException var299) {
        }

        try {
            this.list.put("143:1", Material.valueOf("SPRUCE_BUTTON"));
        } catch (IllegalArgumentException var298) {
        }

        try {
            this.list.put("143:2", Material.valueOf("BIRCH_BUTTON"));
        } catch (IllegalArgumentException var297) {
        }

        try {
            this.list.put("143:3", Material.valueOf("JUNGLE_BUTTON"));
        } catch (IllegalArgumentException var296) {
        }

        try {
            this.list.put("143:4", Material.valueOf("ACACIA_BUTTON"));
        } catch (IllegalArgumentException var295) {
        }

        try {
            this.list.put("143:5", Material.valueOf("DARK_OAK_BUTTON"));
        } catch (IllegalArgumentException var294) {
        }

        try {
            this.list.put("355:0", Material.valueOf("WHITE_BED"));
        } catch (IllegalArgumentException var293) {
        }

        try {
            this.list.put("355:14", Material.valueOf("RED_BED"));
        } catch (IllegalArgumentException var292) {
        }

        try {
            this.list.put("383:0", Material.valueOf("BAT_SPAWN_EGG"));
        } catch (IllegalArgumentException var291) {
        }

        try {
            this.list.put("383:1", Material.valueOf("BLAZE_SPAWN_EGG"));
        } catch (IllegalArgumentException var290) {
        }

        try {
            this.list.put("383:2", Material.valueOf("CAVE_SPIDER_SPAWN_EGG"));
        } catch (IllegalArgumentException var289) {
        }

        try {
            this.list.put("383:3", Material.valueOf("CHICKEN_SPAWN_EGG"));
        } catch (IllegalArgumentException var288) {
        }

        try {
            this.list.put("383:4", Material.valueOf("COD_SPAWN_EGG"));
        } catch (IllegalArgumentException var287) {
        }

        try {
            this.list.put("383:5", Material.valueOf("COW_SPAWN_EGG"));
        } catch (IllegalArgumentException var286) {
        }

        try {
            this.list.put("383:6", Material.valueOf("CREEPER_SPAWN_EGG"));
        } catch (IllegalArgumentException var285) {
        }

        try {
            this.list.put("383:7", Material.valueOf("DOLPHIN_SPAWN_EGG"));
        } catch (IllegalArgumentException var284) {
        }

        try {
            this.list.put("383:8", Material.valueOf("DONKEY_SPAWN_EGG"));
        } catch (IllegalArgumentException var283) {
        }

        try {
            this.list.put("383:9", Material.valueOf("DROWNED_SPAWN_EGG"));
        } catch (IllegalArgumentException var282) {
        }

        try {
            this.list.put("383:10", Material.valueOf("ELDER_GUARDIAN_SPAWN_EGG"));
        } catch (IllegalArgumentException var281) {
        }

        try {
            this.list.put("383:11", Material.valueOf("ENDERMAN_SPAWN_EGG"));
        } catch (IllegalArgumentException var280) {
        }

        try {
            this.list.put("383:12", Material.valueOf("ENDERMITE_SPAWN_EGG"));
        } catch (IllegalArgumentException var279) {
        }

        try {
            this.list.put("383:13", Material.valueOf("EVOKER_SPAWN_EGG"));
        } catch (IllegalArgumentException var278) {
        }

        try {
            this.list.put("383:14", Material.valueOf("GHAST_SPAWN_EGG"));
        } catch (IllegalArgumentException var277) {
        }

        try {
            this.list.put("383:15", Material.valueOf("GUARDIAN_SPAWN_EGG"));
        } catch (IllegalArgumentException var276) {
        }

        try {
            this.list.put("383:16", Material.valueOf("HORSE_SPAWN_EGG"));
        } catch (IllegalArgumentException var275) {
        }

        try {
            this.list.put("383:17", Material.valueOf("HUSK_SPAWN_EGG"));
        } catch (IllegalArgumentException var274) {
        }

        try {
            this.list.put("383:18", Material.valueOf("LLAMA_SPAWN_EGG"));
        } catch (IllegalArgumentException var273) {
        }

        try {
            this.list.put("383:19", Material.valueOf("MAGMA_CUBE_SPAWN_EGG"));
        } catch (IllegalArgumentException var272) {
        }

        try {
            this.list.put("383:20", Material.valueOf("MOOSHROOM_SPAWN_EGG"));
        } catch (IllegalArgumentException var271) {
        }

        try {
            this.list.put("383:21", Material.valueOf("MULE_SPAWN_EGG"));
        } catch (IllegalArgumentException var270) {
        }

        try {
            this.list.put("383:22", Material.valueOf("OCELOT_SPAWN_EGG"));
        } catch (IllegalArgumentException var269) {
        }

        try {
            this.list.put("383:23", Material.valueOf("PARROT_SPAWN_EGG"));
        } catch (IllegalArgumentException var268) {
        }

        try {
            this.list.put("383:24", Material.valueOf("PHANTOM_SPAWN_EGG"));
        } catch (IllegalArgumentException var267) {
        }

        try {
            this.list.put("383:25", Material.valueOf("PIG_SPAWN_EGG"));
        } catch (IllegalArgumentException var266) {
        }

        try {
            this.list.put("383:26", Material.valueOf("POLAR_BEAR_SPAWN_EGG"));
        } catch (IllegalArgumentException var265) {
        }

        try {
            this.list.put("383:27", Material.valueOf("PUFFERFISH_SPAWN_EGG"));
        } catch (IllegalArgumentException var264) {
        }

        try {
            this.list.put("383:28", Material.valueOf("RABBIT_SPAWN_EGG"));
        } catch (IllegalArgumentException var263) {
        }

        try {
            this.list.put("383:29", Material.valueOf("SALMON_SPAWN_EGG"));
        } catch (IllegalArgumentException var262) {
        }

        try {
            this.list.put("383:30", Material.valueOf("SHEEP_SPAWN_EGG"));
        } catch (IllegalArgumentException var261) {
        }

        try {
            this.list.put("383:31", Material.valueOf("SHULKER_SPAWN_EGG"));
        } catch (IllegalArgumentException var260) {
        }

        try {
            this.list.put("383:32", Material.valueOf("SILVERFISH_SPAWN_EGG"));
        } catch (IllegalArgumentException var259) {
        }

        try {
            this.list.put("383:33", Material.valueOf("SKELETON_HORSE_SPAWN_EGG"));
        } catch (IllegalArgumentException var258) {
        }

        try {
            this.list.put("383:34", Material.valueOf("SKELETON_SPAWN_EGG"));
        } catch (IllegalArgumentException var257) {
        }

        try {
            this.list.put("383:35", Material.valueOf("SLIME_SPAWN_EGG"));
        } catch (IllegalArgumentException var256) {
        }

        try {
            this.list.put("383:36", Material.valueOf("SPIDER_SPAWN_EGG"));
        } catch (IllegalArgumentException var255) {
        }

        try {
            this.list.put("383:37", Material.valueOf("SQUID_SPAWN_EGG"));
        } catch (IllegalArgumentException var254) {
        }

        try {
            this.list.put("383:38", Material.valueOf("STRAY_SPAWN_EGG"));
        } catch (IllegalArgumentException var253) {
        }

        try {
            this.list.put("383:39", Material.valueOf("TROPICAL_FISH_SPAWN_EGG"));
        } catch (IllegalArgumentException var252) {
        }

        try {
            this.list.put("383:40", Material.valueOf("TURTLE_SPAWN_EGG"));
        } catch (IllegalArgumentException var251) {
        }

        try {
            this.list.put("383:41", Material.valueOf("VEX_SPAWN_EGG"));
        } catch (IllegalArgumentException var250) {
        }

        try {
            this.list.put("383:42", Material.valueOf("VILLAGER_SPAWN_EGG"));
        } catch (IllegalArgumentException var249) {
        }

        try {
            this.list.put("383:43", Material.valueOf("VINDICATOR_SPAWN_EGG"));
        } catch (IllegalArgumentException var248) {
        }

        try {
            this.list.put("383:44", Material.valueOf("WITCH_SPAWN_EGG"));
        } catch (IllegalArgumentException var247) {
        }

        try {
            this.list.put("383:45", Material.valueOf("WITHER_SKELETON_SPAWN_EGG"));
        } catch (IllegalArgumentException var246) {
        }

        try {
            this.list.put("383:46", Material.valueOf("WOLF_SPAWN_EGG"));
        } catch (IllegalArgumentException var245) {
        }

        try {
            this.list.put("383:47", Material.valueOf("ZOMBIE_HORSE_SPAWN_EGG"));
        } catch (IllegalArgumentException var244) {
        }

        try {
            this.list.put("383:48", Material.valueOf("ZOMBIE_PIGMAN_SPAWN_EGG"));
        } catch (IllegalArgumentException var243) {
        }

        try {
            this.list.put("383:49", Material.valueOf("ZOMBIE_SPAWN_EGG"));
        } catch (IllegalArgumentException var242) {
        }

        try {
            this.list.put("383:50", Material.valueOf("ZOMBIE_VILLAGER_SPAWN_EGG"));
        } catch (IllegalArgumentException var241) {
        }

        try {
            this.list.put("397:6", Material.valueOf("SKELETON_WALL_SKULL"));
        } catch (IllegalArgumentException var240) {
        }

        try {
            this.list.put("397:7", Material.valueOf("WITHER_SKELETON_WALL_SKULL"));
        } catch (IllegalArgumentException var239) {
        }

        try {
            this.list.put("397:8", Material.valueOf("ZOMBIE_WALL_HEAD"));
        } catch (IllegalArgumentException var238) {
        }

        try {
            this.list.put("397:9", Material.valueOf("PLAYER_WALL_HEAD"));
        } catch (IllegalArgumentException var237) {
        }

        try {
            this.list.put("397:10", Material.valueOf("CREEPER_WALL_HEAD"));
        } catch (IllegalArgumentException var236) {
        }

        try {
            this.list.put("397:11", Material.valueOf("DRAGON_WALL_HEAD"));
        } catch (IllegalArgumentException var235) {
        }

        try {
            this.list.put("425:15", Material.valueOf("WHITE_BANNER"));
        } catch (IllegalArgumentException var234) {
        }

        try {
            this.list.put("454:0", Material.valueOf("PUMPKIN"));
        } catch (IllegalArgumentException var233) {
        }

        try {
            this.list.put("455:0", Material.valueOf("SHULKER_BOX"));
        } catch (IllegalArgumentException var232) {
        }

        try {
            this.list.put("456:0", Material.valueOf("BLUE_ICE"));
        } catch (IllegalArgumentException var231) {
        }

        try {
            this.list.put("457:0", Material.valueOf("STRIPPED_OAK_LOG"));
        } catch (IllegalArgumentException var230) {
        }

        try {
            this.list.put("457:1", Material.valueOf("STRIPPED_SPRUCE_LOG"));
        } catch (IllegalArgumentException var229) {
        }

        try {
            this.list.put("457:2", Material.valueOf("STRIPPED_BIRCH_LOG"));
        } catch (IllegalArgumentException var228) {
        }

        try {
            this.list.put("457:3", Material.valueOf("STRIPPED_JUNGLE_LOG"));
        } catch (IllegalArgumentException var227) {
        }

        try {
            this.list.put("457:4", Material.valueOf("STRIPPED_ACACIA_LOG"));
        } catch (IllegalArgumentException var226) {
        }

        try {
            this.list.put("457:5", Material.valueOf("STRIPPED_DARK_OAK_LOG"));
        } catch (IllegalArgumentException var225) {
        }

        try {
            this.list.put("458:0", Material.valueOf("OAK_WOOD"));
        } catch (IllegalArgumentException var224) {
        }

        try {
            this.list.put("458:1", Material.valueOf("SPRUCE_WOOD"));
        } catch (IllegalArgumentException var223) {
        }

        try {
            this.list.put("458:2", Material.valueOf("BIRCH_WOOD"));
        } catch (IllegalArgumentException var222) {
        }

        try {
            this.list.put("458:3", Material.valueOf("JUNGLE_WOOD"));
        } catch (IllegalArgumentException var221) {
        }

        try {
            this.list.put("458:4", Material.valueOf("ACACIA_WOOD"));
        } catch (IllegalArgumentException var220) {
        }

        try {
            this.list.put("458:5", Material.valueOf("DARK_OAK_WOOD"));
        } catch (IllegalArgumentException var219) {
        }

        try {
            this.list.put("459:0", Material.valueOf("STRIPPED_OAK_WOOD"));
        } catch (IllegalArgumentException var218) {
        }

        try {
            this.list.put("459:1", Material.valueOf("STRIPPED_SPRUCE_WOOD"));
        } catch (IllegalArgumentException var217) {
        }

        try {
            this.list.put("459:2", Material.valueOf("STRIPPED_BIRCH_WOOD"));
        } catch (IllegalArgumentException var216) {
        }

        try {
            this.list.put("459:3", Material.valueOf("STRIPPED_JUNGLE_WOOD"));
        } catch (IllegalArgumentException var215) {
        }

        try {
            this.list.put("459:4", Material.valueOf("STRIPPED_ACACIA_WOOD"));
        } catch (IllegalArgumentException var214) {
        }

        try {
            this.list.put("459:5", Material.valueOf("STRIPPED_DARK_OAK_WOOD"));
        } catch (IllegalArgumentException var213) {
        }

        try {
            this.list.put("460:0", Material.valueOf("BUBBLE_COLUMN"));
        } catch (IllegalArgumentException var212) {
        }

        try {
            this.list.put("461:0", Material.valueOf("BRAIN_CORAL"));
        } catch (IllegalArgumentException var211) {
        }

        try {
            this.list.put("461:1", Material.valueOf("BUBBLE_CORAL"));
        } catch (IllegalArgumentException var210) {
        }

        try {
            this.list.put("461:2", Material.valueOf("FIRE_CORAL"));
        } catch (IllegalArgumentException var209) {
        }

        try {
            this.list.put("461:3", Material.valueOf("HORN_CORAL"));
        } catch (IllegalArgumentException var208) {
        }

        try {
            this.list.put("461:4", Material.valueOf("TUBE_CORAL"));
        } catch (IllegalArgumentException var207) {
        }

        try {
            this.list.put("462:0", Material.valueOf("DEAD_BRAIN_CORAL"));
        } catch (IllegalArgumentException var206) {
        }

        try {
            this.list.put("462:1", Material.valueOf("DEAD_BUBBLE_CORAL"));
        } catch (IllegalArgumentException var205) {
        }

        try {
            this.list.put("462:2", Material.valueOf("DEAD_FIRE_CORAL"));
        } catch (IllegalArgumentException var204) {
        }

        try {
            this.list.put("462:3", Material.valueOf("DEAD_HORN_CORAL"));
        } catch (IllegalArgumentException var203) {
        }

        try {
            this.list.put("462:4", Material.valueOf("DEAD_TUBE_CORAL"));
        } catch (IllegalArgumentException var202) {
        }

        try {
            this.list.put("463:0", Material.valueOf("BRAIN_CORAL_BLOCK"));
        } catch (IllegalArgumentException var201) {
        }

        try {
            this.list.put("463:1", Material.valueOf("BUBBLE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var200) {
        }

        try {
            this.list.put("463:2", Material.valueOf("FIRE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var199) {
        }

        try {
            this.list.put("463:3", Material.valueOf("HORN_CORAL_BLOCK"));
        } catch (IllegalArgumentException var198) {
        }

        try {
            this.list.put("463:4", Material.valueOf("TUBE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var197) {
        }

        try {
            this.list.put("464:0", Material.valueOf("DEAD_BRAIN_CORAL_BLOCK"));
        } catch (IllegalArgumentException var196) {
        }

        try {
            this.list.put("464:1", Material.valueOf("DEAD_BUBBLE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var195) {
        }

        try {
            this.list.put("464:2", Material.valueOf("DEAD_FIRE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var194) {
        }

        try {
            this.list.put("464:3", Material.valueOf("DEAD_HORN_CORAL_BLOCK"));
        } catch (IllegalArgumentException var193) {
        }

        try {
            this.list.put("464:4", Material.valueOf("DEAD_TUBE_CORAL_BLOCK"));
        } catch (IllegalArgumentException var192) {
        }

        try {
            this.list.put("465:0", Material.valueOf("BRAIN_CORAL_FAN"));
        } catch (IllegalArgumentException var191) {
        }

        try {
            this.list.put("465:1", Material.valueOf("BUBBLE_CORAL_FAN"));
        } catch (IllegalArgumentException var190) {
        }

        try {
            this.list.put("465:2", Material.valueOf("FIRE_CORAL_FAN"));
        } catch (IllegalArgumentException var189) {
        }

        try {
            this.list.put("465:3", Material.valueOf("HORN_CORAL_FAN"));
        } catch (IllegalArgumentException var188) {
        }

        try {
            this.list.put("465:4", Material.valueOf("TUBE_CORAL_FAN"));
        } catch (IllegalArgumentException var187) {
        }

        try {
            this.list.put("466:0", Material.valueOf("DEAD_BRAIN_CORAL_FAN"));
        } catch (IllegalArgumentException var186) {
        }

        try {
            this.list.put("466:1", Material.valueOf("DEAD_BUBBLE_CORAL_FAN"));
        } catch (IllegalArgumentException var185) {
        }

        try {
            this.list.put("466:2", Material.valueOf("DEAD_FIRE_CORAL_FAN"));
        } catch (IllegalArgumentException var184) {
        }

        try {
            this.list.put("466:3", Material.valueOf("DEAD_HORN_CORAL_FAN"));
        } catch (IllegalArgumentException var183) {
        }

        try {
            this.list.put("466:4", Material.valueOf("DEAD_TUBE_CORAL_FAN"));
        } catch (IllegalArgumentException var182) {
        }

        try {
            this.list.put("467:0", Material.valueOf("BRAIN_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var181) {
        }

        try {
            this.list.put("467:1", Material.valueOf("BUBBLE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var180) {
        }

        try {
            this.list.put("467:2", Material.valueOf("FIRE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var179) {
        }

        try {
            this.list.put("467:3", Material.valueOf("HORN_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var178) {
        }

        try {
            this.list.put("467:4", Material.valueOf("TUBE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var177) {
        }

        try {
            this.list.put("468:0", Material.valueOf("DEAD_BRAIN_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var176) {
        }

        try {
            this.list.put("468:1", Material.valueOf("DEAD_BUBBLE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var175) {
        }

        try {
            this.list.put("468:2", Material.valueOf("DEAD_FIRE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var174) {
        }

        try {
            this.list.put("468:3", Material.valueOf("DEAD_HORN_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var173) {
        }

        try {
            this.list.put("468:4", Material.valueOf("DEAD_TUBE_CORAL_WALL_FAN"));
        } catch (IllegalArgumentException var172) {
        }

        try {
            this.list.put("469:0", Material.valueOf("TROPICAL_FISH_BUCKET"));
        } catch (IllegalArgumentException var171) {
        }

        try {
            this.list.put("469:1", Material.valueOf("COD_BUCKET"));
        } catch (IllegalArgumentException var170) {
        }

        try {
            this.list.put("469:2", Material.valueOf("PUFFERFISH_BUCKET"));
        } catch (IllegalArgumentException var169) {
        }

        try {
            this.list.put("469:3", Material.valueOf("SALMON_BUCKET"));
        } catch (IllegalArgumentException var168) {
        }

        try {
            this.list.put("470:0", Material.valueOf("CONDUIT"));
        } catch (IllegalArgumentException var167) {
        }

        try {
            this.list.put("471:0", Material.valueOf("PRISMARINE_SLAB"));
        } catch (IllegalArgumentException var166) {
        }

        try {
            this.list.put("471:1", Material.valueOf("PRISMARINE_BRICK_SLAB"));
        } catch (IllegalArgumentException var165) {
        }

        try {
            this.list.put("471:2", Material.valueOf("DARK_PRISMARINE_SLAB"));
        } catch (IllegalArgumentException var164) {
        }

        try {
            this.list.put("472:0", Material.valueOf("PRISMARINE_STAIRS"));
        } catch (IllegalArgumentException var163) {
        }

        try {
            this.list.put("472:1", Material.valueOf("PRISMARINE_BRICK_STAIRS"));
        } catch (IllegalArgumentException var162) {
        }

        try {
            this.list.put("472:2", Material.valueOf("DARK_PRISMARINE_STAIRS"));
        } catch (IllegalArgumentException var161) {
        }

        try {
            this.list.put("473:0", Material.valueOf("SEA_PICKLE"));
        } catch (IllegalArgumentException var160) {
        }

        try {
            this.list.put("474:0", Material.valueOf("SEAGRASS"));
        } catch (IllegalArgumentException var159) {
        }

        try {
            this.list.put("474:1", Material.valueOf("TALL_SEAGRASS"));
        } catch (IllegalArgumentException var158) {
        }

        try {
            this.list.put("475:0", Material.valueOf("KELP"));
        } catch (IllegalArgumentException var157) {
        }

        try {
            this.list.put("476:0", Material.valueOf("DRIED_KELP"));
        } catch (IllegalArgumentException var156) {
        }

        try {
            this.list.put("477:0", Material.valueOf("DRIED_KELP_BLOCK"));
        } catch (IllegalArgumentException var155) {
        }

        try {
            this.list.put("478:0", Material.valueOf("HEART_OF_THE_SEA"));
        } catch (IllegalArgumentException var154) {
        }

        try {
            this.list.put("479:0", Material.valueOf("NAUTILUS_SHELL"));
        } catch (IllegalArgumentException var153) {
        }

        try {
            this.list.put("480:0", Material.valueOf("PHANTOM_MEMBRANE"));
        } catch (IllegalArgumentException var152) {
        }

        try {
            this.list.put("481:0", Material.valueOf("SCUTE"));
        } catch (IllegalArgumentException var151) {
        }

        try {
            this.list.put("482:0", Material.valueOf("TURTLE_HELMET"));
        } catch (IllegalArgumentException var150) {
        }

        try {
            this.list.put("483:0", Material.valueOf("TRIDENT"));
        } catch (IllegalArgumentException var149) {
        }

        try {
            this.list.put("484:0", Material.valueOf("TURTLE_EGG"));
        } catch (IllegalArgumentException var148) {
        }

        try {
            this.list.put("485:0", Material.valueOf("VOID_AIR"));
        } catch (IllegalArgumentException var147) {
        }

        try {
            this.list.put("486:0", Material.valueOf("CAVE_AIR"));
        } catch (IllegalArgumentException var146) {
        }

        try {
            this.list.put("487:0", Material.valueOf("DEBUG_STICK"));
        } catch (IllegalArgumentException var145) {
        }

        try {
            this.list.put("488:0", Material.valueOf("BLACK_WALL_BANNER"));
        } catch (IllegalArgumentException var144) {
        }

        try {
            this.list.put("488:1", Material.valueOf("RED_WALL_BANNER"));
        } catch (IllegalArgumentException var143) {
        }

        try {
            this.list.put("488:2", Material.valueOf("GREEN_WALL_BANNER"));
        } catch (IllegalArgumentException var142) {
        }

        try {
            this.list.put("488:3", Material.valueOf("BROWN_WALL_BANNER"));
        } catch (IllegalArgumentException var141) {
        }

        try {
            this.list.put("488:4", Material.valueOf("BLUE_WALL_BANNER"));
        } catch (IllegalArgumentException var140) {
        }

        try {
            this.list.put("488:5", Material.valueOf("PURPLE_WALL_BANNER"));
        } catch (IllegalArgumentException var139) {
        }

        try {
            this.list.put("488:6", Material.valueOf("CYAN_WALL_BANNER"));
        } catch (IllegalArgumentException var138) {
        }

        try {
            this.list.put("488:7", Material.valueOf("LIGHT_GRAY_WALL_BANNER"));
        } catch (IllegalArgumentException var137) {
        }

        try {
            this.list.put("488:8", Material.valueOf("GRAY_WALL_BANNER"));
        } catch (IllegalArgumentException var136) {
        }

        try {
            this.list.put("488:9", Material.valueOf("PINK_WALL_BANNER"));
        } catch (IllegalArgumentException var135) {
        }

        try {
            this.list.put("488:10", Material.valueOf("LIME_WALL_BANNER"));
        } catch (IllegalArgumentException var134) {
        }

        try {
            this.list.put("488:11", Material.valueOf("YELLOW_WALL_BANNER"));
        } catch (IllegalArgumentException var133) {
        }

        try {
            this.list.put("488:12", Material.valueOf("LIGHT_BLUE_WALL_BANNER"));
        } catch (IllegalArgumentException var132) {
        }

        try {
            this.list.put("488:13", Material.valueOf("MAGENTA_WALL_BANNER"));
        } catch (IllegalArgumentException var131) {
        }

        try {
            this.list.put("488:14", Material.valueOf("ORANGE_WALL_BANNER"));
        } catch (IllegalArgumentException var130) {
        }

        try {
            this.list.put("488:15", Material.valueOf("WHITE_WALL_BANNER"));
        } catch (IllegalArgumentException var129) {
        }

        try {
            this.list.put("489:0", Material.valueOf("POTTED_ACACIA_SAPLING"));
        } catch (IllegalArgumentException var128) {
        }

        try {
            this.list.put("489:1", Material.valueOf("POTTED_ALLIUM"));
        } catch (IllegalArgumentException var127) {
        }

        try {
            this.list.put("489:2", Material.valueOf("POTTED_AZURE_BLUET"));
        } catch (IllegalArgumentException var126) {
        }

        try {
            this.list.put("489:3", Material.valueOf("POTTED_BIRCH_SAPLING"));
        } catch (IllegalArgumentException var125) {
        }

        try {
            this.list.put("489:4", Material.valueOf("POTTED_BLUE_ORCHID"));
        } catch (IllegalArgumentException var124) {
        }

        try {
            this.list.put("489:5", Material.valueOf("POTTED_BROWN_MUSHROOM"));
        } catch (IllegalArgumentException var123) {
        }

        try {
            this.list.put("489:6", Material.valueOf("POTTED_CACTUS"));
        } catch (IllegalArgumentException var122) {
        }

        try {
            this.list.put("489:7", Material.valueOf("POTTED_DANDELION"));
        } catch (IllegalArgumentException var121) {
        }

        try {
            this.list.put("489:8", Material.valueOf("POTTED_DARK_OAK_SAPLING"));
        } catch (IllegalArgumentException var120) {
        }

        try {
            this.list.put("489:9", Material.valueOf("POTTED_DEAD_BUSH"));
        } catch (IllegalArgumentException var119) {
        }

        try {
            this.list.put("489:10", Material.valueOf("POTTED_FERN"));
        } catch (IllegalArgumentException var118) {
        }

        try {
            this.list.put("489:11", Material.valueOf("POTTED_JUNGLE_SAPLING"));
        } catch (IllegalArgumentException var117) {
        }

        try {
            this.list.put("489:12", Material.valueOf("POTTED_OAK_SAPLING"));
        } catch (IllegalArgumentException var116) {
        }

        try {
            this.list.put("489:13", Material.valueOf("POTTED_ORANGE_TULIP"));
        } catch (IllegalArgumentException var115) {
        }

        try {
            this.list.put("489:14", Material.valueOf("POTTED_OXEYE_DAISY"));
        } catch (IllegalArgumentException var114) {
        }

        try {
            this.list.put("489:15", Material.valueOf("POTTED_PINK_TULIP"));
        } catch (IllegalArgumentException var113) {
        }

        try {
            this.list.put("489:16", Material.valueOf("POTTED_POPPY"));
        } catch (IllegalArgumentException var112) {
        }

        try {
            this.list.put("489:17", Material.valueOf("POTTED_RED_MUSHROOM"));
        } catch (IllegalArgumentException var111) {
        }

        try {
            this.list.put("489:18", Material.valueOf("POTTED_RED_TULIP"));
        } catch (IllegalArgumentException var110) {
        }

        try {
            this.list.put("489:19", Material.valueOf("POTTED_SPRUCE_SAPLING"));
        } catch (IllegalArgumentException var109) {
        }

        try {
            this.list.put("489:20", Material.valueOf("POTTED_WHITE_TULIP"));
        } catch (IllegalArgumentException var108) {
        }

        try {
            this.list.put("383:51", Material.valueOf("CAT_SPAWN_EGG"));
        } catch (IllegalArgumentException var107) {
        }

        try {
            this.list.put("383:52", Material.valueOf("FOX_SPAWN_EGG"));
        } catch (IllegalArgumentException var106) {
        }

        try {
            this.list.put("383:53", Material.valueOf("PANDA_SPAWN_EGG"));
        } catch (IllegalArgumentException var105) {
        }

        try {
            this.list.put("383:54", Material.valueOf("PILLAGER_SPAWN_EGG"));
        } catch (IllegalArgumentException var104) {
        }

        try {
            this.list.put("383:55", Material.valueOf("RAVAGER_SPAWN_EGG"));
        } catch (IllegalArgumentException var103) {
        }

        try {
            this.list.put("383:56", Material.valueOf("TRADER_LLAMA_SPAWN_EGG"));
        } catch (IllegalArgumentException var102) {
        }

        try {
            this.list.put("383:57", Material.valueOf("WANDERING_TRADER_SPAWN_EGG"));
        } catch (IllegalArgumentException var101) {
        }

        try {
            this.list.put("489:21", Material.valueOf("POTTED_CORNFLOWER"));
        } catch (IllegalArgumentException var100) {
        }

        try {
            this.list.put("489:22", Material.valueOf("POTTED_LILY_OF_THE_VALLEY"));
        } catch (IllegalArgumentException var99) {
        }

        try {
            this.list.put("489:23", Material.valueOf("POTTED_WITHER_ROSE"));
        } catch (IllegalArgumentException var98) {
        }

        try {
            this.list.put("490:0", Material.valueOf("ACACIA_SIGN"));
        } catch (IllegalArgumentException var97) {
        }

        try {
            this.list.put("490:1", Material.valueOf("BIRCH_SIGN"));
        } catch (IllegalArgumentException var96) {
        }

        try {
            this.list.put("490:2", Material.valueOf("DARK_OAK_SIGN"));
        } catch (IllegalArgumentException var95) {
        }

        try {
            this.list.put("490:3", Material.valueOf("JUNGLE_SIGN"));
        } catch (IllegalArgumentException var94) {
        }

        try {
            this.list.put("490:4", Material.valueOf("OAK_SIGN"));
        } catch (IllegalArgumentException var93) {
        }

        try {
            this.list.put("490:5", Material.valueOf("SPRUCE_SIGN"));
        } catch (IllegalArgumentException var92) {
        }

        try {
            this.list.put("491:0", Material.valueOf("ACACIA_WALL_SIGN"));
        } catch (IllegalArgumentException var91) {
        }

        try {
            this.list.put("491:1", Material.valueOf("BIRCH_WALL_SIGN"));
        } catch (IllegalArgumentException var90) {
        }

        try {
            this.list.put("491:2", Material.valueOf("DARK_OAK_WALL_SIGN"));
        } catch (IllegalArgumentException var89) {
        }

        try {
            this.list.put("491:3", Material.valueOf("JUNGLE_WALL_SIGN"));
        } catch (IllegalArgumentException var88) {
        }

        try {
            this.list.put("491:4", Material.valueOf("OAK_WALL_SIGN"));
        } catch (IllegalArgumentException var87) {
        }

        try {
            this.list.put("491:5", Material.valueOf("SPRUCE_WALL_SIGN"));
        } catch (IllegalArgumentException var86) {
        }

        try {
            this.list.put("492:0", Material.valueOf("ANDESITE_SLAB"));
        } catch (IllegalArgumentException var85) {
        }

        try {
            this.list.put("492:1", Material.valueOf("CUT_RED_SANDSTONE_SLAB"));
        } catch (IllegalArgumentException var84) {
        }

        try {
            this.list.put("492:2", Material.valueOf("CUT_SANDSTONE_SLAB"));
        } catch (IllegalArgumentException var83) {
        }

        try {
            this.list.put("492:3", Material.valueOf("DIORITE_SLAB"));
        } catch (IllegalArgumentException var82) {
        }

        try {
            this.list.put("492:4", Material.valueOf("END_STONE_BRICK_SLAB"));
        } catch (IllegalArgumentException var81) {
        }

        try {
            this.list.put("492:5", Material.valueOf("GRANITE_SLAB"));
        } catch (IllegalArgumentException var80) {
        }

        try {
            this.list.put("492:6", Material.valueOf("MOSSY_COBBLESTONE_SLAB"));
        } catch (IllegalArgumentException var79) {
        }

        try {
            this.list.put("492:7", Material.valueOf("MOSSY_STONE_BRICK_SLAB"));
        } catch (IllegalArgumentException var78) {
        }

        try {
            this.list.put("492:8", Material.valueOf("POLISHED_ANDESITE_SLAB"));
        } catch (IllegalArgumentException var77) {
        }

        try {
            this.list.put("492:9", Material.valueOf("POLISHED_DIORITE_SLAB"));
        } catch (IllegalArgumentException var76) {
        }

        try {
            this.list.put("492:10", Material.valueOf("POLISHED_GRANITE_SLAB"));
        } catch (IllegalArgumentException var75) {
        }

        try {
            this.list.put("492:11", Material.valueOf("RED_NETHER_BRICK_SLAB"));
        } catch (IllegalArgumentException var74) {
        }

        try {
            this.list.put("492:12", Material.valueOf("SMOOTH_QUARTZ_SLAB"));
        } catch (IllegalArgumentException var73) {
        }

        try {
            this.list.put("492:13", Material.valueOf("SMOOTH_RED_SANDSTONE_SLAB"));
        } catch (IllegalArgumentException var72) {
        }

        try {
            this.list.put("492:14", Material.valueOf("SMOOTH_SANDSTONE_SLAB"));
        } catch (IllegalArgumentException var71) {
        }

        try {
            this.list.put("493:0", Material.valueOf("ANDESITE_STAIRS"));
        } catch (IllegalArgumentException var70) {
        }

        try {
            this.list.put("493:1", Material.valueOf("DIORITE_STAIRS"));
        } catch (IllegalArgumentException var69) {
        }

        try {
            this.list.put("493:2", Material.valueOf("END_STONE_BRICK_STAIRS"));
        } catch (IllegalArgumentException var68) {
        }

        try {
            this.list.put("493:3", Material.valueOf("GRANITE_STAIRS"));
        } catch (IllegalArgumentException var67) {
        }

        try {
            this.list.put("493:4", Material.valueOf("MOSSY_COBBLESTONE_STAIRS"));
        } catch (IllegalArgumentException var66) {
        }

        try {
            this.list.put("493:5", Material.valueOf("MOSSY_STONE_BRICK_STAIRS"));
        } catch (IllegalArgumentException var65) {
        }

        try {
            this.list.put("493:6", Material.valueOf("POLISHED_ANDESITE_STAIRS"));
        } catch (IllegalArgumentException var64) {
        }

        try {
            this.list.put("493:7", Material.valueOf("POLISHED_DIORITE_STAIRS"));
        } catch (IllegalArgumentException var63) {
        }

        try {
            this.list.put("493:8", Material.valueOf("POLISHED_GRANITE_STAIRS"));
        } catch (IllegalArgumentException var62) {
        }

        try {
            this.list.put("493:9", Material.valueOf("RED_NETHER_BRICK_STAIRS"));
        } catch (IllegalArgumentException var61) {
        }

        try {
            this.list.put("493:10", Material.valueOf("SMOOTH_QUARTZ_STAIRS"));
        } catch (IllegalArgumentException var60) {
        }

        try {
            this.list.put("493:11", Material.valueOf("SMOOTH_RED_SANDSTONE_STAIRS"));
        } catch (IllegalArgumentException var59) {
        }

        try {
            this.list.put("493:12", Material.valueOf("SMOOTH_SANDSTONE_STAIRS"));
        } catch (IllegalArgumentException var58) {
        }

        try {
            this.list.put("493:13", Material.valueOf("STONE_STAIRS"));
        } catch (IllegalArgumentException var57) {
        }

        try {
            this.list.put("494:0", Material.valueOf("ANDESITE_WALL"));
        } catch (IllegalArgumentException var56) {
        }

        try {
            this.list.put("494:1", Material.valueOf("BRICK_WALL"));
        } catch (IllegalArgumentException var55) {
        }

        try {
            this.list.put("494:2", Material.valueOf("DIORITE_WALL"));
        } catch (IllegalArgumentException var54) {
        }

        try {
            this.list.put("494:3", Material.valueOf("END_STONE_BRICK_WALL"));
        } catch (IllegalArgumentException var53) {
        }

        try {
            this.list.put("494:4", Material.valueOf("GRANITE_WALL"));
        } catch (IllegalArgumentException var52) {
        }

        try {
            this.list.put("494:5", Material.valueOf("MOSSY_STONE_BRICK_WALL"));
        } catch (IllegalArgumentException var51) {
        }

        try {
            this.list.put("494:6", Material.valueOf("NETHER_BRICK_WALL"));
        } catch (IllegalArgumentException var50) {
        }

        try {
            this.list.put("494:7", Material.valueOf("PRISMARINE_WALL"));
        } catch (IllegalArgumentException var49) {
        }

        try {
            this.list.put("494:8", Material.valueOf("RED_NETHER_BRICK_WALL"));
        } catch (IllegalArgumentException var48) {
        }

        try {
            this.list.put("494:9", Material.valueOf("RED_SANDSTONE_WALL"));
        } catch (IllegalArgumentException var47) {
        }

        try {
            this.list.put("494:10", Material.valueOf("SANDSTONE_WALL"));
        } catch (IllegalArgumentException var46) {
        }

        try {
            this.list.put("494:11", Material.valueOf("STONE_BRICK_WALL"));
        } catch (IllegalArgumentException var45) {
        }

        try {
            this.list.put("495:0", Material.valueOf("BAMBOO"));
        } catch (IllegalArgumentException var44) {
        }

        try {
            this.list.put("496:0", Material.valueOf("BAMBOO_SAPLING"));
        } catch (IllegalArgumentException var43) {
        }

        try {
            this.list.put("497:0", Material.valueOf("COCOA_BEANS"));
        } catch (IllegalArgumentException var42) {
        }

        try {
            this.list.put("498:0", Material.valueOf("CORNFLOWER"));
        } catch (IllegalArgumentException var41) {
        }

        try {
            this.list.put("499:0", Material.valueOf("LILY_OF_THE_VALLEY"));
        } catch (IllegalArgumentException var40) {
        }

        try {
            this.list.put("500:0", Material.valueOf("SWEET_BERRY_BUSH"));
        } catch (IllegalArgumentException var39) {
        }

        try {
            this.list.put("501:0", Material.valueOf("WITHER_ROSE"));
        } catch (IllegalArgumentException var38) {
        }

        try {
            this.list.put("502:0", Material.valueOf("BARREL"));
        } catch (IllegalArgumentException var37) {
        }

        try {
            this.list.put("503:0", Material.valueOf("BELL"));
        } catch (IllegalArgumentException var36) {
        }

        try {
            this.list.put("504:0", Material.valueOf("BLAST_FURNACE"));
        } catch (IllegalArgumentException var35) {
        }

        try {
            this.list.put("505:0", Material.valueOf("CAMPFIRE"));
        } catch (IllegalArgumentException var34) {
        }

        try {
            this.list.put("506:0", Material.valueOf("CARTOGRAPHY_TABLE"));
        } catch (IllegalArgumentException var33) {
        }

        try {
            this.list.put("507:0", Material.valueOf("COMPOSTER"));
        } catch (IllegalArgumentException var32) {
        }

        try {
            this.list.put("508:0", Material.valueOf("FLETCHING_TABLE"));
        } catch (IllegalArgumentException var31) {
        }

        try {
            this.list.put("509:0", Material.valueOf("GRINDSTONE"));
        } catch (IllegalArgumentException var30) {
        }

        try {
            this.list.put("510:0", Material.valueOf("JIGSAW"));
        } catch (IllegalArgumentException var29) {
        }

        try {
            this.list.put("511:0", Material.valueOf("LANTERN"));
        } catch (IllegalArgumentException var28) {
        }

        try {
            this.list.put("512:0", Material.valueOf("LECTERN"));
        } catch (IllegalArgumentException var27) {
        }

        try {
            this.list.put("513:0", Material.valueOf("LOOM"));
        } catch (IllegalArgumentException var26) {
        }

        try {
            this.list.put("514:0", Material.valueOf("SCAFFOLDING"));
        } catch (IllegalArgumentException var25) {
        }

        try {
            this.list.put("515:0", Material.valueOf("SMITHING_TABLE"));
        } catch (IllegalArgumentException var24) {
        }

        try {
            this.list.put("516:0", Material.valueOf("SMOKER"));
        } catch (IllegalArgumentException var23) {
        }

        try {
            this.list.put("517:0", Material.valueOf("STONECUTTER"));
        } catch (IllegalArgumentException var22) {
        }

        try {
            this.list.put("518:0", Material.valueOf("CREEPER_BANNER_PATTERN"));
        } catch (IllegalArgumentException var21) {
        }

        try {
            this.list.put("518:1", Material.valueOf("FLOWER_BANNER_PATTERN"));
        } catch (IllegalArgumentException var20) {
        }

        try {
            this.list.put("518:2", Material.valueOf("GLOBE_BANNER_PATTERN"));
        } catch (IllegalArgumentException var19) {
        }

        try {
            this.list.put("518:3", Material.valueOf("MOJANG_BANNER_PATTERN"));
        } catch (IllegalArgumentException var18) {
        }

        try {
            this.list.put("518:4", Material.valueOf("SKULL_BANNER_PATTERN"));
        } catch (IllegalArgumentException var17) {
        }

        try {
            this.list.put("519:0", Material.valueOf("BLACK_DYE"));
        } catch (IllegalArgumentException var16) {
        }

        try {
            this.list.put("519:1", Material.valueOf("BLUE_DYE"));
        } catch (IllegalArgumentException var15) {
        }

        try {
            this.list.put("519:2", Material.valueOf("BROWN_DYE"));
        } catch (IllegalArgumentException var14) {
        }

        try {
            this.list.put("519:3", Material.valueOf("WHITE_DYE"));
        } catch (IllegalArgumentException var13) {
        }

        try {
            this.list.put("520:0", Material.valueOf("CROSSBOW"));
        } catch (IllegalArgumentException var12) {
        }

        try {
            this.list.put("521:0", Material.valueOf("LEATHER_HORSE_ARMOR"));
        } catch (IllegalArgumentException var11) {
        }

        try {
            this.list.put("522:0", Material.valueOf("SUSPICIOUS_STEW"));
        } catch (IllegalArgumentException var10) {
        }

        try {
            this.list.put("523:0", Material.valueOf("SWEET_BERRIES"));
        } catch (IllegalArgumentException var9) {
        }

        try {
            this.list.put("383:58", Material.valueOf("BEE_SPAWN_EGG"));
        } catch (IllegalArgumentException var8) {
        }

        try {
            this.list.put("524:0", Material.valueOf("BEEHIVE"));
        } catch (IllegalArgumentException var7) {
        }

        try {
            this.list.put("525:0", Material.valueOf("BEE_NEST"));
        } catch (IllegalArgumentException var6) {
        }

        try {
            this.list.put("526:0", Material.valueOf("HONEY_BLOCK"));
        } catch (IllegalArgumentException var5) {
        }

        try {
            this.list.put("527:0", Material.valueOf("HONEYCOMB_BLOCK"));
        } catch (IllegalArgumentException var4) {
        }

        try {
            this.list.put("528:0", Material.valueOf("HONEYCOMB"));
        } catch (IllegalArgumentException var3) {
        }

        try {
            this.list.put("529:0", Material.valueOf("HONEY_BOTTLE"));
        } catch (IllegalArgumentException var2) {
        }

    }

    public Material getMaterial(String ID) {
        return (Material)this.list.get(ID);
    }

    public String getIDData(Material M) {
        Iterator var3 = this.list.entrySet().iterator();

        while(var3.hasNext()) {
            Entry<String, Material> m = (Entry)var3.next();
            if (((Material)m.getValue()).equals(M)) {
                return (String)m.getKey();
            }
        }

        return null;
    }

    public int getID(Material M) {
        Iterator var3 = this.list.entrySet().iterator();

        while(var3.hasNext()) {
            Entry<String, Material> m = (Entry)var3.next();
            if (((Material)m.getValue()).equals(M)) {
                return Integer.parseInt(((String)m.getKey()).split(":")[0]);
            }
        }

        return -1;
    }

    public byte getData(Material M) {
        Iterator var3 = this.list.entrySet().iterator();

        while(var3.hasNext()) {
            Entry<String, Material> m = (Entry)var3.next();
            if (((Material)m.getValue()).equals(M)) {
                return Byte.parseByte(((String)m.getKey()).split(":")[1]);
            }
        }

        return -1;
    }
}