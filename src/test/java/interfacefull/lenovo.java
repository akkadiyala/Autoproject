package interfacefull;

public class lenovo implements laptop{
	
	//	- The type laptop cannot be the superclass of lenovo; a superclass must be a class
	//- Breakpoint:lenovo

	@Override
	public void copy() {
	
		System.out.println("lenovo copy");
	}

	@Override
	public void paste() {
		System.out.println("lenovo paste");
	}

	@Override
	public void cut() {
	
		System.out.println("lenovo cut");
	}

	@Override
	public void keyword() {
		
		System.out.println("lenovo keyword");
		
	}
	public void memory() {
		
		System.out.println("lenovo memory");
		
	}
public void audio() {
		
		System.out.println("lenovo audio");
		
	}

}
