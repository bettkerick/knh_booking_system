/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knh_booking_system;
//import org.json.*;
///**
// *
// * @author bett
// */
////SendMessage.sendMyMessage(phoneNumber, message);
//public class SendMessage{
//    
//        private static final String username = "kipkirui.bett";
//        private static final  String apiKey ="b1507f2ebe092509370b17a5c04f7e906745e5f81045b734e2d10c6e234c8253";
//     
//        private static final String sucessMsg ="Sucess";
//        
//    public static String sendMyMessage(String recipients,String message){
//       
//        
//       //create the new instance of Gateway Class
//       
//        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);
//       
//          try{
//              
//             JSONArray results = gateway.SendMessage(recipients, message);
//               for( int i = 0; i < results.length(); ++i ) {
//                  JSONArray result = results.getJSONArray(i);
//                 System.out.print(result.getString("status") + ","); // status is either "Success" or "error message"
//                 System.out.print(result.getString("number") + ",");
//                 System.out.print(result.getString("messageId") + ",");
//                 System.out.println(result.getString("cost"));
//        }
//          }catch(Exception e){
//               System.out.println("Encountered an error while sending " + e.getMessage());
//          }
//        System.out.println("SEND SND SEND");
//          return "SEND SND SEND";
//    }
//    
//}

///shit
import org.json.*;
import java.util.HashMap;

public class SendMessage{
    //public class SendMessage{
    
        private static final String username = "kipkirui.bett";
        private static final  String apiKey ="b1507f2ebe092509370b17a5c04f7e906745e5f81045b734e2d10c6e234c8253";
        private static final String sucessMsg ="Sucess";
        
    public static String sendMyMessage(String recipients,String message){
       
      
       //create the new instance of Gateway Class
       
        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);

		try {
			org.json.JSONArray results = gateway.sendMessage(recipients, message);

			for( int i = 0; i < results.length(); ++i ) {
				JSONObject result = results.getJSONObject(i);
				System.out.print(result.getString("status") + ","); // status is either "Success" or "error message"
				System.out.print(result.getString("number") + ",");
				System.out.print(result.getString("messageId") + ",");
				System.out.println(result.getString("cost"));
			}
		} catch (Exception e) {
			System.out.println("Encountered an error while sending " + e.getMessage());
		}
                 System.out.println("SEND SND SEND");
                 return "SEND SND SEND";
	}
}