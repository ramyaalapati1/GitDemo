package rahulshettyacademy.coreJava;



public class Sample {
	int i;
	static final int j=10;
	public Sample(int i)
	{
		this.i = i;
		
	}
	
	public static void x() {
		System.out.println(Sample.class);
		
	}
	
	public void y() {
		System.out.println("Sample");
	}
	
	public static void main(String[] args) {
		Sample s = new SampleChild(90);
		System.out.println(s.i);
		System.out.println(Sample.j);
		Sample s1 = new Sample(100);
		System.out.println(s1.i);
		System.out.println(s1);
		
		
	}

	public String toString() {
		return "I am Sample Object";
	}
	

}


class SampleChild extends Sample {

	public SampleChild(int i) {
		super(i);
		
	}
	public void y() {
		System.out.println("SampleChild");
	}
	
	public static void x() {
		System.out.println(SampleChild.class.getName());
		
	}
	public String toString() {
		return "I am Sample Child Object";
	}
}
