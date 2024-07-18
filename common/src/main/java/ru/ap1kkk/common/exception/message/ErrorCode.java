package ru.ap1kkk.common.exception.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Egor Bokov
 */
@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    UNKNOWN("unknown");

    private final String value;
}
