import java.util.Scanner;
import java.util.ArrayList;
public class MainMenu{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ArrayLists
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<Workout> workouts = new ArrayList<>();

        int option;

        do {

            // Main Menu
            System.out.println("\n===== GYM MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Member");
            System.out.println("2. Add Trainer");
            System.out.println("3. Create Workout Plan");
            System.out.println("4. Add Exercise to Workout");
            System.out.println("5. View Member Details");
            System.out.println("6. View Workout Plans");
            System.out.println("7. Track Progress");
            System.out.println("8. Exit");

            System.out.print("Enter your option: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {

                // Add Member
                case 1:

                    System.out.print("Enter Member Name: ");
                    String memberName = scan.nextLine();

                    System.out.print("Enter Member ID: ");
                    int memberId = scan.nextInt();

                    System.out.print("Enter Member Weight: ");
                    int weight = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Goal (cut/bulk): ");
                    String goal = scan.nextLine();

                    Member member = new Member(
                            memberName,
                            memberId,
                            weight,
                            goal
                    );

                    members.add(member);

                    System.out.println("Member added successfully!");
                    break;

                // Add Trainer
                case 2:

                    System.out.print("Enter Trainer Name: ");
                    String trainerName = scan.nextLine();

                    System.out.print("Enter Trainer ID: ");
                    int trainerId = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = scan.nextLine();

                    Trainer trainer = new Trainer(
                            trainerName,
                            trainerId,
                            specialization
                    );

                    trainers.add(trainer);

                    System.out.println("Trainer added successfully!");
                    break;

                // Create Workout Plan
                case 3:

                    System.out.print("Enter Workout Plan Name: ");
                    String workoutName = scan.nextLine();

                    Workout workout = new Workout(workoutName);

                    workouts.add(workout);

                    System.out.println("Workout plan created successfully!");
                    break;

                // Add Exercise
                case 4:

                    if (workouts.isEmpty()) {

                        System.out.println("No workout plans available.");

                    } else {

                        System.out.println("Available Workout Plans:");

                        for (int i = 0; i < workouts.size(); i++) {

                            System.out.println((i + 1) + ". Workout " + (i + 1));
                        }

                        System.out.print("Select Workout Number: ");
                        int workoutIndex = scan.nextInt();
                        scan.nextLine();

                        if (workoutIndex > 0 &&
                                workoutIndex <= workouts.size()) {

                            System.out.print("Enter Exercise Name: ");
                            String exercise = scan.nextLine();

                            workouts.get(workoutIndex - 1)
                                    .addExercise(exercise);

                            System.out.println(
                                    "Exercise added successfully!"
                            );

                        } else {

                            System.out.println(
                                    "Invalid workout selection."
                            );
                        }
                    }

                    break;

                // View Member Details
                case 5:

                    if (members.isEmpty()) {

                        System.out.println("No members available.");

                    } else {

                        System.out.println(
                                "\n===== MEMBER DETAILS ====="
                        );

                        for (Member m : members) {

                            m.displayDetails();

                            System.out.println(
                                    "-----------------------"
                            );
                        }
                    }

                    break;

                // View Workout Plans
                case 6:

                    if (workouts.isEmpty()) {

                        System.out.println(
                                "No workout plans available."
                        );

                    } else {

                        System.out.println(
                                "\n===== WORKOUT PLANS ====="
                        );

                        for (Workout w : workouts) {

                            w.displayWorkout();

                            System.out.println(
                                    "-----------------------"
                            );
                        }
                    }

                    break;

                // Track Progress
                case 7:

                    System.out.print("Enter Member Name: ");
                    String progressMember = scan.nextLine();

                    System.out.print("Enter Completed Workouts: ");
                    int completed = scan.nextInt();
                    scan.nextLine();

                    Progress progress = new Progress(
                            progressMember,
                            completed
                    );

                    System.out.println(
                            "\n===== PROGRESS TRACKING ====="
                    );

                    progress.displayProgress();

                    break;

                // Exit
                case 8:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid option!");
            }

        } while (option != 8);

        scan.close();
    }
}