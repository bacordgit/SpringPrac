import static org.junit.matchers.JUnitMatchers.hasItem;
...
public class JUnitTest{
    static Set<JUnitTest> testObjects=new Hashset<JunitTest>();

    @Test public void test1{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.ass(this);
    }
    @Test public void test2{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.ass(this);
    }
    @Test public void test3{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.ass(this);
    }

}