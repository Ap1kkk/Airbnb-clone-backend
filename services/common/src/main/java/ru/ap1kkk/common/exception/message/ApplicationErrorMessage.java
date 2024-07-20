package ru.ap1kkk.common.exception.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author Egor Bokov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationErrorMessage {
    @JsonProperty("trace_id")
    private String traceId;
    private int code;
    private String message;
    @JsonIgnore
    private ErrorCode errorCode;
    private Map<String, Object> details;


    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode.getValue();
    }
}
