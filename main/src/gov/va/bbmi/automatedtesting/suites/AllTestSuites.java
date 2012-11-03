package gov.va.bbmi.automatedtesting.suites;

import gov.va.bbmi.automatedtesting.suites.example.ExampleSuite;
import gov.va.bbmi.automatedtesting.suites.simple.SimpleTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SimpleTestSuite.class, ExampleSuite.class, /* ExampleSuite2.class, */})
public final class AllTestSuites {

}
