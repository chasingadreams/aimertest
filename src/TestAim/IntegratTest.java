package TestAim;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestContainer.CalculateTest;
import TestContainer.UseInfoTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculateTest.class, UseInfoTest.class })
public class IntegratTest {

}