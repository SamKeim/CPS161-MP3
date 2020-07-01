package string_methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStringMethodsTest {
	// COUNT OCCURRENCES STRING
	@Test
	void testCountOccurrences() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Apples Apples Apples");
		assertEquals(3,msm.countOccurrences("Appl"));
	}

	@Test
	void testCountOccurrencesBig() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Aardvarks get big and bigger as You feed them big and bigger\r\n" + 
				"ants who Feed on apples");
		assertEquals(4, msm.countOccurrences("big"));
	}
	
	// COUNT OCCURRENCES CHAR
	@Test
	void testCountOccurrencesCharA() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Apples Apples Apples");
		assertEquals(3,msm.countOccurrences('A'));
	}

	@Test
	void testCountOccurrencesCharB() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Aardvarks get big and bigger as You feed them big and bigger\r\n" + 
				"ants who Feed on apples");
		assertEquals(7, msm.countOccurrences('a'));
	}
	
	// COUNT UPPERCASE LETTERS
	@Test
	void testCountUpperCaseLetters() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Apples Apples Apples");
		assertEquals(3,msm.countUpperCaseLetters());
	}

	@Test
	void testCountUpperCaseLettersB() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Aardvarks get big and bigger as You feed them big and bigger\r\n" + 
				"ants who Feed on apples");
		assertEquals(3, msm.countUpperCaseLetters());
	}		
	// COUNT LOWERCASE LETTERS
	@Test
	void testCountLowerCaseLetters() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Apples Apples Apples");
		assertEquals(15,msm.countLowerCaseLetters());
	}

	@Test
	void testCountLowerCaseLettersB() {
		MyStringMethods msm = new MyStringMethods();
		msm.setString("Aardvarks get big and bigger as You feed them big and bigger\r\n" + 
				"ants who Feed on apples");
		assertEquals(65, msm.countLowerCaseLetters());
	}	
}
