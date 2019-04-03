//String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string.
public class StringManipulation{
    public String trimAndConcat(String string1, String string2){
        String str1 =string1.trim();
        String str2= string2.trim();
        String str = (str1 + str2);
        return str;
    }

    // ● Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.

    public int getIndexOrNull(String words, char apple){
        for (int x = 0; x < words.length(); x++){
            if (apple == words.charAt(x)){
                return x;
            } 
        }
        return -1;
    }   

//  Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.

    public Integer getIndexOrNull(String str1, String str2){
        for (int y = 0; y < str1.length(); y++){
            if (str2 == str1.indexOf(y)){
                return y;
            }
        } //Incomparable int and String
        return -1;
    }
    // String concatSubstring(String str1, int x, int y, String str2){
        
    // }
    // ● String concatSubstring(String, int, int, String): Get a substring using a starting and ending index 
    // concatenate that with the second string input to our method. Feel free to use the substring method of the String class.

}


