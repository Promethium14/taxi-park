package util;

public class ReportException extends Exception {

    private static final String MESSAGE = "Unable to find booking in report.";

    public ReportException() {
        super(MESSAGE);
    }
}
