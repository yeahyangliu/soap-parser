package com.thoughtworks;

import com.thoughtworks.domain.GetOrdersHistoryResponse;
import com.thoughtworks.domain.MultipleNodes;
import com.thoughtworks.domain.OrderStatus;
import com.thoughtworks.domain.Statue;
import org.apache.commons.io.IOUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SoapParserStringTest
{

    @Test
    public void shouldGetOrdersHistoryRes() throws IOException
    {
        String xml = getResponse("/GetOrdersHistoryResponse.xml");

        GetOrdersHistoryResponse result = new SoapParserString().getResult(xml, GetOrdersHistoryResponse.class);

        final List<OrderStatus> orderStatuses = result.getOrderStatuses();
        assertThat(orderStatuses.size(), is(2));
        final OrderStatus first = orderStatuses.get(0);
        assertThat(first.getCustomerId(), is("customerId"));
        assertThat(first.getActionCode(), is("actionCode"));
        assertThat(first.getCreateBy().toString(), is("2010-12-1"));
        assertThat(first.getStatue(), is(Statue.None));
    }

    @Test
    public void testMultipleNodes() throws IOException
    {
        String xml = getResponse("/MultipleNodes.xml");

        MultipleNodes result = new SoapParserString().getResult(xml, MultipleNodes.class);

        final List<OrderStatus> orderStatuses = result.getOrderStatuses();
        assertThat(orderStatuses.size(), is(2));
        final OrderStatus first = orderStatuses.get(0);
        assertThat(first.getCustomerId(), is("customerId"));
        assertThat(first.getActionCode(), is("actionCode"));
        assertThat(first.getCreateBy().toString(), is("2010-12-1"));
        assertThat(first.getStatue(), is(Statue.None));
    }

    private String getResponse(String path) throws IOException {
        final InputStream stream = SoapParserTest.class.getResourceAsStream(path);
        return IOUtil.toString(stream);
    }
}
