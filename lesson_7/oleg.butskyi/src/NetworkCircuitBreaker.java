public class NetworkCircuitBreaker {
    private int amperOffNCB;
    private int HowMuchWattWillUse;
    private int maxWattInNetworkCircuitBreaker;
    private int CableSection;
    private int volts220 = 220;

    public NetworkCircuitBreaker(int amperOffNCB, int HowMuchWattWillUse, int CableSection) {
        this.amperOffNCB = amperOffNCB;
        this.HowMuchWattWillUse = HowMuchWattWillUse;
        this.CableSection = CableSection;
    }

    public void getMaxWattInNetworkCircuitBreaker220(){
        this.maxWattInNetworkCircuitBreaker = amperOffNCB * volts220;
    }

    public void checkingOnUseTheNetworkCircuitBreaker(){
        if (maxWattInNetworkCircuitBreaker <= HowMuchWattWillUse){

            System.out.println("You can use that Network Circuit Breaker ");
        }else {
            System.out.println("You can't use that Network Circuit Breaker ");
        }
    }

    public int getMaxWattInNetworkCircuitBreaker() {
        return maxWattInNetworkCircuitBreaker;
    }
}
