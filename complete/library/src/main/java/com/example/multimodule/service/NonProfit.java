public class nonProfit{
    private String npName;
    private String npCity;
    private String npDonationLink;
    private String npDescription;
    private String npWebsite;
    private boolean isActive;
    private int npId;


    public nonProfit(String npName, String npCity, String npDonationLink, 
                     String npDescription, String npWebsite, 
                     String isActive, int npId){

        this.npName = npName;
        this.npCity = npCity;
        this.npDonationLink = npDonationLink;
        this.npDescription = npDescription;
        this.isActive = isActive;
        this.npId = npId;

    }

}
