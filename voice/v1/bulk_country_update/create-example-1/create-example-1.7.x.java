// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.voice.v1.voicepermission.BulkCountryUpdate;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        BulkCountryUpdate bulkCountryUpdate = BulkCountryUpdate.creator(
                "[ { \"iso_code\": \"US\", \"low_risk_numbers_enabled\": \"true\", \"high_risk_special_numbers_enabled\":\"true\", \"high_risk_tollfraud_numbers_enabled\": \"true\" } ]")
            .create();

        System.out.println(bulkCountryUpdate.getUpdateCount());
    }
}