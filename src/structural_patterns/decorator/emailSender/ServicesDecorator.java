package structural_patterns.decorator.emailSender;

import structural_patterns.proxy.sms_proxy.ISMSService;

public class ServicesDecorator implements ISMSService {

    private final ISMSService smsService;

    public ServicesDecorator(ISMSService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message) {
        return smsService.sendSMS(senderMobileNumber, receiverMobileNumber, message);
    }
}
