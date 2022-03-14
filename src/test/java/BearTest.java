import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Cold Cammy", 20, 80.50);
    }
    @Test
    public void hasName(){
        assertEquals("Cold Cammy", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(20, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(80.50, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void readyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Skinny Simon", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
    }

}
