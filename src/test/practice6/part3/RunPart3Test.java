package test.practice6.part3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TypeFactoryTest.class,
        TypeTest.class,
        TypeMatcherTest.class,
        ReadDataUtilTest.class
})
public class RunPart3Test {
}
