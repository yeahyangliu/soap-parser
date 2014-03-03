package com.thoughtworks.domain;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "GetOrdersHistoryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class MultipleNodes
{

    @XmlElementWrapper(name = "orderStatuses")
    @XmlElement(name = "orderStatus")
    private List<OrderStatus> orderStatuses;

    public List<OrderStatus> getOrderStatuses()
    {
        return orderStatuses;
    }

    public void setOrderStatuses(List<OrderStatus> orderStatuses)
    {
        this.orderStatuses = orderStatuses;
    }
}
