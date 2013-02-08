package gov.va.bbmi.automatedtesting.suites;

import gov.va.bbmi.automatedtesting.suites.example.BBMILookAndFeel;
import gov.va.bbmi.automatedtesting.suites.example.VeteranNegative;
import gov.va.bbmi.automatedtesting.suites.example.VeteranP1011;
import gov.va.bbmi.automatedtesting.suites.example.VeteranP1211;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	//SimpleTestSuite.class, 
	//ExampleSuite.class, 
	//Testcase1.class, 
	//BBMILookAndFeel.class,
	//Testcase3.class,
	//bbmigmailtest.class,
	//Directemail.class,
	//VeteranP1011.class,
	//VeteranNegative.class,
	//VeteranP1211.class ,
	BBMILookAndFeel.class})
public final class AllTestSuites {

}
