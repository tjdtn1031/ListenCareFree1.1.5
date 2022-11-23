package com.example.listencarefree;

//  REST API 데이터 구조
//  Title(String)
//  Body(String)
//  Answer(Integer)
//  Audio(File)

import com.google.gson.annotations.SerializedName;

import java.io.File;

public class Django_Item {
    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    @SerializedName("answer")
    private int answer;

    @SerializedName("audio")
    private String audio;

    @Override
    public String toString(){
        return "PostResult{"+
                "title=" + title +
                ", body=" + body +
                ", answer=" +answer +
                ", audio= " +audio + "\n" +
                "}";
    }
}
