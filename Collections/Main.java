import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] word = {"Love","Hate","Spring","Miracle","Love","Summer","Vacation","Vacation","Zenit","Zenit","Spartak","Zenit"};
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i <word.length ; i++) {
            words.add(word[i]);
        }
            System.out.println(words);
        HashMap<String,Integer> words1 = new HashMap<>();
        for (int i = 0; i < word.length ; i++) {
        if(words1.containsKey(word[i])){words1.put(word[i],words1.get(word[i])+1);}
        else{words1.put(word[i],1);}
        }
        System.out.println(words1);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov","5563733");
        phoneBook.add("Ivanov","5573733");
        phoneBook.add("Rabinovich","6663733");
        phoneBook.add("Petrov","892134255");
        phoneBook.get("Petrov");
        System.out.println(phoneBook);
    }
}
