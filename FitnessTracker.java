import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FitnessTracker {

    private final User user;
    private final ArrayList<Exercise> exercises;

    public FitnessTracker(User user) {
        this.user = user;
        this.exercises = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Fitness Tracker!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        User user = new User(name, weight);
        FitnessTracker tracker = new FitnessTracker(user);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Log exercise");
            System.out.println("2. View exercise history");
            System.out.println("3. Calculate calories burned");
            System.out.println("4. Set fitness goal");
            System.out.println("5. View fitness goal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tracker.logExercise();
                    break;
                case 2:
                    tracker.viewExerciseHistory();
                    break;
                case 3:
                    tracker.calculateCaloriesBurned();
                    break;
                case 4:
                    tracker.setFitnessGoal();
                    break;
                case 5:
                    tracker.viewFitnessGoal();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void logExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exercise type (e.g., running, swimming): ");
        String type = scanner.nextLine();
        System.out.print("Enter duration (minutes): ");
        int duration = scanner.nextInt();

        Exercise exercise = new Exercise(type, duration, new Date());
        exercises.add(exercise);

        System.out.println("Exercise logged successfully!");
    }

    private void viewExerciseHistory() {
        if (exercises.isEmpty()) {
            System.out.println("No exercises logged yet!");
            return;
        }

        System.out.println("Exercise History:");
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }

    private void calculateCaloriesBurned() {
        if (exercises.isEmpty()) {
            System.out.println("No exercises logged yet!");
            return;
        }

        double totalCalories = 0;
        for (Exercise exercise : exercises) {
            totalCalories += exercise.calculateCaloriesBurned(user.getWeight());
        }

        System.out.println("Total calories burned: " + totalCalories);
    }

    private void setFitnessGoal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your fitness goal (e.g., lose 5kg, run 10km): ");
        String goal = scanner.nextLine();

        user.setFitnessGoal(goal);

        System.out.println("Fitness goal set successfully!");
    }

    private void viewFitnessGoal() {
        if (user.getFitnessGoal() == null) {
            System.out.println("No fitness goal set yet!");
            return;
        }

        System.out.println("Your fitness goal: " + user.getFitnessGoal());
    }
}

class User {
    private final String name;
    private final double weight;
    private String fitnessGoal;

    public User(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }
}

class Exercise {
    private String type;
    private int duration;
    private Date date;

    public Exercise(String type, int duration, Date date) {
        this.type = type;
        this.duration = duration;
        this.date = date;
    }

    // Example implementation of calculateCaloriesBurned method
    public double calculateCaloriesBurned(double userWeight) {
        // Replace this with your actual calculation logic
        // For example, a simple calculation based on duration and weight
        double caloriesPerMinute = 5.0; // Adjust this value based on your calculation
        return caloriesPerMinute * duration * userWeight;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "type='" + type + '\'' +
                ", duration=" + duration +
                ", date=" + date +
                '}';
    }
}
