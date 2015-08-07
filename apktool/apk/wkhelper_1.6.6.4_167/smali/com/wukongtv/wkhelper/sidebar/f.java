package com.wukongtv.wkhelper.sidebar; class f { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/sidebar/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(JJ)I
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v2, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1, v3, v4}, Ljava/util/Calendar;->add(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     return v0
a=0;// .end method
}}
