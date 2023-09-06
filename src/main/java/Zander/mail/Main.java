package Zander.mail;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SendMail m1=new SendMail("rehman.arjunagi@irisidea.com","abdul123arj@gmail.com", ReadFile.get("C:\\Users\\abdul\\OneDrive\\Desktop\\passforjava.txt"));
        System.out.println(ReadFile.get("C:\\Users\\abdul\\OneDrive\\Desktop\\passforjava.txt"));
        m1.setMassage("testing 2");
        m1.setSubject("testing 2");
        m1.send();

    }
}