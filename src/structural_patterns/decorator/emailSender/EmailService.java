package structural_patterns.decorator.emailSender;

import structural_patterns.proxy.sms_proxy.ISMSService;

public class EmailService extends ServicesDecorator {

    public EmailService(ISMSService smsService) {
        super(smsService);
    }

    @Override
    public String sendSMS(String senderMobileNumber, String receiverMobileNumber, String message) {
        StringBuilder stringBuilder = new StringBuilder();

        String smsResult = super.sendSMS(senderMobileNumber, receiverMobileNumber, message);
        String emailResult = sendEmail(senderMobileNumber, receiverMobileNumber, message);

        stringBuilder.append(smsResult);
        stringBuilder.append("\n");
        stringBuilder.append(emailResult);

        return stringBuilder.toString();
    }

    public String sendEmail(String sender, String receiver, String email) {
        // get From database email by mobile number
        return "Email: (" + email + ") sent to: " + receiver + ", from: " + sender;
    }
}