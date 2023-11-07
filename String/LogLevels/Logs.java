package String.LogLevels;
/*Instructions
In this exercise you'll be processing log-lines.

Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".

There are three different log levels:

INFO
WARNING
ERROR
You have three tasks, each of which will take a log line and ask you to do something with it.

1. Get message from a log line
Implement the (static) LogLevels.message() method to return a log line's message:

LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"
Any leading or trailing white space should be removed:

LogLevels.message("[WARNING]:  Disk almost full\r\n")
// => "Disk almost full"

2. Get log level from a log line
Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

3. Reformat a log line
Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)" */
public class Logs {
    public static void main(String args[]){
        System.out.println(LogLevels.message("[WARNING]:   \tTimezone not set  \r\n"));
        System.out.println(LogLevels.logLevel("[ERROR]"));
        System.out.println(LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
    }
}
