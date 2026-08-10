public class BankAccount {

    private String name;
    private String accountNumber;
    private String nationalId;
    private String phoneNumber;
    private String email;
    private String address;
    private String dateOfBirth;
    private String gender;
    private String accountType;
    private String branchName;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setName("Mohammed El3tar");
        account.setAccountNumber("123456789");
        account.setNationalId("30101010101010");
        account.setPhoneNumber("01013698294");
        account.setEmail("mohammedelatar60@gmail.com");
        account.setAddress("Mansoura, Egypt");
        account.setDateOfBirth("06/08/2006");
        account.setGender("Male");
        account.setAccountType("Savings");
        account.setBranchName("Mansoura Branch");
        account.setBalance(1500000);

        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("National ID: " + account.getNationalId());
        System.out.println("Phone: " + account.getPhoneNumber());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Address: " + account.getAddress());
        System.out.println("Date of Birth: " + account.getDateOfBirth());
        System.out.println("Gender: " + account.getGender());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Branch: " + account.getBranchName());
        System.out.println("Balance: " + account.getBalance());
    }
}