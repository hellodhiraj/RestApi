/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.List;
import javax.json.JsonArray;

/**
 *
 * @author c0691289
 */
public class MessageController 
{
    List<Message> messages;

    public MessageController() {
        
    }
    public JsonArray getAllJson()
    {
        return null;
        
    }
    public Integer getById(int id)
    {
        
        return id;
    }
    
}
