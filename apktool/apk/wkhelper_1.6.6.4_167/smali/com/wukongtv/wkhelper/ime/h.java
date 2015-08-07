package com.wukongtv.wkhelper.ime; class h { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/ime/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field private d:Landroid/content/res/Configuration;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     new-instance v0, Landroid/content/res/Configuration;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/res/Configuration;);
a=0;//     invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Configuration;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/h;->d:Landroid/content/res/Configuration;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/wukongtv/wkhelper/ime/h;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/ime/h;->c:Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/ime/h;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/ime/h;->c:Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/ime/h;->c:Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/res/Configuration;Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/h;->d:Landroid/content/res/Configuration;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Configuration;);
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/h;->a:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/h;->a:I
a=0;// 
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const v1, 0x3dac0831
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/h;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/h;->d:Landroid/content/res/Configuration;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Configuration;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3e000000
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/h;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
