package com.safarandras.RockPaperScissors.dto;

public class ErrorMessageDTO extends DTO {
    private String message;

    public ErrorMessageDTO() {
    }

    public ErrorMessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMessageDTO{" +
                "message=" + message + '\'' +
                '}';
    }
}
