package com.umeng.a; class k { void a() { int a;
a=0;// .class public final Lcom/umeng/a/k;
a=0;// .super Lcom/umeng/a/l;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:La/a/hc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(La/a/hc;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/umeng/a/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/a/k;);
a=0;//     const-wide/32 v0, 0x5265c00
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/umeng/a/k;->a:J
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/a/k;->b:La/a/hc;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Z)Z
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/umeng/a/k;->b:La/a/hc;
a=0;// 
a=0;//     #v2=(Reference,La/a/hc;);
a=0;//     iget-wide v2, v2, La/a/hc;->d:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/umeng/a/k;->a:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
