public class User{
    private String userType;
    private String userName;
    private String userCity;
    private List<Causes> favCauses;
    private List<NonProfit> favNonProfits;


    public User(String userType, String userName, String userCity){
        if(!userType.equals("ADMIN") || !userType.equals("USER")){
            //maybe throw an exception.
            userType = null;
        }

        this.userName = userName;
        this.userCity = userCity;
    }

    


    
    
}

