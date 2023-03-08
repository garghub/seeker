package examples;

public class S {
    private String B;
    private Integer C;

    public String getB() {
        return B;
    }

    public Integer getC() {
        return C;
    }

    public S(String B, Integer C) {
        this.B = B;
        this.C = C;
    }

    @Override
    public int hashCode() {
        int _hash_code159136 = 0;
        _hash_code159136 = (_hash_code159136 * 31) ^ ((B).hashCode());
        _hash_code159136 = (_hash_code159136 * 31) ^ ((C).hashCode());
        return _hash_code159136;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof S))
            return false;
        S o = (S) other;
        Boolean _v159137;
        if ((java.util.Objects.equals(this.B, o.B))) {
            _v159137 = (java.util.Objects.equals(this.C, o.C));
        } else {
            _v159137 = false;
        }
        return _v159137;
    }
}

