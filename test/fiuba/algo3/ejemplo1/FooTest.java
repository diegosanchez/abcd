package fiuba.algo3.ejemplo1;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FooTest {

	@Test
	public void doFooShouldReturnFoo(){
        Foo foo = new Foo();
        String result = foo.doFoo();
        Assert.assertEquals("Foo", result);
	}

    @Test
    public void doFooShouldReturnFooX() {
        HashMap<Integer, MiClase> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");


        assertEquals("a", map.get(1));


    }
	/*
	@Test
	public void doBarShouldReturnBar(){
        Foo foo = new Foo();
        String result = foo.doBar();
        Assert.assertEquals("Bar", result);
	}
	*/

}
