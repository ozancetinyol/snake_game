import java.util.List;

public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake();
        Food food = new Food();

        while (true) {
            List<Integer> snakeList = snake.getSnakeCoordinates();
            List<Integer> foodList = food.getFoodCoordinates();

            if (snakeList.get(0) == foodList.get(0) && snakeList.get(1) == foodList.get(1)) {
                snake.setEatCount(snake.getEatCount() + 1);
                if (snake.getEatCount() == 5) {
                    System.out.println("Well done! Snake ate food " + snake.getEatCount() + " times and he is adult now. GAME OVER");
                    break;
                }else {
                    System.out.println("Snake is eating food");
                }
            }
        }
    }
}