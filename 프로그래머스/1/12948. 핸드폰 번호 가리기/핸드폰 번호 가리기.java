class Solution {
    public String solution(String phone_number) {
        String string = phone_number.substring(0, phone_number.length() - 4);
        String replaced = string.replaceAll("[0-9]", "*");
        
        return replaced + phone_number.substring(string.length());
    }
}