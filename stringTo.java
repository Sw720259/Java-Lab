import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        StringTokenizer st = new StringTokenizer(sentence);

        System.out.println("Total words: " + st.countTokens());

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(word + " (Length: " + word.length() + ")");
        }
    }
}

