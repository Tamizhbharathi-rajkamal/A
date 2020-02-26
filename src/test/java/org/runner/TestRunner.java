package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature\\Login.feature"},monochrome=true,dryRun=false,
glue = {"org.stepdefinition"},plugin= {"html:D:\\Tamizhbharathi\\Cucumber_Workspace\\NewDependencies\\Reports",
		"json:D:\\Tamizhbharathi\\Cucumber_Workspace\\NewDependencies\\Reports\\report.json"})
public class TestRunner {
	
	@AfterClass
	public static void reportGeneration() {
		JvmReport.jvmReportGeneration("D:\\Tamizhbharathi\\Cucumber_Workspace\\NewDependencies\\Reports\\report.json");
	}
	

}
