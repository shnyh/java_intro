public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
        System.out.println("Part Two: " + calcPosition(gravity, fallingTime, initialVelocity, initialPosition) + " m.");
    }
    private static double calcPosition(double acceleration, double time, double initial_velocity, double initial_position) {
        return 0.5 * acceleration * time * time + initial_velocity * time+initial_position;
    }
}
