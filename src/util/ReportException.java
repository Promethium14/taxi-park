package util;

public class ReportException extends RuntimeException {
    private static final String MESSAGE = "Unable to find booking in report queue.";

    public ReportException() {
        super(MESSAGE);
    }
}
