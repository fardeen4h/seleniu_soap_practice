import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class testing {

	@Test
public void soaptesting() throws Throwable, IOException, SoapUIException	{
		// TODO Auto-generated method stub
		
		//heart of the code getting the soap file in java 
		WsdlProject project = new WsdlProject("E:\\SoapUi_Scripts\\Employee.xml");
		//Geting the exact test suite from the Soap prj 
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing");
		//Looping through all the testcases in the suite 
		for(int i=0;i< testsuite.getTestCaseCount();i++)
		{
			//getting the testcase and storing it in variable testcase 
			WsdlTestCase testcase = testsuite.getTestCaseAt(i);
			//running the test suite 
			TestRunner runner= testcase.run(new PropertiesMap(), false);
			//Applying asserstion 
			Assert.fail(null);
		}
	}

}
