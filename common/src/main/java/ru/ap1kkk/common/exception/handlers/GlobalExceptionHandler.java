package ru.ap1kkk.common.exception.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ap1kkk.common.exception.message.ApplicationErrorMessage;
import ru.ap1kkk.common.exception.message.ErrorCode;

/**
 * @author Egor Bokov
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ApplicationErrorMessage> handle(Exception e) {
        return build(e, HttpStatus.INTERNAL_SERVER_ERROR, ErrorCode.UNKNOWN);
    }

    public ResponseEntity<ApplicationErrorMessage> build(Exception e, HttpStatus status, ErrorCode errorCode) {
        return new ResponseEntity<>(
                ApplicationErrorMessage
                        .builder()
                        .message(e.getMessage())
                        .code(status.value())
                        .errorCode(errorCode)
                        .build(),
                status
        );
    }
}
