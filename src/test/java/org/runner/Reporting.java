package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonfile) {
		String path = System.getProperty("user.dir");
		File reportDirectory = new File(path +"\\src\\test\\resources\\Report");
		
		Configuration config = new Configuration(reportDirectory, path);
		config.addClassifications("Browser", "chrome");
		config.addClassifications("Browser version", "95.0");
		config.addClassifications("os", "windows10");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonfiles, config);
		reportBuilder.generateReports();
	}
}
