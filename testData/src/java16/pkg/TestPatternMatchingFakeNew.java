package pkg;

public class TestPatternMatchingFakeNew {
  void test1(Object o) {
    if (o instanceof String) {
      final String s = (String) o;
      System.out.println(s.length());
    }
  }

  void test2(Object o) {
    if (o instanceof String x) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test3(Object o) {
    if (o.hashCode() < 0 || o instanceof String) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test3B(Object o) {
    if (o.hashCode() < 0 || o instanceof String) {
      final String s = (String) o;
      System.out.println(s);
    }

    System.out.println("bye");
  }

  void test4(Object o) {
    if (o.hashCode() < 0 || o instanceof String x) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test4x(Object o) {
    if (o.hashCode() < 0 || o instanceof String x && !x.isEmpty()) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test4B(Object o) {
    if (o.hashCode() < 0 || o instanceof String x) {
      final String s = (String) o;
      System.out.println(s);
    }
    System.out.println("bye");
  }

  void test4xB(Object o) {
    if (o.hashCode() < 0 || o instanceof String x && !x.isEmpty()) {
      final String s = (String) o;
      System.out.println(s);
    }
    System.out.println("bye");
  }

  void test3Swap(Object o) {
    if (o instanceof String || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test3BSwap(Object o) {
    if (o instanceof String || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }

    System.out.println("bye");
  }

  void test4Swap(Object o) {
    if (o instanceof String x || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test4xSwap(Object o) {
    if (o instanceof String x && !x.isEmpty() || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }
  }

  void test4BSwap(Object o) {
    if (o instanceof String x || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }
    System.out.println("bye");
  }

  void test4xBSwap(Object o) {
    if (o instanceof String x && !x.isEmpty() || o.hashCode() < 0) {
      final String s = (String) o;
      System.out.println(s);
    }
    System.out.println("bye");
  }


  public void testClash(Object obj) {
    if (!(obj instanceof String s)) {
      int s = 0;

      System.out.println(s);
    } else {
      System.out.println(s.length());
    }
  }

  public void testSet(Object obj) {
    String s = "Hi";
    if (obj instanceof String) {
      s = (String) obj;
    }

    System.out.println(s);
  }
}
