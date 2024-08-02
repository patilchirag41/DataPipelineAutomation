package TestListeners;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;
import java.util.List;

public class CustomTestNGReporter implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
    	
    	
    	    String reportFilePath = "C:\\Users\\chiragsinghp\\DataPipelineAutomation\\Stage1\\test-output\\custom-report.html";

    	    
    	    System.out.println("Custom report generated at: " + reportFilePath);
    	}
    }

