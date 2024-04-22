import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static Map<String, String> telcoAllowanceMap = new HashMap<>();

    static {
        telcoAllowanceMap.put("Smart", "Data allowance: 15 GB for ₱500 per month.");
        telcoAllowanceMap.put("Globe", "Data allowance: 10 GB for ₱450 per month.");
        telcoAllowanceMap.put("Ditto", "Data allowance: 8 GB for ₱400 per month.");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        // Implementing the method to return the allowance information based on telco name and price
        return telcoAllowanceMap.get(telcoName);
    }

    @Override
    public String showAllowance(TelcoSubscription smart) {
        // This method doesn't seem to be necessary for your current implementation
        return null;
    }
}