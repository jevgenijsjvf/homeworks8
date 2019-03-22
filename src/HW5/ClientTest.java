package HW5;

class ClientTest {
    public static void main (String[] args) {

        ContactInformation contactInformation=new ContactInformation();
        contactInformation.setAddress("Lacplesa 37");
        contactInformation.setCity("Riga");
        contactInformation.setCountry("Latvia");
        contactInformation.setEmail("john@gmail.com");
        contactInformation.setPhoneNumber("+37112345678");
        Client client = new Client();
        client.setFirstName("John");
        client.setLastName("Doe");
        client.setPersonalCode("010101-12345");
        client.setContactInformation(contactInformation);
        System.out.println(client);
    }
}
