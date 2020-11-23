package app_07b_HashMap;

public class Country {

	String name;
	long population;
 
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
 
	@Override
	public String toString() {
		
		return name +"....."+ population;
	}
	
//	France                 
	   @Override                 // we can say i name.length() means  length if "India"  is   5
	public int hashCode() {              // so as  neam.length()%2==0;  it return false
		if(this.name.length()%2==0)       // so for "India"  95  as hashCode() will be returned
			return 31;                    // and some "India" and "Japan"  both will go in same bucket
		else                               
			return 95;                  //but "Russia" ,"France"   length()  return 6  so  if() execute
 	}                                  // and return 31 ;  so they both go in same bucket
	  
	@Override
	public boolean equals(Object obj) {
		Country other = (Country) obj;
		if (name.equalsIgnoreCase((other.name)))
			return true;
		return false;
	}
 
}