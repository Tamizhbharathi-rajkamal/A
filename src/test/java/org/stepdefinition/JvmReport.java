package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void jvmReportGeneration(String json) {
		File f = new File("Reports\\jvmReport");
		Configuration obj = new Configuration(f,"fbLoginReport");
		obj.addClassifications("platform", "windows");
		obj.addClassifications("browser", "chrome");
		obj.addClassifications("version", "79.0");
		obj.addClassifications("sprint", "17");
		
		List<String> jsonFiles = new ArrayList();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, obj);
		r.generateReports();
		

	}

}
