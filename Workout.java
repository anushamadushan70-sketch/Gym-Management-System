import java.util.ArrayList;
class Workout {
    private String workoutName;
    private ArrayList<String> exercises;

    // Constructor
    public Workout(String workoutName) {
        this.workoutName = workoutName;
        exercises = new ArrayList<>();
    }

    // Add Exercise
    public void addExercise(String exercise) {
        exercises.add(exercise);
    }

    // Display Workout
    public void displayWorkout() {
        System.out.println("Workout Plan : " + workoutName);

        if (exercises.isEmpty()) {
            System.out.println("No exercises added yet.");
        } else {
            System.out.println("Exercises:");
            for (int i = 0; i < exercises.size(); i++) {
                System.out.println((i + 1) + ". " + exercises.get(i));
            }
        }
    }
}