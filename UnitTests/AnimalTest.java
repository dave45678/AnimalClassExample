import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	/*
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void BirdTest(){
				Bird b = new Bird();
		assertEquals("A Bird sleeps Test: ",b.sleep(),"A bird sleeps...");
	}
	@Test
	public void CatTest(){
		Cat c = new Cat();
		assertEquals("A Cat sleeps Test:",c.sleep(),"A cat sleeps...");
	}
	@Test
	public void DogTest(){
		fail("Not yet implemented");
	}
	

	
}
