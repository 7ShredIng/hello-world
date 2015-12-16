public class HelloWorld {
	public static void main(String[] args) {
        printOutput();
        System.out.println(addition(1,1));
    }
	
	public static void printOutput() {
		System.out.println("Hello World.");
	}

	public static int addition(int value1, int value2) {
		return value1 + value2;
	}
}
