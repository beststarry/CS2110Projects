package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void personAndNameTest() {
		// test for a person's constructor
		// test for name(),birthYear(),birthMonth() and birthDay()

		// test for a new person Kurt
		Person kurt = new Person("Kurt",1999,4,12);
		assertEquals("Kurt", kurt.name());
		assertEquals(1999, kurt.birthYear());
		assertEquals(4, kurt.birthMonth());
		assertEquals(12, kurt.birthDay());
		
		// test for a new person Ezra
		Person ezra = new Person("Ezra",1807,1,11);
		assertEquals("Ezra", ezra.name());
		assertEquals(1807, ezra.birthYear());
		assertEquals(1, ezra.birthMonth());
		assertEquals(11, ezra.birthDay());
		
	    
	}
	
	@Test
	void motherTest() {
		
		// test for methods mother() and setMother()
		Person kurt = new Person("Kurt",1999,4,12);
		Person daisy = new Person("Daisy",1975,9,8);
		kurt.setMother(daisy);
		assertEquals(daisy, kurt.mother());
		assertEquals(daisy.numChildren(),1);
		
	}
	
	@Test
	void fatherTest() {
		
		// test for methods father() and setFather()
		Person kurt = new Person("Kurt",1999,4,12);
		Person alan = new Person("Alan",1969,21,11);
		kurt.setFather(alan);
		assertEquals(alan, kurt.father());
		assertEquals(alan.numChildren(),1);
	}

	
	@Test
	void numChildrenTest() {
		
	}
}
