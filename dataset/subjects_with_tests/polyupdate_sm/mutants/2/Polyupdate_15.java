package examples;

public class Polyupdate implements java.io.Serializable {
  protected int _var23;
  protected int _var426;

  public Polyupdate() {
    clear();
  }

  /*
  public void add0(Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add1(Integer x1, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add2(Integer x1, Integer x2, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  x.add(x2);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }
  */

  public void add3(int x1, int x2, int x3, int s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  x.add(x2);
	  x.add(x3);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  } 
  
  public Polyupdate(java.util.ArrayList<Integer> x, int s) {
    <NO-OP>;
    Integer _sum345639 = 0;
    for (Integer _x345640 : x) {
      _sum345639 = (_sum345639 + _x345640);
    }
    _var426 = _sum345639;
  }

  public void clear() {
    _var23 = 0;
    int _sum345641 = 0;
    _var426 = _sum345641;
  }

  public int sm() {
    int result = (_var23 + _var426);
    assert(true);
    return result;
  }

  public void a(int y) {
    int _conditional_result345643 = 0;
    if ((y > 0)) {
      _conditional_result345643 = (_var23 + y);
    } else {
      _conditional_result345643 = _var23;
    }
    int _var345637 = _conditional_result345643;
    int _var345638 = (_var426 + y);
    _var23 = _var345637;
    _var426 = _var345638;
    assert(true);
  }
}
