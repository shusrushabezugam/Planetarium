import java.text.ParseException;

public class Planetarium
{

	public static void main(String[] args) throws ParseException  {
		System.out.println("Planetarium");
		System.out.println("***************");
		// TODO Auto-generated method stub
			String me[]={" "};
			TerrestrialPlanets m = new TerrestrialPlanets("Mercury", 0.39, 58.65, 87.97, false,0,me,false); 
			String mercury =m.getFactualSummary();
			System.out.println(mercury);
			String ve[]={" "};
			TerrestrialPlanets v = new TerrestrialPlanets("Venus", 0.72, 243.1, 224.7,false, 0,ve,false); 
			String venus =v.getFactualSummary();
			System.out.println(venus);
			String ea[]={"Moon"};
			TerrestrialPlanets e = new TerrestrialPlanets("Earth", 1.0, 1.0, 365.265,false,1,ea,false); 
			String earth =e.getFactualSummary();
			System.out.println(earth);
			String ear[]={"Phobos", "Deimos"};
			TerrestrialPlanets ma = new TerrestrialPlanets("Mars", 1.524, 1.026, 687.0, false,2,ear,true); 
			String mars =ma.getFactualSummary();
			System.out.println(mars);
			String ju[]={"Ganymede", "Callisto", "Io"};
			GasGaint j = new GasGaint("Jupiter", 5.203, 0.41, 4332.71, true,67,ju,true); 
			String jupiter =j.getFactualSummary();
			System.out.println(jupiter);
			String sat[]={"Titan", "Rhea", "Iapetus"};
			GasGaint sa = new GasGaint("Saturn", 9.54, 0.426, 10759.5,true,62,sat,true); 
			String saturn =sa.getFactualSummary();
			System.out.println(saturn);
			String u[]={"Titania", "Oberon", "Umbriel"};
			GasGaint ur = new GasGaint("Uranus",19.19, 0.717, 30685.0,true,24,u,false); 
			String uranus =ur.getFactualSummary();
			System.out.println(uranus);
			String pl[]={"Charon", "Nix","Hydra"};
			DwarfPlanet p = new DwarfPlanet("Pluto", 39.53, 6.386, 90800.0, false,5,pl,false); 
			String pluto =p.getFactualSummary();
			System.out.println(pluto);
			CelestialVisitors hc=new CelestialVisitors("Halley's Commet", true, "01/01/1986", "01/01/2061");
			String halley=hc.getFactualSummary();
			String gs[]={" "};
			Gaint ar=new Gaint("Arcturus",Star.SpectralType.K,-0.04,-0.3,37.0,gs,Gaint.Gaintness.gaint);
			String arctrus=ar.getFactualSummary();
			String mss[]={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"," Pluto"};
			MainSequence sun=new MainSequence("sun",Star.SpectralType.G,-26.5,4.82,0.0,mss);
			String s=sun.getFactualSummary();
			String sn[]={" "};
			SuperNova Sanduleak=new SuperNova("Sanduleak - 69 - 202",Star.SpectralType.B,2.9,-15.6,163000.0,sn,"20/05/1987");
			String suno=Sanduleak.getFactualSummary();
			System.out.println(arctrus);
			
			System.out.println(arctrus);
			System.out.println(s);
			System.out.println(suno);
			System.out.println(halley);
			
	}
}
