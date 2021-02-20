public class MyRes {

    public MyRes(String command, String response, String reportBody) {
        this.command = command;
        this.response = response;
        ReportBody = reportBody;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getReportBody() {
        return ReportBody;
    }

    public void setReportBody(String reportBody) {
        ReportBody = reportBody;
    }

    private String command;
    private String response;
    private String ReportBody;

}

