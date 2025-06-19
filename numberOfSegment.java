class Solution {
    public int countSegments(String s) {
    String input = s;
    String[] parts = input.split("[,\\s]+");//here it split it from comma and space
    int i =0;
    for(String part : parts){
     if(!part.isEmpty()){//here is going to count how many parts are here 
        i++;//each time is going add 1
     }
     }
    return i;//and return the value here
}
}
