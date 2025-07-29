package com.app;

final public class ImmutableClassDemo
{
    private int i;
 ImmutableClassDemo(int i)
 {
    this.i=i;
 }
 
 public ImmutableClassDemo modify(int i)
 {
    if(this.i==i)
    {
        return this;
    }else
    {
        return new ImmutableClassDemo(i);
    }
 }

 public static void main(String args[])
 {
    ImmutableClassDemo i1=new ImmutableClassDemo(10);
     ImmutableClassDemo i2=new ImmutableClassDemo(100);
      ImmutableClassDemo i3=new ImmutableClassDemo(10);
     ImmutableClassDemo o1=i1.modify(10); 
     ImmutableClassDemo o2=i1.modify(100); 
     ImmutableClassDemo o3=i1.modify(10);
     System.out.println(o1==o2); 
     System.out.println(o1==o3); 

 }

}