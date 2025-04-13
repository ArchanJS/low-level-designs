package payment.impl;

import payment.abstracts.Card;

public class DebitCard extends Card {
    public DebitCard(String _no){
        super("Debit Card", _no);
    }
}
