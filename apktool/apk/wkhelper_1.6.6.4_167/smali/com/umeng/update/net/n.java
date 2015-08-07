package com.umeng.update.net; class n { void a() { int a;
a=0;// .class public final Lcom/umeng/update/net/n;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/umeng/update/net/m;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/update/net/m;Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/n;->a:Lcom/umeng/update/net/m;
a=0;// 
a=0;//     const-string v0, "UMENG_DATA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, p2, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/n;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/m;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
