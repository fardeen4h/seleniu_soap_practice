package restAPITest;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class testRunner2 {
	
	
	@Test
	public void individual_testcase() throws XmlException, IOException, SoapUIException 
	{
		WsdlProject project=new WsdlProject("C:\\Users\\user\\Documents\\REST-Project-3-soapui-project.xml");
		WsdlTestSuite testsuite=project.getTestSuiteByName("SoapTesting");
		WsdlTestCase testcase=testsuite.getTestCaseByName("GetBook");
		WsdlTestCaseRunner runner=testcase.run(new PropertiesMap(), false);
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
	}

}
