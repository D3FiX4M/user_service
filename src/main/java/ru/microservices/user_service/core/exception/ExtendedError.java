package ru.microservices.user_service.core.exception;

import io.grpc.Status;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ExtendedError {


    // COMMON
    UNKNOWN(Status.INTERNAL, HttpStatus.INTERNAL_SERVER_ERROR),
    NOT_FOUND(Status.NOT_FOUND, HttpStatus.NOT_FOUND),
    BAD_REQUEST(Status.INVALID_ARGUMENT, HttpStatus.BAD_REQUEST),
    PARSER_ERROR(Status.INVALID_ARGUMENT, HttpStatus.BAD_REQUEST),
    ALREADY_EXIST(Status.ALREADY_EXISTS, HttpStatus.CONFLICT);


    private final Status grpcStatus;
    private final HttpStatus httpStatus;
}
