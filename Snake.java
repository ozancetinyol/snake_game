import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {

    Random random = new Random();

    private int eatCount = 0;

    public List<Integer> getSnakeCoordinates() {

        int xSnake = random.nextInt(1, 8);
        int ySnake = random.nextInt(1, 8);

        List<Integer> snakeCoordinates = new ArrayList<>();

        snakeCoordinates.add(xSnake);
        snakeCoordinates.add(ySnake);

        return snakeCoordinates;

    }

    public int getEatCount() {
        return this.eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }

}