public class ValidateIpAddress {

    // 468. Validate IP Address
    // https://leetcode.com/problems/validate-ip-address/description/

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]+");
    }

    private static boolean isHexDecimal(String str){
        return str != null && str.matches("[a-fA-F0-9]+");
    }

    public String validIPAddress(String queryIP) {
        //Check if it's IPv4. Split the string into 4 parts with a period. If there isn't 4 parts, return false.
        //If any part of the addresses contains a leading zero or contains invalid characters, return false.

        //Check if it's IPv6. Split the string into 8 parts. If there isn't 8 parts, return false.
        //If any part of the addresses contains more than 5 characters or contains invalid characters, return false.
        
        String[] ipv4 = queryIP.split("\\.", 4);
        String[] ipv6 = queryIP.split(":", 8);

        if(ipv4.length == 4){
            boolean isIpv4 = true;

            for(int i = 0; i < ipv4.length; i++){

                int num = 0;

                if(ipv4[i] == "" || (ipv4[i].charAt(0) == '0' && ipv4[i].length() > 1) || ipv4[i].length() > 4 || !isNumeric(ipv4[i])){
                    isIpv4 = false;
                    break;
                }

                if(isNumeric(ipv4[i])){
                    num = Integer.parseInt(ipv4[i]);
                }

                if(num > 255){
                    isIpv4 = false;
                    break;
                }
            }

            if(isIpv4){
                return "IPv4";
            }
        }
        
        if(ipv6.length == 8){
            boolean isIpv6 = true;

            for(int i = 0; i < ipv6.length; i++){
                if(ipv6[i] == "" || ipv6[i].length() > 4 || !isHexDecimal(ipv6[i])){
                    isIpv6 = false;
                    break;
                }
            }

            if(isIpv6){
                return "IPv6";
            }
        }

        return "Neither";

    }
}