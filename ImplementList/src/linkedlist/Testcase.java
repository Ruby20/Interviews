package linkedlist;
import static org.junit.Assert.*;
import org.junit.Test;;

public class Testcase {
	public void TestfindNonRep(String test){
		char  c = ' ';
		assertNotNull("assert output",c);
		assertEquals('b', DFS.findNonRepChar("abcdefghija"));
		System.out.println("print after 1st assert");
		assertEquals('h', DFS.findNonRepChar("hello")); 
		assertEquals('J', DFS.findNonRepChar("Java")); 
		assertEquals('i', DFS.findNonRepChar("simplest"));
		assertEquals(2,3);

		
	
	
	}
}
