package Backup;
public class ReplaceSubString {
  public static void main(String[] argv) throws Exception {
    System.out.println(replace("this is a test", "is", "are"));
  }

  static String replace(String str, String pattern, String replace) {
    int start = 0;
    int index = 0;
    StringBuffer result = new StringBuffer();

    while ((index = str.indexOf(pattern, start)) >= 0) {
      result.append(str.substring(start, index));
      result.append(replace);
      start = index + pattern.length();
    }
    result.append(str.substring(start));
    return result.toString();
  }
}

// http://www.java2s.com/Tutorial/Java/0040__Data-Type/ReplacingSubstringsinaString.htm
