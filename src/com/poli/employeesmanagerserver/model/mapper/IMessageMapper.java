/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poli.employeesmanagerserver.model.mapper;

import com.poli.employeesmanagerserver.model.Message;

/**
 *
 *
 */
public interface IMessageMapper {
    Message mapStringToMessage(String stringMessage);
    String mapMessageToString(Message message);
}
