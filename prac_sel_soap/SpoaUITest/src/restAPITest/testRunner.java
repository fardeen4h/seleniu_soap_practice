package restAPITest;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class testRunner {

	@Test
	public void SoapTest() throws XmlException, IOException, SoapUIException {
		// TODO Auto-generated method stub
		//wsdl project 
		
		//Grab the project 
		WsdlProject project= new WsdlProject("C:\\Users\\user\\Documents\\REST-Project-3-soapui-project.xml");
		//Grab the testSuite
		WsdlTestSuite testsuite=project.getTestSuiteByName("SoapTesting");
		//Grab the testCase 
		for(int i =0; i< testsuite.getTestCaseCount();i++) {
			WsdlTestCase testcase=testsuite.getTestCaseAt(i);
			//execute the test case 
			TestRunner runner=testcase.run(new PropertiesMap(), false);
			Assert.assertEquals(com.eviware.soapui.model.testsuite.TestRunner.Status.FINISHED, runner.getStatus());
		}
	}

}
