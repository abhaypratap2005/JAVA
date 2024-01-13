package pack;

class Account{
    public String name;         //public access modfier
    protected String email;     // protected
    private String password;     //private


    //getters & setters
    public String getPassword(){
        return this.password;
    }
    public void  setPassword(String pass){
        this.password= pass;
    }
}    

public class Y_24_pacakge {
    public static void main(String[] args) {
        Account account1= new Account();
    account1.name =  " Abhay Pratap";
    account1.email= " abhay";
    account1.setPassword("abcd");
    System.out.println(account1.getPassword());
}
}
