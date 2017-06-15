
public abstract class Planet extends AstroEntity
{

public double siderealDay;
public double distanceFromTheSun ;
public double orbitalPeriod;
public int numberOfStatilites;
public String[] nameThreeBigSatellites;
public boolean hasRings;

public Planet()
{
	super();
}

public abstract String getFactualSummary();

public  String getCelestialClassification()
{
return "planet";	
}
}

 