package lab9.prob1.business;

import java.io.Serializable;

final public class Author extends Person implements Serializable {
	private String bio;
	public String getBio() {
		return bio;
	}


	@Override
	public String toString() {
		return "Author{" +
				"bio='" + bio + '\'' +
				'}';
	}

	public Author(String f, String l, String t, Address a, String bio) {
		super(f, l, t, a);
		this.bio = bio;
	}

	private static final long serialVersionUID = 7508481940058530471L;

}
