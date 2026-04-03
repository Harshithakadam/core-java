class BankRunner{
    public static void main(String[] args){
        Bank sbi=new Bank("SBI","Dinesh Kumar Khara","Purushottamdas Thakurdas","India","government");
        sbi.display();
        System.out.println("------------------------------");
        Bank hdfc=new Bank("HDFC","Sashidhar Jagdishan","Hasmukhbhai Parekh","India","private");
        hdfc.display();
        System.out.println("------------------------------");
        Bank icici=new Bank("ICICI","Sandeep Bakhshi","Narayanan Vaghul","India","private");
        icici.display();
        System.out.println("------------------------------");
        Bank axis=new Bank("Axis Bank","Amitabh Chaudhry","PJ Nayak","India","private");
        axis.display();
        System.out.println("------------------------------");
        Bank pnb=new Bank("PNB","Atul Kumar Goel","Lala Lajpat Rai","India","government");
        pnb.display();
        System.out.println("------------------------------");
        Bank kotak=new Bank("Kotak Mahindra","Ashok Vaswani","Uday Kotak","India","private");
        kotak.display();
        System.out.println("------------------------------");
        Bank jpmorgan=new Bank("JP Morgan","Jamie Dimon","John Pierpont Morgan","USA","private");
        jpmorgan.display();
        System.out.println("------------------------------");
        Bank hsbc=new Bank("HSBC","Noel Quinn","Thomas Sutherland","UK","private");
        hsbc.display();
        System.out.println("------------------------------");
        Bank barclays=new Bank("Barclays","CS Venkatakrishnan","John Freame","UK","private");
        barclays.display();
        System.out.println("------------------------------");
        Bank canara=new Bank("Canara Bank","K Satyanarayana Raju","Ammembal Subba Rao Pai","India","government");
        canara.display();
    }
}