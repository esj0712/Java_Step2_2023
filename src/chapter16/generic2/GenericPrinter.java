package chapter16.generic2;

public class GenericPrinter<J> {

	private J material;

	public J getMaterial() {
		return material;
	}

	public void setMaterial(J material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}

}
