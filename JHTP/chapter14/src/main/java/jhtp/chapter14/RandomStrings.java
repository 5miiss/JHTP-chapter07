package jhtp.chapter14;

import java.security.SecureRandom;

public class RandomStrings {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String[] article = {"the","a", "one", "some" , "any"};
        String[] noun = {"boy", "girl", "dog", "town" , "car"};
        String[] verb = {"drove", "jumped", "ran", "walked" , "skipped"};
        String[] preposition = {"to", "from", "over", "under" , "on"};

        for(int i = 0; i < 20; i++){
            StringBuilder builder = new StringBuilder(80);

            builder.append(article[random.nextInt(5)])
                    .append(" ")
                    .append(noun[random.nextInt(5)])
                    .append(" ")
                    .append(verb[random.nextInt(5)])
                    .append(" ")
                    .append(preposition[random.nextInt(5)])
                    .append(" ")
                    .append(article[random.nextInt(5)])
                    .append(" ")
                    .append(noun[random.nextInt(5)])
                    .append(".")
                    .setCharAt(0, Character.toUpperCase(builder.charAt(0)));
                String s = builder.toString();
                System.out.println(s);
        }
    }
}
