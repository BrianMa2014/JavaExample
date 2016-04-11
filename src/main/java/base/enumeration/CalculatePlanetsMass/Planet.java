package base.reflection.enumeration.CalculatePlanetsMass;

/**
 * Created by MaMingJiang on 2016/4/8.
 * 根据枚举提供的特性 计算物体在不同行星的质量
 */
public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.387e6),
    MARS(6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN(5.685e+26, 6.027e7),
    URANUS(8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);

    private final double mass;      // 行星质量
    private final double radius;    //行星半径
    private final double surfaceGravity;    //行星表面重力,计算公式: G * (mass/(radius * radius))  行星质量除以半径的平方 * G

    private static final double G = 6.67300E-11;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double getSurfaceWeigth(double mass){
        return mass * surfaceGravity;
    }
}
