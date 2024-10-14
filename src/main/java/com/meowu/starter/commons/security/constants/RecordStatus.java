package com.meowu.starter.commons.security.constants;

import com.meowu.starter.commons.security.exception.NoSuchEnumException;
import com.meowu.starter.commons.utils.StringUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum RecordStatus{

    ACTIVE("A", "ACTIVE"),

    INACTIVE("I", "INACTIVE"),

    DELETE("D", "DELETE"),

    ;

    private final String code;
    private final String display;

    public static RecordStatus getByCode(String code){
        if(StringUtils.isBlank(code)){
            throw new IllegalArgumentException("Enum code must not be null");
        }

        for(RecordStatus status : RecordStatus.values()){
            if(status.code.equals(code)){
                return status;
            }
        }

        throw new NoSuchEnumException("No such code [" + code + "] in Enum RecordStatus");
    }
}
