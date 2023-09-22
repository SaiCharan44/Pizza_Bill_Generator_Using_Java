public class Pizza {
    private int price;
    private int ec=100;
    private int et=150;

    private int bp=20;
    private int bprice;
    private Boolean veg;
    private Boolean eca=false;
    private Boolean eta=false;

    private Boolean tao=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        bprice=this.price;
    }
    public void addExtraCheese(){
        //System.out.println("Extra Cheese Added");
        this.price+=ec;
        eca=true;
    }
    public void addExtraToppings(){
        //System.out.println("Extra Toppings Added");
        this.price+=et;
        eta=true;
    }
    public void takeAway(){
        //System.out.println("Take Away Opted");
        this.price+=bp;
        tao=true;
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza : "+bprice);
        if(eca){
            bill+="Extra Cheese added : "+ec+"\n";
        }
        if(eta){
            bill+="Extra Toppings added : "+et+"\n";
        }
        if(tao){
            bill+="Take Away opted : "+bp+"\n";
        }
        bill+="Bill :"+this.price+"\n";
        System.out.println(bill);
    }
}
