import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {
    private static Map<String, String> telcoUnliCallTextMap = new HashMap<>();

    static {
        telcoUnliCallTextMap.put("Smart", "Not available. You will be charged per use.");
        telcoUnliCallTextMap.put("Globe", "Unlimited calls and texts to Globe network subscribers.");
        telcoUnliCallTextMap.put("Ditto", "Unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoUnliCallTextMap.get(telcoName);
    }

    @Override
    public String showUnliCallsTextOffer(TelcoSubscription smart) {
        return null;
    }
}