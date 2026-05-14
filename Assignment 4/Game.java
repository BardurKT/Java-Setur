import java.util.Scanner;

// Main game class
public class Game {

    // Game board
    private Board board;

    // Goal object
    private Goal goal;

    // Constructor
    public Game() {

        board = new Board(4, 7);

        // Create robots
        Robot aa = new Robot(1, 1, "AA");
        Robot bb = new Robot(0, 0, "BB");
        Robot cc = new Robot(3, 3, "CC");

        // Create goal
        goal = new Goal(2, 2, "gg");

        // Add robots
        board.addRobot(aa);
        board.addRobot(bb);
        board.addRobot(cc);

        // Add goal
        board.addElement(goal);

        // Add outer frame
        board.addElement(new BoardFrame(4, 7));

        // Add walls
        board.addElement(new VerticalWall(1, 2, 2));
        board.addElement(new HorizontalWall(0, 3, 2));

        // Add teleporter
        board.addElement(new Teleporter(1, 5, 3, 0));
    }

    // Main game loop
    public void play() {

        Scanner scanner = new Scanner(System.in);

        int moves = 0;

        while (true) {

            // Spacing for cleaner console
            System.out.println("\n\n\n");

            // Show board
            board.show();

            System.out.println();
            System.out.println("Moves: " + moves);

            // Ask player for robot
            System.out.println("Choose robot:");
            String robotName = scanner.nextLine();

            Robot selected = null;

            for (Robot robot : board.robots()) {

                if (robot.getName().equalsIgnoreCase(robotName)) {

                    selected = robot;
                }
            }

            // Invalid robot
            if (selected == null) {
                continue;
            }

            // Ask player for direction
            System.out.println("Direction (w/a/s/d):");
            String input = scanner.nextLine();

            Direction direction = null;

            switch(input.toLowerCase()) {

                case "w":
                    direction = Direction.NORTH;
                    break;

                case "s":
                    direction = Direction.SOUTH;
                    break;

                case "a":
                    direction = Direction.WEST;
                    break;

                case "d":
                    direction = Direction.EAST;
                    break;
            }

            // Invalid direction
            if (direction == null) {
                continue;
            }

            // Move robot
            board.move(selected, direction);

            moves++;

            // Check win condition
            if (goal.gameOver(board.robots())) {

                board.show();

                System.out.println();
                System.out.println("YOU WIN!");

                break;
            }
        }
    }

    // Starts game
    public static void main(String[] args) {

        Game game = new Game();

        game.play();
    }
}