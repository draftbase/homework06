package task2;

public class Point {
    private int pointX;
    private int pointY;

    Point () {

    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public String whichQuarter(){
        if (pointX > 0 && pointY > 0) {
            return "I";
        } else if (pointX < 0 && pointY > 0) {
            return "II";
        } else if (pointX < 0 && pointY < 0) {
            return "III";
        } else if (pointX > 0 && pointY < 0) {
            return "IV";
        } else {
            return "(nie można okreścilć jednoznacznie)";
        }
    }
}
