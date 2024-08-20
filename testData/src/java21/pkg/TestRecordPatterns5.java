package pkg;

public class TestRecordPatterns5 {
  record R(Number a, String b) {}

  public void test1(R r) {
    if (r instanceof R(Integer x, String s)) {
      System.out.println(x);
      System.out.println(s);
    }
  }

  public void test2(R r) {
    if (r instanceof R(Integer x, String s) && s.length() > 10) {
      System.out.println(x);
      System.out.println(s);
    }
  }

  public void test3(R r) {
    if (r instanceof R(Integer x, String s) && s.length() > 10 && x.intValue() == 3) {
      System.out.println(x);
      System.out.println(s);
    }
  }
}
