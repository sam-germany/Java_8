package app_07ba_HashMap;


// HashMap sorting by keys
public class Country implements Comparable {
 
	 String name;
	 long id;

	 public Country(String name, long id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(Object o) {
		Country c = (Country)o;
		return this.getName().compareTo(c.getName());
	}
}
