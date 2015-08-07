package com.alimama.mobile.csdk.umupdate.a; class b { void a() { int a;
a=0;// .class public abstract Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field public static final b:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field public static final c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field public static final d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static final e:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;// .field private static final f:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;// .field private static final g:Lcom/alimama/mobile/csdk/umupdate/a/h;
a=0;// 
a=0;// .field private static volatile h:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final i:Lcom/alimama/mobile/csdk/umupdate/a/l;
a=0;// 
a=0;// .field private final j:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;// .field private volatile k:I
a=0;// 
a=0;// .field private final l:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/c;);
a=0;//     invoke-direct {v0}, Lcom/alimama/mobile/csdk/umupdate/a/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/c;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->e:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->f:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const-wide/16 v4, 0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     sget-object v7, Lcom/alimama/mobile/csdk/umupdate/a/b;->f:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     sget-object v8, Lcom/alimama/mobile/csdk/umupdate/a/b;->e:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;);
a=0;//     invoke-direct {v9}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;);
a=0;//     invoke-direct/range {v1 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     sput-object v1, Lcom/alimama/mobile/csdk/umupdate/a/b;->a:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/csdk/umupdate/a/b;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/i;);
a=0;//     invoke-direct {v0, v10}, Lcom/alimama/mobile/csdk/umupdate/a/i;-><init>(B)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->b:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/csdk/umupdate/a/b;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/i;);
a=0;//     invoke-direct {v0, v10}, Lcom/alimama/mobile/csdk/umupdate/a/i;-><init>(B)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->b:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/h;);
a=0;//     invoke-direct {v0, v10}, Lcom/alimama/mobile/csdk/umupdate/a/h;-><init>(B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/h;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->g:Lcom/alimama/mobile/csdk/umupdate/a/h;
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->b:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->h:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->e:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->e:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/b;);
a=0;//     sget v0, Lcom/alimama/mobile/csdk/umupdate/a/k;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->k:I
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->m:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/d;);
a=0;//     invoke-direct {v0, p0}, Lcom/alimama/mobile/csdk/umupdate/a/d;-><init>(Lcom/alimama/mobile/csdk/umupdate/a/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/d;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->i:Lcom/alimama/mobile/csdk/umupdate/a/l;
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/e;);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->i:Lcom/alimama/mobile/csdk/umupdate/a/l;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/l;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/e;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->j:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/alimama/mobile/csdk/umupdate/a/b;->b(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/alimama/mobile/csdk/umupdate/a/b;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->m:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->g:Lcom/alimama/mobile/csdk/umupdate/a/h;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/h;);
a=0;//     new-instance v1, Lcom/alimama/mobile/csdk/umupdate/a/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/g;);
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-direct {v1, p0, v2}, Lcom/alimama/mobile/csdk/umupdate/a/g;-><init>(Lcom/alimama/mobile/csdk/umupdate/a/b;[Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/g;);
a=0;//     invoke-virtual {v0, v4, v1}, Lcom/alimama/mobile/csdk/umupdate/a/h;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method protected static varargs b()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->m:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/alimama/mobile/csdk/umupdate/a/b;->b(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/alimama/mobile/csdk/umupdate/a/b;->a(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     sget v0, Lcom/alimama/mobile/csdk/umupdate/a/k;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->k:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static c()Z
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/alimama/mobile/csdk/umupdate/a/k;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/f;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->k:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     sget v0, Lcom/alimama/mobile/csdk/umupdate/a/k;->b:I
a=0;// 
a=0;//     iput v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->k:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->i:Lcom/alimama/mobile/csdk/umupdate/a/l;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/l;);
a=0;//     iput-object p2, v0, Lcom/alimama/mobile/csdk/umupdate/a/l;->b:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/b;->j:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-object p0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task is already running."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected varargs abstract a()Ljava/lang/Object;
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
