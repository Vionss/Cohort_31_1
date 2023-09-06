package practicum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Address address3 = new Address("Street3",3);

        Person person1 = new Person("John", address1);
        Person person2 = new Person("Jack", address2);

        List<Address> addresses = List.of(address1,address2,address3);
        List<Address> addressList  = new LinkedList<>(addresses);
        addressList.add(address3);
        System.out.println(addressList);

        List<Person> personList = Arrays.asList(person1,person2);

    }

    public List<Address> getAddresses(List<Person> persons ){
        List<Address> resultAddres = new ArrayList<>();
                for(Person p : persons){
                    resultAddres.add(p.getAddress());
                }
                return resultAddres;
    }
}
