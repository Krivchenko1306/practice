package test.practice6.part4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.practice6.part3.ReadDataUtilTest;
import test.practice6.part3.TypeFactoryTest;
import test.practice6.part3.TypeMatcherTest;
import test.practice6.part3.TypeTest;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ParserTest.class
})
public class RunPart4Test {
}
