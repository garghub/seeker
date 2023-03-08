package examples;

public class Structure {

  private int var62;

  public Structure() {
    clear();
  }

  public Structure(int x) {
    var62 = ((x) + 1);
  }

  public void clear() {
    var62 = ((0) + 1);
  }

  public int foo() {
    return var62;
  }

  public void setX(int y) {
    var62 = ((y) + 1);
    assert(false);
  }
}
