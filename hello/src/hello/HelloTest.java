package hello;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testNoArgs() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Hello hello = new Hello();
		hello.hello("");
		assertEquals("Hello Devin", outContent.toString());
	}
	
	@Test
	public void testArgs() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Hello hello = new Hello();
		hello.hello("test");
		assertEquals("Hello Test", outContent.toString());
	}

}
