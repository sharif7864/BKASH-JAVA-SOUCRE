import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bkash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        int Choice, Password, Amount;

        System.out.println("1. Send Money");
        System.out.println("2. Send Money to Non-bKash User");
        System.out.println("3. Mobile Recharge");
        System.out.println("4. Payment");
        System.out.println("5. Cash Out");
        System.out.println("6. Pay Bill");
        System.out.println("7. Tk 50 CASHBACK");
        System.out.println("8. My BKash");
        System.out.println("9. Reset Your Pin");

        Password = 487295;
        Amount = 48000;

        System.out.println("Entered Your Choice: ");
        Choice = sc.nextInt();

        switch (Choice) {
            case 1:
                int a, b, c, d;
                System.out.println("Enter Receiver bkash Account No: ");
                a = sc.nextInt();
                System.out.println("FREE Send Money to 5 priyo Numbers");
                System.out.println("Dail *247# and select option 8 to");
                System.out.println("Find Priyo Numbers");
                System.out.println("Enter Amount: ");
                b = sc.nextInt();
                System.out.println("FREE Send Money to 5 priyo Numbers");
                System.out.println("up to 25,000 Tk. every month.");
                System.out.println("Entered Reference: ");
                c = sc.nextInt();
                System.out.println("Send Money Tk" + b);
                System.out.println("To" + a);
                System.out.println("Successful. Ref." + c);
                System.out.println("Enter Menu PIN to confirm: ");
                d = sc.nextInt();
                if (d != Password) {
                    System.out.println("You Entered Wrong Password");
                    System.out.println(".........Please Try Again.........");
                } else {
                    System.out.println("Send Money Tk" + b);
                    System.out.println("To" + a);
                    System.out.println("Successful. Ref." + c);
                    System.out.println("Fee Tk.00." + " Balance Tk = " + (Amount - b));
                    System.out.println("TrxID " + " CMT5TH");
                    System.out.println("at" + formatter.format(date));
                }
                break;
            case 2:
                int i, f, j, h;
                System.out.println("Enter Receiver No: ");
                i = sc.nextInt();
                System.out.println("Enter Amount: ");
                f = sc.nextInt();
                System.out.println("Entered Reference: ");
                j = sc.nextInt();
                System.out.println("Send Money Tk" + f);
                System.out.println("To" + i);
                System.out.println("Successful. Ref." + j);
                System.out.println("Enter Menu PIN to confirm: ");
                h = sc.nextInt();
                if (h != Password) {
                    System.out.println("You Entered Wrong Password");
                    System.out.println(".........Please Try Again.........");
                } else {
                    System.out.println("Send Money Tk" + f);
                    System.out.println("To" + i);
                    System.out.println("Successful. Ref." + j);
                    System.out.println("Fee Tk.00." + " Balance Tk = " + (Amount - f));
                    System.out.println("TrxID " + " CMT5TH");
                    System.out.println("at " + formatter.format(date));
                }
                break;
            case 3:
                System.out.println("bKash");
                System.out.println("1. Robi");
                System.out.println("2. Airtel");
                System.out.println("3. Banglalink");
                System.out.println("4. Grameenphone");
                System.out.println("5. Teletalk");
                System.out.println("6. Cash Out at 1.49% from 1 Priyo Agent Number");
                System.out.println("0. Main Menu");

                System.out.println("Entered Your Choice: ");
                Choice = sc.nextInt();

                if (Choice == 1) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Robi No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 2) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Airtel No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 3) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Banglalink No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 4) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Grameenphone No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 5) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Teletalk No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 6) {

                    System.out.println("bKash");
                    System.out.println("1. Prepaid");
                    System.out.println("2. Postpaid");
                    System.out.println("3. Auto-Recharge");
                    System.out.println("4. Best Offers");
                    System.out.println("5. Internet packs");
                    System.out.println("6. Voice Packs");
                    System.out.println("7. Bundle Packs");
                    System.out.println("0. Main Menu");

                    System.out.println("Entered Your Choice: ");
                    Choice = sc.nextInt();

                    int k, l, m;
                    System.out.println("Enter Robi No: ");
                    k = sc.nextInt();
                    System.out.println("Cash Out at 1.49% from 1 Priyo Agent Number");
                    System.out.println("Enter Amount: ");
                    l = sc.nextInt();
                    System.out.println("Mobile Recharge");
                    System.out.println("To: " + k);
                    System.out.println("Amount: " + l);
                    System.out.println("To know if the amount is for recharge offer, contact mobile operator");
                    System.out.println("Enter Menu Pin to confirm: ");
                    m = sc.nextInt();

                    if (Password != m) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    } else {
                        System.out.println("Received Recharge");
                        System.out.println("Request of Taka " + l);
                        System.out.println("Fee Tk 0.00");
                        System.out.println("Balance Tk = " + (Amount - l));
                        System.out.println("TrxID " + " CMT5TH");
                        System.out.println("at " + formatter.format(date));
                        System.out.println("was Successful");
                    }
                } else if (Choice == 0) {
                    System.out.println();
                } else {
                    System.out.println("Your Input is Wrong");
                }
                break;

            case 4:
                System.out.println("Enter Merchant bKash Account No: ");
                int n = sc.nextInt();
                System.out.println("Enter Amount: ");
                int o = sc.nextInt();
                System.out.println("Enter Reference: ");
                int p = sc.nextInt();
                System.out.println("Enter Counter No: ");
                int q = sc.nextInt();
                System.out.println("Payment");
                System.out.println("To " + n);
                System.out.println("Amount " + o);
                System.out.println("Reference " + p);
                System.out.println("Counter " + q);
                System.out.println("Enter Menu Pin to Confirm: ");
                int r = sc.nextInt();

                if (r != Password) {
                    System.out.println("You Entered Wrong Password");
                    System.out.println(".........Please Try Again.........");
                } else {
                    System.out.println("Payment");
                    System.out.println("Tk " + o);
                    System.out.println("to " + n);
                    System.out.println("successful. " + "Ref " + p);
                    System.out.println("Counter " + q);
                    System.out.println("Fee Tk 0.00 " + "Balance Tk" + (Amount - o));
                    System.out.println("at " + formatter.format(date));
                }
                break;
            case 5:
                break;

            case 6:
                System.out.println("bKash");
                System.out.println("1. Electricity (Prepaid)");
                System.out.println("2. Electricity (Postpaid)");
                System.out.println("3. Gas");
                System.out.println("4. Water");
                System.out.println("5. Internet and Phone");
                System.out.println("6. TV");
                System.out.println("7. City Service");
                System.out.println("8. Education");
                System.out.println("9. Financial Services");
                System.out.println("10. Other");
                System.out.println("0. Main Menu");

                System.out.println("Enter Your Choice");
                Choice = sc.nextInt();

                if (Choice == 1) {
                    System.out.println("1. PALLI BIDYUT\n2. DESCO\n3. DPDC\n4. BPDB\n5. Sylhet BPDB\n6. Westzone\n7. NESCO\n0. Main Menu");
                    System.out.println("Enter Your Choice");
                    Choice = sc.nextInt();

                    System.out.println("PALLI BIDYUT (Prepaid)\n 1. Bill Breakdown\n 2. Make Payment\n 0. Main Menu");
                    Choice = sc.nextInt();

                    if (Choice == 1) {
                        System.out.println("PALLI BIDYUT (Prepaid)");
                        System.out.println("Bill Breakdown");
                        System.out.println("1. Input Meter Number: \n 2. Saved Accounts\n 0. Main Menu");
                        Choice = sc.nextInt();
                        System.out.println("Enter Meter Number: ");
                        int meter = sc.nextInt();
                        System.out.println("Enter Amount: ");
                        int amount = sc.nextInt();
                        System.out.println("Bilk Breakdown.\n To: PALLI BIDYUT (PREPAID)\n Meter No: " + meter);
                        System.out.println("Amount: " + amount);
                        System.out.println("Menu Pin to Confirm");
                        int pass = sc.nextInt();
                        if (pass != Password) {
                            System.out.println("You Entered Wrong Password");
                            System.out.println(".........Please Try Again.........");
                        } else {
                            System.out.println("Customer received two SMS notification(s):");
                            System.out.println("1. ''Please wait for confirmation SMS''\n2. Bill Payment");
                            System.out.println("Bill Payment Was Successful\nTrxID: CMT5TH");
                            System.out.println("Your Cureent Balance is Tk: " + (Amount - amount));
                            System.out.println("at " + formatter.format(date));
                        }
                    }
                } else if (Choice == 2) {
                    System.out.println("Electricity (Postpaid)");
                    System.out.println("1. PALLI BIDYUT\n2. DESCO\n3. DPDC\n4. Westzone\n5. BPDB\n0. Main Menu");
                    System.out.println("Enter Your Choice");
                    Choice = sc.nextInt();

                    System.out.println("PALLI BIDYUT (Postpaid)\n 1. Check Bill\n 2. Make Payment\n 0. Main Menu");
                    Choice = sc.nextInt();

                    if (Choice == 1) {
                        System.out.println("Check Bill");
                        System.out.println("1. Input Meter Number: \n 2. Saved Accounts\n 0. Main Menu");
                        Choice = sc.nextInt();
                        System.out.println("Enter Meter Number: ");
                        int meter = sc.nextInt();
                        System.out.println("Enter Amount: ");
                        int amount = sc.nextInt();
                        System.out.println("Bilk Breakdown.\n To: PALLI BIDYUT (PREPAID)\n Meter No: " + meter);
                        System.out.println("Amount: " + amount);
                        System.out.println("Menu Pin to Confirm");
                        int pass = sc.nextInt();
                        if (pass != Password) {
                            System.out.println("You Entered Wrong Password");
                            System.out.println(".........Please Try Again.........");
                        } else {
                            System.out.println("Customer received two SMS notification(s):");
                            System.out.println("1. ''Please wait for confirmation SMS''\n2. Bill Payment");
                            System.out.println("Bill Payment Was Successful\nTrxID: CMT5TH");
                            System.out.println("Your Cureent Balance is Tk: " + (Amount - amount));
                            System.out.println("at " + formatter.format(date));
                        }
                        if (Choice == 2) {
                            System.out.println("Pay Bill\n1. Input Bill A/C Number:\n2. Saved Accounts\n0. Main Menu");
                            Choice = sc.nextInt();
                            System.out.println("Enter Customer\nBill Accounts Number: ");
                            int ac = sc.nextInt();
                            System.out.println("Bill Month & Year (MMYYYY)");
                            int mont = sc.nextInt();
                            System.out.println("Enter Amount: ");
                            int amount2 = sc.nextInt();
                            System.out.println("Bill Payment.\n To: PALLI BIDYUT (PREPAID)\n Meter No: " + meter);
                            System.out.println("Amount: " + amount);
                            System.out.println("Menu Pin to Confirm");
                            pass = sc.nextInt();
                        }
                    }
                } else if (Choice == 3) {
                    System.out.println("------Gas are Comming Soon------");
                } else if (Choice == 4) {
                    System.out.println("------Water Bill are Comming Soon------");
                } else if (Choice == 5) {
                    System.out.println("------Internet & Phone Bill are Comming Soon------");
                } else if (Choice == 6) {
                    System.out.println("------TV Bill is Comming Soon------");
                } else if (Choice == 7) {
                    System.out.println("--------City Service bill are Comming Soon-------");
                } else if (Choice == 8) {
                    System.out.println("------Education bill is Comming Soon------");
                } else if (Choice == 9) {
                    System.out.println("------Financical Service bill are Comming Soon------");
                } else if (Choice == 10) {
                    System.out.println("------Other bill is Comming Soon------");
                } else {
                    System.out.println("-------Your input is wrong------");
                }
                break;

            case 7:
                System.out.println("50TK CASHBACK! 20TK Cashback on\n50TK App Self Recharge;\n10Tk Cashback on 50Tk USSD *247#");
                System.out.println("Self Recharge; 20Tk Cashback on 2510TK Cash In! Valid till 7 Jun. TCA");
                break;

            case 8:
                System.out.println("bKash");
                System.out.println("1. Check Balance\n2. Request Statement\n3. Change Pin\n4. Priyo Numbers");
                System.out.println("5. Save bill info\n6. Update MNP Info\n7. Confirm iPhone Login\n8. Helpline\0. Main Menu");

                System.out.println("Enter your Choice: ");
                Choice = sc.nextInt();

                if (Choice == 1) {
                    System.out.println("Enter Mune Pin: ");
                    int pass = sc.nextInt();
                    if (pass != Password) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    }
                    else {
                        System.out.println("Your current bKash Account balance is Tk " + Amount);
                        System.out.println("Your available bKash Account balance is Tk " + Amount);
                        System.out.println("bKash App diye balance check ekdom simple!");
                    }
                }
                else if (Choice == 2) {
                    System.out.println("Enter Menu Pin: ");
                    int pass = sc.nextInt();
                    if (pass != Password) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    }
                    else {
                        System.out.println("------Your Statement-------");
                    }
                }
                else if (Choice == 3) {
                    System.out.println("Enter Old Pin");
                    int pass = sc.nextInt();
                    System.out.println("Enter 5 digit Pin: ");
                    int pass2 = sc.nextInt();

                    if (pass != Password) {
                        System.out.println("You Entered Wrong Password");
                        System.out.println(".........Please Try Again.........");
                    }
                    else {
                        System.out.println("Your Password was Successfully Change");
                        System.out.println("Your New Passwrod is: " + pass2);
                        System.out.println("Please do not share this password to any one");
                    }
                }
                else if (Choice == 4) {
                    System.out.println("Priyo Numbers");
                    System.out.println("1. Send Money\n2. Cash Out\n3. Main Menu");

                    System.out.println("Enter Your Choice: ");
                    Choice = sc.nextInt();

                    if (Choice == 1){
                        System.out.println("Send Money");
                        System.out.println("1. Add Priyo Number\n2. Remove Priyo Number");
                        System.out.println("3. Check Priyo Numbers\n4. Check Priyo Number Trx Limit\n0. Main Menu");

                        System.out.println("Enter Your Choice: ");
                        Choice = sc.nextInt();
                        if (Choice == 1){
                            System.out.println("Enter Customer Bkash Account No: ");
                            int num = sc.nextInt();
                            System.out.println("Enter Name (Max 6 Characters.\nDo not use any special character and space)");
                            int num2 = sc.nextInt();
                            System.out.println("Add Priyo Number:");
                            System.out.println("Number: " + num);
                            System.out.println("Name: " + num2);
                            System.out.println("Enter Pin To Confirm: ");
                            int pass = sc.nextInt();

                            if (pass != Password) {
                                System.out.println("You Entered Wrong Password");
                                System.out.println(".........Please Try Again.........");
                            }
                            else {
                                System.out.println("You added Successfully " + num + " as your Priyo Number");
                                System.out.println("Now you can free Send money for this number upto Tk 25,000");
                                System.out.println("You can added more 4 numbers to your Priyo Number");
                            }
                        }
                        else if (Choice == 2) {
                            System.out.println("Remove Priyo Number");
                            System.out.println("Entered Your Priyo Number: ");
                            int num = sc.nextInt();
                            System.out.println("Enter Mneu Pin to Confirm: ");
                            int pass = sc.nextInt();
                            if (pass != Password) {
                                System.out.println("You Entered Wrong Password");
                                System.out.println(".........Please Try Again.........");
                            }
                            else {
                                System.out.println("You added Successfully " + num + " remove as your Priyo Number");
                                System.out.println("You can added more 5 numbers to your Priyo Number");
                            }
                        }
                    }
                    else if (Choice == 2) {
                        System.out.println("Cash Out");
                        System.out.println("1. Add Priyo Agent Number\n2. Remove Priyo Agent Number");
                        System.out.println("3. Check Priyo Agent\n0. Main Menu");

                        System.out.println("Enter Your Choice: ");
                        Choice = sc.nextInt();
                        if (Choice == 1){
                            System.out.println("Enter Agent Account No: ");
                            int num = sc.nextInt();
                            System.out.println("Enter Name (Max 6 Characters.\nDo not use any special character and space)");
                            int num2 = sc.nextInt();
                            System.out.println("Add Priyo Agent Number:");
                            System.out.println("Number: " + num);
                            System.out.println("Name: " + num2);
                            System.out.println("Enter Pin To Confirm: ");
                            int pass = sc.nextInt();

                            if (pass != Password) {
                                System.out.println("You Entered Wrong Password");
                                System.out.println(".........Please Try Again.........");
                            }
                            else {
                                System.out.println("You added Successfully " + num + " as your Agent Number");
                                System.out.println("Now you can free cash out for this number up to Tk 25,000");
                                System.out.println("You can remove this number for next month");
                            }
                        }
                    }
                }
        }
    }
}