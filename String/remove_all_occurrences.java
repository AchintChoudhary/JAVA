class remove_all_occurrences{
    public static String removeOccurrences(String s, String part) {
        StringBuilder str =new StringBuilder(s);
        int index=str.indexOf(part);

        while(index!=-1){
            str=str.delete(index,index+part.length());
            index=str.indexOf(part);
        }
        return str.toString();
    }

public static void main(String[] args) {
String result=removeOccurrences("daabcbaabcbc", "abc");
System.out.println(result);
}





}
