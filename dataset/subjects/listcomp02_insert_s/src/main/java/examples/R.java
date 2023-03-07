package examples;

public class R {
    private Integer A;
    private String B;

    public Integer getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public R(Integer A, String B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public int hashCode() {
        int _hash_code159134 = 0;
        _hash_code159134 = (_hash_code159134 * 31) ^ ((A).hashCode());
        _hash_code159134 = (_hash_code159134 * 31) ^ ((B).hashCode());
        return _hash_code159134;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof R))
            return false;
        R o = (R) other;
        Boolean _v159135;
        if ((java.util.Objects.equals(this.A, o.A))) {
            _v159135 = (java.util.Objects.equals(this.B, o.B));
        } else {
            _v159135 = false;
        }
        return _v159135;
    }
}

