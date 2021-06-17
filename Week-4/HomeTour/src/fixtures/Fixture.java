package fixtures;

public abstract class Fixture {
	private String name;
//Short name/ title for the fixture
	private String shortDescription;
//	a one-sentence-long description of a fixture
	private String longDescription;
//	a paragraph-long description of the thing, displayed when the player investigates the fixture
//	thoroughly looks at it or enters a room
	public Fixture(String name2, String shortDescription2, String longDescription2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.shortDescription = shortDescription2;
		this.longDescription =longDescription2;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return this.shortDescription;
	}
	public void setShortDescription(String description) {
		this.shortDescription = description;
	}
	public String getLongDescription() {
		return this.longDescription;
	}
	public void setLongDescription(String description) {
		this.longDescription = description;
	}
	

}
