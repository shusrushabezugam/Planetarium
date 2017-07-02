import java.util.*;
public abstract class Planet extends AstroEntity
{


public AU distanceFromTheSun ;
protected EarthDay siderealDay;
protected EarthDay orbitalPeriod;
protected boolean hasRings;
protected int numberOfStatilites;
public String[] nameThreeBigSatellites;
public EarthMass relativeMassinem;
public MicroSun relativeMassinms;


public  String getFactualSummary()
{
	String name = super.getFactualSummary(); 
	String celestialClassification=getCelestialClassification();
	String cc1 = "celestialClassification = "+celestialClassification;
	String dFS = "Distance from Sun = "+distanceFromTheSun.au+" "+AU.getAstroUnit();
	String sd="siderealDay = "+siderealDay.ed +EarthDay.getEarthDay();
	String op="orbitalPeriod = "+orbitalPeriod.ed;
	String ntbs="largest Satellites"+getLargestSatellites();
	String rm="Relative Mass = "+relativeMassinem.rem+" "+EarthMass.getEarthMass()+" = "+relativeMassinms.relativeMass+" "+MicroSun.getMicroSun();
	String p = "\n"+name +"\n"+cc1+"\n"+dFS+"\n"+sd+"\n"+op+"\n"+ntbs+"\n"+rm+"\n";
	
	return  p;	
}

public Planet(String commonName,AU distanceFromTheSun2, EarthDay siderealDay, EarthDay orbitalPeriod, boolean hasRings, int numberOfStatilites,
		String[] nameThreeBigSatellites,EarthMass relativeMassinem,MicroSun relativeMassinms) 
{
	
	super(commonName);
	
	this.distanceFromTheSun = distanceFromTheSun2;
	this.siderealDay = siderealDay;
	this.orbitalPeriod = orbitalPeriod;
	this.hasRings =hasRings;
	this.numberOfStatilites = numberOfStatilites;
	this.nameThreeBigSatellites = nameThreeBigSatellites;
	this.relativeMassinms=relativeMassinms;
	this.relativeMassinem=relativeMassinem;
	
}

public abstract String getCelestialClassification();

protected String getLargestSatellites()
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

 