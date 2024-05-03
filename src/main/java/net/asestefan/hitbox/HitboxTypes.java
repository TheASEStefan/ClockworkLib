package net.asestefan.hitbox;


import java.util.ArrayList;

/**
 * @Author = ASEStefan
 */
public class HitboxTypes {
    public static final Hitbox BIPED = new Hitbox(1.25F, 1.8F);
    public static final Hitbox CUBE = new Hitbox(1.6F, 1.6F);
    public static final Hitbox NULL = new Hitbox(0.0F, 0.0F);
    public static ArrayList<Hitbox> BOXES = new ArrayList<Hitbox>();

    public static void start() {
        BOXES.add(BIPED);
        BOXES.add(CUBE);
        BOXES.add(NULL);
    }

    public static ArrayList<Hitbox> getBoxes() {
        return BOXES;
    }
}

