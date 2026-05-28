package tema19.task4;

public class Game {
    private String leftTeam, rightTeam;
    private int leftTeamGoals, rightTeamGoals, cornerCount, outCount;
    private Ball ball;
    private CoordinateGenerator coordinateGenerator;

    public Game(String leftTeam, String rightTeam) {
        this.leftTeam = leftTeam;
        this.rightTeam = rightTeam;
        this.rightTeamGoals = 0;
        this.leftTeamGoals = 0;
        this.cornerCount = 0;
        this.outCount = 0;
        this.coordinateGenerator = new CoordinateGenerator();
    }

    public void simulate(){
        this.ball = new Ball(50, 25);
        for(int i = 0; i < 1000; i++){
            System.out.println("Lovitura #" + (i+1) + ". ");
            Ball oldBall = new Ball(this.ball.getX(), this.ball.getY());
            int tempX = coordinateGenerator.generateX();
            int tempY = coordinateGenerator.generateY();
            try {
                this.ball.shoot(tempX, tempY);
            } catch (GoalException e){
                System.out.print("\tMingea e pe pozitia (" + tempX + ',' + tempY + "). GOAL! echipei \"");
                if(tempX <=0){
                    this.rightTeamGoals++;
                    System.out.print(leftTeam);
                } else {
                    System.out.print(rightTeam);
                    this.leftTeamGoals++;
                }
                this.ball = new Ball(50, 25);
                System.out.println("\". Scor: " + leftTeamGoals + ':' + rightTeamGoals + ". Mingea e inlocuita cu una noua: (" + this.ball.getX() + ',' + this.ball.getY() + ')');
            } catch (OutException e){
                outCount++;
                this.ball = new Ball(oldBall.getX(), oldBall.getY());
                System.out.println("\tOUT! Mingea (" + tempX + ',' + tempY + ") se inlocuieste cu (" + this.ball.getX() + ',' + this.ball.getY() + ").");
            } catch (CornerException e){
                cornerCount++;
                if(tempX <= 50){
                    this.ball = new Ball(1, tempY < 25 ? 1 : 49);
                } else {
                    this.ball = new Ball(49, tempY < 25 ? 1 : 49);
                }
                System.out.println("\tCORNER! Mingea (" + tempX + ',' + tempY + ") se inlocuieste cu (" + this.ball.getX() + ',' + this.ball.getY() + ").");
            }
            System.out.println('\t' + getShootInfo());
        }
    }

    public String getShootInfo(){
        return leftTeam + " - " + rightTeam + " : Ball is at coordinates (" + ball.getX() + ',' + ball.getY() + ")";
    }

    @Override
    public String toString() {
        return "Game:\n" +
                leftTeam + "→" + leftTeamGoals + " | " +
                rightTeamGoals + "←" + rightTeam + '\n' +
                "Corners: " + cornerCount + '\n' +
                "Outs: " + outCount + '\n';
    }
}
