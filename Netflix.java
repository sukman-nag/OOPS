import java.util.Scanner;

interface Netflix {
    String appName = "Netfilix";

    public void moviesName();

    public void seriesName();

    public void documentryName();

    public void printDetails();

}

class UserOne implements Netflix {
    private String userName;
    private int userAge;
    private String userEmail;

    public UserOne() {

    }

    public UserOne(String usserName, int userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;

    }

    @Override
    public void moviesName() {
        System.out.println("Watchimg Mirai");
    }

    @Override
    public void seriesName() {
        System.out.println("Watching Highay Love");

    }

    @Override
    public void documentryName() {

        System.out.println("Watching Animal Documentry");

    }

    @Override
    public void printDetails() {
        System.out.println("User Name1 is " + userName);
        System.out.println("User Age is " + userAge);
        System.out.println("User email ID is " + userEmail);

    }
}

class UserTwo implements Netflix {
    private String userName;
    private int userAge;
    private String userEmail;

    public UserTwo() {

    }

    public UserTwo(String userName, int userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    @Override
    public void moviesName() {
        System.out.println("Watching Phir Hera Peri");
    }

    @Override
    public void seriesName() {
        System.out.println("Watching School Days");
    }

    @Override
    public void documentryName() {
        System.out.println("Watching Wild Animal Docuntry ");

    }

    @Override

    public void printDetails() {
        System.out.println("User Name2 is " + userName);
        System.out.println("User Age is " + userAge);
        System.out.println("User email ID is " + userEmail);
        // System.out.println(".............................................");
    }
}

class UserThree implements Netflix {
    private String userName;
    private int userAge;
    private String userEmail;

    public UserThree() {

    }

    public UserThree(String userName, int userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    @Override
    public void moviesName() {
        System.out.println("Watching Saiyaara");
    }

    @Override
    public void seriesName() {
        System.out.println("Watching Game Of thrones ");

    }

    @Override
    public void documentryName() {
        System.out.println("Watching Marine life documentry name ");

    }
    // @Override

    public void printDetails() {
        System.out.println("User Name3 is " + userName);
        System.out.println("User Age is " + userAge);
        System.out.println("User email ID is " + userEmail);
        // System.out.println(".............................................");
    }
}

class Helper {
    public UserOne creatFirstImplObject(String userName, int userAge, String userEmail) {
        UserOne one = new UserOne(userName, userAge, userEmail);
        int a = 6;
        return one;
    }

    public UserTwo creatSecondImplObject(String userName, int userAge, String userEmail) {
        UserTwo one = new UserTwo(userName, userAge, userEmail);
        return one;
    }

    public UserThree creatthirdImplObject(String userName, int userAge, String userEmail) {
        UserThree one = new UserThree(userName, userAge, userEmail);
        return one;
    }
}

class MainNetflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the user name=");
        String userName = sc.nextLine();
        System.out.println("Please enter the user age =");
        int userAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the user emailId =");
        String userEmail = sc.nextLine();
        Helper h1 = new Helper();
        Netflix n1 = h1.creatFirstImplObject(userName, userAge, userEmail);
        n1.printDetails();
        n1.moviesName();
        n1.seriesName();
        n1.documentryName();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Please enter the user name=");
        String userName1 = sc.nextLine();
        System.out.println("Please enter the user age =");
        int userAge1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the user emailId =");
        String userEmail1 = sc.nextLine();
        Netflix n2 = h1.creatSecondImplObject(userName, userAge, userEmail);
        n1.printDetails();
        n1.moviesName();
        n1.seriesName();
        n1.documentryName();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please enter the user name=");
        String userName2 = sc.nextLine();
        System.out.println("Please enter the user age =");
        int userAge2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the user emailId =");
        String userEmail2 = sc.nextLine();
        Netflix n3 = h1.creatFirstImplObject(userName, userAge, userEmail);
        n1.printDetails();
        n1.moviesName();
        n1.seriesName();
        n1.documentryName();

    }
}
