package lab3.prob1;

public class PersonWithJob {

	private Person person;
	private double salary;

	public PersonWithJob(String name, double salary) {
		this.person = new Person(name);
		this.salary = salary;
	}

	public String getName() {
		return person.getName();
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof PersonWithJob)) return false;
		PersonWithJob other = (PersonWithJob) obj;
		return this.person.equals(other.person) && this.salary == other.salary;
	}

	@Override
	public int hashCode() {
		return person.hashCode() + Double.hashCode(salary);
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);

		System.out.println("p1.equals(p2)? " + p1.equals(p2));
	}
}
