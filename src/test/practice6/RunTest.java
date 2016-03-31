package test.practice6;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.practice6.part1.Part1Test;
import test.practice6.part1.RunPart1Test;
import test.practice6.part2.RunPart2Test;
import test.practice6.part3.RunPart3Test;
import test.practice6.part4.RunPart4Test;
import test.practice6.part5.RunPart5Test;

/**
 * Created by Dmytro_Kryvko on 3/30/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        RunPart1Test.class,
        RunPart2Test.class,
        RunPart3Test.class,
        RunPart4Test.class,
        RunPart5Test.class
})
public class RunTest {
}
