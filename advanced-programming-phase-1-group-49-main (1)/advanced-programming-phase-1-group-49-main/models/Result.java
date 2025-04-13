package models;

public record Result(boolean isSuccessfully, String message) {
    @Override
    public String toString() {
        return message;
    }
}
