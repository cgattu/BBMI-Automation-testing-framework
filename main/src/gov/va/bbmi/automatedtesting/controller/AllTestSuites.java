package gov.va.bbmi.automatedtesting.controller;

import gov.va.bbmi.automatedtesting.suites.*;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	VeteranP1211.class ,
	VeteranP1011.class,
	BBMIgmail.class,
	Directemail.class,	
	BBMILookAndFeel.class,
	VeteranNegative.class,
	DirectemailErrorMsg.class})
public final class AllTestSuites {

}
