import main.codes.Demo1;

public class TaxDeclaration2{
      
   private  String tpName;
    private String tType;
    private Double income;
    private Double taxRate;
    private Double taxAmount;
    private boolean isPaid;


    // getters and setters
    public String getTpName() {
        return tpName;
    }
    public void setTpName(String tpName) {
        this.tpName=tpName;

    }
    public String gettType() {

        
        return tType;
    }
    public void settType(String tType) {
        this.tType = tType;
    }
    public Double getIncome() {
        return income;
    }
    public void setIncome(Double income) {
        this.income = income;
    }
    public Double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
    public Double getTaxAmount() {
        return taxAmount;
    }
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }
    public boolean getisPaid() {
        return isPaid;
    }
    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }


    public void setVat(Double income, String tType){
        this.tType=tType;
        this.income=income;
        if (income>=50000){
            if(tType.equals("vat")){
                taxAmount = income*0.18;
            }
        }
        else{
            System.out.println("no vat charged");
        }

    }
    
    public void setIncomeTax(Double income, String tType){
        this.tType=tType;
        this.income=income;
        if (income>=50000){
            if(tType.equals("income tax")){
            taxAmount = income*0.3;
            } 
        }
        else{
            System.out.println("no vat income tax charged");
        }

    }
     

    public Double getVat() {
        if (tType.equalsIgnoreCase("vat")) {
            return taxAmount;
        } else {
            System.out.println("No VAT tax charged.");
            return 0.0;
        }
    }

    public Double getIncomeTax() {
        if (tType.equalsIgnoreCase("income tax")) {
            return taxAmount;
        } else {
            System.out.println("No income tax charged.");
            return 0.0;
        }
    }
}

        

    

    


    

