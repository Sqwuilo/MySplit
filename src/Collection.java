public class Collection {


    public String mySplit(String line, char separator){
        char[] newLine = line.toCharArray();
        String result = "";
        for (int i = 0; i < newLine.length; i++) {
            if(newLine[i] == separator) result += ' ';
            else result += newLine[i];
        }
        return result;
    }


}
