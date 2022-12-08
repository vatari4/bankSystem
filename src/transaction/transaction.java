package transaction;

import user.User;

public class Transaction {

 private User recipient;

 private User sender;

 private String categoryTranslation;

 private double sumTranslation;
    public Transaction () {

    }
 public Transaction(User recipient, User sender, String categoryTranslation, double sumTranslation){
     this.recipient = recipient;
     this.sender = sender;
     this.categoryTranslation = categoryTranslation;
     this.sumTranslation = sumTranslation;

 }
 public void trySending() {
        if(this.sender.getBalance() >= sumTranslation){
            this.sender.setBalance((this.sender.getBalance() - sumTranslation));
            this.recipient.setBalance((this.recipient.getBalance() + sumTranslation));


        }
 }

}
