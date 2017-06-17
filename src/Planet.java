import java.util.*;
public abstract class Planet extends AstroEntity
{


public double distanceFromTheSun ;
protected double siderealDay;
protected double orbitalPeriod;
protected boolean hasRings;
protected int numberOfStatilites;
public String[] nameThreeBigSatellites;

public  String getFactualSummary()
{
	String name = "Name = "+commonName; 
	String celestialClassification=getCelestialClassification();
	String cc1 = "celestialClassification = "+celestialClassification;
	String dFS = "Distance from Sun = "+distanceFromTheSun+" AU";
	String sd="siderealDay = "+siderealDay;
	String op="orbitalPeriod = "+orbitalPeriod;
	String ntbs="largest Satillites"+getLargestSatillites();
	String p = "\n"+name +"\n"+cc1+"\n"+dFS+"\n"+sd+"\n"+op+"\n"+ntbs+"\n";
	
	return  p;	
}

public Planet(String commonName, double distanceFromTheSun,double siderealDay, double orbitalPeriod, boolean hasRings, int numberOfStatilites,
		String[] nameThreeBigSatellites) {
	
	super(commonName);
	
	this.distanceFromTheSun = distanceFromTheSun;
	this.siderealDay = siderealDay;
	this.orbitalPeriod = orbitalPeriod;
	this.hasRings =hasRings;
	this.numberOfStatilites = numberOfStatilites;
	this.nameThreeBigSatellites = nameThreeBigSatellites;
	
}
public abstract String getCelestialClassification();

protected String getLargestSatillites()
{
	
	for(int i=0;i<nameThreeBigSatellites.length;i++)
	{
	if(nameThreeBigSatellites.length==0)
		System.out.println("none");
	else if(nameThreeBigSatellites.length>0||nameThreeBigSatellites.length==3)
		System.out.print("");
	}
String str = Arrays.toString(nameThreeBigSatellites);
return str;
}
}

 