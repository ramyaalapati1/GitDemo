package rahulshettyacademy.coreJava;

//1. Final Class: Cannot be extended
final class ImmutableConfig {
    // 2. Final Variable: Cannot be changed once initialized
	final int i;
    final String URL = "https://example.com";
    
    public ImmutableConfig()
    {
		this.i = 0;
    	
    }
    // 3. Final Method: Cannot be overridden
    final void display() {
        System.out.println("URL: " + URL);
    }
}