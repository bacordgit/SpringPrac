import static.org.hamcrest.CoreMatchers.nullValue;
import static.org.hamcrest.CoreMatchers.either;
import static.org.junit.Assert.assertTrue;
...
@Runwith(SpringJUNit4ClassRunner.class)
@ContextConfiguration
public class JUnitTest{
    @Autowired ApplicationContext context;

    static Set<JUnitTest> testObjects=new Hashset<JunitTest>();
    static AppliationContext contextObject=null;

    @Test public void test1{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.add(this);
        assertThat(contextObject==null | contextObject==this.context,is(true));
        contextObject=this.context;
    }
    @Test public void test2{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.add(this);
        asserTrue(contextObject==null | contextObject==this.context,is(true));
        contextObject=this.context;
    }
    @Test public void test3{
        assertThat(testObjects,not(hasItem(this)));
        testObjects.add(this);
        assertThat(contextObject,either(is(nullValue())).or(is(this.context)));
        contextObject=this.context;
    }

}