package oops_Concepts;

public abstract class Flipkart implements Amazon {

	public abstract void sell();

	@Override
  public void buy() {
		
		System.out.println("Here you acn buy this");
	}

		
	}

