package com.example.todofragments;

import java.util.Date;
import java.util.UUID;

public class TaskList
{

    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public TaskList(String title, boolean bIsComplete)
    {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTitle = title;
        mIsComplete = bIsComplete;
    }

    public void setIsComplete(boolean todoIsComplete)
    {
        mIsComplete = todoIsComplete;
    }

    public boolean isIsComplete()
    {
        return mIsComplete;
    }

    public UUID getId()
    {
        return mId;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getDetail()
    {
        return mDetail;
    }

    public Date getDate()
    {
        return mDate;
    }

    public void setId(UUID todoId)
    {
        mId = todoId;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

    public void setDetail(String detail)
    {
        mDetail = detail;
    }

    public void setDate(Date todoDate)
    {
        mDate = todoDate;
    }
}