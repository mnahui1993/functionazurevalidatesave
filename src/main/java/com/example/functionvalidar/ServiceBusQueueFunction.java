package com.example.functionvalidar;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceBusQueueFunction {
    
    @FunctionName("processServiceBusMessage")
    public void run(
            @ServiceBusQueueTrigger(name = "message", queueName = "pedidos", connection = "AzureWebJobsStorage") String message,
            final ExecutionContext context
    ) {
        context.getLogger().info("Service Bus message received: " + message);
    }




}
