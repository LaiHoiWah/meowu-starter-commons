package com.meowu.starter.commons.utils;

public class VersionUtils{

    private VersionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    /**
     * when compare == target then return 0
     * when compare < target then return -1
     * when compare > target then return 1
     * when compare and target are null then return 0
     * when compare is null and target is not null then return -1
     * when compare is not null and target is null then return 1
     * null is minimum
     */
    public static int compare(Integer compare, Integer target){
        if(compare == null && target == null){
            return 0;
        }else if(compare == null){
            return -1;
        }else if(target == null){
            return 1;
        }else if(compare.equals(target)){
            return 0;
        }else{
            return compare < target ? -1 : 1;
        }
    }

    /**
     * when compare == target then return 0
     * when compare < target then return -1
     * when compare > target then return 1
     * when compare and target are null then return 0
     * when compare is null and target is not null then return -1
     * when compare is not null and target is null then return 1
     * null is minimum
     */
    public static int compare(Long compare, Long target){
        if(compare == null && target == null){
            return 0;
        }else if(compare == null){
            return -1;
        }else if(target == null){
            return 1;
        }else if(compare.equals(target)){
            return 0;
        }else{
            return compare < target ? -1 : 1;
        }
    }

    /**
     * when compare == target then return 0
     * when compare < target then return -1
     * when compare > target then return 1
     * when compare and target are null then return 0
     * when compare is null and target is not null then return -1
     * when compare is not null and target is null then return 1
     * null is minimum
     */
    public static int compare(Float compare, Float target){
        if(compare == null && target == null){
            return 0;
        }else if(compare == null){
            return -1;
        }else if(target == null){
            return 1;
        }else if(compare.equals(target)){
            return 0;
        }else{
            return compare < target ? -1 : 1;
        }
    }

    /**
     * when compare == target then return 0
     * when compare < target then return -1
     * when compare > target then return 1
     * when compare and target are null then return 0
     * when compare is null and target is not null then return -1
     * when compare is not null and target is null then return 1
     * null is minimum
     */
    public static int compare(Double compare, Double target){
        if(compare == null && target == null){
            return 0;
        }else if(compare == null){
            return -1;
        }else if(target == null){
            return 1;
        }else if(compare.equals(target)){
            return 0;
        }else{
            return compare < target ? -1 : 1;
        }
    }

    /**
     * support xx.xx.xx pattern
     */
    public static int compare(String compare, String target){
        if(StringUtils.isBlank(compare) && StringUtils.isBlank(target)){
            return 0;
        }else if(StringUtils.isBlank(compare)){
            return -1;
        }else if(StringUtils.isBlank(target)){
            return 1;
        }else if(compare.equals(target)){
            return 0;
        }else{
            int compareLength = StringUtils.length(compare);
            int targetLength  = StringUtils.length(target);
            int minLength     = Math.min(compareLength, targetLength);

            for(int i = 0; i < minLength; i++){
                char compareChar = compare.charAt(i);
                char targetChar  = target.charAt(i);

                if(compareChar < targetChar){
                    return -1;
                }else if(compareChar > targetChar){
                    return 1;
                }
            }

            return Integer.compare(compareLength, targetLength);
        }
    }

    public static Integer max(Integer compare, Integer target){
        return compare(compare, target) >= 0 ? compare : target;
    }

    public static Integer min(Integer compare, Integer target){
        return compare(compare, target) <= 0 ? compare : target;
    }

    public static Long max(Long compare, Long target){
        return compare(compare, target) >= 0 ? compare : target;
    }

    public static Long min(Long compare, Long target){
        return compare(compare, target) <= 0 ? compare : target;
    }

    public static Float max(Float compare, Float target){
        return compare(compare, target) >= 0 ? compare : target;
    }

    public static Float min(Float compare, Float target){
        return compare(compare, target) <= 0 ? compare : target;
    }

    public static Double max(Double compare, Double target){
        return compare(compare, target) >= 0 ? compare : target;
    }

    public static Double min(Double compare, Double target){
        return compare(compare, target) <= 0 ? compare : target;
    }

    public static String max(String compare, String target){
        return compare(compare, target) >= 0 ? compare : target;
    }

    public static String min(String compare, String target){
        return compare(compare, target) <= 0 ? compare : target;
    }
}
