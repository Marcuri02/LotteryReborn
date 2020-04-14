package me.idlibrary.main;

import java.util.EnumSet;
import java.util.Iterator;
import me.idlibrary.list.IDList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class IDLibrary {
    public static final String Separator = ":";
    private static final IDList List = new IDList();

    private static boolean isInt(String S) {
        try {
            Integer.parseInt(S);
            return true;
        } catch (NumberFormatException var2) {
            return false;
        }
    }

    public static Material getMaterial(String ID) {
        Material m = List.getMaterial(ID.contains(":") ? ID : ID + ":" + "0");
        if (m != null) {
            return m;
        } else {
            try {
                m = Material.valueOf(ID);
                if (List.getIDData(m) != null) {
                    return m;
                }
            } catch (Exception var9) {
            }

            if (ID.startsWith("383")) {
                return null;
            } else {
                if (!ID.contains(":") && !isInt(ID)) {
                    try {
                        m = Material.valueOf(ID.toUpperCase());
                        if (m != null) {
                            return m;
                        }
                    } catch (Exception var8) {
                    }
                }

                if (ID.contains(":")) {
                    String[] md = ID.split(":");

                    try {
                        return getMaterial(Integer.parseInt(md[0]), Byte.parseByte(md[1]));
                    } catch (Exception var7) {
                        Material m1 = Material.getMaterial("LEGACY_" + md[0].toUpperCase(), false);

                        try {
                            return m1 == null ? m1 : getMaterial(m1.getId(), Byte.parseByte(md[1]));
                        } catch (Exception var6) {
                            return null;
                        }
                    }
                } else {
                    try {
                        return getMaterial(Integer.parseInt(ID));
                    } catch (Exception var10) {
                        Material m1 = Material.getMaterial("LEGACY_" + ID.toUpperCase(), false);
                        return m1 == null ? m1 : getMaterial(m1.getId(), (byte)0);
                    }
                }
            }
        }
    }

    public static Material getMaterial(int ID) {
        return getMaterial(ID, (byte)0);
    }

    public static Material getMaterial(int ID, byte Data) {
        Iterator var3 = EnumSet.allOf(Material.class).iterator();

        while(var3.hasNext()) {
            Material m = (Material)var3.next();

            try {
                if (m.getId() == ID) {
                    Material m1 = Bukkit.getUnsafe().fromLegacy(new MaterialData(m, Data));
                    return (m1 != Material.AIR || ID == 0 && Data == 0) && (Data == 0 || m1 != Bukkit.getUnsafe().fromLegacy(new MaterialData(m, (byte)0))) ? m1 : List.getMaterial(ID + ":" + Data);
                }
            } catch (IllegalArgumentException var5) {
            }
        }

        return null;
    }

    public static Material getMaterial(String ID, byte Data) {
        return getMaterial(ID + ":" + Data);
    }

    public static String getIDData(Material M) {
        byte d = getData(M);
        return getID(M) + (d == 0 ? "" : ":" + d);
    }

    public static int getID(Material M) {
        int d = List.getID(M);
        if (d != -1) {
            return d;
        } else {
            int i = Bukkit.getUnsafe().toLegacy(M).getId();
            return i == 383 || i == 0 && (i != 0 || M != Material.AIR) ? 0 : i;
        }
    }

    public static byte getData(Material M) {
        byte d = List.getData(M);
        if (d != -1) {
            return d;
        } else {
            int i = Bukkit.getUnsafe().toLegacy(M).getId();
            return i == 383 || i == 0 && (i != 0 || M != Material.AIR) ? 0 : getData(M, i, Bukkit.getUnsafe().toLegacy(M));
        }
    }

    private static byte getData(Material M, int ID, Material O) {
        Iterator var4 = EnumSet.allOf(Material.class).iterator();

        while(var4.hasNext()) {
            Material m = (Material)var4.next();

            try {
                if (m.getId() == ID) {
                    for(byte i = 0; i <= 15; ++i) {
                        if (M.equals(Bukkit.getUnsafe().fromLegacy(new MaterialData(m, i)))) {
                            return i;
                        }
                    }
                }
            } catch (IllegalArgumentException var6) {
            }
        }

        return 0;
    }
}