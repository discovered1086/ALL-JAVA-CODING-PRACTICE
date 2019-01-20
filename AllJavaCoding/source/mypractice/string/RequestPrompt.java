package mypractice.string;

import java.sql.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 8/11/15
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class RequestPrompt {
    private String id;
    private String status;
    private String url;
    private String docId;
    private String userId;
    private String caseId;
    private String queryId;
    private String replaceReport;
    private String reportId;
    private Date asOfDate;
    private String submittedDate;
    private String reportDeletionDate;
    private String promptInfo;
    private String requestId;
    private String policyLUString;
    private Set<String> promptValues;
    // private String policyNumber [];
    private String lossUnits[];
    private String policyNumber;
    private String dateRange;
    private String fromDate;
    private String throughDate;
    private String asOfDateString;
    private String coverage;
    private String remarks;
    private String queryxml;
    private String report;
    private String description;
    private String lossUnit;
    private String lossUnitAll;
    private String promptInputString; // The format of the string is
    // Policy#1-LU1,LU2,LU3|Policy#2-LU3,LU5...
    private String promptOutputString;
    private String socialSecurityNumbers;
    private String suppressSSN;
    private String ssnumbers;
    private String selectedEmpIds;
    private String claimStatus;
    private String timeframe_idrc;
    private String defaultLocation;

    public String getTimeframe_idrc() {
        return timeframe_idrc;
    }

    public void setTimeframe_idrc(String timeframe_idrc) {
        this.timeframe_idrc = timeframe_idrc;
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }


    private String displayIdentifier;
    private String reportType;
    private String empIds;
    private String divisionIds;
    private String divisionIdsDisplay;
    private String locationIds;
    private String locationIdsDisplay;
    // added for new leave management report
    private String ilmdGroupingOption;
    private String ilmdGroupingOptions;
    private String selectDateRange=" ";
    private String selectedCoverage;
    private String queryFromDate;
    private String queryEndDate;
    private String frdate;
    private String todate;
    private String queryName;
    private String dateType;
    private String fmlType;
    private String selectedDivisionIds;
    private String selectedLocationIds;
    private String selectedTimeframe;
    public String getSelectedTimeframe() {
        return selectedTimeframe;
    }

    public void setSelectedTimeframe(String selectedTimeframe) {
        this.selectedTimeframe = selectedTimeframe;
    }


    private String month_lot;
    private String year_lot;
    private String tempDivisionIds;
    private String includeNullId;
    private String tempClaims;

    private String radioSSN;
    private String division;
    private String divisionAll;
    private String location;
    private String allPolicyNumbers;
    private String empids;
    private String locationAll;
    private String radioEMPID;
    private String ReporRequestId;

    // Scheduled parameters - jsp fields
    private String daytype = "";
    private String month_type = "";
    private String day_monthly;
    private String monthlyvalue;
    private String days_week;
    private String day_quarterly;
    private String quarter;
    private String endafter;
    private String day_year;
    private String month;
    private String monthly_customize;
    private String enddatetype = "";

    // Scheduled

    private String scheduled;
    private String recurrencePattern = ""; // common
    private String startdt; // common
    private String enddt; // common
    private String actlenddt;
    private String endafterNoccurences;
    private String scheduleRequestId;
    private String scheduleId;
    private String noEndDt;
    private String emailNotification; // common
    private String everyDay = "";
    private String everyweekDay = "";
    private String daysinweek;
    private String dayvalue;
    private String monthorQuaterlyReccurence;
    private String firstDayoftheMonth;
    private String lastDayofMonth;
    private String monthValue;
    private String monthlySchedulecustomize;
    private static final Map<String,String> allDateRanges=new TreeMap<String,String>();
    //private static final Map<String,String> months_in_year=new TreeMap<String,String>();
    private static final Map<String,String> allClaimStatus=new TreeMap<String,String>();
    private static final Map<String,String> reportNameForID=new TreeMap<String,String>();

    //THPA RS change

    private boolean thpaReportId;


    public boolean isThpaReportId() {
        return thpaReportId;
    }

    public void setThpaReportId(boolean thpaReportId) {
        this.thpaReportId = thpaReportId;
    }

    public String getScheduleRequestId() {
        return scheduleRequestId;
    }

    public void setScheduleRequestId(String scheduleRequestId) {
        this.scheduleRequestId = scheduleRequestId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getNoEndDt() {
        if (this.enddatetype.equals("NED"))
            return "N";
        else
            return null;
    }

    public void setNoEndDt(String noEndDt) {
        this.noEndDt = noEndDt;
    }

    public String getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(String emailNotification) {
        this.emailNotification = emailNotification;
    }

    public String getDaysinweek() {
        if (this.recurrencePattern.equals("weekly"))
            return this.days_week;
        else
            return null;
    }

    public void setDaysinweek(String daysinweek) {
        this.daysinweek = daysinweek;
    }

    public String getDayvalue() {
        if (this.recurrencePattern.equals("monthly")
                && this.month_type.equals("type1")
                && (this.day_monthly != null || this.day_monthly.length() != 0))
            return this.day_monthly;
        else if (this.recurrencePattern.equals("quarterly")
                && (this.day_quarterly != null || this.day_quarterly.length() != 0))
            return this.day_quarterly;
        else if (this.recurrencePattern.equals("yearly")
                && (this.day_year != null || this.day_year.length() != 0))
            return this.day_year;
        else
            return null;
    }

    public void setDayvalue(String dayvalue) {
        this.dayvalue = dayvalue;
    }

    public String getMonthorQuaterlyReccurence() {
        if (this.recurrencePattern.equals("monthly")
                && this.month_type.equals("type1")
                && (this.monthlyvalue != null || this.monthlyvalue.length() != 0))
            return this.monthlyvalue;
        else if (this.recurrencePattern.equals("quarterly")
                && (this.monthlyvalue != null || this.quarter.length() != 0))
            return this.quarter;
        else
            return null;
    }

    public void setMonthorQuaterlyReccurence(String monthorQuaterlyReccurence) {
        this.monthorQuaterlyReccurence = monthorQuaterlyReccurence;
    }

    public String getMonthValue() {
        if (this.recurrencePattern.equals("yearly"))
            return this.month;
        else
            return null;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getMonthlySchedulecustomize() {
        if (this.recurrencePattern.equals("monthly")
                && this.month_type.equals("type2"))
            return this.monthly_customize;
        else
            return null;
    }

    public void setMonthlySchedulecustomize(String monthlySchedulecustomize) {
        this.monthlySchedulecustomize = monthlySchedulecustomize;
    }

    public String getReporRequestId() {
        return ReporRequestId;
    }

    public void setReporRequestId(String reporRequestId) {
        ReporRequestId = reporRequestId;
    }

    public String getRadioEMPID() {
        return radioEMPID;
    }

    public void setRadioEMPID(String radioEMPID) {
        this.radioEMPID = radioEMPID;
    }

    public String getTempClaims() {
        return tempClaims;
    }

    public void setTempClaims(String tempClaims) {
        this.tempClaims = tempClaims;
    }

    public String getSelectedDivisionIds() {
        return selectedDivisionIds;
    }

    public void setSelectedDivisionIds(String selectedDivisionIds) {
        this.selectedDivisionIds = selectedDivisionIds;
    }

    public String getSelectedLocationIds() {
        return selectedLocationIds;
    }

    public void setSelectedLocationIds(String selectedLocationIds) {
        this.selectedLocationIds = selectedLocationIds;
    }

    public String getTempDivisionIds() {
        return tempDivisionIds;
    }

    public void setTempDivisionIds(String tempDivisionIds) {
        this.tempDivisionIds = tempDivisionIds;
    }

    public String getIncludeNullId() {
        return includeNullId;
    }

    public void setIncludeNullId(String includeNullId) {
        this.includeNullId = includeNullId;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getFmlType() {
        return fmlType;
    }

    public void setFmlType(String fmlType) {
        this.fmlType = fmlType;
    }

    public String getFrdate() {
        return frdate;
    }



    public void setFrdate(String frdate) {
        this.frdate = frdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getQueryFromDate() {
        return queryFromDate;
    }

    public void setQueryFromDate(String queryFromDate) {
        this.queryFromDate = queryFromDate;
    }

    public String getQueryEndDate() {
        return queryEndDate;
    }

    public void setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
    }

    public String getSelectDateRange() {
        return selectDateRange;
    }

    //right nav and save reports page display
    public String getFormattedDateRange() {
        String val=allDateRanges.get(this.selectDateRange.toUpperCase());
        if(val!=null && !val.isEmpty())
        {	if(val.equals("Nodaterange"))//DCS/IDR PPM1281122
            val=this.getFormattedClaimStatus();
            return val;
        }
        else
        {
            System.out.println("To Change"+this.selectDateRange);
            return this.selectDateRange;
        }

    }

    public void setSelectDateRange(String selectDateRange) {
        this.selectDateRange = selectDateRange;
    }

    public String getSelectedCoverage() {
        return selectedCoverage;
    }

    public void setSelectedCoverage(String selectedCoverage) {
        this.selectedCoverage = selectedCoverage;
    }

    public Set<String> getPromptValues() {
        return promptValues;
    }

    public void setPromptValues(Set<String> promptValues) {
        this.promptValues = promptValues;
    }


    /**
     * Class constructor
     */
    public RequestPrompt() {
        allDateRanges.put("Yesterday".toUpperCase(),"Yesterday");
        allDateRanges.put("ThisWeek".toUpperCase(),"This Week <br/> (Monday - Sunday)");
        allDateRanges.put("LastWeek".toUpperCase(),"Last Week <br/> (Monday - Sunday)");
        allDateRanges.put("This Week(Monday through Sunday)".toUpperCase(),"This Week <br/> (Monday - Sunday)");
        allDateRanges.put("Last Week(Monday through Sunday)".toUpperCase(),"Last Week <br/> (Monday - Sunday)");
        allDateRanges.put("LastMonth".toUpperCase(),"Last Month");
        allDateRanges.put("LastQuarter".toUpperCase(),"Last Quarter");
        allDateRanges.put("Last Calendar Quarter".toUpperCase(),"Last Quarter");
        allDateRanges.put("YearToDate".toUpperCase(),"Year to Date");
        allDateRanges.put("Calendar Year to Date".toUpperCase(),"Year to Date");
        allDateRanges.put("YTD".toUpperCase(),"Year to Date");
        allDateRanges.put("Last12Months1".toUpperCase(),"Last 12 Months");
        allDateRanges.put("Last Calendar Year".toUpperCase(),"Last Year");
        allDateRanges.put("Prior Calendar Year".toUpperCase(),"Last Year");
        allDateRanges.put("LastYear".toUpperCase(),"Last Year");
        allDateRanges.put("Last2Weeks".toUpperCase(),"Last 2 Weeks <br/> (Monday - Sunday)");
        allDateRanges.put("Last two Weeks(Monday through Sunday)".toUpperCase(),"Last 2 Weeks <br/> (Monday - Sunday)");
        allDateRanges.put("ThisMonth".toUpperCase(),"This Month");
        allDateRanges.put("This Month through Yesterday".toUpperCase(),"This Month");
        allDateRanges.put("ThisQuarter".toUpperCase(),"This Quarter");
        allDateRanges.put("This Calendar Quarter through Yesterday".toUpperCase(),"This Quarter");
        allDateRanges.put("ThisYear".toUpperCase(),"This Year");
        allDateRanges.put("This Calendar Year through Yesterday".toUpperCase(),"This Year");
        allDateRanges.put("Last6Months".toUpperCase(),"Last 6 Months");
        allDateRanges.put("Last12Months2".toUpperCase(),"Last 12 Months");
        allDateRanges.put("Last 12 months".toUpperCase(),"Last 12 Months");
        allDateRanges.put("Prior 6 months".toUpperCase(),"Last 6 Months");
        allDateRanges.put("Prior 12 months".toUpperCase(),"Last 12 Months");
        //return claim status for DCS/IDR report with NO end date selection
        allDateRanges.put("Nodaterange".toUpperCase(),"Nodaterange");

        //PPM 1281122
        //custom date inbox-view DCS/IDR
		/*months_in_year.put("01", "January");
		months_in_year.put("02", "Febraury");
		months_in_year.put("03", "March");
		months_in_year.put("04", "April");
		months_in_year.put("05", "May");
		months_in_year.put("06", "June");
		months_in_year.put("07", "July");
		months_in_year.put("08", "August");
		months_in_year.put("09", "September");
		months_in_year.put("10", "October");
		months_in_year.put("11", "November");
		months_in_year.put("12", "December");
		*/
        //DCS & IDR No date range in saved reports page
        allClaimStatus.put("01", "Pending Claims Only");
        allClaimStatus.put("02", "Pending and Approved Claims");
        allClaimStatus.put("03", "Pending, Approved and Recently Closed Claims");
        allClaimStatus.put("04", "Recently Closed Claims");

        //thpa Rs
        allDateRanges.put("lastweek(Monday through Sunday)".toUpperCase(),"Last Week(Monday through Sunday)");
        allDateRanges.put("lastmonth".toUpperCase(),"Last Month");
        allDateRanges.put("lastquarter".toUpperCase(),"Last Quarter");
        allDateRanges.put("yeartodate".toUpperCase(),"Year to Date");
        allDateRanges.put("Year To Date".toUpperCase(),"Year to Date");
        allDateRanges.put("lastyear".toUpperCase(),"Last Year");

        reportNameForID.put("301","New Absence");
        reportNameForID.put("302","Absence Inventory");
        reportNameForID.put("303","Absence Data");
        reportNameForID.put("304","Denied Leave And Claim");
        reportNameForID.put("305","Estimated Return to Work (RTW)");
        reportNameForID.put("307","ADAAA Assist");
        reportNameForID.put("306","Absence Dashboard");
        reportNameForID.put("2","Disability Claim Status");
        reportNameForID.put("3","Medical Underwriting Status");
        reportNameForID.put("4","Disability Transaction Detail");
        reportNameForID.put("6","Disability Activity");
        reportNameForID.put("12","Integrated Disability");
        reportNameForID.put("13","Integrated Disability Changes");
        reportNameForID.put("14","Leave Overview Trend");
    }

    /**
     * Getter methods
     */
    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getUrl() {
        return url;
    }

    public String getDocId() {
        return docId;
    }

    public String getUserId() {
        return userId;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getReportId() {
        return reportId;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public String getReportDeletionDate() {
        return reportDeletionDate;
    }

    public String getCoverage() {
        if ("BOTH".equals(this.coverage))
            return "Both LTD and STD";
        else
            return coverage;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getPromptInputString() {
        return promptInputString;
    }

    public String getDateRange() {
        return dateRange;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getThroughDate() {
        return throughDate;
    }
    //formatted dates methods  for right nav & xml sending
    public String getFormattedFromDate() {
        String formattedDate = getFromDate();
        if(formattedDate!=null && !formattedDate.isEmpty())
        {
            if(formattedDate.indexOf('/') == 1)  {
                formattedDate = "0" + getFromDate();
            }

            int secondSlash = formattedDate.lastIndexOf('/');
            if(secondSlash == 4) {
                formattedDate = formattedDate.substring(0,3)+"0"+formattedDate.substring(3);
            }
        }
        return formattedDate;
    }

    public String getFormattedThroughDate() {
        String formattedDate = getThroughDate();
        if(formattedDate!=null && !formattedDate.isEmpty())
        {
            if(formattedDate.indexOf('/') == 1)  {
                formattedDate = "0" + getThroughDate();
            }

            int secondSlash = formattedDate.lastIndexOf('/');
            if(secondSlash == 4) {
                formattedDate = formattedDate.substring(0,3)+"0"+formattedDate.substring(3);
            }
        }
        return formattedDate;
    }

    public String getPromptOutputString() {
        return promptOutputString;
    }

    public String getSocialSecurityNumbers() {
        return socialSecurityNumbers;
    }

    public String getSuppressSSN() {
        return suppressSSN;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    // DCS/IDR No end date
    public String getFormattedClaimStatus() {
        String val=allClaimStatus.get(this.claimStatus);
        if(val!=null && !val.isEmpty())
            return val;
        else
            return " ";

    }

    public String getDisplayIdentifier() {
        return displayIdentifier;
    }

    // added for new leave management report
    public String getIlmdGroupingOption() {
        return ilmdGroupingOption;
    }

    /**
     * Setter methods
     */
    public void setId(String id) {
        if (id != null && !id.equals("null"))
            this.id = id;
    }

    public void setStatus(String status) {
        if (status != null && !status.equals("null"))
            this.status = status;
    }

    public void setUrl(String url) {
        if (url != null && !url.equals("null"))
            this.url = url;
    }

    public void setDocId(String docId) {
        if (docId != null && !docId.equals("null"))
            this.docId = docId;
    }

    public void setUserId(String userId) {
        if (userId != null && !userId.equals("null"))
            this.userId = userId;
    }

    public void setCaseId(String caseId) {
        if (caseId != null && !caseId.equals("null"))
            this.caseId = caseId;
    }

    public void setReportId(String reportId) {
        if (reportId != null && !reportId.equals("null"))
            this.reportId = reportId;
    }

    public void setSubmittedDate(String submittedDate) {
        if (submittedDate != null && !submittedDate.equals("null"))
            this.submittedDate = submittedDate;
    }

    public void setReportDeletionDate(String reportDeletionDate) {
        if (reportDeletionDate != null && !reportDeletionDate.equals("null"))
            this.reportDeletionDate = reportDeletionDate;
    }

	/*
	 * public void addPolicyNumber(String policyNumberIn) { if (policyNumber ==
	 * null) { policyNumber = new String[10]; } int l = 0; for (int i = 0; i <
	 * policyNumber.length; i++) { if (policyNumber[i] == null) { l = i; break; } }
	 * policyNumber[l] = policyNumberIn; }
	 *
	 * public void setPolicyNumber(String[] policyNumber) { this.policyNumber =
	 * policyNumber; }
	 */

    public void addLossUnits(String lossUnitsIn) {
        if (lossUnits == null) {
            lossUnits = new String[10];
        }
        int l = 0;
        for (int i = 0; i < lossUnits.length; i++) {
            if (lossUnits[i] == null) {
                l = i;
                break;
            }
        }
        lossUnits[l] = lossUnitsIn;
    }

    public void lossUnits(String[] lossUnits) {
        this.lossUnits = lossUnits;
    }

    public void setCoverage(String coverage) {
        if (coverage != null && !coverage.equals("null"))
            this.coverage = coverage;
    }

    public void setRemarks(String remarks) {
        if (remarks != null && !remarks.equals("null"))
            this.remarks = remarks;
    }

    public void setPromptInputString(String promptInputString) {
        if (promptInputString != null && !promptInputString.equals("null"))
            this.promptInputString = promptInputString;
    }

    public void setDateRange(String dateRange) {
        if (dateRange != null && !dateRange.equals("null"))
            this.dateRange = dateRange;
    }

    public void setFromDate(String fromDate) {
        if (fromDate != null && !fromDate.equals("null"))
            this.fromDate = fromDate;
    }

    public void setThroughDate(String throughDate) {
        if (throughDate != null && !throughDate.equals("null"))
            this.throughDate = throughDate;
    }

    public void setPromptOutputString(String promptOutputString) {
        if (promptOutputString != null && !promptOutputString.equals("null"))
            this.promptOutputString = promptOutputString;
    }

    public void setSSN(String ssNumbers) {
        if (ssNumbers != null && !ssNumbers.equals("null"))
            this.socialSecurityNumbers = ssNumbers;
    }

    public void setSuppressSSN(String suppressSSN) {
        if (suppressSSN != null && !suppressSSN.equals("null"))
            this.suppressSSN = suppressSSN;
    }

    public void setClaimStatus(String claimStatus) {
        if (claimStatus != null && !claimStatus.equals("null"))
            this.claimStatus = claimStatus;
    }

    public void setDisplayIdentifier(String displayIdentifier) {
        if (displayIdentifier != null && !displayIdentifier.equals("null"))
            this.displayIdentifier = displayIdentifier;
    }

    // added for new leave management report
    public void setIlmdGroupingOption(String ilmdGroupingOption) {
        this.ilmdGroupingOption = ilmdGroupingOption;
    }

    public String getLoaClaimStatus() {
        if ("01".equals(claimStatus))
            return "Pending Claims Only";
        else if ("02".equals(claimStatus))
            return "Pending and Approved Claims";
        else if ("03".equals(claimStatus))
            return "Pending, Approved and Recently Closed Claims";
        else if ("04".equals(claimStatus))
            return "Recently Closed Claims";
        else if ("05".equals(claimStatus))
            return "All Claims in Date Range";
        else
            return "N/A";
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getLoaReportType() {
        if ("01".equals(reportType))
            return "LOA Only";
        else if ("02".equals(reportType))
            return "LOA with STD";
        else
            return "N/A";
    }

    public String getEmpIds() {
        return empIds;
    }

    public void setEmpIds(String empIds) {
        this.empIds = empIds;
    }

    public String[] getLossUnits() {
        return lossUnits;
    }

    public void setLossUnits(String[] lossUnits) {
        this.lossUnits = lossUnits;
    }

    public String getDivisionIds() {
        return divisionIds;
    }

    public void setDivisionIds(String divisionIds) {
        this.divisionIds = divisionIds;
    }

    public String getLocationIds() {
        return locationIds;
    }

    public void setLocationIds(String locationIds) {
        this.locationIds = locationIds;
    }

    public String getDivisionIdsDisplay() {
        return divisionIdsDisplay;
    }

    public void setDivisionIdsDisplay(String divisionIdsDisplay) {
        this.divisionIdsDisplay = divisionIdsDisplay;
    }

    public String getLocationIdsDisplay() {
        return locationIdsDisplay;
    }

    public void setLocationIdsDisplay(String locationIdsDisplay) {
        this.locationIdsDisplay = locationIdsDisplay;
    }

    public Date getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(Date asOfDate) {
        this.asOfDate = asOfDate;
    }

    public String getIlmdGroupingOptions() {
        System.out.println(ilmdGroupingOptions);
        return ilmdGroupingOptions;
		/*if ("01".equals(ilmdGroupingOptions))
			return "No Grouping";
		else if ("02".equals(ilmdGroupingOptions))
			return "Location";
		else if ("03".equals(ilmdGroupingOptions))
			return "Generic 1";
		else if ("04".equals(ilmdGroupingOptions))
			return "Generic 1, Generic 2";
		else if ("05".equals(ilmdGroupingOptions))
			return "Generic 2";
		else if ("06".equals(ilmdGroupingOptions))
			return "Generic 1, Generic 2,Generic 3";
		else if ("07".equals(ilmdGroupingOptions))
			return "Generic 3";
		else if ("08".equals(ilmdGroupingOptions))
			return "Generic 4";
		else if ("09".equals(ilmdGroupingOptions))
			return "Generic 5";
		else if ("10".equals(ilmdGroupingOptions))
			return "Generic 6";
		else if ("11".equals(ilmdGroupingOptions))
			return "Generic 7";
		else
			return "N/A";*/
    }



    public void setIlmdGroupingOptions(String ilmdGroupingOptions) {
        this.ilmdGroupingOptions = ilmdGroupingOptions;
    }

    public String getQueryxml() {
        return queryxml;
    }

    public void setQueryxml(String queryxml) {
        this.queryxml = queryxml;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPromptInfo() {
        return promptInfo;
    }

    public void setPromptInfo(String promptInfo) {
        this.promptInfo = promptInfo;
    }

    public String getSelectedEmpIds() {
        return selectedEmpIds;
    }

    public void setSelectedEmpIds(String selectedEmpIds) {
        this.selectedEmpIds = selectedEmpIds;
    }

    public void setSocialSecurityNumbers(String socialSecurityNumbers) {
        this.socialSecurityNumbers = socialSecurityNumbers;
    }

    public String getSsnumbers() {
        return ssnumbers;
    }

    public void setSsnumbers(String ssnumbers) {
        this.ssnumbers = ssnumbers;
    }

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getAsOfDateString() {
        return asOfDateString;
    }

    public void setAsOfDateString(String asOfDateString) {
        this.asOfDateString = asOfDateString;
    }

    public String getLossUnit() {
        return lossUnit;
    }

    public void setLossUnit(String lossUnit) {
        this.lossUnit = lossUnit;
    }

    public String getLossUnitAll() {
        return lossUnitAll;
    }

    public void setLossUnitAll(String lossUnitAll) {
        this.lossUnitAll = lossUnitAll;
    }

    public String getRadioSSN() {
        return radioSSN;
    }

    public void setRadioSSN(String radioSSN) {
        this.radioSSN = radioSSN;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivisionAll() {
        return divisionAll;
    }

    public void setDivisionAll(String divisionAll) {
        this.divisionAll = divisionAll;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAllPolicyNumbers() {
        return allPolicyNumbers;
    }

    public void setAllPolicyNumbers(String allPolicyNumbers) {
        this.allPolicyNumbers = allPolicyNumbers;
    }

    public String getEmpids() {
        return empids;
    }

    public void setEmpids(String empids) {
        this.empids = empids;
    }

    public String getLocationAll() {
        return locationAll;
    }

    public void setLocationAll(String locationAll) {
        this.locationAll = locationAll;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPolicyLUString() {
        return policyLUString;
    }

    public void setPolicyLUString(String policyLUString) {
        this.policyLUString = policyLUString;
    }

    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    public void setRecurrencePattern(String recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public String getStartdt() {
        return startdt;
    }

    public void setStartdt(String startdt) {
        this.startdt = startdt;
    }

    public String getEnddt() {
        if (this.getEnddatetype().equals("ED"))
            return enddt;
        else
            return null;
    }

    public void setEnddt(String enddt) {
        this.enddt = enddt;
    }

    public String getEndafterNoccurences() {
        if (this.enddatetype.equals("EANO"))
            return this.endafter;
        else
            return null;
    }

    public void setEndafterNoccurences(String endafterNoccurences) {
        this.endafterNoccurences = endafterNoccurences;
    }

    public String getFirstDayoftheMonth() {
        if (this.recurrencePattern.equals("monthly")
                && this.month_type.equals("FDM"))
            return "F";
        else
            return null;
    }

    public void setFirstDayoftheMonth(String firstDayoftheMonth) {
        this.firstDayoftheMonth = firstDayoftheMonth;
    }

    public String getLastDayofMonth() {
        if (this.recurrencePattern.equals("monthly")
                && this.month_type.equals("LDM"))
            return "L";
        else
            return null;
    }

    public void setLastDayofMonth(String lastDayofMonth) {
        this.lastDayofMonth = lastDayofMonth;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getEveryDay() {
        if (this.recurrencePattern.equals("daily") && this.daytype.equals("D"))
            return "D";
        else
            return null;

    }

    public void setEveryDay(String everyDay) {
        this.everyDay = everyDay;
    }

    public String getEveryweekDay() {
        if (this.recurrencePattern != null && this.recurrencePattern.equals("daily") && this.daytype.equals("W"))
            return "W";
        else
            return null;
    }

    public void setEveryweekDay(String everyweekDay) {
        this.everyweekDay = everyweekDay;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    //

    public String getDaytype() {
        if (this.recurrencePattern != null && this.recurrencePattern.equals("daily") && this.everyDay != null && this.everyDay.equals("D"))
            return "D";
        else if (this.recurrencePattern.equals("daily") && this.everyweekDay != null && this.everyweekDay.equals("W"))
            return "W";
        else
            return "D";
    }

    public void setDaytype(String daytype) {
        this.daytype = daytype;
    }

    //
    public String getMonth_type() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.firstDayoftheMonth != null)
            return "FDM";
        else if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.lastDayofMonth != null)
            return "LDM";
        else if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.monthlySchedulecustomize != null)
            return "type2";
        else
            return "type1";
    }

    public void setMonth_type(String month_type) {
        this.month_type = month_type;
    }

    // /
    public String getDay_monthly() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.getMonth_type() != null && this.getMonth_type().equals("type1")
                && (this.dayvalue != null || this.dayvalue.length() != 0))
            return this.dayvalue;
        else
            return null;
    }

    public void setDay_monthly(String day_monthly) {
        this.day_monthly = day_monthly;
    }

    //
    public String getMonthlyvalue() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.getMonth_type() != null
                && this.getMonth_type().equals("type1")
                && (this.monthorQuaterlyReccurence != null || this.monthorQuaterlyReccurence
                .length() != 0))
            return this.monthorQuaterlyReccurence;
        else
            return null;
    }

    public void setMonthlyvalue(String monthlyvalue) {
        this.monthlyvalue = monthlyvalue;
    }

    //
    public String getDay_quarterly() {
        //System.out.println(this.dayvalue);
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("quarterly"))
            return this.dayvalue;
        else
            return null;
    }

    public void setDay_quarterly(String day_quarterly) {
        this.day_quarterly = day_quarterly;
    }

    //
    public String getQuarter() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("quarterly"))
            return this.monthorQuaterlyReccurence;
        else
            return null;

    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    //
    public String getDay_year() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("yearly"))
            return this.dayvalue;
        else
            return null;
    }

    public void setDay_year(String day_year) {
        this.day_year = day_year;
    }

    //
    public String getEnddatetype() {
        if (this.noEndDt != null)
            return "NED";
        else if (this.endafterNoccurences != null)
            return "EANO";
        else if (this.enddt != null)
            return "ED";
        else
            return "EANO";

    }

    public void setEnddatetype(String enddatetype) {
        this.enddatetype = enddatetype;
    }

    //
    public String getMonth() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("yearly"))
            return this.monthValue;
        else
            return "January";
    }

    public void setMonth(String month) {
        this.month = month;
    }

    //
    public String getDays_week() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("weekly"))
            return this.daysinweek;
        else
            return "monday";
    }

    public void setDays_week(String days_week) {
        this.days_week = days_week;
    }

    //
    public String getEndafter() {
        if (this.getEnddatetype() != null && this.getEnddatetype().equals("EANO") && this.endafterNoccurences!=null)
            return this.endafterNoccurences;
        else
            return "10";
    }

    public void setEndafter(String endafter) {
        this.endafter = endafter;
    }

    //
    public String getMonthly_customize() {
        if (this.recurrencePattern != null
                && this.recurrencePattern.equals("monthly")
                && this.getMonth_type() != null && this.getMonth_type().equals("type2"))
            return this.monthlySchedulecustomize;
        else
            return "First,Sunday";
    }

    public String getMonthly_customize1() {
        if (this.getMonthly_customize()!=null)
        {
            String s[]=new String[2];
            s=this.getMonthly_customize().split(",");
            return s[0];
        }
        else
            return "First";
    }

    public String getMonthly_customize2() {
        if (this.getMonthly_customize()!=null)
        {
            String s[]=new String[2];
            s=this.getMonthly_customize().split(",");
            return s[1];
        }
        else
            return "Sunday";
    }

    public void setMonthly_customize(String monthly_customize) {
        this.monthly_customize = monthly_customize;
    }

    public String getActlenddt() {
        return actlenddt;
    }

    public void setActlenddt(String actlenddt) {
        this.actlenddt = actlenddt;
    }

    public void setReplaceReport(String replaceReport) {
        this.replaceReport = replaceReport;
    }

    public String getReplaceReport() {
        return replaceReport;
    }

    public String getMonth_lot() {
        return month_lot;
    }

    public void setMonth_lot(String month_lot) {
        this.month_lot = month_lot;
    }

    public String getYear_lot() {
        return year_lot;
    }

    public void setYear_lot(String year_lot) {
        this.year_lot = year_lot;
    }
    //THPA RS CHANGE

    public String getReportName() {
        String val=reportNameForID.get(this.reportId);

        return val;

    }
}
