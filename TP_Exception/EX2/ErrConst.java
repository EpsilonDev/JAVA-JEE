class ErrConst extends Exception {
    private int val;

    public ErrConst (int val) {
        this.val = val ;
    }

    public int getVal() {
        return val;
    }
}

