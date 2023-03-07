package examples;

import java.util.Objects;

public class _Type328393 {
    public Integer _0;
    public Integer[] _1;

    public Integer get_0() {
        return _0;
    }

    public Integer[] get_1() {
        return _1;
    }

    public _Type328393(Integer _0, Integer[] _1) {
        this._0 = _0;
        this._1 = _1;
    }

    @Override
    public int hashCode() {
        int _hash_code328456 = 0;
        _hash_code328456 = (_hash_code328456 * 31) ^ ((_0).hashCode());
        _hash_code328456 = (_hash_code328456 * 31) ^ ((_1).hashCode());
        return _hash_code328456;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof _Type328393))
            return false;
        _Type328393 o = (_Type328393) other;
        Boolean _v328457;
        if ((Objects.equals(this._0, o._0))) {
            _v328457 = ((this._1 == o._1));
        } else {
            _v328457 = false;
        }
        return _v328457;
    }
}

