package test;

public enum SomeStatus {
    CONTINUE(100, "Continue"), 
    SWITCHING_PROTOCOLS(101, "Switching Protocols");

    private final int value;

    private final String reasonPhrase;

    private SomeStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public String toString() {
        return Integer.toString(value);
    }

}
