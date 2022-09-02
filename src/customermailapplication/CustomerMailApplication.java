/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public static Customer getCustomerTypeFromUser() {
        Customer customer = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customer = CustomerFactory.createCustomer("Regular");
                break;
            case 2:
                customer = CustomerFactory.createCustomer("Mountain");
                break;
            case 3:
                customer = CustomerFactory.createCustomer("Delinquent");
                break;
        }
        return customer;
    }
    public static String generateMail(Customer customer) {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        Customer customer = getCustomerTypeFromUser();
        String mail = null;
        if (customer != null) {
            mail = generateMail(customer);
            System.out.print(mail);
        }
        else System.out.println("Error");      
    }
    
}
