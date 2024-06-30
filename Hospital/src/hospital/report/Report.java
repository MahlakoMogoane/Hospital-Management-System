package hospital.report;

import java.time.LocalDate;

public class Report {
	//attributes
	private int reportID;
	private String reportType;
	private LocalDate generationDate;
	private String generatedBy;
	private String summary;
	
	//getters
	public int getReportID() {
		return reportID;
	}
	
	public String getReportType() {
		return reportType;
	}
	
	public LocalDate getGenerationDate() {
		return generationDate;
	}
	
	public String getGeneratedBy() {
		return generatedBy;
	}
	
	public String getSummary() {
		return summary;
	}
	
	//setters
	public void setReportID(int reportID) {
		this.reportID = reportID;
	}
	
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	
	public void setGenerationDate(LocalDate generationDate) {
		this.generationDate = generationDate;
	}

	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
