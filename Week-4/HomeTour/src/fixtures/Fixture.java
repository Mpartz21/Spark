package fixtures;

public abstract class Fixture {
	public Fixture(String name2, String shortDescription2, String longDescription2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
//Short name/ title for the fixture
	String shortDescription;
//	a one-sentence-long description of a fixture
	String longDescription;
//	a paragraph-long description of the thing, displayed when the player investigates the fixture
//	thoroughly looks at it or enters a room

}
