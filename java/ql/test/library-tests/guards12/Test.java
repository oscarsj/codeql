class Test {
  void foo(String s, boolean unknown) {
    int x = switch(s) {
      case "a", "b" -> 1;
      case "c" -> 2;
      case "d" -> 2;
      default -> 3;
    };
    switch (s) {
      case "a", "b" -> { }
      case "c" -> { }
      case "d" -> { }
      default -> { }
    }
    int len = s.length();
    switch (s) {
      case String s2 when len == 4 -> { }
      case "e" -> { }
      default -> { }
    }
    switch (unknown ? s : s.toLowerCase()) {
      case "f" -> { }
      case String s2 when len == 4 -> { }
      case "g" -> { }
      default -> { }
    }
  }
}
