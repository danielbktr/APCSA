// Made by Daniel Boktor on April 20, 2023
// This program uses OOP and two dimesnional arrays in 
// order to calculate the distance traveled by an object
// launched from a catapult witha  certain angle andd speed.
public class Catapult {
    private double velocity;
    private double degrees;
    private double distance;

    public Catapult(double v, double d){
        velocity=v;
        degrees=d;
    }

    public double calcDistance(){
        distance  = (Math.pow(this.velocity, 2) * Math.sin(2*Math.toRadians(this.degrees))/9.81);
        return distance;
    }

    public double getVelocity(){
        return velocity;
    }
    public double getDegrees(){
        return degrees;
    }
    public double getDistance(){
        return distance;
    }
}
