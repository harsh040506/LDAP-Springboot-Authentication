# LDAP Authentication Application

This application demonstrates LDAP (Lightweight Directory Access Protocol) authentication using Java JDK 21 and Thymeleaf as the template engine. It allows users to log in with predefined credentials. Below are the steps to try out the application:

## Features
- Secure authentication using LDAP.
- User-friendly login interface.
- Runs on `localhost` for testing purposes.

## Prerequisites
- Ensure you have Java and Maven installed on your system.
- Verify that port `8080` is available on your machine.

## Steps to Run the Application

1. **Clone the Repository**:
   ```bash
   git clone <[repository-url](https://github.com/harsh040506/LDAP-Springboot-Authentication.git)>
   cd <[repository-folder](https://github.com/harsh040506/LDAP-Springboot-Authentication/tree/main/LdapAuthentication)>
   ```

2. **Build the Application**:
   Run the following command to build the application using Maven:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Start the application by executing:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**:
   Open your web browser and navigate to:
   ```
   http://localhost:8080/
   ```

## Testing the Application
To log in, use the following credentials:

- **Username**: Achilles Pelides
- **Password**: Achilles.Pelides

## Notes
- These credentials are hardcoded for demonstration purposes and should be replaced with real LDAP credentials in a production environment.
- Ensure the LDAP server is configured correctly if testing with a live directory.

## Troubleshooting
If the application fails to start or authenticate users:

1. Check the console logs for error messages.
2. Verify that port `8080` is not in use by another application.
3. Ensure the LDAP server is accessible and properly configured.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contributions
Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

---
Happy coding!
