package com.alimama.mobile.csdk.umupdate.a; class r { void a() { int a;
a=0;// .class public Lcom/alimama/mobile/csdk/umupdate/a/r;
a=0;// .super Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;// .field private final g:Lcom/alimama/mobile/e;
a=0;// 
a=0;// .field private final h:I
a=0;// 
a=0;// .field private final i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/alimama/mobile/csdk/umupdate/a/r;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/r;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/alimama/mobile/csdk/umupdate/models/d;Lcom/alimama/mobile/e;IZ)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/alimama/mobile/csdk/umupdate/a/b;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/r;);
a=0;//     iput-object p2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->g:Lcom/alimama/mobile/e;
a=0;// 
a=0;//     iput p3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->h:I
a=0;// 
a=0;//     iput-boolean p4, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->i:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONObject;)Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->a:Lcom/alimama/mobile/csdk/umupdate/models/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/e;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->x:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->x:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/models/e;->a(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-class v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->O:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, p1, v2}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Ljava/util/Collection;Ljava/lang/Class;Lorg/json/JSONObject;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->a:Lcom/alimama/mobile/csdk/umupdate/models/e;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->p:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, p1, v2, v3}, Lcom/alimama/mobile/csdk/umupdate/models/e;->a(ZJ)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Lorg/json/JSONObject;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a([I)Ljava/util/List;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
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
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0}, Lcom/alimama/mobile/csdk/umupdate/a/r;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/util/Map;);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "sid"
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     const-string v0, "sid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     new-instance v6, Lcom/alimama/mobile/csdk/umupdate/b/b;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/b;);
a=0;//     invoke-direct {v6}, Lcom/alimama/mobile/csdk/umupdate/b/b;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/b;);
a=0;//     new-instance v7, Lcom/alimama/mobile/csdk/umupdate/b/f;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/f;);
a=0;//     invoke-direct {v7, v3}, Lcom/alimama/mobile/csdk/umupdate/b/f;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/f;);
a=0;//     invoke-virtual {v6, v7}, Lcom/alimama/mobile/csdk/umupdate/b/b;->a(Lcom/alimama/mobile/csdk/umupdate/b/f;)Lcom/alimama/mobile/csdk/umupdate/b/g;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     aput v3, p1, v2
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget-object v3, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/util/Map;);v6=(Uninit);v7=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v6=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/g;);v7=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/f;);
a=0;//     iget v3, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "   requestLive get resStr: "
a=0;// 
a=0;//     invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v3, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Lorg/json/JSONObject;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-gtz v7, :cond_7
a=0;// 
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->a:Lcom/alimama/mobile/csdk/umupdate/models/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/e;->a()V
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v7=(Integer);
a=0;//     iget-boolean v7, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->i:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     iget v7, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->a:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v7, v1, :cond_8
a=0;// 
a=0;//     iget-object v7, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v7=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v7, v7, Lcom/alimama/mobile/csdk/umupdate/models/d;->a:Lcom/alimama/mobile/csdk/umupdate/models/e;
a=0;// 
a=0;//     iget-object v6, v6, Lcom/alimama/mobile/csdk/umupdate/b/g;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v7, v0, v6}, Lcom/alimama/mobile/csdk/umupdate/models/e;->a(ZLorg/json/JSONObject;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/a/r;->e:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "  request from network error:"
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v6, v2
a=0;// 
a=0;//     aput-object v0, v6, v1
a=0;// 
a=0;//     invoke-static {v3, v6}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/Collection;Ljava/lang/Class;Lorg/json/JSONObject;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get promoters use class "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "promoters"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "promoters"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->a(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object p3, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->y:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,[Ljava/lang/Object;);v3=(Uninit);
a=0;//     const-string v0, "failed requesting"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,[Ljava/lang/Object;);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private c()Ljava/util/Map;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/a;);
a=0;//     const-string v0, "sdk_version"
a=0;// 
a=0;//     sget-object v4, Lcom/alimama/mobile/csdk/umupdate/a/o;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "sdk_channel"
a=0;// 
a=0;//     sget-object v4, Lcom/alimama/mobile/csdk/umupdate/a/o;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "protocol_version"
a=0;// 
a=0;//     sget-object v4, Lcom/alimama/mobile/csdk/umupdate/a/o;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const-string v0, "MUNION_CHANNEL"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Lcom/alimama/mobile/csdk/umupdate/a/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     const-string v4, "channel"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v0, "device_id"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "idmd5"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/alimama/mobile/csdk/umupdate/a/s;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "device_model"
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "os"
a=0;// 
a=0;//     const-string v4, "android"
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     const-string v4, "mc"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const-string v0, "os_version"
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "locale"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "language"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "timezone"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "resolution"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->l()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "access"
a=0;// 
a=0;//     aget-object v5, v0, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "access_subtype"
a=0;// 
a=0;//     aget-object v0, v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "carrier"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->m()Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v4, "lat"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "lng"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "gps_type"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "gpst"
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "gps_accuracy"
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
a=0;//     invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v0, "cpu"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->o()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v4, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v4, Ljava/util/Date;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v4}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aget-object v4, v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-object v0, v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v5, "date"
a=0;// 
a=0;//     invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "time"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "brand"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "timezone"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "apnm"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "apvn"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "apvc"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "adnm"
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     const-string v0, "slot_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->F:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "promoter"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->F:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "layout_type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
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
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->D:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->D:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "^$^"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const-string v3, "^$^"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "keywords"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->O:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->O:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     array-length v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Reference,[Ljava/lang/String;);
a=0;//     if-ge v0, v5, :cond_a
a=0;// 
a=0;//     aget-object v2, v3, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v6, "="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_6
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget-object v6, v2, v6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-object v2, v2, v7
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v4, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Reference,[Ljava/lang/String;);v6=(Integer);v7=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->A:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     const-string v0, "app_key"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->A:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "Both APPKEY and SLOTID are empty, please specify either one. Request aborted."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_a
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v4=(Reference,Ljava/util/HashMap;);v5=(Integer);
a=0;//     invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_4
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->N:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     const-string v0, "url_params"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->N:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->G:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     const-string v0, "tags"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->G:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->B:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v8, :cond_e
a=0;// 
a=0;//     const-string v0, "autofill"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->B:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     const-string v0, "sid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->J:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_10
a=0;// 
a=0;//     const-string v0, "psid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->J:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "req_desc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->K:Lcom/alimama/mobile/csdk/umupdate/models/j;
a=0;// 
a=0;//     if-nez v0, :cond_13
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_5
a=0;//     const-string v2, "resource_type"
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->L:Lcom/alimama/mobile/csdk/umupdate/models/o;
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->L:Lcom/alimama/mobile/csdk/umupdate/models/o;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/alimama/mobile/csdk/umupdate/models/o;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->M:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "template"
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_11
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->H:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_12
a=0;// 
a=0;//     const-string v0, "landing_type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->H:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_13
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->K:Lcom/alimama/mobile/csdk/umupdate/models/j;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/j;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->M:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic a()Ljava/lang/Object;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     aput-wide v4, v0, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     new-array v4, v1, [I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-direct {p0, v0}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_3
a=0;// 
a=0;//     aput v1, v4, v2
a=0;// 
a=0;//     const-string v5, "get data from local-cache."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-array v6, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v5, v6}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_1
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->r:[J
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     aput-wide v6, v3, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     aget v0, v4, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(One);v3=(Boolean);v5=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     aput v2, v4, v2
a=0;// 
a=0;//     const-string v5, "get data from local-cache.but has no data."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-array v6, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v5, v6}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Uninit);
a=0;//     invoke-direct {p0, v4}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a([I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const-string v5, "get data from live."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-array v6, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v5, v6}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic a(Ljava/lang/Object;)V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     check-cast p1, Landroid/os/Message;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->g:Lcom/alimama/mobile/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/e;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->m:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->j:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v5, v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->j:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->j:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     :goto_1
a=0;//     iput v1, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->j:I
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "new tips has changed "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ===> "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->g:Lcom/alimama/mobile/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/e;);
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/alimama/mobile/e;->a(ILjava/util/List;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v2, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ltz v5, :cond_4
a=0;// 
a=0;//     invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v7=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v7, v7, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     iget-boolean v7, v7, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->m:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     iget-boolean v8, v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->D:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v7, v7, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->u:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v7, v1}, Lcom/alimama/mobile/csdk/umupdate/a/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     sget-object v7, Lcom/alimama/mobile/csdk/umupdate/a/o;->e:Ljava/lang/String;
a=0;// 
a=0;//     new-array v8, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Installed: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v9, ". Remove from the list."
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v8, v4
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->w:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v10, :cond_7
a=0;// 
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v2, v5, -0x1
a=0;// 
a=0;//     move v5, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     new-instance v5, Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->f:Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     invoke-direct {v5, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     iput v3, v5, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     iput v3, v5, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     iput v3, v5, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     new-array v1, v4, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     invoke-interface {v6, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/d;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);v5=(Integer);v6=(Conflicted);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/r;->g:Lcom/alimama/mobile/e;
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/alimama/mobile/e;->a(ILjava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Integer);v5=(Integer);v6=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_4
a=0;// .end method
}}
