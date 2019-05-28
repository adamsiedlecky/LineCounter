package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCommunicator {

    private Scanner scanner;
    private List<String> extensionList;

    public List<String> getStarted(){

        System.out.println(textArt);
        System.out.println("--------------------------");
        System.out.println("This program is 4 you to help you to count lines in your files.");
        System.out.println("Tell me, how many file extensions are you going to count?");
        int extensionAmount = getAmount();
        System.out.println("Now, you can insert their names. (for example: php, txt, js, html)");
        extensionList = getExtensions(extensionAmount);
        System.out.println("I am going to search for files in current directory and subdirectories.");
        return extensionList;
    }

    private int getAmount(){

        boolean isValid = false;
        int amount=0;
        scanner = new Scanner(System.in);

        while(!isValid) {
            try{
                amount = scanner.nextInt();
                isValid=true;
            }catch(Exception e){
                System.out.println("It seems like you didn' provide a proper number. Try again:");
            }

        }
        return amount;
    }

    private List<String> getExtensions(int amount){

        List<String> extensionList = new ArrayList<String>();
        scanner = new Scanner(System.in);

        for (int i = 0; i < amount ; i++) {
            extensionList.add(scanner.nextLine());
        }
        return extensionList;
    }



    String textArt = ".____    .__                _________        .__               .__          __                         \n" +
            "|    |   |__| ____   ____   \\_   ___ \\_____  |  |   ____  __ __|  | _____ _/  |_  ___________          \n" +
            "|    |   |  |/    \\_/ __ \\  /    \\  \\/\\__  \\ |  | _/ ___\\|  |  \\  | \\__  \\\\   __\\/  _ \\_  __ \\         \n" +
            "|    |___|  |   |  \\  ___/  \\     \\____/ __ \\|  |_\\  \\___|  |  /  |__/ __ \\|  | (  <_> )  | \\/         \n" +
            "|_______ \\__|___|  /\\___  >  \\______  (____  /____/\\___  >____/|____(____  /__|  \\____/|__|            \n" +
            "        \\/       \\/     \\/          \\/     \\/          \\/                \\/                            \n" +
            "___.                       .___                     .__           .___.__                 __           \n" +
            "\\_ |__ ___.__. _____     __| _/____    _____   _____|__| ____   __| _/|  |   ____   ____ |  | _____.__.\n" +
            " | __ <   |  | \\__  \\   / __ |\\__  \\  /     \\ /  ___/  |/ __ \\ / __ | |  | _/ __ \\_/ ___\\|  |/ <   |  |\n" +
            " | \\_\\ \\___  |  / __ \\_/ /_/ | / __ \\|  Y Y  \\\\___ \\|  \\  ___// /_/ | |  |_\\  ___/\\  \\___|    < \\___  |\n" +
            " |___  / ____| (____  /\\____ |(____  /__|_|  /____  >__|\\___  >____ | |____/\\___  >\\___  >__|_ \\/ ____|\n" +
            "     \\/\\/           \\/      \\/     \\/      \\/     \\/        \\/     \\/           \\/     \\/     \\/\\/     ";
}
