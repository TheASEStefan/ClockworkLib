package net.asestefan.hitbox;

import net.asestefan.api.ClockworkLib;

import java.util.ArrayList;

/**
 * @Author = ASEStefan
 */
public class SpecialHitboxTypes {
    public static final SpecialHitbox SCREEN_SHAKE_HITBOX = new SpecialHitbox(1.0F, 1.0F, true, Integer.MAX_VALUE, ClockworkLib.MODID + ":screen_shake");
    public static final SpecialHitbox EXAMPLE = new SpecialHitbox(1.0F, 1.0F, true, 15, "yourmodid" + ":entity_name");

    public static ArrayList<SpecialHitbox> SPECIAL_BOXES = new ArrayList<SpecialHitbox>();

    public static void start() {
        SPECIAL_BOXES.add(SCREEN_SHAKE_HITBOX);
        SPECIAL_BOXES.add(EXAMPLE);
    }

    public static ArrayList<SpecialHitbox> getSpecialBoxes() {
        return SPECIAL_BOXES;
    }
}
