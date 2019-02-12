package com.bat.petra.data.model;

import java.util.Date;
import java.util.List;

public class PetraMessage {


    private String poNumber;
    private Date orderDelivery;
    private List<PetraItemMessage> messageItems;


    private String soldTo;

    public String getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Date getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(Date orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public List<PetraItemMessage> getMessageItems() {
        return messageItems;
    }

    public void setMessageItems(List<PetraItemMessage> messageItems) {
        this.messageItems = messageItems;
    }


    @Override
    public String toString() {
        return "PetraMessage{" +
                "poNumber='" + poNumber + '\'' +
                ", orderDelivery=" + orderDelivery +
                ", messageItems=" + messageItems +
                ", soldTo='" + soldTo + '\'' +
                '}';
    }
}
