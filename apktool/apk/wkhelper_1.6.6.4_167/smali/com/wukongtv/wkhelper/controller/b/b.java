package com.wukongtv.wkhelper.controller.b; class b { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final d:Ljava/util/HashSet;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;// .field b:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;// .field c:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "sun7i-ir"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "aml_keypad"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "mtkinp_events"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "rc-input"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "Hisense Smart TV IR Receiver"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     const-string v1, "Tcl Smart TV IR Receiver"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/16 v6, 0x67
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/b/b;);
a=0;//     iput-boolean v3, p0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     sget-object v4, Lcom/wukongtv/wkhelper/controller/b/b;->d:Ljava/util/HashSet;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashSet;);
a=0;//     iget-object v5, v0, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lnet/pocketmagic/android/eventinjector/a;->a(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v0, v6}, Lnet/pocketmagic/android/eventinjector/a;->a(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lnet/pocketmagic/android/eventinjector/a;->a(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v6=(PosShort);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iget v1, v0, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1, v7, v3}, Lnet/pocketmagic/android/eventinjector/Events;->a(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget v5, v0, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x110
a=0;// 
a=0;//     invoke-static {v5, v2, v6}, Lnet/pocketmagic/android/eventinjector/Events;->a(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->b:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/a;);v1=(Integer);v5=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/util/List;)Lcom/wukongtv/wkhelper/controller/b/b;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     array-length v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v1, v5, :cond_2
a=0;// 
a=0;//     aget v6, v2, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/InputDevice;);
a=0;//     invoke-virtual {v6}, Landroid/view/InputDevice;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ltz v7, :cond_1
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/InputDevice;->getSources()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     and-int/lit16 v7, v7, 0x201
a=0;// 
a=0;//     const/16 v8, 0x201
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-ne v7, v8, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v6}, Landroid/view/InputDevice;->getSources()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     and-int/lit16 v7, v7, 0x2002
a=0;// 
a=0;//     const/16 v8, 0x2002
a=0;// 
a=0;//     if-ne v7, v8, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     array-length v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     aget v5, v2, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/InputDevice;);
a=0;//     invoke-virtual {v5}, Landroid/view/InputDevice;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ltz v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/InputDevice;->getSources()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     and-int/lit16 v6, v6, 0x101
a=0;// 
a=0;//     const/16 v7, 0x101
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     if-ne v6, v7, :cond_3
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/InputDevice;
a=0;// 
a=0;//     iget-object v8, v1, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     iget-object v8, v1, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/InputDevice;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/InputDevice;
a=0;// 
a=0;//     iget-object v8, v1, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     iget-object v8, v1, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/InputDevice;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/b;);
a=0;//     invoke-direct {v0, v2, v5}, Lcom/wukongtv/wkhelper/controller/b/b;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final a(I)I
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/pocketmagic/android/eventinjector/a;->h:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/pocketmagic/android/eventinjector/a;->h:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     iget-object v0, v0, Lnet/pocketmagic/android/eventinjector/a;->h:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x66
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x9e
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x67
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x6c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x69
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_5
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x6a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_6
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x61
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_7
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x72
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_8
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x73
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_9
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x74
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_a
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x130
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_b
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x131
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_c
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x133
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_d
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x134
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_e
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x13a
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_f
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x13b
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x3 -> :sswitch_0
a=0;//         0x4 -> :sswitch_1
a=0;//         0x13 -> :sswitch_2
a=0;//         0x14 -> :sswitch_3
a=0;//         0x15 -> :sswitch_4
a=0;//         0x16 -> :sswitch_5
a=0;//         0x17 -> :sswitch_6
a=0;//         0x18 -> :sswitch_8
a=0;//         0x19 -> :sswitch_7
a=0;//         0x1a -> :sswitch_9
a=0;//         0x60 -> :sswitch_a
a=0;//         0x61 -> :sswitch_b
a=0;//         0x63 -> :sswitch_c
a=0;//         0x64 -> :sswitch_d
a=0;//         0x6c -> :sswitch_f
a=0;//         0x6d -> :sswitch_e
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(II)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/wukongtv/wkhelper/controller/b/b;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v1=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v0, v2}, Lnet/pocketmagic/android/eventinjector/a;->a(IZ)I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v1=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lnet/pocketmagic/android/eventinjector/a;->a(IZ)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
