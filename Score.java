public class Score {

    private int points;

    public Score() {
        this.points = 0;
    }

    public void addPoint() {
        this.points++;
    }

    public int getPoints() {
        return this.points;
    }
}