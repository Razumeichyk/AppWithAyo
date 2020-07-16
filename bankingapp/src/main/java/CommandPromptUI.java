import model.Account;
import model.Transaction;
import model.User;
import service.AccountService;
import service.LoginService;
import service.TransactionService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandPromptUI {

    private static LoginService loginService = new LoginService();
    private static AccountService accountService = new AccountService();
    private static TransactionService transactionService = new TransactionService();

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Id: ");
        int userId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        User user = new User(userId, password);

        boolean isUserValid = loginService.authenticateUser(user);

        if(!isUserValid) {
            System.out.println("Invalid User details... Good bye! ");
            return;
        }

        System.out.println("Select one of following options:");

        System.out.println("1. Send Money");
        System.out.println("2. Check Balance");
        System.out.println("3. View Transaction History");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option){
            case 1:
                System.out.println("Enter recipient account Number:");
                String recAcctNo = sc.nextLine();
                System.out.println("Enter amount:");
                BigDecimal amount = sc.nextBigDecimal();

                Account senderAcct = accountService.getAccountByUserId(userId);
                Account recvAcct = accountService.getAccountByAccountNumber(recAcctNo);

                Transaction transaction = new Transaction();
                //Populate object
                transactionService.sendMoney(transaction);

                break;
            case 2:
                System.out.println("Not yet implemented");
                break;
            case 3:
                System.out.println("Not yet implemented");
                break;
            default:
                System.out.println("Invalid option. Good bye");
        }
    }
}
