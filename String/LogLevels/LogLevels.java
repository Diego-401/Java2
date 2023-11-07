package String.LogLevels;

public class LogLevels {
    public static String message(String logLine){
        String logText[]=logLine.split(": ");
        logLine=logText[1].replace("  ","");
        logLine=logLine.replace("\r","");
        logLine=logLine.replace("\n","");
        logLine=logLine.replace("\t","");
        return logLine;
    } 
    
    public static String logLevel(String logLine) {
        String logType=null;
        if(logLine.indexOf("[ERROR]")>=0){
            logType="ERROR";
        }else if(logLine.indexOf("[WARNING]")>=0){
            logType="WARNING";
        }else{
            logType="INFO";
        }
        return logType.toLowerCase();
    }

    public static String reformat(String logLine) {
        String logText[]=logLine.split(": ");
        logLine=logText[0].replace("[","(");
        logLine=logLine.replace("]",")");
        logText[1]=logText[1].replace("\r\n","");
        logText[1]=logText[1].replace("\t ","");
        logText[1]=logText[1].replace("\n","");
        return logText[1]+" "+logLine.toLowerCase();
    }
}
