import java.text.DecimalFormat;
import java.util.Scanner;

class Common {
    public static Scanner scanner = new Scanner(System.in);
    public static int getInt(String str){
        System.out.println(str);
        return scanner.nextInt();
    }
    public static String getString (String str){
        System.out.println(str);
        return scanner.nextLine();
    }
    public static String getStrings (String str) {
        System.out.print(str);
        scanner.nextLine();
        return scanner.nextLine();
    }
    public static float getFloat (String srt) {
        System.out.print(srt);
        return scanner.nextFloat();
    }
    public static double getDouble(String srt){
        System.out.print(srt);
        return scanner.nextDouble();
    }
    public static char getChar(String srt){
        System.out.print(srt);
        return scanner.next().charAt(0);
    }
    public static boolean getBoolean(String srt){
        System.out.print(srt);
        return scanner.hasNextBoolean();
    }
    public static String toVND(Object money){
        DecimalFormat formatter = new DecimalFormat("fff,fff,fff");
        return formatter.format(money);
    }
    public static void clearScreen(){
        System.out.print("\033|H\033|2J");
        System.out.flush();
    }
    public static void anyPressKey(){
        System.out.print("Nhan de tiep tuc...");
        scanner.nextLine();
        scanner.nextLine();
    }
    public static Date InputDate(String str){
        System.out.println("Hay dat ngay thang nam");
        String date = Common.getString(str).trim();
        String[] dateArr = date.split("/");
        return new Date(Integer.parseInt(dateArr[0]),Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[2]));
    }
    public static Date InputDates(String str){
        System.out.println("Hay dat ngay thang nam");
        String date = Common.getStrings(str).trim();
        String[] dateArr = date.split("/");
        return new Date(Integer.parseInt(dateArr[0]),Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[2]));
    }
}