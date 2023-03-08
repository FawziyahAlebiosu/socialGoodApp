public class Cause{
    private String causeName;
    private List<NonProfit> nps;
    private List<Hashmap<Cause,List<NonProfit>> allCauses;



//list of non profits : value
//cause object: key
//list of all causes
//add hashmap into list of all causes

    //a list of np asscoaiested with cause obj
    //todo: a list of hashmaps:
    //hashmap 1 [cause obj: [np1, np2, np3, etc]]
    //hashmap 2 [cause obj: [np1, np2]]

    public Cause(String causeName){
        this.causeName = causeName;
        nps = new ArrayList<>();
        allCauses = new List<Hashmap<Cause,List<NonProfit>>;
    }

    public void addNonProfit(NonProfit np, Cause cause){
        for(int index = 0; index <= allCauses.size(); index++){
            if(allCauses.get(index).containsKey(cause)){
                //update the list of nonprofits
                List<NonProfit> temp = allCauses.get(index).get(cause);
                temp.add(np);
                allCauses.put(cause, temp);
            }
        }
    }
    
}

