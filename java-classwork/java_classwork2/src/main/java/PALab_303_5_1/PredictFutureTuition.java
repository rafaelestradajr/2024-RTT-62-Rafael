package PALab_303_5_1;

public class PredictFutureTuition {
    public static void main(String[] args) {
        // Initial tuition
        double initialTuition = 10000;

        // Desired tuition (double the initial tuition)
        double desiredTuition = initialTuition * 2;

        // Tuition increase rate per year (7 percent)
        double increaseRate = 0.07;

        // Initialize the year counter
        int years = 0;

        // Calculate the number of years until the tuition doubles
        double currentTuition = initialTuition;
        while (currentTuition < desiredTuition) {
            currentTuition *= (1 + increaseRate); // Increase tuition by 7 percent
            years++; // Increment the year counter
        }

        // Print the result
        System.out.println(STR."It will take \{years} years for the tuition to double.");
    }
}

