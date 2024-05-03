package net.asestefan.hitbox;


/**
 * @Author = ASEStefan
 * @Disclaimer = Used to create mob hitboxes.
 */
public class Hitbox {

    private final float width;
    private final float height;

    public Hitbox(float width, float height) {
        this.width = width;
        this.height = height;
    }


    public Hitbox getHitbox(float width, float height) {
        Hitbox hitbox = new Hitbox(width, height);

        return hitbox;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }




}
