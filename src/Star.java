import java.util.Arrays;

public abstract class Star extends AstroEntity 
{
			public enum SpectralType{O,B,A,F,G,K,M};
			public String constellationDesignation;
			protected double apparentMagnitude;
			protected double absoluteMagnitude;
			protected LY distanceFromTheSun;
			protected String[] planets;
			private SpectralType spectralType;
			public SolarMass relativeMass;
			
			public abstract String getCelestialClassification();
			
			public String getFactualSummary()
			{
				String name =super.getFactualSummary(); 
				String celestialClassification=getCelestialClassification();
				String cc1 = "celestialClassification = "+celestialClassification;
				String cd="constellationDesignation = "+constellationDesignation;
				String dFS = "Distance from Sun = "+distanceFromTheSun.ly;
				String sd="apparentMagnitude = "+apparentMagnitude;
				String op="absoluteMagnitude = "+absoluteMagnitude;
				String ntbs="Planets ="+getPlanets();
				String rm = "Relative Mass = "+relativeMass.relativeMass+" "+SolarMass.getSolarMass();
				String st  = "\n"+name +"\n"+cc1+"\n"+cd+"\n"+dFS+"\n"+sd+"\n"+op+"\n"+ntbs+"\n"+rm+"\n";	
				return st;
			}
			private String getPlanets()
			{
				// TODO Auto-generated method stub
				String planet = "";
				for(int i=1;i<planets.length;i++)
				{
					
					planet= planet + " " + planets[i];
						
				}
				String str = Arrays.toString(planets);
				return str;
			}

		

			public Star(String commonName ,String constellationDesignation,SpectralType type,double apparentMagnitude,double absoluteMagnitude, LY distanceFromTheSun, String[] planets,SolarMass relativeMass)
			{
			super(commonName);
			this.constellationDesignation=constellationDesignation;
			this.apparentMagnitude = apparentMagnitude;
			this.absoluteMagnitude = absoluteMagnitude;
			this.distanceFromTheSun =distanceFromTheSun;
			this.planets = planets;
			this.spectralType = type;
			this.relativeMass=relativeMass;
			}

			public SpectralType getSpectralType() {
				return spectralType;
			}

			public void setSpectralType(SpectralType spectralType) {
				this.spectralType = spectralType;
			}	

			
}

