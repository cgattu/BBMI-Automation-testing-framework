package gov.va.bbmi.automatedtesting.suites;

import gov.va.bbmi.automatedtesting.SimpleTestSuite;
import gov.va.bbmi.automatedtesting.suites.example.ExampleSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SimpleTestSuite.class, ExampleSuite.class, /* ExampleSuite2.class, */})
public final class AllTestSuites {

}
