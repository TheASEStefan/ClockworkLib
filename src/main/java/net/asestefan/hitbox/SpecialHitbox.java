package net.asestefan.hitbox;

/**
 * @Author = ASEStefan
 * @Disclaimer = Used to create special mob hitboxes.
 */
public class SpecialHitbox {
    private final float pWidth;
    private final float pHeight;
    private final boolean pFireImmune;
    private final int pUpdateInterval;
    private final String pBuild;
    public SpecialHitbox(float pWidth, float pHeight, boolean pFireImmune, int pUpdateInterval, String pBuild) {
        this.pWidth = pWidth;
        this.pHeight = pHeight;
        this.pFireImmune = pFireImmune;
        this.pUpdateInterval = pUpdateInterval;
        this.pBuild = pBuild;
    }

    public SpecialHitbox getSpecialHitbox(float pWidth, float pHeight, boolean pFireImmune, int pUpdateInterval, String pBuild) {
        SpecialHitbox specialHitbox = new SpecialHitbox(pWidth, pHeight, pFireImmune, pUpdateInterval, pBuild);

        return specialHitbox;
    }

    public float getWidth() {
        return this.pWidth;
    }

    public float getHeight() {
        return this.pHeight;
    }
    public boolean getFireImmune() {
        return this.pFireImmune;
    }
    public int getUpdateInterval() {
        return this.pUpdateInterval;
    }
    public String getBuild() {
        return this.pBuild;
    }
}
