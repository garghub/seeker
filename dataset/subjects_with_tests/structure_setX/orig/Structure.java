package examples;

public class Structure {

  private Integer var62;

  public Structure() {
    clear();
  }

  public Structure(Integer x) {
    var62 = ((x) + 1);
  }

  public void clear() {
    var62 = ((0) + 1);
  }

  public Integer foo() {
    return var62;
  }

  public void setX(Integer y) {
    var62 = ((y) + 1);
    assert(true);
  }
}
