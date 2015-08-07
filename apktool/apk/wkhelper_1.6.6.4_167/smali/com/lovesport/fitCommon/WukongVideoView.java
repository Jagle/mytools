package com.lovesport.fitCommon; class WukongVideoView { void a() { int a;
a=0;// .class public Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// .super Landroid/view/SurfaceView;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lovesport/fitCommon/u;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private A:Z
a=0;// 
a=0;// .field private B:Z
a=0;// 
a=0;// .field private C:Landroid/content/Context;
a=0;// 
a=0;// .field private D:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;// .field private E:Ljava/util/Vector;
a=0;// 
a=0;// .field a:I
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field c:Landroid/media/MediaPlayer;
a=0;// 
a=0;// .field d:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;// .field e:Landroid/view/SurfaceHolder$Callback;
a=0;// 
a=0;// .field f:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;// .field public g:Z
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// .field private i:Landroid/net/Uri;
a=0;// 
a=0;// .field private j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;// .field private k:I
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// .field private m:I
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// .field private o:I
a=0;// 
a=0;// .field private p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;// .field private q:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;// .field private r:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;// .field private s:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;// .field private t:I
a=0;// 
a=0;// .field private u:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
a=0;// 
a=0;// .field private v:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;// .field private w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;// .field private x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;// .field private y:I
a=0;// 
a=0;// .field private z:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     const-string v0, "VideoView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->h:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/w;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/w;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/w;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/w;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->d:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/x;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/x;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/x;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/x;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->r:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/y;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/y;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/y;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/y;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->u:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/z;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/z;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/z;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/z;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/aa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/aa;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/aa;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/aa;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->e:Landroid/view/SurfaceHolder$Callback;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ab;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ab;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ab;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->f:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ac;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ac;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ac;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ac;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->D:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     const-string v0, "VideoView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->h:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/w;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/w;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/w;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/w;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->d:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/x;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/x;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/x;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/x;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->r:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/y;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/y;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/y;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/y;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->u:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/z;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/z;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/z;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/z;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/aa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/aa;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/aa;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/aa;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->e:Landroid/view/SurfaceHolder$Callback;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ab;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ab;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ab;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->f:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ac;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ac;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ac;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ac;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->D:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     const-string v0, "VideoView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->h:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/w;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/w;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/w;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/w;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->d:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/x;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/x;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/x;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/x;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->r:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/y;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/y;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/y;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/y;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->u:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/z;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/z;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/z;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/z;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/aa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/aa;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/aa;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/aa;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->e:Landroid/view/SurfaceHolder$Callback;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ab;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ab;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ab;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->f:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/ac;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/ac;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/ac;-><init>(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/ac;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->D:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/lovesport/fitCommon/WukongVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->E:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     iput v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iput v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/lovesport/fitCommon/WukongVideoView;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->z:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/lovesport/fitCommon/WukongVideoView;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->A:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/lovesport/fitCommon/WukongVideoView;)Lcom/lovesport/fitCommon/p;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/lovesport/fitCommon/WukongVideoView;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->g:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->q:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer$OnCompletionListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->t:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/media/MediaPlayer;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     iput v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->getHolder()Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SurfaceHolder;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->e:Landroid/view/SurfaceHolder$Callback;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/SurfaceHolder$Callback;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->getHolder()Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/lovesport/fitCommon/WukongVideoView;->setFocusable(Z)V
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/lovesport/fitCommon/WukongVideoView;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->requestFocus()Z
a=0;// 
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->E:Ljava/util/Vector;
a=0;// 
a=0;//     iput v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->n:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/media/MediaPlayer$OnErrorListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->v:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer$OnErrorListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->i:Landroid/net/Uri;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/SurfaceHolder;);v1=(Uninit);v2=(Uninit);v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "audio"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/media/AudioManager;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
a=0;// 
a=0;//     invoke-direct {p0, v6}, Lcom/lovesport/fitCommon/WukongVideoView;->a(Z)V
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/media/MediaPlayer;);
a=0;//     invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioSessionId(I)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->f:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/MediaPlayer$OnPreparedListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->d:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->r:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->D:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->u:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->t:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->i:Landroid/net/Uri;
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->j:Landroid/view/SurfaceHolder;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->g()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Unable to open content: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->i:Landroid/net/Uri;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     iput v5, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v5, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     invoke-interface {v0, v1, v4, v6}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->getAudioSessionId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iput v5, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iput v5, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->w:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-interface {v0, v1, v4, v3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/lovesport/fitCommon/WukongVideoView;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->o:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private g()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/lovesport/fitCommon/p;->setMediaPlayer(Lcom/lovesport/fitCommon/u;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v1, v0}, Lcom/lovesport/fitCommon/p;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/p;->setEnabled(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private h()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     iget-boolean v0, v0, Lcom/lovesport/fitCommon/p;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/p;->a()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     const/16 v1, 0xbb8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/p;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->y:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->f()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic k(Lcom/lovesport/fitCommon/WukongVideoView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/lovesport/fitCommon/WukongVideoView;->a(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic l(Lcom/lovesport/fitCommon/WukongVideoView;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->B:Z
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic m(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->s:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer$OnPreparedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic n(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic o(Lcom/lovesport/fitCommon/WukongVideoView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic p(Lcom/lovesport/fitCommon/WukongVideoView;)Landroid/media/MediaPlayer$OnInfoListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer$OnInfoListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setVideoURI$412e492d(Landroid/net/Uri;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->i:Landroid/net/Uri;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->y:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->f()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->requestLayout()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
a=0;// 
a=0;//     iput v4, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/MediaPlayer;);
a=0;//     const/16 v2, 0x820
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/media/MediaPlayer$OnInfoListener;->onInfo(Landroid/media/MediaPlayer;II)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput v4, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->y:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     iput p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->y:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
a=0;// 
a=0;//     iput v4, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/MediaPlayer;);
a=0;//     const/16 v2, 0x819
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/media/MediaPlayer$OnInfoListener;->onInfo(Landroid/media/MediaPlayer;II)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput v4, p0, Lcom/lovesport/fitCommon/WukongVideoView;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final d()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/MediaPlayer;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->a:I
a=0;// 
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAudioSessionId()I
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/media/MediaPlayer;);
a=0;//     invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->getAudioSessionId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBufferPercentage()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->t:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
a=0;//     .locals 1
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xe
a=0;//     .end annotation
a=0;// 
a=0;//     const-class v0, Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v5, 0xbb8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v4, 0x13
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x19
a=0;// 
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0xa4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x52
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     const/16 v0, 0x4f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x55
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x17
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x42
a=0;// 
a=0;//     if-ne p1, v0, :cond_4
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0, v5}, Lcom/lovesport/fitCommon/p;->a(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosShort);v1=(One);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/p;->a()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x7e
a=0;// 
a=0;//     if-ne p1, v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/p;->a()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x56
a=0;// 
a=0;//     if-eq p1, v0, :cond_6
a=0;// 
a=0;//     const/16 v0, 0x7f
a=0;// 
a=0;//     if-ne p1, v0, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0, v5}, Lcom/lovesport/fitCommon/p;->a(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v4, :cond_8
a=0;// 
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     if-ne p1, v0, :cond_b
a=0;// 
a=0;//     :cond_8
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->c:Landroid/media/MediaPlayer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/MediaPlayer;);
a=0;//     invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->C:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "audio"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/media/AudioManager;
a=0;// 
a=0;//     if-ne p1, v4, :cond_a
a=0;// 
a=0;//     invoke-virtual {v0, v3, v1, v1}, Landroid/media/AudioManager;->adjustStreamVolume(III)V
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/media/AudioManager;);v1=(One);v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v3, v2, v1}, Landroid/media/AudioManager;->adjustStreamVolume(III)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(PosByte);v2=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->h()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v6, -0x80000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, p1}, Lcom/lovesport/fitCommon/WukongVideoView;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     invoke-static {v0, p2}, Lcom/lovesport/fitCommon/WukongVideoView;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v4, v3, :cond_2
a=0;// 
a=0;//     if-ne v5, v3, :cond_2
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     mul-int/2addr v1, v0
a=0;// 
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     mul-int/2addr v3, v2
a=0;// 
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     mul-int/2addr v1, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     div-int/2addr v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/lovesport/fitCommon/WukongVideoView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     mul-int/2addr v1, v0
a=0;// 
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     mul-int/2addr v3, v2
a=0;// 
a=0;//     if-le v1, v3, :cond_7
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     if-ne v4, v3, :cond_3
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     mul-int/2addr v1, v2
a=0;// 
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     div-int/2addr v1, v3
a=0;// 
a=0;//     if-ne v5, v6, :cond_6
a=0;// 
a=0;//     if-le v1, v0, :cond_6
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     if-ne v5, v3, :cond_4
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     mul-int/2addr v1, v0
a=0;// 
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     div-int/2addr v1, v3
a=0;// 
a=0;//     if-ne v4, v6, :cond_0
a=0;// 
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     if-ne v5, v6, :cond_5
a=0;// 
a=0;//     if-le v1, v0, :cond_5
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     mul-int/2addr v1, v0
a=0;// 
a=0;//     iget v3, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     div-int/2addr v1, v3
a=0;// 
a=0;//     :goto_1
a=0;//     if-ne v4, v6, :cond_0
a=0;// 
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->m:I
a=0;// 
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     iget v1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->l:I
a=0;// 
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     move v0, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->h()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTrackballEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->h()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setMediaController(Lcom/lovesport/fitCommon/p;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/p;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->p:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->g()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->q:Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->v:Landroid/media/MediaPlayer$OnErrorListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->x:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->s:Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVideoPath(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/fitCommon/WukongVideoView;->setVideoURI(Landroid/net/Uri;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVideoURI(Landroid/net/Uri;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/WukongVideoView;->i:Landroid/net/Uri;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lovesport/fitCommon/WukongVideoView;->y:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->f()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->requestLayout()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/fitCommon/WukongVideoView;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
