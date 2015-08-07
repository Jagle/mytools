package com.wukongtv.wkhelper; class RemoteService { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/RemoteService;
a=0;// .super Landroid/app/Service;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// .implements Lcom/wukongtv/wkhelper/h/d;
a=0;// .implements Lcom/wukongtv/wkhelper/i/b;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final e:Ljava/lang/String;
a=0;// 
a=0;// .field private static final f:Ljava/lang/String;
a=0;// 
a=0;// .field private static final g:Ljava/lang/String;
a=0;// 
a=0;// .field private static final h:Ljava/lang/String;
a=0;// 
a=0;// .field private static final i:Ljava/lang/String;
a=0;// 
a=0;// .field private static final j:Ljava/lang/String;
a=0;// 
a=0;// .field private static final p:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;// .field public b:Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;// .field private c:Lcom/wukongtv/wkhelper/a;
a=0;// 
a=0;// .field private d:Lcom/wukongtv/wkhelper/childlock/a;
a=0;// 
a=0;// .field private k:Landroid/os/Handler;
a=0;// 
a=0;// .field private l:Landroid/os/Binder;
a=0;// 
a=0;// .field private m:Lcom/wukongtv/wkhelper/i/f;
a=0;// 
a=0;// .field private n:Z
a=0;// 
a=0;// .field private o:J
a=0;// 
a=0;// .field private q:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "YAOKONG_TUZI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "YAOKONG_VST"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "YAOKONG_MORETV"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "YAOKONG_MHT"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "YAOKONG_SUNING"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->i:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "YAOKONG_QIHU"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "API_SETTING_PKG"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/RemoteService;->p:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/RemoteService;);
a=0;//     new-instance v0, Landroid/os/Binder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Binder;);
a=0;//     invoke-direct {v0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Binder;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->l:Landroid/os/Binder;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->n:Z
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->o:J
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/w;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/w;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/w;-><init>(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/w;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->q:Ljava/lang/Runnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/b/m;->a()Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/16 v1, 0x821
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     const/16 v1, 0x1a
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/RemoteService;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/controller/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/b;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/controller/b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/wukongtv/wkhelper/b/j;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const v4, 0x813838
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p1, Lcom/wukongtv/wkhelper/b/j;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.elinkway.tvlive2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/a;->a()Lcom/wukongtv/wkhelper/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a/a;);
a=0;//     const-string v2, "dsj_hint"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/wukongtv/wkhelper/a/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     const-string v2, "on"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v2, 0x1388
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/a/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "mySharedPreferences"
a=0;// 
a=0;//     invoke-virtual {v0, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 11
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "RtlHardcoded,InflateParams"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/high16 v10, 0x10000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v3=(One);v4=(Null);v5=(Byte);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "layout_inflater"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcom/wukongtv/wkhelper/RemoteService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     const v5, 0x7f030012
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     const v1, 0x7f0b004a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const v0, 0x7f0b004b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v5, 0x8138132
a=0;// 
a=0;//     if-ne v1, v5, :cond_1
a=0;// 
a=0;//     const v1, 0x7f07008e
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     const/16 v0, 0xdac
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sget v1, Lcom/a/a/a/c;->b:I
a=0;// 
a=0;//     invoke-static {p0, v2, v0, v1}, Lcom/a/a/a/b;->a(Landroid/content/Context;Landroid/view/View;II)Lcom/a/a/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/a/a/a/b;);
a=0;//     invoke-virtual {v0}, Lcom/a/a/a/b;->b()Lcom/a/a/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/a/a/a/b;->a()V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     const v5, 0x8138133
a=0;// 
a=0;//     if-ne v1, v5, :cond_2
a=0;// 
a=0;//     const v1, 0x7f07008f
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     const v1, 0x7f07007e
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     const v5, 0x7f09000c
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v5=(Byte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->c:Lcom/wukongtv/wkhelper/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/a;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/wukongtv/wkhelper/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->c:Lcom/wukongtv/wkhelper/a;
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x444354
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->c:Lcom/wukongtv/wkhelper/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/a;);
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/a;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1b
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_1
a=0;// 
a=0;//     :goto_3
a=0;//     :pswitch_4
a=0;//     const v1, 0x813813
a=0;// 
a=0;//     iput v1, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     const/16 v0, 0x7d0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->d:Lcom/wukongtv/wkhelper/childlock/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/childlock/a;);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/childlock/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/childlock/a;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/wukongtv/wkhelper/childlock/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/childlock/a;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->d:Lcom/wukongtv/wkhelper/childlock/a;
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x544355
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput v2, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->d:Lcom/wukongtv/wkhelper/childlock/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/childlock/a;);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v2, v1, v4, v5}, Lcom/wukongtv/wkhelper/childlock/a;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v4=(Null);v5=(Byte);
a=0;//     const v0, 0x7f070031
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_6
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f070032
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_7
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f070033
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_8
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_9
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f070091
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_a
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f070079
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_b
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v4, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v5, "com.luxtone.tuzi3"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "com.luxtone.tuzi3.activity.Main"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v1, v4, :cond_6
a=0;// 
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "com.luxtone.tuzi3.page.detail.MediaDetailForTudanPage"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const-string v1, "mediaId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v10}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, v2}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;// 
a=0;//     :goto_7
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v4=(PosByte);
a=0;//     if-ne v1, v3, :cond_5
a=0;// 
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "com.luxtone.tuzi3.page.detail.MediaDetailPage"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :pswitch_c
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);v5=(Byte);v6=(Uninit);
a=0;//     const v0, 0x7f070092
a=0;// 
a=0;//     invoke-static {p0, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     const-string v0, "com.luxtone.tuzi3.mustUpdate"
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/wukongtv/wkhelper/RemoteService;->sendBroadcast(Landroid/content/Intent;)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_d
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f0700b3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_e
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f070071
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_f
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "linkData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const-string v0, "linkData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_8
a=0;//     const-string v2, "sid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const-string v2, "sid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_9
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_9
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_a
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v5, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v6, "com.moretv.android"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "com.moretv.middleware.externalcall.ExternalCallReceiver"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v5, "moretv.action.external"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v5, Landroid/os/Bundle;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v5}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v6, "Data"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v7, "&sid="
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5, v6, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ReturnMode"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {p0, v2}, Lcom/wukongtv/wkhelper/RemoteService;->sendBroadcast(Landroid/content/Intent;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
a=0;// 
a=0;//     :goto_a
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_10
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v5=(Byte);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f07005b
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_11
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "requestType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "videoId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "dataurl"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "pkg"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "setnum"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1a
a=0;// 
a=0;//     const-string v1, "setnum"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_b
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sparse-switch v8, :sswitch_data_0
a=0;// 
a=0;//     :cond_c
a=0;//     #v4=(Boolean);v6=(Conflicted);v8=(Conflicted);
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_c
a=0;//     #v4=(Byte);
a=0;//     packed-switch v4, :pswitch_data_2
a=0;// 
a=0;//     :cond_d
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_d
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
a=0;// 
a=0;//     :goto_e
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Null);v6=(Reference,Ljava/lang/String;);v8=(Integer);
a=0;//     const-string v8, "vod"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_c
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v6=(Reference,Ljava/lang/String;);v8=(Integer);
a=0;//     const-string v4, "live"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v4=(Null);
a=0;//     const-string v4, "vcd"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :pswitch_12
a=0;//     #v4=(Byte);v6=(Conflicted);v8=(Conflicted);
a=0;//     const-string v4, "uuid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_d
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v5, :cond_e
a=0;// 
a=0;//     const-string v4, "setnum"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :pswitch_13
a=0;//     #v4=(Byte);
a=0;//     const-string v0, "vid"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :pswitch_14
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "myvst.intent.action.MediaDetail"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "uuid"
a=0;// 
a=0;//     invoke-virtual {v2, v1, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :pswitch_15
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/RemoteService;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x7f07005a
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_16
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v4, "com.fastcloud.tv"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "com.fastcloud.tv.views.GameDetailActivity"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v4, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "gameId"
a=0;// 
a=0;//     invoke-virtual {v4, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "gamePackage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v0, 0x14000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
a=0;// 
a=0;//     :goto_f
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_17
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);v5=(Byte);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "mounted"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_19
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_10
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_f
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/Android/data/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     invoke-direct {v1, v0}, Lcom/wukongtv/wkhelper/CleanCache/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->f:Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     :cond_10
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_18
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/e/a;->a()Lcom/wukongtv/wkhelper/e/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/e/a;);
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/e/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_19
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/sidebar/b;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/sidebar/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v1, :cond_13
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/sidebar/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v5, "mySharedPreferences"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-string v5, "popup_sidebar_time"
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-interface {v1, v5, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     cmp-long v5, v6, v8
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-nez v5, :cond_11
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v6, "popup_sidebar_time"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     invoke-interface {v5, v6, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     :cond_11
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v5, Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     invoke-direct {v5, v1}, Lcom/wukongtv/wkhelper/sidebar/e;-><init>(Landroid/content/SharedPreferences;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     iget-boolean v1, v5, Lcom/wukongtv/wkhelper/sidebar/e;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_13
a=0;// 
a=0;//     iget-wide v6, v5, Lcom/wukongtv/wkhelper/sidebar/e;->d:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     invoke-static {v6, v7, v8, v9}, Lcom/wukongtv/wkhelper/sidebar/f;->a(JJ)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-le v1, v5, :cond_12
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     :cond_12
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_14
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/z;);
a=0;//     sget-object v4, Lcom/wukongtv/wkhelper/sidebar/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lcom/wukongtv/wkhelper/sidebar/c;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/wukongtv/wkhelper/sidebar/c;);
a=0;//     invoke-direct {v5, v0}, Lcom/wukongtv/wkhelper/sidebar/c;-><init>(Lcom/wukongtv/wkhelper/sidebar/b;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/sidebar/c;);
a=0;//     invoke-virtual {v1, v4, v2, v5}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     :cond_13
a=0;//     :goto_11
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);v1=(Integer);v4=(Boolean);v5=(PosByte);v6=(LongLo);v7=(LongHi);v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/sidebar/b;->a()V
a=0;// 
a=0;//     goto :goto_11
a=0;// 
a=0;//     :pswitch_1a
a=0;//     #v0=(Integer);v1=(Uninit);v4=(Null);v5=(Byte);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/RemoteService;->a()V
a=0;// 
a=0;//     :goto_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,[Ljava/lang/Object;);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v5=(Byte);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->q:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/RemoteService;->q:Ljava/lang/Runnable;
a=0;// 
a=0;//     mul-int/lit8 v5, v0, 0x3c
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit16 v5, v5, 0x3e8
a=0;// 
a=0;//     int-to-long v6, v5
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v1, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     const v1, 0x7f070076
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_12
a=0;// 
a=0;//     :pswitch_1b
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v5=(Byte);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "action"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "data"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_16
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v4, 0x1000
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ge v2, v4, :cond_16
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v4, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v5, "com.suning.tv.ebuy"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "com.suning.tv.ebuy.ui.proxy.ProxyActivity"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     const-string v5, "action"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v0, 0x14000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {p0, v2}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     :cond_16
a=0;//     :goto_13
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Integer);v2=(Reference,Landroid/content/Intent;);v4=(Reference,Landroid/content/ComponentName;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SADIEYU"
a=0;// 
a=0;//     const-string v2, "Fail to start suning ..."
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_13
a=0;// 
a=0;//     :pswitch_1c
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v4=(Null);v5=(Byte);v6=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "com.qihoo.tvsafe.opti.ui.SingleApkOptiActivity.action.ThirdPlayCallDisappear"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "isNeedGetFreeMemPercent"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     :cond_17
a=0;//     :goto_14
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813816
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_14
a=0;// 
a=0;//     :pswitch_1d
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "appdir"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/a/p;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/a/p;);
a=0;//     invoke-direct {v2, p0}, Lcom/wukongtv/wkhelper/a/p;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/a/p;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v1, v5, v4
a=0;// 
a=0;//     aput-object v0, v5, v3
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/wukongtv/wkhelper/a/p;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_1e
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v5=(Byte);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/widget/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/widget/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/widget/a;);
a=0;//     const v0, 0x7f0700b4
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/widget/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/widget/a;->c:Lcom/wukongtv/wkhelper/widget/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/b;);
a=0;//     const-wide/16 v6, 0x7d0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0, v3, v6, v7}, Lcom/wukongtv/wkhelper/widget/b;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     :try_start_8
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/widget/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "window"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/wukongtv/wkhelper/widget/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     if-nez v1, :cond_18
a=0;// 
a=0;//     iget-object v1, v2, Lcom/wukongtv/wkhelper/widget/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "layout_inflater"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     const v3, 0x7f03001d
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v1, v3, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/wukongtv/wkhelper/widget/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     :cond_18
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, v2, Lcom/wukongtv/wkhelper/widget/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v1, v2, Lcom/wukongtv/wkhelper/widget/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/widget/a;->d:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_1f
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v3=(One);v5=(Byte);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/g/a;->a()Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Lcom/wukongtv/wkhelper/g/a;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_20
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->b:Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/a;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/i/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/g/a;->a()Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Lcom/wukongtv/wkhelper/g/a;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Reference,Landroid/content/Intent;);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :catch_5
a=0;//     #v4=(Null);v7=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :catch_6
a=0;//     #v4=(Conflicted);v5=(Byte);v6=(Conflicted);v8=(Conflicted);v9=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Integer);v4=(Reference,Landroid/content/Intent;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Null);v5=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_19
a=0;//     #v1=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_1a
a=0;//     #v1=(Boolean);v4=(Null);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :cond_1b
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v2=(Reference,Landroid/os/Message;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x813813
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_15
a=0;//         :pswitch_16
a=0;//         :pswitch_d
a=0;//         :pswitch_11
a=0;//         :pswitch_18
a=0;//         :pswitch_10
a=0;//         :pswitch_f
a=0;//         :pswitch_17
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_19
a=0;//         :pswitch_1a
a=0;//         :pswitch_a
a=0;//         :pswitch_1b
a=0;//         :pswitch_0
a=0;//         :pswitch_e
a=0;//         :pswitch_1c
a=0;//         :pswitch_1d
a=0;//         :pswitch_1e
a=0;//         :pswitch_1f
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_20
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch -0x2
a=0;//         :pswitch_5
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1c757 -> :sswitch_2
a=0;//         0x1c8cb -> :sswitch_0
a=0;//         0x32b0ec -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// 
a=0;//     :pswitch_data_2
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_12
a=0;//         :pswitch_13
a=0;//         :pswitch_14
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->l:Landroid/os/Binder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Binder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Service;->onCreate()V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/a;->a()Lcom/wukongtv/wkhelper/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a/a;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkhelper/a/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/a/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Lcom/wukongtv/wkhelper/a/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/wukongtv/wkhelper/a/b;);
a=0;//     invoke-direct {v4, v0}, Lcom/wukongtv/wkhelper/a/b;-><init>(Lcom/wukongtv/wkhelper/a/a;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/a/b;);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/i/a;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/wukongtv/wkhelper/i/a;-><init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/i/a;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->b:Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/i/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/i/f;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/wukongtv/wkhelper/i/f;-><init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/i/f;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/RemoteService;->m:Lcom/wukongtv/wkhelper/i/f;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->b:Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;//     iput-object p0, v0, Lcom/wukongtv/wkhelper/i/a;->c:Lcom/wukongtv/wkhelper/i/b;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/RemoteService;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/s;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/s;-><init>(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/s;);
a=0;//     const-wide/16 v2, 0x7d0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "mySharedPreferences"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/wukongtv/wkhelper/RemoteService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "settingPkg"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/z;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/z;);
a=0;//     invoke-direct {v1}, Lcom/b/a/a/z;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/b/a/a/z;);
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build;->HOST:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "m"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v0}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "h"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/RemoteService;->p:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Lcom/wukongtv/wkhelper/x;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/wukongtv/wkhelper/x;);
a=0;//     invoke-direct {v3, p0}, Lcom/wukongtv/wkhelper/x;-><init>(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/x;);
a=0;//     invoke-virtual {v0, v2, v1, v3}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/t;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/t;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/t;-><init>(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/t;);
a=0;//     const-wide/32 v2, 0xc350
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/b;->b()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/RemoteService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/widget/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/widget/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/widget/a;->a()V
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Service;->onDestroy()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 12
a=0;// 
a=0;//     const v10, 0x7f07003b
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/g/a;->a()Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/g/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/g/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/g/a;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/g/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/g/a;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     const-wide/16 v2, 0x1388
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v2=(PosByte);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Integer);v11=(Uninit);
a=0;//     const-string v0, "extraaction"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     const-string v0, "token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/c/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-wide v6, p0, Lcom/wukongtv/wkhelper/RemoteService;->o:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v6, v4, v6
a=0;// 
a=0;//     const-wide/16 v8, 0x1f40
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v0, v6, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "mySharedPreferences"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v3}, Lcom/wukongtv/wkhelper/RemoteService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/wukongtv/wkhelper/a/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "saved_device_name"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/RemoteService;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     invoke-virtual {v6, v0}, Lcom/wukongtv/wkhelper/h/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/c/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v6, v0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/controller/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     iput-object p0, v0, Lcom/wukongtv/wkhelper/h/a;->e:Lcom/wukongtv/wkhelper/h/d;
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->n:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/16 v0, 0x333
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-instance v6, Landroid/app/Notification;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/app/Notification;);
a=0;//     const v7, 0x1080093
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const-string v8, "remote service"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-direct {v6, v7, v8, v10, v11}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Notification;);
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v8, Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-direct {v7, p0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v8, 0x8000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {p0, v3, v7, v8}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput v2, v6, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     const v8, 0x7f070026
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const v9, 0x7f070061
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0, v9}, Lcom/wukongtv/wkhelper/RemoteService;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, p0, v8, v9, v7}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     invoke-virtual {p0, v0, v6}, Lcom/wukongtv/wkhelper/RemoteService;->startForeground(ILandroid/app/Notification;)V
a=0;// 
a=0;//     const-string v0, "http://json.wukongtv.com/yaokong/wkupdate/remoteserver120.json?ver=%d&channel=%s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkupdate/lib/g;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     const-string v6, "UMENG_CHANNEL"
a=0;// 
a=0;//     invoke-static {p0, v6}, Lcom/wukongtv/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v2, v1
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/v;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/v;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/v;-><init>(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/v;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/wukongtv/wkupdate/lib/g;->a(Landroid/content/Context;Ljava/lang/String;Lcom/wukongtv/wkupdate/lib/i;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/wukongtv/wkhelper/h/a;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/b/m;->a()Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/16 v2, 0x832
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iput v2, v1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/a;->a()Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/c/a;->c()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/h/a;->d:Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/RemoteService;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/h/f;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/b/l;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/b/l;);
a=0;//     invoke-direct {v2}, Lcom/wukongtv/wkhelper/b/l;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/b/l;);
a=0;//     iget-object v6, v0, Lcom/wukongtv/wkhelper/h/a;->c:Lcom/wukongtv/wkhelper/h/f;
a=0;// 
a=0;//     iget-object v6, v6, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/wukongtv/wkhelper/b/l;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v6, Landroid/os/Build;->HOST:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/wukongtv/wkhelper/b/l;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/wukongtv/wkhelper/b/l;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v6, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/wukongtv/wkhelper/b/l;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/b/l;->a()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/h/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/h/b;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v2, v0, v6}, Lcom/wukongtv/wkhelper/h/b;-><init>(Lcom/wukongtv/wkhelper/h/a;B)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/h/b;);
a=0;//     sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v1, v6, v7
a=0;// 
a=0;//     invoke-virtual {v2, v0, v6}, Lcom/wukongtv/wkhelper/h/b;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;//     :try_end_0
a=0;//     .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Reference,Landroid/app/PendingIntent;);
a=0;//     iput-boolean v3, p0, Lcom/wukongtv/wkhelper/RemoteService;->n:Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->b:Lcom/wukongtv/wkhelper/i/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/a;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/i/a;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/i/c;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->m:Lcom/wukongtv/wkhelper/i/f;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/i/f;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/i/c;->a()V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/e/a;->a()Lcom/wukongtv/wkhelper/e/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/e/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     iput-wide v4, p0, Lcom/wukongtv/wkhelper/RemoteService;->o:J
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(One);v2=(PosByte);v6=(Boolean);v10=(Integer);v11=(Uninit);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/wukongtv/wkhelper/h/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/b;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/controller/b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const-string v0, "myDevicesname"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/h/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     const-string v0, "extraparam"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v5, ":"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget-object v0, v4, v5
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v5=(Conflicted);
a=0;//     const-string v4, "extraparam2"
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_8
a=0;// 
a=0;//     const-string v2, "mySharedPreferences"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "install_app"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/util/HashSet;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "install_app"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_6
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     iget-boolean v3, v2, Lcom/wukongtv/wkhelper/h/a;->b:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/b/m;->a()Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/16 v4, 0x834
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iput v4, v3, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     iput v1, v3, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(One);v2=(PosByte);v3=(Null);v4=(Reference,Ljava/lang/Object;);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v5=(Boolean);
a=0;//     const-string v1, "android.intent.action.PACKAGE_REMOVED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "action_preference"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/wukongtv/wkhelper/RemoteService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     const-string v3, "true"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     const v3, 0x813829
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/RemoteService;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p0, v0}, Lcom/wukongtv/wkhelper/a/k;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Boolean);v2=(PosByte);v3=(Null);
a=0;//     const-string v1, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(One);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/RemoteService;->a()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/RemoteService;->b()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/b/m;->a()Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/16 v3, 0x838
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     iput v3, v2, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Null);v4=(LongLo);v5=(LongHi);v6=(Conflicted);v7=(Reference,Landroid/app/PendingIntent;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(LongLo);v11=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Boolean);v2=(PosByte);v4=(Reference,Ljava/lang/String;);v5=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Integer);v11=(Uninit);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
}}
