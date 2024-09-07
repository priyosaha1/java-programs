import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set up game parameters
        int width = 20;
        int height = 10;
        char[][] board = new char[height][width];

        LinkedList<Point> snake = new LinkedList<>();
        snake.add(new Point(0, 0));
        int snakeLength = 1;

        Point food = generateFood(width, height, snake);

        char direction = 'R'; // Initially, the snake moves right

        boolean isGameOver = false;

        while (!isGameOver) {
            // Display the game board
            displayBoard(board, snake, food);

            // Get user input for the next direction
            char input = scanner.next().charAt(0);

            // Update the direction if it's a valid input
            if ((input == 'W' || input == 'w') && direction != 'D')
                direction = 'U'; // Up
            else if ((input == 'S' || input == 's') && direction != 'U')
                direction = 'D'; // Down
            else if ((input == 'A' || input == 'a') && direction != 'R')
                direction = 'L'; // Left
            else if ((input == 'D' || input == 'd') && direction != 'L')
                direction = 'R'; // Right

            // Move the snake
            Point newHead = moveSnake(snake, direction);

            // Check for collisions
            if (newHead.equals(food)) {
                snakeLength++;
                food = generateFood(width, height, snake);
            } else {
                snake.removeLast();
            }

            if (isGameOver(snake, width, height)) {
                isGameOver = true;
                System.out.println("Game Over! Your score: " + (snakeLength - 1));
            }
        }

        scanner.close();
    }

    private static Point moveSnake(LinkedList<Point> snake, char direction) {
        Point head = snake.getFirst();
        Point newHead = new Point(head);

        switch (direction) {
            case 'U':
                newHead.translate(0, -1);
                break;
            case 'D':
                newHead.translate(0, 1);
                break;
            case 'L':
                newHead.translate(-1, 0);
                break;
            case 'R':
                newHead.translate(1, 0);
                break;
        }

        snake.addFirst(newHead);
        return newHead;
    }

    private static void displayBoard(char[][] board, LinkedList<Point> snake, Point food) {
        // Initialize the board with empty spaces
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        // Place the snake on the board
        for (Point segment : snake) {
            int x = segment.x;
            int y = segment.y;
            board[y][x] = 'O'; // Snake body
        }

        // Place the food on the board
        int x = food.x;
        int y = food.y;
        board[y][x] = 'F'; // Food

        // Display the board
        System.out.println("Score: " + (snake.size() - 1));
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("WASD to move (Q to quit):");
    }

    private static boolean isGameOver(LinkedList<Point> snake, int width, int height) {
        Point head = snake.getFirst();

        // Check for collisions with walls
        if (head.x < 0 || head.x >= width || head.y < 0 || head.y >= height) {
            return true;
        }

        // Check for collisions with itself
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                return true;
            }
        }

        return false;
    }

    private static Point generateFood(int width, int height, LinkedList<Point> snake) {
        Random rand = new Random();
        Point food;

        do {
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            food = new Point(x, y);
        } while (snake.contains(food));

        return food;
    }
}
