import java.text.ParseException;

public class Planetarium
{

	public static void main(String[] args) throws ParseException  {
		System.out.println("Planetarium");
		System.out.println("***************");
		
			String mss[]={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"," Pluto"};
			LY sun1=new LY(0.0);
			LY sun2=sun1.toLY1();
			SolarMass sunsm=new SolarMass(1.0);
			SolarMass sunsm1=sunsm.toSolarMass1();
			MainSequence sun=new MainSequence("sun","Our Sun",Star.SpectralType.G,-26.5,4.82,sun2,mss,sunsm1);
		
	
			String me[]={" "};
			AU m1=new AU(0.39);
			AU x=m1.toAU1();
			EarthDay ms=new EarthDay(58.65);
			EarthDay msd=ms.toEarthDay();
			EarthDay mop=new EarthDay(87.97);
			EarthDay emop=mop.toEarthDay();
			EarthMass mem=new EarthMass(0.06);
			EarthMass mem1=mem.toEarthMass1();
			MicroSun mrms=new MicroSun(0.166);
			MicroSun mrms1=mrms.toMicroSun1();
			TerrestrialPlanets m = new TerrestrialPlanets("Mercury", x,msd,emop, false,0,me,false,mem1,mrms1); 
		
			String ve[]={" "};
			AU v1=new AU(0.72);
			AU y=v1.toAU1();
			EarthDay vs=new EarthDay(243.1);
			EarthDay vsd=vs.toEarthDay();
			EarthDay vop=new EarthDay(224.7);
			EarthDay evop=vop.toEarthDay();
			EarthMass vem=new EarthMass(0.82);
			EarthMass vem1=vem.toEarthMass1();
			MicroSun vrms=new MicroSun(2.447);
			MicroSun vrms1=vrms.toMicroSun1();
			TerrestrialPlanets v = new TerrestrialPlanets("Venus", y,vsd ,evop,false, 0,ve,false,vem1,vrms1); 
			
			String ea[]={"Moon"};
			AU e1=new AU(1.0);
			AU z=e1.toAU1();
			EarthDay es=new EarthDay(1.0);
			EarthDay esd=es.toEarthDay();
			EarthDay eop=new EarthDay(365.265);
			EarthDay eoop=eop.toEarthDay();
			EarthMass eem=new EarthMass(1);
			EarthMass eem1=eem.toEarthMass1();
			MicroSun erms=new MicroSun(3.003);
			MicroSun erms1=erms.toMicroSun1();
			TerrestrialPlanets e = new TerrestrialPlanets("Earth",z, esd, eoop,false,1,ea,false,eem1,erms1); 
			
			String ear[]={"Phobos", "Deimos"};
			AU ma1=new AU(1.524);
			AU a=ma1.toAU1();
			EarthDay mas=new EarthDay(1.026);
			EarthDay masd=mas.toEarthDay();
			EarthDay maop=new EarthDay(687.0);
			EarthDay maoop=maop.toEarthDay();
			EarthMass maem=new EarthMass(0.11);
			EarthMass maem1=maem.toEarthMass1();
			MicroSun marms=new MicroSun(0.3227);
			MicroSun marms1=marms.toMicroSun1();
			TerrestrialPlanets ma = new TerrestrialPlanets("Mars", a,masd ,maoop, false,2,ear,true,maem1,marms1); 
		
			String ju[]={"Ganymede", "Callisto", "Io"};
			AU j1=new AU(58.5);
			AU j2=j1.toAU1();
			EarthDay js=new EarthDay(0.41);
			EarthDay jsd=js.toEarthDay();
			EarthDay jop=new EarthDay(4332.71);
			EarthDay juop=jop.toEarthDay();
			EarthMass jem=new EarthMass(317.8);
			EarthMass jem1=jem.toEarthMass1();
			MicroSun jrms=new MicroSun(954.792);
			MicroSun jrms1=jrms.toMicroSun1();
			GasGaint j = new GasGaint("Jupiter", j2,jsd , juop, true,67,ju,true,jem1,jrms1); 
			
			String sat[]={"Titan", "Rhea", "Iapetus"};
			AU sa1=new AU(5.203);
			AU sa2=sa1.toAU1();
			EarthDay sas=new EarthDay( 0.426);
			EarthDay sasd=sas.toEarthDay();
			EarthDay saop=new EarthDay(10759.5);
			EarthDay satop=saop.toEarthDay();
			EarthMass saem=new EarthMass(95.2);
			EarthMass saem1=saem.toEarthMass1();
			MicroSun sarms=new MicroSun(285.866);
			MicroSun sarms1=sarms.toMicroSun1();
			GasGaint sa = new GasGaint("Saturn", sa2,sasd,satop ,true,62,sat,true,saem1,sarms1); 
			
			AU ur1=new AU(19.19);
			AU ur2=ur1.toAU1();
			EarthDay urs=new EarthDay(0.717);
			EarthDay ursd=urs.toEarthDay();
			EarthDay urop=new EarthDay(30685.0);
			EarthDay uraop=urop.toEarthDay();
			EarthMass uem=new EarthMass(14.6);
			EarthMass uem1=uem.toEarthMass1();
			MicroSun urms=new MicroSun(43.662);
			MicroSun urms1=urms.toMicroSun1();
			String u[]={"Titania", "Oberon", "Umbriel"};
			GasGaint ur = new GasGaint("Uranus",ur2,ursd ,uraop ,true,24,u,false,uem1,urms1); 
			
			AU nep1=new AU(30.06);
			AU nep2=nep1.toAU1();
			EarthDay ns=new EarthDay(0.671);
			EarthDay nsd=ns.toEarthDay();
			EarthDay nop=new EarthDay(60190.0);
			EarthDay nop1=nop.toEarthDay();
			EarthMass nem=new EarthMass(17.2);
			EarthMass nem1=nem.toEarthMass1();
			MicroSun nms=new MicroSun(51.514);
			MicroSun nms1=nms.toMicroSun1();
			String nep[]={"Triton"," Proteus", "Nereid"};
			GasGaint n = new GasGaint("Neptune",nep2,nsd ,nop1 ,true,14,nep,false,nem1,nms1); 	
			
			AU p1=new AU(39.53);
			AU p2=p1.toAU1();
			EarthDay pls=new EarthDay(6.386);
			EarthDay plsd=pls.toEarthDay();
			EarthDay plop=new EarthDay(90800.0);
			EarthDay pluop=plop.toEarthDay();
			EarthMass pem=new EarthMass(0.0022);
			EarthMass pem1=pem.toEarthMass1();
			MicroSun prms=new MicroSun(0.00740);
			MicroSun prms1=prms.toMicroSun1();
			String pl[]={"Charon", "Nix","Hydra"};
			DwarfPlanet p = new DwarfPlanet("Pluto",p2 ,plsd ,pluop , true,5,pl,false,pem1,prms1); 
			
			String si[]={" "};
			LY si1=new LY(8.6);
			LY si2=si1.toLY1();
			SolarMass sms=new SolarMass(2.02);
			SolarMass sms1=sms.toSolarMass1();
			MainSequence mssi=new MainSequence("Sirius","Alpha Canis Majoris",Star.SpectralType.A,-1.46,1.43,si2,si,sms1);
			
			String al[]={" "};
			LY al1=new LY(37.0);
			LY al2=al1.toLY1();
			SolarMass alsm=new SolarMass(3.17);
			SolarMass alsm1=alsm.toSolarMass1();
			Giant algol=new Giant("Algol","Alpha Boötis",Star.SpectralType.K,2.12,-0.1,al2,al,Giant.Giantness.SUB_GAINT,alsm1);
		
			
		
			String gs[]={" "};
			LY ar1=new LY(93.0);
			SolarMass arsm=new SolarMass(1.1);
			SolarMass arsm1=arsm.toSolarMass1();
			Giant ar=new Giant("Arcturus","Alpha Boötis",Star.SpectralType.K,-0.04,-0.3,ar1,gs,Giant.Giantness.GAINT,arsm1);
		
			
			String sn[]={" "};
			LY san1=new LY(163000.0);
			LY san2=san1.toLY1();
			SolarMass sandsm=new SolarMass(20);
			SolarMass sandsm1=sandsm.toSolarMass1();
			SuperNova Sanduleak=new SuperNova("Sanduleak - 69 - 202","Supernova 1987A", Star.SpectralType.B,2.9,-15.6,san2,sn,"20/05/1987",sandsm1,SuperNova.SuperNovaType.II);
			
			
			CelestialVisitors hc=new CelestialVisitors("Halley's Commet", true, "01/01/1986", "01/01/2061");
			
			CelestialVisitors gem=new CelestialVisitors("Geminids", true, "12/13/2016", "12/13/2017");
		
			AstroEntity[] entities = {sun,m,v,e,ma,j, sa,ur,n,p,mssi,algol,ar,Sanduleak,hc,gem};
			for (AstroEntity entity : entities) {
				System.out.println(entity.getFactualSummary());
			}
			
	}
}
