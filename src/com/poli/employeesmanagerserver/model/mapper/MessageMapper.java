/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poli.employeesmanagerserver.model.mapper;

import com.poli.employeesmanagerserver.model.Message;

/**
 * Esta clase es la encargada de hacer las conversiones necesarias en el envío y recepción de mensajes a través de sockets. Sigue el patrón de diseño Mapper.
 *
 */
public class MessageMapper implements IMessageMapper{
     /***
     * Este método transforma una cadena de texto con el formato tipo_mensaje|de|contenido|para a un objeto POJO.
     * @param stringMessage la cadena de texto a convertir.
     * @return        una representación en forma de objeto de la clase Message.
     * @see com.poli.employeesmanagerserver.model.Message
     */    
    @Override
    public Message mapStringToMessage(String stringMessage) {
        Message message = new Message();
        if(!stringMessage.isEmpty()){
            String[] stringMessageArray = stringMessage.split("\\|");
            message.setMessageType(Integer.parseInt(stringMessageArray[0]));
            message.setFrom(stringMessageArray[1]);
            message.setContent(stringMessageArray[2]);
            message.setTo(stringMessageArray[3]);
        }        
        return message;
    }
     /***
     * Este método hace una conversión de objeto Message a una cadena de texto para su envío por el canal de salida de un socket.
     * @param message el objeto que contiene las propiedades del mensaje a convertir.
     * @return        una representación en forma de cadena de texto del objeto message.
     */
    @Override
    public String mapMessageToString(Message message) {
        String stringMessage = String.format("%s: %s", message.getFrom(), message.getContent());
        return stringMessage;
    }
    
}
