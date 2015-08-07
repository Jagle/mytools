package com.umeng.update.net; class i { void a() { int a;
a=0;// .class public Lcom/umeng/update/net/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final h:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field public c:[Ljava/lang/String;
a=0;// 
a=0;// .field public d:Z
a=0;// 
a=0;// .field public e:Z
a=0;// 
a=0;// .field public f:Z
a=0;// 
a=0;// .field final g:Landroid/os/Messenger;
a=0;// 
a=0;// .field private i:Landroid/content/Context;
a=0;// 
a=0;// .field private j:Lcom/umeng/update/net/u;
a=0;// 
a=0;// .field private k:Landroid/os/Messenger;
a=0;// 
a=0;// .field private l:Ljava/lang/String;
a=0;// 
a=0;// .field private m:Ljava/lang/String;
a=0;// 
a=0;// .field private n:Ljava/lang/String;
a=0;// 
a=0;// .field private o:Landroid/content/ServiceConnection;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/update/net/i;->h:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/umeng/update/net/u;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/net/i;->d:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/net/i;->e:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/net/i;->f:Z
a=0;// 
a=0;//     new-instance v0, Landroid/os/Messenger;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Messenger;);
a=0;//     new-instance v1, Lcom/umeng/update/net/l;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/net/l;);
a=0;//     invoke-direct {v1, p0}, Lcom/umeng/update/net/l;-><init>(Lcom/umeng/update/net/i;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/l;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Messenger;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/i;->g:Landroid/os/Messenger;
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/update/net/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/update/net/j;);
a=0;//     invoke-direct {v0, p0}, Lcom/umeng/update/net/j;-><init>(Lcom/umeng/update/net/i;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/j;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/i;->o:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/update/net/i;->l:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/umeng/update/net/i;->m:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/umeng/update/net/i;->n:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/umeng/update/net/i;->j:Lcom/umeng/update/net/u;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/update/net/i;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/i;->k:Landroid/os/Messenger;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->j:Lcom/umeng/update/net/u;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/u;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/umeng/update/net/i;)Landroid/content/ServiceConnection;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->o:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ServiceConnection;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/net/i;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/umeng/update/net/i;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lcom/umeng/update/net/i;)[Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->c:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lcom/umeng/update/net/i;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/net/i;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic k(Lcom/umeng/update/net/i;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/net/i;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic l(Lcom/umeng/update/net/i;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/net/i;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic m(Lcom/umeng/update/net/i;)Landroid/os/Messenger;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->k:Landroid/os/Messenger;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Messenger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/i;->o:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/i;->i:Landroid/content/Context;
a=0;// 
a=0;//     const-class v3, Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
