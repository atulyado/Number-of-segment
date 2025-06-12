class Solution {
    public int countSegments(String s) {
    String input = s;
    String[] parts = input.split("[,\\s]+");
    int i =0;
    for(String part : parts){
     if(!part.isEmpty()){
        i++;
     }
     }
    return i;
}
}