import java.util.HashMap;
import java.util.Map;
public class TelcoAllowance implements UsagePromo {
    private Map<String, String> telcoAllowanceMap = new HashMap<>();

    public TelcoAllowance() {
        telcoAllowanceMap.put("Smart", "Data allowance: 15 GB for ₱500 per month.");
        telcoAllowanceMap.put("Globe", "Data allowance: 10 GB for ₱450 per month.");
        telcoAllowanceMap.put("Ditto", "Data allowance: 8 GB for ₱400 per month.");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoAllowanceMap.get(telcoName);
    }
}