package com.alimama.mobile.csdk.umupdate.b; class e { void a() { int a;
a=0;// .class public final Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final k:Ljava/util/Random;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:I
a=0;// 
a=0;// .field d:Ljava/util/List;
a=0;// 
a=0;// .field private e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Ljava/lang/String;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// .field private i:Ljava/lang/String;
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// .field private m:Ljava/lang/String;
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v0}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/b/e;->k:Ljava/util/Random;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->l:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->n:I
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()Ljava/util/Map;
a=0;//     .locals 12
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v2, v0, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/a;);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const-string v0, "slot_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_7
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     #v3=(Reference,[J);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-wide v4, v3, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v3, v4, v6
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_7
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     #v3=(Reference,[J);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-wide v4, v3, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-wide v6, v3, v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aget-wide v8, v3, v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-wide v10, v0, v3
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     sub-long v4, v6, v4
a=0;// 
a=0;//     sub-long v6, v10, v8
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     cmp-long v0, v4, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const-string v3, "tcost"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "tabids"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->E:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const-string v0, "tabid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->E:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "spvnums"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "sdk_version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/a/o;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "protocol_version"
a=0;// 
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/a/o;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "ts"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "device_model"
a=0;// 
a=0;//     sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     array-length v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v5, :cond_8
a=0;// 
a=0;//     aget-object v6, v3, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     array-length v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v6, v7
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aget-object v6, v6, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v6=(Reference,[Ljava/lang/String;);v7=(Integer);v8=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->A:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     const-string v0, "app_key"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->A:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/a;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "Both APPKEY and SLOTID are empty, please specify either one. Request aborted."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/lang/Integer;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_4
a=0;//     #v0=(Integer);v3=(Reference,[Ljava/lang/String;);v4=(Reference,Ljava/util/HashMap;);v5=(Integer);
a=0;//     invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_9
a=0;//     :try_start_5
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     const-string v3, "mc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);
a=0;//     const-string v0, "carrier"
a=0;// 
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->b:Lcom/alimama/mobile/csdk/umupdate/models/f;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     const-string v0, "module"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->b:Lcom/alimama/mobile/csdk/umupdate/models/f;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_b
a=0;//     const-string v0, "os_version"
a=0;// 
a=0;//     sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "os"
a=0;// 
a=0;//     const-string v3, "android"
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "rid"
a=0;// 
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/b/e;->k:Ljava/util/Random;
a=0;// 
a=0;//     const/16 v4, 0x7fff
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->l()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "access"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v4, v0, v4
a=0;// 
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "access_subtype"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v0, v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     const-string v0, "sid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->J:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     const-string v0, "psid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->J:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "device_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "idmd5"
a=0;// 
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/alimama/mobile/csdk/umupdate/a/s;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->m()Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     const-string v3, "lat"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "lng"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(DoubleLo);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "gps_type"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "gpst"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "gps_accuracy"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     :cond_e
a=0;//     :goto_5
a=0;//     :try_start_7
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v3}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, " "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v0, v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v4, "date"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "timezone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Lcom/alimama/mobile/csdk/umupdate/a/a;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "orientation"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "promoter"
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     :goto_6
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "category"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "action_type"
a=0;// 
a=0;//     iget v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "action_index"
a=0;// 
a=0;//     iget v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "layout_type"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->C:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "page_level"
a=0;// 
a=0;//     iget v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     const-string v0, "MUNION_CHANNEL"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Lcom/alimama/mobile/csdk/umupdate/a/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_7
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_f
a=0;// 
a=0;//     const-string v2, "channel"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_f
a=0;//     #v2=(Conflicted);
a=0;//     iget v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->l:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     const-string v0, "display_style"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, "page_content_type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->e:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_11
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->d:Ljava/lang/String;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/alimama/mobile/csdk/umupdate/a/a;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/alimama/mobile/csdk/umupdate/b/e;->b()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/d;);
a=0;//     invoke-direct {v1, v0}, Lcom/alimama/mobile/csdk/umupdate/b/d;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/d;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->x:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "set promoter act_pams to report act_params. ["
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuffer;);
a=0;//     new-instance v4, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Reference,Ljava/lang/StringBuffer;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ","
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);v1=(Null);v3=(Integer);v4=(One);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->y:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "set slot act_pams to report act_params. ["
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Reference,Ljava/lang/StringBuffer;);v4=(Reference,Ljava/lang/StringBuffer;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/b/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
}}
