package test.practice6;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.practice6.part1.Part1Test;
import test.practice6.part1.RunPart1Test;
import test.practice6.part2.RunPart2Test;

/**
 * Created by Dmytro_Kryvko on 3/30/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        RunPart1Test.class,
        RunPart2Test.class
})
public class RunTest {
}
