package lab3.prob1;

public class Person {

	private String name;

	public Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null) return false;
		if (!(aPerson instanceof Person)) return false;
		Person p = (Person) aPerson;
		return this.name.equals(p.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
