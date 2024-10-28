package structural_patterns.proxy;

public interface ISMSService {
    String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message);
}
