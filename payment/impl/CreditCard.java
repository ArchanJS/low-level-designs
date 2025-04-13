package payment.impl;

import payment.abstracts.Card;

public class CreditCard extends Card {
    public CreditCard(String _no){
        super("Credit Card",_no);
    }
}
