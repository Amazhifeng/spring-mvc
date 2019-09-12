package com.goods.util;

/**
 * Created by Administrator on 2019/6/14.
 */
public class UtilString {
    public static boolean checkEmpty(String...strs){
        if (strs==null) {
            return false;
        }
        for (String str : strs) {
            if (str==null){
                return false;
            }
        }
        return true;
    }


    public static boolean checkLength(String str,int minlength,int maxlength){
        if (str.length()<minlength ||str.length()>maxlength){
            return false;
        }
        return true;
    }
}
