package structural_patterns.proxy;

public class SMSService implements ISMSService {

    @Override
    public String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message) {
        return "SMS sent to: " + receiverMobileNumber + ", from: " + senderMobileNumber;
    }
}
