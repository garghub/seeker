package examples;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class MaxBag {
    protected Integer _var587;
    protected HashMap<Integer, Boolean> _var721;
    protected Boolean _var1457;
    protected _Type328393 _var4384;
    protected Integer _var5992;
    protected ArrayList<Integer> _var66253;

    public MaxBag() {
        clear();
    }

    public MaxBag(ArrayList<Integer> l) {
        Integer _max328394 = 0;
        Boolean _first328395 = true;
        for (Integer _x328396 : l) {
            Boolean _v328397;
            if (_first328395) {
                _v328397 = true;
            } else {
                _v328397 = (_x328396 > _max328394);
            }
            if (false) {
                _first328395 = false;
                _max328394 = _x328396;
            }
        }
        _var587 = _max328394;
        HashMap<Integer, Boolean> _map328398 = new HashMap<Integer, Boolean>();
        for (Integer _var686 : l) {
            Boolean _v328399 = _map328398.getOrDefault(_var686, false);
            _v328399 = true;
            _map328398.put(_var686, _v328399);

        }
        _var721 = _map328398;
        Boolean _v328400 = true;
_label328401: do {
                  for (Integer _x328402 : l) {
                      _v328400 = false;
                      break _label328401;
                  }
              } while (false);
        _var1457 = (!(_v328400));
        Integer[] _heap_elems328389;
        _heap_elems328389 = new Integer[0];
        _Type328393 _var328388 = new _Type328393(0, _heap_elems328389);
        Integer _heap_size328390 = 0;
        Integer _sum328403 = 0;
        for (Integer _x328405 : l) {
            {
                _sum328403 = (_sum328403 + 1);
            }
        }
        for (;;) {
            Boolean _v328407;
            if ((((_heap_size328390 + _sum328403) - 1) >= 0)) {
                Boolean _v328408;
                if ((((_heap_size328390 + _sum328403) - 1) >= 0)) {
                    _v328408 = (((_heap_size328390 + _sum328403) - 1) < ((_var328388)._1.length));
                } else {
                    _v328408 = false;
                }
                _v328407 = (!(_v328408));
            } else {
                _v328407 = false;
            }
            if ((!(_v328407))) {
                break;
            }
            Integer[] _new_array328406 = new Integer[(((_var328388)._1.length) << 1) + 1];
            System.arraycopy((_var328388)._1, 0, _new_array328406, 0, ((_var328388)._1.length));
            (_var328388)._1 = _new_array328406;
        }
        for (Integer _x328392 : l) {
            (_var328388)._0 = ((_var328388)._0 + 1);
            (_var328388)._1[_heap_size328390] = _x328392;
            Integer _i328391 = _heap_size328390;
            for (;;) {
                Boolean _v328409;
                if ((_i328391 > 0)) {
                    _v328409 = (!(((_var328388)._1[((_i328391 - 1) >> 1)] >= (_var328388)._1[_i328391])));
                } else {
                    _v328409 = false;
                }
                if ((!(_v328409))) {
                    break;
                }
                Integer _swap_tmp328410 = (_var328388)._1[((_i328391 - 1) >> 1)];
                (_var328388)._1[((_i328391 - 1) >> 1)] = (_var328388)._1[_i328391];
                (_var328388)._1[_i328391] = _swap_tmp328410;
                _i328391 = ((_i328391 - 1) >> 1);
            }
            _heap_size328390 = (_heap_size328390 + 1);
        }
        _var4384 = _var328388;
        Integer _sum328411 = 0;
        for (Integer _x328413 : l) {
            {
                _sum328411 = (_sum328411 + 1);
            }
        }
        _var5992 = _sum328411;
        _var66253 = l;
    }

    public void clear() {
        Integer _max328414 = 0;
        Boolean _first328415 = true;
        _var587 = _max328414;
        HashMap<Integer, Boolean> _map328417 = new HashMap<Integer, Boolean>();
        _var721 = _map328417;
        Boolean _v328419 = true;
_label328420: do {
              } while (false);
              _var1457 = (!(_v328419));
              Integer[] _heap_elems328389;
              _heap_elems328389 = new Integer[0];
              _Type328393 _var328388 = new _Type328393(0, _heap_elems328389);
              Integer _heap_size328390 = 0;
              Integer _sum328422 = 0;
              for (;;) {
                  Boolean _v328426;
                  if ((((_heap_size328390 + _sum328422) - 1) >= 0)) {
                      Boolean _v328427;
                      if ((((_heap_size328390 + _sum328422) - 1) >= 0)) {
                          _v328427 = (((_heap_size328390 + _sum328422) - 1) < ((_var328388)._1.length));
                      } else {
                          _v328427 = false;
                      }
                      _v328426 = (!(_v328427));
                  } else {
                      _v328426 = false;
                  }
                  if ((!(_v328426))) {
                      break;
                  }
                  Integer[] _new_array328425 = new Integer[(((_var328388)._1.length) << 1) + 1];
                  System.arraycopy((_var328388)._1, 0, _new_array328425, 0, ((_var328388)._1.length));
                  (_var328388)._1 = _new_array328425;
              }
              _var4384 = _var328388;
              Integer _sum328428 = 0;
              _var5992 = _sum328428;
              _var66253 = new ArrayList<Integer>();
    }

    public Integer getMax() {
        Integer result = _var587;
        assert(true);
        return result;
    }

    public void add(Integer x) {
        Integer _conditional_result328431 = 0;
        if (_var1457) {
            Integer _conditional_result328432 = 0;
            if ((_var587 > x)) {
                _conditional_result328432 = _var587;
            } else {
                _conditional_result328432 = x;
            }
            _conditional_result328431 = _conditional_result328432;
        } else {
            _conditional_result328431 = x;
        }
        Integer _var328366 = _conditional_result328431;
        Integer _var328367 = (_var5992 + 1);
        _var587 = _var328366;
        _var1457 = true;
        Integer _heap_size328371 = _var5992;
        Integer _heap_size328376 = _var5992;
        for (;;) {
            Boolean _v328434;
            if ((((_heap_size328376 + 1) - 1) >= 0)) {
                Boolean _v328435;
                if ((((_heap_size328376 + 1) - 1) >= 0)) {
                    _v328435 = (((_heap_size328376 + 1) - 1) < ((_var4384)._1.length));
                } else {
                    _v328435 = false;
                }
                _v328434 = (!(_v328435));
            } else {
                _v328434 = false;
            }
            if ((!(_v328434))) {
                break;
            }
            Integer[] _new_array328433 = new Integer[(((_var4384)._1.length) << 1) + 1];
            System.arraycopy((_var4384)._1, 0, _new_array328433, 0, ((_var4384)._1.length));
            (_var4384)._1 = _new_array328433;
        }
        {
            (_var4384)._0 = ((_var4384)._0 + 1);
            (_var4384)._1[_heap_size328376] = x;
            Integer _i328377 = _heap_size328376;
            for (;;) {
                Boolean _v328436;
                if ((_i328377 > 0)) {
                    _v328436 = (!(((_var4384)._1[((_i328377 - 1) >> 1)] >= (_var4384)._1[_i328377])));
                } else {
                    _v328436 = false;
                }
                if ((!(_v328436))) {
                    break;
                }
                Integer _swap_tmp328437 = (_var4384)._1[((_i328377 - 1) >> 1)];
                (_var4384)._1[((_i328377 - 1) >> 1)] = (_var4384)._1[_i328377];
                (_var4384)._1[_i328377] = _swap_tmp328437;
                _i328377 = ((_i328377 - 1) >> 1);
            }
            _heap_size328376 = (_heap_size328376 + 1);
        }
        {
            _var66253.add(x);
        }
        _var5992 = _var328367;
        {
            Boolean _var1233 = _var721.getOrDefault(x, false);
            _var1233 = true;
            _var721.put(x, _var1233);

        }
    }

    public void remove(Integer x) {
        Integer _conditional_result328438 = 0;
        if ((Objects.equals(x, _var587))) {
            Integer _var328379 = 0;
            switch ((_var4384)._0) {
                case 0:
                    _var328379 = 0;
                    break;
                case 1:
                    _var328379 = 0;
                    break;
                case 2:
                    _var328379 = (_var4384)._1[1];
                    break;
                default:
                    Integer _conditional_result328439 = 0;
                    if (((_var4384)._1[1] > (_var4384)._1[2])) {
                        _conditional_result328439 = (_var4384)._1[1];
                    } else {
                        _conditional_result328439 = (_var4384)._1[2];
                    }
                    _var328379 = _conditional_result328439;
            }
            _conditional_result328438 = _var328379;
        } else {
            _conditional_result328438 = _var587;
        }
        Integer _var328368 = _conditional_result328438;
        Integer _sum328440 = 0;
        if (_var721.containsKey(x)) {
            {
                {
                    _sum328440 = (_sum328440 + 1);
                }
            }
        }
        Integer _var328369 = (_var5992 - _sum328440);
        ArrayList<Integer> _conditional_result328443 = new ArrayList<Integer>();
        if (_var721.containsKey(x)) {
            ArrayList<Integer> _singleton328448 = new ArrayList<Integer>();
            _singleton328448.add(x);
            _conditional_result328443 = _singleton328448;
        } else {
            _conditional_result328443 = new ArrayList<Integer>();
        }
        ArrayList<Integer> _var328370 = _conditional_result328443;
        _var587 = _var328368;
        Integer _conditional_result328444 = 0;
        ArrayList<Integer> _singleton328449 = new ArrayList<Integer>();
        _singleton328449.add(x);
        if (((_var66253 == _singleton328449))) {
            _conditional_result328444 = 1;
        } else {
            _conditional_result328444 = 0;
        }
        _var1457 = (_var5992 > _conditional_result328444);
        Integer _heap_size328380 = _var5992;
        if (_var721.containsKey(x)) {
            {
                (_var4384)._0 = ((_var4384)._0 - 1);
                Integer _i328381 = (Arrays.asList((_var4384)._1).indexOf(x));
                Integer _swap_tmp328450 = (_var4384)._1[_i328381];
                (_var4384)._1[_i328381] = (_var4384)._1[(_heap_size328380 - 1)];
                (_var4384)._1[(_heap_size328380 - 1)] = _swap_tmp328450;
_stop_bubble_down328383: do {
                             for (;;) {
                                 if ((!((((_i328381 << 1) + 1) < (_heap_size328380 - 1))))) {
                                     break;
                                 }
                                 Integer _child_index328384 = ((_i328381 << 1) + 1);
                                 Boolean _v328451;
                                 if ((((_i328381 << 1) + 2) < (_heap_size328380 - 1))) {
                                     _v328451 = (!(((_var4384)._1[((_i328381 << 1) + 1)] >= (_var4384)._1[((_i328381 << 1)
                                                         + 2)])));
                                 } else {
                                     _v328451 = false;
                                 }
                                 if (_v328451) {
                                     _child_index328384 = ((_i328381 << 1) + 2);
                                 }
                                 if ((!(((_var4384)._1[_i328381] >= (_var4384)._1[_child_index328384])))) {
                                     Integer _swap_tmp328452 = (_var4384)._1[_i328381];
                                     (_var4384)._1[_i328381] = (_var4384)._1[_child_index328384];
                                     (_var4384)._1[_child_index328384] = _swap_tmp328452;
                                     _i328381 = _child_index328384;
                                 } else {
                                     break _stop_bubble_down328383;
                                 }
                             }
                         } while (false);
                         _heap_size328380 = (_heap_size328380 - 1);
            }
        }
        Integer _sum328445 = 0;
        if (_var721.containsKey(x)) {
            {
                {
                    _sum328445 = (_sum328445 + 1);
                }
            }
        }
        Integer _heap_size328385 = (_var5992 - _sum328445);
        for (;;) {
            Boolean _v328454;
            if ((((_heap_size328385 + 0) - 1) >= 0)) {
                Boolean _v328455;
                if ((((_heap_size328385 + 0) - 1) >= 0)) {
                    _v328455 = (((_heap_size328385 + 0) - 1) < ((_var4384)._1.length));
                } else {
                    _v328455 = false;
                }
                _v328454 = (!(_v328455));
            } else {
                _v328454 = false;
            }
            if ((!(_v328454))) {
                break;
            }
            Integer[] _new_array328453 = new Integer[(((_var4384)._1.length) << 1) + 1];
            System.arraycopy((_var4384)._1, 0, _new_array328453, 0, ((_var4384)._1.length));
            (_var4384)._1 = _new_array328453;
        }
        if (_var721.containsKey(x)) {
            {
                _var66253.remove(x);
            }
        }
        _var5992 = _var328369;
        for (Integer _var3237 : _var328370) {
            _var721.remove(_var3237);
        }
    }
}
