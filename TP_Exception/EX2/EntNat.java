class EntNat {
    private int n;

    public EntNat (int n) throws ErrConst {
        if (n<0) throw new ErrConst(n) ;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public static final int Somme(EntNat n1, EntNat n2) throws ErrSom {
        int somme = n1.getN() + n2.getN();
        if( somme <= Integer.MAX_VALUE ) throw new ErrSom("Somme plus grande que MAX_VALUE !");
        return somme;
    }

    public static final int  Difference(EntNat n1, EntNat n2) throws ErrDif {
        int difference = n1.getN()- n2.getN();
        if( difference < 0 ) throw new ErrDif("Difference inferieure a ZERO !");
        return difference;
    }

    public static final int Produit(EntNat n1, EntNat n2) throws ErrProd {
        int produit = n1.getN() * n2.getN();
        if( produit <= Integer.MAX_VALUE ) throw new ErrProd("Produit plus grand que MAX_VALUE !");
        return produit;
    }
}

