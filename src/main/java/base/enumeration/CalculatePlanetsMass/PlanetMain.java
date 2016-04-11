package base.reflection.enumeration.CalculatePlanetsMass;

/**
 * Created by MaMingJiang on 2016/4/8.
 */
public class PlanetMain {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.getSurfaceGravity();

        for(Planet p : Planet.values()) {
            System.out.printf("The weight on %s is %f %n",p,p.getSurfaceGravity());
        }
    }
}
