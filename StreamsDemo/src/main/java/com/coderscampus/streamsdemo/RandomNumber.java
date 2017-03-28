package com.coderscampus.streamsdemo;

public class RandomNumber
{
  private String type;
  private Integer length;
  private Integer[] data;
  private Boolean success;
  public String getType()
  {
    return type;
  }
  public void setType(String type)
  {
    this.type = type;
  }
  public Integer getLength()
  {
    return length;
  }
  public void setLength(Integer length)
  {
    this.length = length;
  }
  public Integer[] getData()
  {
    return data;
  }
  public void setData(Integer[] data)
  {
    this.data = data;
  }
  public Boolean getSuccess()
  {
    return success;
  }
  public void setSuccess(Boolean success)
  {
    this.success = success;
  }
}
