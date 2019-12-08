package util;

public class ReportException extends RuntimeException {
    private static final String MESSAGE = "Unable to find element.";

    public ReportException() {
        super(MESSAGE);
    }
}
