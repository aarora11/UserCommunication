import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Path("/sendsms")
public class SmsService {

	@POST
	@Path("/twilio")
	@Consumes("application/json")
	public Response sendSmsViaTwilio(String json) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}
		Twilio.init(map.get("accountSid").toString(), map.get("authToken")
				.toString());

		Message msg = Message.creator(
				new PhoneNumber(map.get("reciepientPhoneNumber").toString()),
				new PhoneNumber(map.get("senderPhoneNumber").toString()),
				map.get("message").toString()).create();
		return Response.ok(msg.getSid()).build();
	}

}
