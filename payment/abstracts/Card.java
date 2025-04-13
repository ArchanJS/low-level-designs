package payment.abstracts;

import payment.interfaces.PaymentMethod;

public abstract class Card implements PaymentMethod {
    private String cardName;
    private String cardNo;
    public Card(String _name, String _no){
        this.cardName = _name;
        this.cardNo = _no;
    }
    public String getCardName() {
        return this.cardName;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    @Override
    public void pay() {
        System.out.println("Paying for the "+this.cardName+" with card no: "+this.cardNo);
    }
}
