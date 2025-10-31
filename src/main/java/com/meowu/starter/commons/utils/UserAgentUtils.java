package com.meowu.starter.commons.utils;

import eu.bitwalker.useragentutils.UserAgent;

public class UserAgentUtils{

    public static UserAgent parse(String userAgentString){
        return UserAgent.parseUserAgentString(userAgentString);
    }
}
