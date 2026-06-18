public class StringExample1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels=0, consonants=0;
        String vowelsSet="aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsSet.indexOf(c)!=-1) vowels++;
                else consonants++;
            }
        }
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Reversed: " + reversed);
    }
}

