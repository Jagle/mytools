package com.umeng.a; class f { void a() { int a;
a=0;// .class public final Lcom/umeng/a/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Lcom/umeng/a/o;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/a/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/a/o;);
a=0;//     invoke-direct {v0}, Lcom/umeng/a/o;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/a/o;);
a=0;//     sput-object v0, Lcom/umeng/a/f;->a:Lcom/umeng/a/o;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p0}, Lcom/umeng/a/t;->a(Landroid/content/Context;)Lcom/umeng/a/t;
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/a/t;->e()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/a/f;->a:Lcom/umeng/a/o;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/a/o;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "unexpected null context in onPause"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     sget-boolean v1, Lcom/umeng/a/a;->j:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/a/o;->a:La/a/hf;
a=0;// 
a=0;//     #v1=(Reference,La/a/hf;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, La/a/hf;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, v0, Lcom/umeng/a/o;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/a/o;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v1, Lcom/umeng/a/q;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/a/q;);
a=0;//     invoke-direct {v1, v0, p0}, Lcom/umeng/a/q;-><init>(Lcom/umeng/a/o;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/a/q;);
a=0;//     invoke-static {v1}, Lcom/umeng/a/r;->a(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Exception occurred in Mobclick.onRause(). "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "label is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/a/ep;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     sget-object v2, Lcom/umeng/a/f;->a:Lcom/umeng/a/o;
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lcom/umeng/a/o;);
a=0;//     iget-boolean v3, v2, Lcom/umeng/a/o;->d:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Lcom/umeng/a/o;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v3, v2, Lcom/umeng/a/o;->c:La/a/gv;
a=0;// 
a=0;//     #v3=(Reference,La/a/gv;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_5
a=0;// 
a=0;//     const/16 v4, 0x80
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-gt v2, v4, :cond_5
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_6
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez p2, :cond_4
a=0;// 
a=0;//     const-string p2, ""
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, v3, La/a/gv;->a:La/a/gq;
a=0;// 
a=0;//     #v1=(Reference,La/a/gq;);
a=0;//     new-instance v2, La/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/b;);
a=0;//     invoke-direct {v2, p1, v0}, La/a/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V
a=0;// 
a=0;//     #v2=(Reference,La/a/b;);
a=0;//     invoke-virtual {v1, v2}, La/a/gq;->a(La/a/gx;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v0=(One);v1=(Null);v2=(Integer);v3=(Reference,La/a/gv;);
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Event id is empty or too long in tracking Event"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v4, 0x100
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-le v2, v4, :cond_3
a=0;// 
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Event label or value is empty or too long in tracking Event"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "unexpected null context in onResume"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v0, Lcom/umeng/a/f;->a:Lcom/umeng/a/o;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/a/o;);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "unexpected null context in onResume"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-boolean v1, Lcom/umeng/a/a;->j:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/a/o;->a:La/a/hf;
a=0;// 
a=0;//     #v1=(Reference,La/a/hf;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     iget-object v3, v1, La/a/hf;->a:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, v1, La/a/hf;->a:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-boolean v1, v0, Lcom/umeng/a/o;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/a/o;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_3
a=0;//     new-instance v1, Lcom/umeng/a/p;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/a/p;);
a=0;//     invoke-direct {v1, v0, p0}, Lcom/umeng/a/p;-><init>(Lcom/umeng/a/o;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/a/p;);
a=0;//     invoke-static {v1}, Lcom/umeng/a/r;->a(Ljava/lang/Runnable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Exception occurred in Mobclick.onResume(). "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
