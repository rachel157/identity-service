package com.devteria.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXISTED(1002, "User existed"),
    USER_NOT_EXISTED(1005,"User not existed"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters");

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
