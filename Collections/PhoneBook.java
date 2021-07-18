import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
  private HashMap<String,ArrayList<String>>phonebook=new HashMap<>();
   private ArrayList<String>numbers;
    @Override
    public String toString() {
        return "PhoneBook{" +
                "phonebook=" + phonebook +
                '}';
    }

    public HashMap<String, ArrayList<String>> getPhonebook() {
        return phonebook;
    }



    public void add( String name,String phone_number){
        if (phonebook.containsKey(name)) {
            numbers = phonebook.get(name);
            numbers.add(phone_number);
            phonebook.put(name,numbers);
        } else {
            numbers = new ArrayList<>();
            numbers.add(phone_number);
            phonebook.put(name, numbers);
        }

        }
    public void get(String name){
        System.out.println(phonebook.get(name));
    }
        }



