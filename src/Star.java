import java.util.Arrays;

public abstract class Star extends AstroEntity 
{
			public enum SpectralType{O,B,A,F,G,K,M};
			protected double apparentMagnitude;
			protected double absoluteMagnitude;
			protected double distanceFromTheSun;
			protected String[] planets;
			
			public abstract String getCelestialClassification();
			
			public String getFactualSummary()
			{
				String name =super.getFactualSummary(); 
				String celestialClassification=getCelestialClassification();
				String cc1 = "celestialClassification = "+celestialClassification;
				String dFS = "Distance from Sun = "+distanceFromTheSun+" light years";
				String sd="apparentMagnitude = "+apparentMagnitude;
				String op="absoluteMagnitude = "+absoluteMagnitude;
				String ntbs="Planets ="+getPlanets();
				String st  = "\n"+name +"\n"+cc1+"\n"+dFS+"\n"+sd+"\n"+op+"\n"+ntbs+"\n";	
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

		

			public Star(String commonName , SpectralType type,double apparentMagnitude,double absoluteMagnitude, double distanceFromTheSun, String[] planets)
			{
			super(commonName);
		
			this.apparentMagnitude = apparentMagnitude;
			this.absoluteMagnitude = absoluteMagnitude;
			this.distanceFromTheSun =distanceFromTheSun;
			this.planets = planets;
			}	

}

