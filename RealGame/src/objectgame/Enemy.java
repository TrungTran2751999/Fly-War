package objectgame;

import mainGame.Screen;

import java.awt.*;

public class Enemy{
    private double x =100;
    private double y = 0;
    private double w = 100;
    private double h = 100;
    private double speed = 1;
    private BackGround backGround;
    private Rectangle collisionBoundEnemy;
    private Bullets bullets;
    public Enemy(){
        backGround = new BackGround(true);
        collisionBoundEnemy = new Rectangle((int) x, (int) y, (int) w, (int) h);
        bullets = new Bullets(true);
    };
    public void paintEnemy(Graphics g){
        g.drawRect((int) this.x, (int) this.y, (int) this.w, (int) this.h);
        enemyMove();
        if(bullets.haveCollision1(collisionBoundEnemy)){
            System.out.println("enemy-bulet1");
        }
        if(bullets.haveCollision2(collisionBoundEnemy)){
            System.out.println("enemy-bulet2");
        }
    }
    public void enemyMove(){
        double bgX = backGround.getPosX1();
        double bgW = backGround.getWidth();
        if(this.x + this.w >= bgX + bgW || this.x <= bgX){
            this.speed = -this.speed;
        }
        this.x+=this.speed;
        collisionBoundEnemy.setLocation((int) this.x, (int) this.y);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
