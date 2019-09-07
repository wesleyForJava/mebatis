package com.wesley.mebatis;

import java.io.Serializable;

public class Blog implements Serializable {
   Integer bid;//文章id
   String name;//name
   Integer authorId;//作者id

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
