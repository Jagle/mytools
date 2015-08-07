package com.umeng.update.net; class p { void a() { int a;
a=0;// .class Lcom/umeng/update/net/p;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/util/SparseArray;
a=0;// 
a=0;// .field private c:Ljava/util/Map;
a=0;// 
a=0;// .field private d:Lcom/umeng/update/net/v;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/umeng/update/net/p;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/util/SparseArray;Ljava/util/Map;Lcom/umeng/update/net/v;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/p;);
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/umeng/update/net/p;->d:Lcom/umeng/update/net/v;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Lcom/umeng/update/net/k;)I
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shr-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shr-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Lcom/umeng/update/net/k;II)Lcom/umeng/update/net/r;
a=0;//     .locals 11
a=0;// 
a=0;//     const/16 v10, 0x8
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/16 v9, 0xe
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/umeng/update/net/r;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/net/r;);
a=0;//     invoke-direct {v2, v1}, Lcom/umeng/update/net/r;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/r;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v3, 0x8000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v8, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1}, La/b/o;->j(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/umeng/update/net/r;->c(Ljava/lang/CharSequence;)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x1080081
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/umeng/update/util/a;->b(I)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/umeng/update/util/a;->a(Landroid/app/PendingIntent;)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v3, v9, :cond_0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, v0, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iput-wide v4, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     new-instance v3, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1}, La/b/n;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v0, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RemoteViews;);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v9, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v4, 0x1050005
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     const v5, 0x1050006
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v1}, La/b/m;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     const-string v6, "setWidth"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5, v6, v0}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;// 
a=0;//     invoke-static {v1}, La/b/m;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const-string v5, "setHeight"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v5, v4}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "com.android.internal.R$drawable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "notify_panel_notification_icon_bg_tile"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1}, La/b/m;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "setBackgroundResource"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {v1}, La/b/o;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p1, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/umeng/update/net/r;->b(Ljava/lang/CharSequence;)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "%"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/umeng/update/net/r;->a(Ljava/lang/CharSequence;)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lcom/umeng/update/net/r;->a(I)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     iget-boolean v0, p1, Lcom/umeng/update/net/k;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     if-lt v0, v9, :cond_1
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/util/a;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/umeng/update/util/a;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/umeng/update/net/r;->b()V
a=0;// 
a=0;//     const-string v0, "continue"
a=0;// 
a=0;//     invoke-static {p2, v0}, Lcom/umeng/update/net/w;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/umeng/update/net/w;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "cancel"
a=0;// 
a=0;//     invoke-static {p2, v3}, Lcom/umeng/update/net/w;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/umeng/update/net/w;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     invoke-static {v1, v2, p2, v4}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;Lcom/umeng/update/net/r;II)V
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v4, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, La/b/m;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, La/b/m;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, La/b/m;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, La/b/m;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, La/b/m;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v1, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v3, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, La/b/o;->d(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const-string v3, "setBackgroundResource"
a=0;// 
a=0;//     iget-object v4, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "umeng_common_gradient_orange"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, La/b/c;->b(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v0, v3, v4}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/umeng/update/net/r;->a(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/util/a;);
a=0;//     invoke-virtual {v0, v8}, Lcom/umeng/update/util/a;->b(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/content/Context;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v4, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "No notification icon background found:"
a=0;// 
a=0;//     invoke-static {v4, v5, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v4=(Integer);v5=(LongHi);v6=(Uninit);
a=0;//     const-string v0, "com.android.internal.R$drawable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "status_bar_notification_icon_bg"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1}, La/b/m;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "setBackgroundResource"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v0, "com.android.internal.R$dimen"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "status_bar_edge_ignore"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x0
a=0;// 
a=0;//     const-string v5, "status_bar_height"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     invoke-static {v1}, La/b/m;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const-string v5, "setWidth"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v4, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "No notification size found:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v6=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, La/b/m;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, La/b/m;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/umeng/update/net/r;->a(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Lcom/umeng/update/util/a;->b(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/update/net/p;)Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lcom/umeng/update/net/r;II)V
a=0;//     .locals 5
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "continue"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v0}, Lcom/umeng/update/net/w;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/umeng/update/net/w;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "cancel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v1}, Lcom/umeng/update/net/w;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/umeng/update/net/w;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     packed-switch p3, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const v0, 0x1080038
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {p0}, La/b/o;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/update/net/r;->a(ILjava/lang/String;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);v1=(Reference,Landroid/app/PendingIntent;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const v2, 0x1080024
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {p0}, La/b/o;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1, v2, v3, v0}, Lcom/umeng/update/net/r;->a(ILjava/lang/String;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const v2, 0x1080023
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {p0}, La/b/o;->d(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1, v2, v3, v0}, Lcom/umeng/update/net/r;->a(ILjava/lang/String;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/List;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;
a=0;// 
a=0;//     iget v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x64
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final a(Landroid/content/Context;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "download service clear cache "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, v1, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v2, v1, Lcom/umeng/update/net/s;->a:Lcom/umeng/update/net/f;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Lcom/umeng/update/net/s;->a:Lcom/umeng/update/net/f;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget v2, v1, Lcom/umeng/update/net/s;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     iget-object v2, v1, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v2, v1, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iget v2, v1, Lcom/umeng/update/net/s;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     iget v1, v1, Lcom/umeng/update/net/s;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->d:Lcom/umeng/update/net/v;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/v;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "UMENG_RUNTIME_CACHE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/umeng/update/net/v;->a:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "remove nid ["
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "] to runtime cache."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final a(Lcom/umeng/update/net/k;JJJ)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p1, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v0, "dsize"
a=0;// 
a=0;//     invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {}, La/b/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v2, "dtime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p4, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     long-to-float v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     long-to-float v2, p4
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     :cond_0
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "dpcent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "ptimes"
a=0;// 
a=0;//     invoke-static {p6, p7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p1, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0, v2}, Lcom/umeng/update/net/p;->a(Ljava/util/Map;Z[Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,[Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(Ljava/util/Map;Z[Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/umeng/update/net/q;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/net/q;);
a=0;//     invoke-direct {v1, p0, p3, p2, p1}, Lcom/umeng/update/net/q;-><init>(Lcom/umeng/update/net/p;[Ljava/lang/String;ZLjava/util/Map;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/q;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(Lcom/umeng/update/net/DownloadingService;Landroid/content/Intent;)Z
a=0;//     .locals 17
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/umeng/update/net/DownloadingService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v3, "com.umeng.broadcast.download.msg"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v2, v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/p;);
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v2, v6}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Lcom/umeng/update/net/s;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->a:Lcom/umeng/update/net/f;
a=0;// 
a=0;//     const-string v5, "continue"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const-string v2, "android.permission.ACCESS_NETWORK_STATE"
a=0;// 
a=0;//     invoke-static {v4, v2}, La/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {v4}, La/b/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, La/b/o;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v4, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/umeng/update/net/s;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Landroid/content/Context;);v5=(Boolean);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Reference,Lcom/umeng/update/net/s;);
a=0;//     new-instance v2, Lcom/umeng/update/net/f;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/net/f;);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/k;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v7, v0, Lcom/umeng/update/net/s;->d:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v8, v0, Lcom/umeng/update/net/DownloadingService;->a:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/e;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     invoke-direct/range {v2 .. v8}, Lcom/umeng/update/net/f;-><init>(Lcom/umeng/update/net/DownloadingService;Landroid/content/Context;Lcom/umeng/update/net/k;IILcom/umeng/update/net/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/f;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput-object v2, v0, Lcom/umeng/update/net/s;->a:Lcom/umeng/update/net/f;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/umeng/update/net/f;->start()V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     iput v2, v3, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v6, v3, Landroid/os/Message;->arg2:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :try_start_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v4, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v4, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v3, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-static {v3, v4, v2}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/umeng/update/net/s;);v2=(Reference,Lcom/umeng/update/net/f;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Landroid/content/Context;);v5=(Boolean);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Reference,Lcom/umeng/update/net/s;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :try_start_3
a=0;//     #v3=(One);
a=0;//     iput v3, v2, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput-object v2, v0, Lcom/umeng/update/net/s;->a:Lcom/umeng/update/net/f;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v2, "notification"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v5, v3, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/r;);
a=0;//     invoke-virtual {v5}, Lcom/umeng/update/net/r;->b()V
a=0;// 
a=0;//     iget-object v5, v3, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;Lcom/umeng/update/net/r;II)V
a=0;// 
a=0;//     iget-object v5, v3, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {v4}, La/b/o;->h(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v7, v3, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Lcom/umeng/update/net/r;->b(Ljava/lang/CharSequence;)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, v4, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v5}, La/b/m;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v7, v4, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v8, v4, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, v4, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, La/b/o;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v5, v8}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v7, v4, Lcom/umeng/update/net/r;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const-string v8, "setBackgroundResource"
a=0;// 
a=0;//     iget-object v9, v4, Lcom/umeng/update/net/r;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v9}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "umeng_common_gradient_green"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, La/b/c;->b(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v5, v8, v9}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Lcom/umeng/update/net/r;->a(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v5}, Lcom/umeng/update/util/a;->b(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/umeng/update/net/r;->a()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v6, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     iput v2, v3, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v6, v3, Landroid/os/Message;->arg2:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :try_start_4
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v4, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v4, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_4
a=0;//     .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v3, Lcom/umeng/update/net/p;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-static {v3, v4, v2}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Boolean);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v5, "cancel"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     :try_start_6
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Lcom/umeng/update/net/f;->a:I
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_7
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     iput v2, v3, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v6, v3, Landroid/os/Message;->arg2:I
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     :try_start_8
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_6
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_8
a=0;//     .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
a=0;// 
a=0;//     :goto_4
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_9
a=0;//     #v2=(Reference,Lcom/umeng/update/net/f;);v3=(Boolean);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-wide v10, v2, v3
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-wide v12, v2, v3
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-wide v14, v2, v3
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v9, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v9=(Reference,Lcom/umeng/update/net/k;);
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/p;);
a=0;//     invoke-virtual/range {v8 .. v15}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/k;JJJ)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     iput v2, v3, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v6, v3, Landroid/os/Message;->arg2:I
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
a=0;// 
a=0;//     :try_start_b
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_8
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_b
a=0;//     .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_c
a=0;//     #v2=(Reference,Landroid/os/RemoteException;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/RemoteException;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_0
a=0;//     #v3=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v5, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     iput v2, v5, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v6, v5, Landroid/os/Message;->arg2:I
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
a=0;// 
a=0;//     :try_start_d
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v7, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v7=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget-object v7, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_9
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_d
a=0;//     .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_d} :catch_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_e
a=0;//     #v7=(Conflicted);
a=0;//     throw v3
a=0;// 
a=0;//     :catch_6
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/RemoteException;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method final a(Lcom/umeng/update/net/k;ZLandroid/os/Messenger;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v0}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/umeng/update/net/k;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "_"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " downling  "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, v0, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "   "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "_"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "downling  null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/Map;);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/Map;);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v4, p1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget-object v4, p1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, v0, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);v1=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, v0, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p1, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/p;->c:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method final b(Lcom/umeng/update/net/k;)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v3, p1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget v0, v0, Lcom/umeng/update/net/s;->c:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/p;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget v0, v0, Lcom/umeng/update/net/s;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
}}
