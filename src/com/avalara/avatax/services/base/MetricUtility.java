package com.avalara.avatax.services.base;

/**
 * Metric utility methods
 *
 * @author brian.hilst
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class MetricUtility
{
    /**
     *
     * @param originalMetric
     * @param transactionId
     * @param duration
     * @return
     */
    public static String BuildAuditMetrics(String originalMetric,String transactionId, long duration)
    {
        String str = "ClientMetrics:" + transactionId + ",ClientDuration," + duration + "\n";

        return str;
    }

    /**
     * Utility finction that checks if  clientmetricsrequest message has been sent from server or not
     * We will send client Metrics back to server only if we find this message in the Result Object
     * @param message  com.avalara.avatax.services.address.ArrayOfMessage or com.avalara.avatax.services.tax.ArrayOfMessage object
     * @return Object of Message
     */
    public static Object HasClientMetricMessage(Object message)
    {
        if(message.getClass().getName().equals("com.avalara.avatax.services.address.ArrayOfMessage"))
        {
            com.avalara.avatax.services.address.ArrayOfMessage addressMessages = (com.avalara.avatax.services.address.ArrayOfMessage)message;
            com.avalara.avatax.services.address.ArrayOfMessage result = null;
            if (addressMessages != null)
            {
                result = new com.avalara.avatax.services.address.ArrayOfMessage();

                for (int i = 0; i < addressMessages.size(); i++)
                {
                    if(!addressMessages.getMessage(i).toString().equalsIgnoreCase("clientmetricsrequest"))
                    {
                        result.setMessage(i,addressMessages.getMessage(i));
                    }
                }
            }
            return result;
        }
        else if(message.getClass().getName().equals("com.avalara.avatax.services.tax.ArrayOfMessage"))
        {
            com.avalara.avatax.services.tax.ArrayOfMessage taxMessages = (com.avalara.avatax.services.tax.ArrayOfMessage)message;
            com.avalara.avatax.services.tax.ArrayOfMessage result = null;
            if (taxMessages != null)
            {
                result = new com.avalara.avatax.services.tax.ArrayOfMessage();
                for (int i = 0; i < taxMessages.size(); i++)
                {
                    if(!taxMessages.getMessage(i).toString().equalsIgnoreCase("clientmetricsrequest"))
                    {
                        result.setMessage(i,taxMessages.getMessage(i));
                    }
                }
            }
            return null;
        }
        return null;
    }
}
