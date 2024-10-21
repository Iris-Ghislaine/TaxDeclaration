import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        TaxDeclaration2 payer1 = new TaxDeclaration2();
        TaxDeclaration2 payer2 = new TaxDeclaration2();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Tax Payer's Name");
        String name = scan.nextLine();
        payer1.setTpName(name);

        System.out.println("Enter Tax Payer's Type ( VAT OR INCOME TAX)");
        String taxtype = scan.nextLine();
        payer1.settType(taxtype);

        if (!taxtype.equalsIgnoreCase("vat") && !taxtype.equalsIgnoreCase("income tax")) {
            System.out.println("Invalid tax type. Calculation skipped.");
            return;
        }

        System.out.println("Enter Tax Payer's income");
        Double inc = scan.nextDouble();
        payer1.setIncome(inc);
         
        if (inc>=5000) {
            
        

        if (taxtype.equalsIgnoreCase("vat")) {

            payer1.setVat(inc, taxtype);

            System.out.println(" Hello " + payer1.getTpName() + " you have paid " + payer1.gettType()
                    + " . your monthly salary is " + payer1.getIncome() + " you have successfully paid "
                    + payer1.getVat() + " of Value added tax");

        }

        else if (taxtype.equalsIgnoreCase("income tax")) {
            payer2.setIncomeTax(inc, taxtype);
            System.out.println(" Hello " + payer2.getTpName() + " you have paid " + payer2.gettType()
                    + " . your monthly salary is " + payer2.getIncome() + " you have successfully paid "
                    + payer2.getIncomeTax() + " of Income Tax");

        }

        else {
            System.out.println("no vat charged");
        }
}

else{
    System.out.println(" less Amount");

    return;
}
    }

}
