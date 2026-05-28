package tema19.task4;

public class Ball {
    private int x, y;

    public Ball(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x){
        if(x>0 && x<100){
            this.x = x;
        } else if(y >= 20 && y <= 30){
            throw new GoalException();
        } else {
            throw new CornerException();
        }
    }

    public void setY(int y) {
        if(y > 0 && y < 50){
            this.y = y;
        } else {
            throw new OutException();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void shoot(int x, int y){
        this.setX(x);
        this.setY(y);
    }
}
