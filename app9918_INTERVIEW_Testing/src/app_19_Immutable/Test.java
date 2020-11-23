package app_19_Immutable;

public final class Test {

	private final int id;
	private final String name;
	
	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
/*
The class must be declared as final (So that child classes can’t be created)
Data members in the class must be declared as private and final (So that we can’t change the
 value of it after object creation)
A parameterized constructor
Getter method for all the variables in it
No setters(To not have the option to change the value of the instance variable)


*/