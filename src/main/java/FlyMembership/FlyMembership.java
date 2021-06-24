package FlyMembership;

public class FlyMembership {

    // Our Private data Variables
    // Stores the points
    private int points;
    // Status variable
    private int status;
    // Checks if the customer is flying in or out of europe
    private boolean europe;
    // Variable to check if customer is allowed Priority Boarding
    private boolean priorityBoarding;

    // ------------Constructors ------------
    // Default constructor
    public FlyMembership() {

    }

    // Overload the constructor, takes the status in the parameters
    public FlyMembership(int status) {
        this.status = status;
    }

    // Overload the constructor, takes the status and europe travel in the
    // parameters
    public FlyMembership(int status, boolean europe) {
        this.status = status;
        this.europe = europe;
    }

    // ------------Getters and setters ------------

    // method to pass the membership status from the user
    public void setStatus(int status) {
        this.status = status;
    }

    // method to pass if the user is travelling in europe
    public void setEuropeTravel(boolean europe) {
        this.europe = europe;
    }

    // get the points
    public int getPoints() {
        return points;
    }

    // get if pirority boarding is allowed
    public String getPirorityBoarding() {
        if (priorityBoarding) {
            return "Yes";
        }
        return "No";
    }

    // ------------- public methods-------------

    // This method does the processing
    public void calculateRewards() {

        // If Membership status is Green
        if (status == 1) {
            // if user travelled in europe
            if (europe == true) {
                points = points + 10;
            } else {
                points = points + 20;
            }
            // If Membership status is gold
        } else if (status == 2) {
            // if user travelled in europe
            if (europe == true) {
                points = points + 30;
            } else {
                points = points + 50;
                priorityBoarding = true;
            }
            // If Membership status is platiumn
        } else if (status == 3) {
            // if user travelled in europe
            if (europe == true) {
                points = points + 70;
            } else {
                points = points + 90;
            }
            priorityBoarding = true;
        }
    }

}