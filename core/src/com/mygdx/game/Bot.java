package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
public class Bot {
    private Texture texture;
//    private Texture textureWeapon;
    private float x;
    private float y;
//    private float speed;
//    private float angle;
//    private float angleWeapon;
//    private Projectile projectile;
    private float scale;

    public Bot() {
        this.texture = new Texture("block.png");
        this.x = 500.0f;
        this.y = 500.0f;
        this.scale = 3.0f;
    }

    public void update_bot(float dt) {

    }
    public void render(SpriteBatch batch) {
        batch.draw(texture,500,500);
    }

    public void dispose() {
        texture.dispose();
//        projectile.dispose();

    }
}