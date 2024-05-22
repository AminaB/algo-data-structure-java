public class CharFunction {

    public static String accum(String chaine){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<chaine.length(); i++){
         for(int j=0; j<=i; j++){
             if(j==0){
                 result.append((Character.toUpperCase(chaine.charAt(i))));
             }else{
                 result.append(Character.toLowerCase(chaine.charAt(i)));

             }
         }
         result.append('-');
        }
        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));

    }
}
