package Section12.HeavenlyChallenge;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon.getKey().getBodyType()== BodyTypes.MOON){
            return super.addMoon(moon);
        }else {
            return false;
        }
    }
}
