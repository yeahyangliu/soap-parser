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


    @XmlElementWrapper(name = "applicationerrors")
    @XmlElement(name = "applicationerror")
    private List<ApplicationError> applicationErrors;

    public List<OrderStatus> getOrderStatuses()
    {
        return orderStatuses;
    }

    public void setOrderStatuses(List<OrderStatus> orderStatuses)

    {
        this.orderStatuses = orderStatuses;
    }

    public List<ApplicationError> getApplicationErrors() {
        return applicationErrors;
    }

    public void setApplicationErrors(List<ApplicationError> applicationErrors) {
        this.applicationErrors = applicationErrors;
    }
}
