public class TestEntNat {
public static void main (String args[]) {
    try{
            EntNat n1 = new EntNat(20);
            System.out.println("N1 = " + n1.getN());

            EntNat n2 = new EntNat(-12);
            System.out.println("N2 = " + n2.getN());

        } catch(ErrConst e) {
            System.out.println("Erreur de constructeur ...");
        }
    }
}