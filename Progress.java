class Progress {
    private String memberName;
    private int completedWorkouts;

    // Constructor
    public Progress(String memberName, int completedWorkouts) {
        this.memberName = memberName;
        this.completedWorkouts = completedWorkouts;
    }

    // Display Progress
    public void displayProgress() {
        System.out.println("Member Name         : " + memberName);
        System.out.println("Completed Workouts  : " + completedWorkouts);
    }
}