package project;

import java.util.*;
import static project.ContactList.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30,
            c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, c46, c47, c48, c49, c50, c51, c52, c53, c54, c55, c56, c57, c58, c59, c60}; // Array with ContactList objects

        byte option;
        do {
            option = 0;
            System.out.print("\n|-=-------=-<|MENU|>-=-------=-|\n");
            System.out.print("| Option 1 - List all Contacts   |\n");
            System.out.print("| Option 2 - Search for name     |\n");
            System.out.print("| Option 3 - Search for email    |\n");
            System.out.print("| Option 4 - Search for country  |\n");
            System.out.print("| Option 0 - End program         |\n");
            System.out.print("|-=----------------------------=-|\n");
            System.out.print("# Select an option: ");

            if(sc.hasNextByte()) { // If it's a number
                option = sc.nextByte();
                if(option > 4 || option < 0) { // If not option between 0 and 4
                    System.out.println("\n## There's no such option! ##");
                } else if(option == 0) { // If option is 0
                    sc.close();
                    System.out.println("\n## Thanks for trying my script out! ##");
                }

                switch(option) {
                    case 1: // List all contact list with objects
                        for(Contact c: contacts) {
                            System.out.println(c);
                        }
                        break;

                    case 2: // List contact if chars at typed string is equal to chars at name string
                        System.out.print("# Type the name: ");
                        String nameSearch = sc.next();
                        byte count = 0;
                        sc.nextLine();
                        for (Contact c : contacts) {
                            boolean match = true;
                            String name = c.name.toLowerCase();
                            String search = nameSearch.toLowerCase();
                            for (int i = 0; i < Math.min(name.length(), search.length()); i++) {
                                if (name.charAt(i) != search.charAt(i)) {
                                    match = false;
                                    break;
                                }
                            }
                            if (match) {
                                System.out.println(c);
                                count++;
                            }
                        }
                        if(count == 0) {
                            System.out.println("\n## No contact with typed name was found! ##");
                        }
                        break;

                    case 3: // List contact if chars at typed string is equal to chars at e-mail string
                        System.out.print("# Type the e-mail: ");
                        String emailSearch = sc.next();
                        byte count2 = 0;
                        sc.nextLine();
                        for(Contact c: contacts) {
                            boolean match = true;
                            String email = c.email.toLowerCase();
                            String search = emailSearch.toLowerCase();
                            for (int i = 0; i < Math.min(email.length(), search.length()); i++) {
                                if (email.charAt(i) != search.charAt(i)) {
                                    match = false;
                                    break;
                                }
                            }
                            if (match) {
                                System.out.println(c);
                                count2++;
                            }
                        }
                        if(count2 == 0) {
                            System.out.println("\n## No contact with typed e-mail was found! ##");
                        }
                        break;

                    case 4: // List contact if chars at typed string is equal to chars at country string
                        System.out.print("# Type the country: ");
                        String countrySearch = sc.next();
                        byte count3 = 0;
                        sc.nextLine();
                        for(Contact c: contacts) {
                            boolean match = true;
                            String country = c.country.toLowerCase();
                            String search = countrySearch.toLowerCase();
                            for (int i = 0; i < Math.min(country.length(), search.length()); i++) {
                                if (country.charAt(i) != search.charAt(i)) {
                                    match = false;
                                    break;
                                }
                            }
                            if (match) {
                                System.out.println(c);
                                count3++;
                            }
                        }
                        if(count3 == 0) {
                            System.out.println("\n## No contact with typed country was found! ##");
                        }
                        break;

                    default: // The code will never reach here because of pre-made verifications, but still...
                        System.out.println("\n## There's no such option! ##");
                        break;
                }
            } else { // If not a number
                System.out.println("\n## Invalid option! ##");
            }
        } while(option != 0);
    }
}
