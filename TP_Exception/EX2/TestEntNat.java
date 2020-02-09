public class TestEntNat {
	public static void main(String[] args) throws ErrConst {

            EntNat n1 = new EntNat(Integer.MAX_VALUE);
            EntNat n2 = new EntNat(10);
            EntNat n3 = new EntNat(30);

            EntNat n4 = new EntNat(20);
            EntNat n5 = new EntNat(40);
            
		try {
            
			System.out.println("Somme :" + EntNat.Somme(n1, n2));

		} catch (ErrSom e1) {
			System.out.println(e1.getMessage());
			try {
				System.out.println("Difference :" + EntNat.Difference(n4, n5));
			} catch (ErrDif e2) {
				System.out.println(e2.getMessage());
				try {
					System.out.println("Produit :" + EntNat.Produit(n1, n3));
				} catch (ErrProd e3) {
					System.out.println(e3.getMessage());
				}
			}
		}
	}
}