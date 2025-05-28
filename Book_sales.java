package Program4;

public class Book_sales {
    String saler_name;
    int no_of_sales,saler_id;

    Book_sales(String saler_name,int no_of_sales,int saler_id){
        this.saler_name=saler_name;
        this.no_of_sales=no_of_sales;
        this.saler_id=saler_id;
    }
    void display(){
        System.out.println("saler name:"+saler_name);
        System.out.println("number of sales:"+no_of_sales);
        System.out.println("saler id:"+saler_id);
    }
    public static void main(String[] args) {
        Book_sales b1=new Book_sales("pooja",2,101);
        b1.display(); 
    }
}
