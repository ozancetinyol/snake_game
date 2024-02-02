import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Food {

    Random random = new Random();

    public List<Integer> getFoodCoordinates() {

        int foodCoordinateOne = random.nextInt(1, 8);
        int foodCoordinateTwo = random.nextInt(1, 8);

        List<Integer> foodCoordinates = new ArrayList<>();

        foodCoordinates.add(foodCoordinateOne);
        foodCoordinates.add(foodCoordinateTwo);

        return foodCoordinates;
    }

}
