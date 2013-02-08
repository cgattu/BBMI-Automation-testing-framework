import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class Example1 {
	
	public boolean multiply(int a ,  int b){
		return false;
	}
	public int add(int a,int b){
		return a+b;
	}

		 @Test
		 public void testMultiply() {
		  Example1 tester = new Example1();
		     assertTrue(tester.multiply(5,10));
		  //fail("Not yet implemented");
		 }
		 @Test
		 public void testAdd() {
		  Example1 mySecondClass = new Example1();
		  assertEquals("Result", 15, mySecondClass.add(10, 5));
		  //fail("Not yet implemented");
		 }
}
