public class Current extends account{
    // float minimumBalance=0.0f;
    public Current(){
        super();
        super.minimumBalance=0;
    }
    
    @Override

    public void display() {
        System.out.println("Yours account Id : "+accountId);
        System.out.println("Description : "+description);
        System.out.println("yours minimum account balance is : "+minimumBalance);
    }
}
