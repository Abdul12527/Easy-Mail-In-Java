# Easy-Mail-In-Java
SendMail Java Application

Overview:
SendMail is a Java application for sending emails using the JavaMail API. It provides a simple interface for sending emails with specified subjects and message content.

Prerequisites:
Before using this application, make sure you have the following prerequisites installed on your system:
- Java Development Kit (JDK) 1.8 or higher
- Apache Maven 3.6.3 or higher (for building the project)

Getting Started:
1. Clone the Repository:
   - Clone the repository to your local machine by running the following command in your terminal:
     git clone[ https://github.com/yourusername/sendmail-java](https://github.com/Abdul12527/Easy-Mail-In-Java/).git

2. Open the Project:
   - Open the project in your preferred Java development environment.

3. Configure Email Credentials:
   - Open the Credentials.java file.
   - Set your email 'to', 'from', and 'pass' values using the provided setter methods.
   - You can make SendMail class object and play with fuctionalities
   - To-"mai_id of Reciver" From-"Mail_id of sender" Password is must while creating the SendMail class
   - if you don't want to put password in java file you can use ReadFile class and get password from other file also (note you need to provide the absalute path as well as seperator might vary according the platform)

4. Build the Project:
   - Build the project using Maven by running the following command in your terminal:
     mvn clean install

5. Run the Application:
   - Run the application with the following command:
     java -cp target/SendMail-1.0-SNAPSHOT.jar Zander.mail.Main

6. Send an Email:
   - Follow the on-screen instructions to send an email.

Usage:
- Customize Email Content:
  - Modify the Main.java file to customize the email's subject, recipient, and message content.
- Specify Credentials File Path:
  - You can also specify the path to the email credentials file in the Main.java file using the ReadFile.get() method.

Dependencies:
This project uses the following external dependency:
- JavaMail API (com.sun.mail.javax.mail)
  (You don't need to download or include this dependency manually; it is managed by Apache Maven.)

Contributing:
Contributions are welcome! If you have suggestions or find issues, please create a GitHub issue or submit a pull request.

License:
This project is licensed under the MIT License. See the LICENSE file for details.

Author:
- Arjunagi A Rehman Moulaali
