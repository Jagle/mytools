package com.umeng.update.util; class a { void a() { int a;
a=0;// .class public Lcom/umeng/update/util/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public d:Landroid/content/Context;
a=0;// 
a=0;// .field public e:Landroid/app/Notification;
a=0;// 
a=0;// .field public f:Landroid/app/Notification$Builder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/util/a;);
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v0}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/util/a;->d:Landroid/content/Context;
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/app/PendingIntent;)Lcom/umeng/update/util/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object p1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Z)Lcom/umeng/update/util/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, -0x3
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)Lcom/umeng/update/util/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput p1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Z)Lcom/umeng/update/util/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, -0x11
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 3
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "mActions"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c(Ljava/lang/CharSequence;)Lcom/umeng/update/util/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
}}
