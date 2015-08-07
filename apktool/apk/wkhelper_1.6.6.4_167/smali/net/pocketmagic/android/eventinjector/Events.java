package net.pocketmagic.android.eventinjector; class Events { void a() { int a;
a=0;// .class public Lnet/pocketmagic/android/eventinjector/Events;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public b:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lnet/pocketmagic/android/eventinjector/Events;->a:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "EventInjector"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsatisfiedLinkError;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lnet/pocketmagic/android/eventinjector/Events;->a:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/pocketmagic/android/eventinjector/Events;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static native OpenDev(I)I
a=0;// .end method
a=0;// 
a=0;// .method private static native RemoveDev(I)I
a=0;// .end method
a=0;// 
a=0;// .method private static native ScanFiles()I
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/pocketmagic/android/eventinjector/Events;->RemoveDev(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(III)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1, p2}, Lnet/pocketmagic/android/eventinjector/Events;->hasKey(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(IIII)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1, p2, p3}, Lnet/pocketmagic/android/eventinjector/Events;->intSendEvent(IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static native getDevName(I)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method private static native getDevPath(I)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method private static native getDevProduct(I)I
a=0;// .end method
a=0;// 
a=0;// .method private static native getDevVendor(I)I
a=0;// .end method
a=0;// 
a=0;// .method private static native getDevVersion(I)I
a=0;// .end method
a=0;// 
a=0;// .method private static native hasKey(III)I
a=0;// .end method
a=0;// 
a=0;// .method private static native intSendEvent(IIII)I
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-boolean v0, Lnet/pocketmagic/android/eventinjector/Events;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     invoke-static {}, Lnet/pocketmagic/android/eventinjector/Events;->ScanFiles()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_4
a=0;// 
a=0;//     new-instance v4, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v4=(UninitRef,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     invoke-static {v2}, Lnet/pocketmagic/android/eventinjector/Events;->getDevPath(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, p0, v2, v0}, Lnet/pocketmagic/android/eventinjector/a;-><init>(Lnet/pocketmagic/android/eventinjector/Events;ILjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     iget v0, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lnet/pocketmagic/android/eventinjector/Events;->OpenDev(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/m;->a()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "chmod 666 "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, v4, Lnet/pocketmagic/android/eventinjector/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     iget v0, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lnet/pocketmagic/android/eventinjector/Events;->OpenDev(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Lnet/pocketmagic/android/eventinjector/Events;->getDevName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, v4, Lnet/pocketmagic/android/eventinjector/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget v5, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Lnet/pocketmagic/android/eventinjector/Events;->getDevProduct(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, v4, Lnet/pocketmagic/android/eventinjector/a;->f:I
a=0;// 
a=0;//     iget v5, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     invoke-static {v5}, Lnet/pocketmagic/android/eventinjector/Events;->getDevVendor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, v4, Lnet/pocketmagic/android/eventinjector/a;->g:I
a=0;// 
a=0;//     iget v5, v4, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     invoke-static {v5}, Lnet/pocketmagic/android/eventinjector/Events;->getDevVersion(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, v4, Lnet/pocketmagic/android/eventinjector/a;->e:I
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, v4, Lnet/pocketmagic/android/eventinjector/a;->d:Z
a=0;// 
a=0;//     iget-boolean v0, v4, Lnet/pocketmagic/android/eventinjector/a;->d:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
