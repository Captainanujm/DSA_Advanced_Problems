class Solution {
    int remain=0;
    int update=0;
    int finalupdate=0;
    public void numbdrink(int bottles,int exchange){
        if(bottles<exchange){
            remain=bottles;
            return;
        }
        update=update+1;
        numbdrink(bottles-exchange,exchange);
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        numbdrink(numBottles,numExchange);
        // to drink new bottles 
    while(update+remain>=numExchange){
         remain=update+remain;
         finalupdate=finalupdate+update;
         update=0;
        numbdrink(remain,numExchange);
    }
    //to update one last attempt of extra bottle provided.
       finalupdate=finalupdate+update;
        return finalupdate+numBottles;
    }
}
