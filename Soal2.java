package AsisPBO1;

import java.util.Date;

/**
 *
 * @author Johanna
 */
public class Soal2 {
    public static void main(String[] args) {
        customer p = new customer("Upin", "Premium");
        customer q = new customer("Ipin", "Gold");
        customer r = new customer("Ehsan", "Silver");
        customer s = new customer ("Meimei","No membership");
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
        System.out.println(s.toString());
 
        visit p1 = new visit(p, new Date());
        visit q1 = new visit(q, new Date());
        visit r1 = new visit(r, new Date());
        visit s1 = new visit(s, new Date());
        
        p1.setProductExpense(982758);
        p1.setServiceExpense(98275.8);
        System.out.print(p1.toString());
        System.out.println(" Total Harga= " + p1.getTotalexpense());
        
        q1.setProductExpense(982758);
        q1.setServiceExpense(98275.8);
        System.out.print(q1.toString());
        System.out.println(" Total Harga = " + q1.getTotalexpense());
        
        r1.setProductExpense(982758);
        r1.setServiceExpense(98275.8);
        System.out.print(r1.toString());
        System.out.println(" Total Harga = " + r1.getTotalexpense());
        
        s1.setProductExpense(982758);
        s1.setServiceExpense(98275.8);
        System.out.print(s1.toString());
        System.out.println(" Total Harga = " + s1.getTotalexpense());
    }
}