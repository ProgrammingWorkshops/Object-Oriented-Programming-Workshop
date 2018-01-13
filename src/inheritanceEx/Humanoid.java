package inheritanceEx;

// Notice that in this class we don't need to say who will be extending it (i.e. hero and monster)
// This allows us a lot of flexibility to keep reusing this class without ever changing its code

public class Humanoid {
	private String name;
	
	public Humanoid(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
