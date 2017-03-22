/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author c0691289
 */
public class Message implements Serializable {
    private int id;
    private String title;
    private String contents;
    private String author;
    private SimpleDateFormat dt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public SimpleDateFormat getDt() {
        return dt;
    }

    public void setDt(SimpleDateFormat dt) {
        this.dt = dt;
    }
    
    

    public Message() {
    }

    public Message(JsonObject json)
    {
        id=json.getInt("id");
        title=json.getString("title");
        contents=json.getString("contents");
        author=json.getString("author");
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public JsonObject toJson()
    {
        return Json.createObjectBuilder().add("id",id).add("title",title).add("author",author).add("content",contents).build();
    }

  
    
    
}
