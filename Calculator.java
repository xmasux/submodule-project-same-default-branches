public class Calculator {

    public int add(int a, int b) {
    	// new branch one
    	// new branch two
    	// master
        int result = a;
        result += b;
        return result;
    }

    public int mul(int a, int b) {
    	// new branch one
        return a*b;
    }

    public int div(int a, int b) {
	// new branch three
        int result = a;
        result /= b;
        return result;
    }

    public int sub(int a, int b) {
	// master
        return a - b;
    }
}
