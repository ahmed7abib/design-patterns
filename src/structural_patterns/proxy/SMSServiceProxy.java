package structural_patterns.proxy;

import java.util.HashMap;

public class SMSServiceProxy {

    private final SMSService service;
    private final HashMap<String, Integer> sentCount = new HashMap<>();

    public SMSServiceProxy(SMSService service) {
        this.service = service;
    }

    public String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message) {
        if (!sentCount.containsKey(senderMobileNumber)) {
            sentCount.put(senderMobileNumber, 1);
            return service.sendSMS(senderMobileNumber, receiverMobileNumber, message);
        } else {
            int count = sentCount.get(senderMobileNumber);

            if (count >= 5) {
                return "Not permitted to send more than 5 message!";
            } else {
                count++;
                sentCount.replace(senderMobileNumber, count);
                return service.sendSMS(senderMobileNumber, receiverMobileNumber, message);
            }
        }
    }
}
