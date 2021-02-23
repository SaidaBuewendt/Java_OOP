public class Customer {
    private String userID;  // 2342354; пгс922-2354345
    private String telNumber; // 8-10-495-254323465  // +49 124 235432524365
    private static int count = 1;

    public Customer() {
        setUserID();
    }

    private void setUserID() {
        userID = "пгс922" + String.valueOf(count);
        count++;
    }

    public String getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userID='" + userID + '\'' +
                '}';
    }
}

class CustomerTest {
    public static void main(String[] args) {
        Customer user = new Customer();
        System.out.println(user.getUserID());
        Customer masha = new Customer();
        System.out.println(masha.getUserID());
        Customer myLovelyCustomer = new Customer();
        System.out.println(myLovelyCustomer);
    }
}