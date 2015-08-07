package com.alimama.mobile.csdk.umupdate.a; class t { void a() { int a;
a=0;// .class public Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public b:Lcom/umeng/update/net/i;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;// .field private e:Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/t;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/alimama/mobile/csdk/umupdate/models/Promoter;Lcom/alimama/mobile/csdk/umupdate/b/e;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/t;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->c:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->e:Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->d:Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/update/net/i;);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "xp"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->q:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lcom/alimama/mobile/csdk/umupdate/a/u;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/u;);
a=0;//     invoke-direct {v5, p0}, Lcom/alimama/mobile/csdk/umupdate/a/u;-><init>(Lcom/alimama/mobile/csdk/umupdate/a/t;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/u;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/umeng/update/net/i;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/umeng/update/net/u;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->b:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     iput v6, p2, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/b/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->b:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     new-array v2, v6, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v2, v7
a=0;// 
a=0;//     iput-object v2, v1, Lcom/umeng/update/net/i;->c:[Ljava/lang/String;
a=0;// 
a=0;//     sget-boolean v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->b:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iput-boolean v6, v0, Lcom/umeng/update/net/i;->d:Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->b:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iput-boolean v7, v0, Lcom/umeng/update/net/i;->d:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->e:Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/t;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/alimama/mobile/csdk/umupdate/a/t;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/t;->d:Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/d;);
a=0;//     return-object v0
a=0;// .end method
}}
