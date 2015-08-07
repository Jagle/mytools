package com.wukongtv.wkhelper.h; class b { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/h/b;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/wukongtv/wkhelper/h/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/h/b;->a:Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/h/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public synthetic constructor <init>(Lcom/wukongtv/wkhelper/h/a;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/h/b;-><init>(Lcom/wukongtv/wkhelper/h/a;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/h/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a([Lcom/wukongtv/wkhelper/b/m;)Ljava/lang/Void;
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/g;->c()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetAddress;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/b/m;->b()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/net/DatagramPacket;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/DatagramPacket;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x3213
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v2, v1, v3, v0, v4}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/net/DatagramPacket;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/b;->a:Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/h/a;->a:Ljava/net/DatagramSocket;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,[B);v2=(Reference,Ljava/net/DatagramPacket;);v3=(Integer);v4=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/h/b;->a([Lcom/wukongtv/wkhelper/b/m;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
}}
