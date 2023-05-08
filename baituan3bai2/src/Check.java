import java.util.regex.Pattern;

class Check {
    public static final String RegexDate = "(0[1-9] |1 [0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]|4})";
    public static String inputSTR (String str, String strError, boolean ver) {
        String strInput = "";
        boolean check = false;
        while (!check) {
            try {
                if(!ver) {
                    strInput = Common.getString(str+": ");
                }
                else{
                    strInput = Common.getStrings (str + ": ");
                    if(strInput.length() == 0) {
                        System.out.println(strError);
                    }else{
                        check = true;
                    }
                }
            } catch (Exception e) {
                System.out.println(strError);
            }
        }
        return strInput;
    }
    public static int inputINT(String str,String strError){
        int intInput = 0;
        boolean check = false;
        while(!check){
            try{
                intInput = Common.getInt(str + ": ");
                check = true;
            }catch (Exception e){
                System.out.println(strError);
            }
        }
        return intInput;
    }
    public static float inputFLOAT(String str,String strError){
        float floatInput = 0;
        boolean check = false;
        while(!check){
            try{
                floatInput = Common.getFloat(str + ": ");
                check = true;
            }catch(Exception e){
                System.out.println(strError);
            }
        }
        return floatInput;
    }
    public static double inputDOUBLE(String str,String strError){
        double doubleInput = 0;
        boolean check = false;
        while(!check){
            try{
                doubleInput = Common.getDouble(str + ": ");
                check = true;
            }catch(Exception e){
                System.out.println(strError);
            }
        }
        return doubleInput;
    }
    public static char inputCHAR(String str, String strError){
        char charInput = ' ';
        boolean check = false;
        while(!check){
            try{
                charInput = Common.getChar(str + ": ");
            }catch(Exception e){
                System.out.println(strError);
            }
        }
        return charInput;
    }
    public static boolean inputBOOLEAN(String str,String strError){
        boolean boolInput = false;
        boolean check = false;
        while(!check){
            try{
                boolInput = Common.getBoolean(str + ": ");
            }catch(Exception e){
                System.out.println(strError);
            }
        }
        return boolInput;
    }
    public static Date inputDATE(String str,String strError,boolean ver){
        Date dateInput = null;
        boolean check = false;
        while(!check){
            try{
                if(!ver){
                    dateInput = Common.InputDate(str + ": ");
                }else{
                    dateInput = Common.InputDates(str + ": ");
                }
                check = Pattern.matches(RegexDate, dateInput.toString());
            }catch(Exception e){
                System.out.println(strError);
            }
        }
        return dateInput;
    }
}
