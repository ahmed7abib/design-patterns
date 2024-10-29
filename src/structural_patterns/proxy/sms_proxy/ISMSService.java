package structural_patterns.proxy.sms_proxy;

public interface ISMSService {
    String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message);
}
