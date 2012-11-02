package gov.va.bbmi.automatedtesting.suites;

import gov.va.bbmi.automatedtesting.suites.example.ExampleSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExampleSuite.class, /* ExampleSuite2.class, */})
public class AllTests {

}
