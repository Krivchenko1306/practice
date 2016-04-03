package test.practice6.part2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ghost on 30.03.2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses
        ({
                BubbleSorterTest.class,
                GenerateArrayTest.class,
                StringAppendUtilTest.class,
                ReaderUtilTest.class,
                WriteUtilTest.class,
                Part2Test.class
        })
public class RunPart2Test {}
