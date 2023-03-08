package examples;

public class ListComp02 {

  private java.util.ArrayList<R> _var49;
  private java.util.ArrayList<S> _var50;

  public ListComp02() {
    clear();
  }

  public ListComp02(java.util.ArrayList<R> Rs, java.util.ArrayList<S> Ss) {
    _var49 = Rs;
    _var50 = Ss;
  }

  public void clear() {
    _var49 = new java.util.ArrayList<R>();
    _var50 = new java.util.ArrayList<S>();
  }

  public Integer q() {
    Integer _sum159130 = 0;
    for (R _r159132 : _var49) {
      for (S _s159133 : _var50) {
        {
          _sum159130 = (_sum159130 + (((_r159132).getA()) * ((_s159133).getC())));
        }
      }
    }
    return _sum159130;
  }

  public void insert_r(R r) {
    {
 
      assert(true);
    }
  }

  public void insert_s(S s) {
    {
      _var50.add(s);
    }
  }
}
