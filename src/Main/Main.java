package Main;

import Client.SoapClient;
import webServiceResources.Message;
import webServiceResources.MessageService;
import webServiceResources.MessageServiceImplService;

public class Main {

    public static void main(String[] args) {

        MessageServiceImplService messageServiceImplService = new MessageServiceImplService();
        MessageService messageService = messageServiceImplService.getMessageServiceImplPort();

    }
}
