package android.support.v4.a; class d { void a() { int a;
a=0;// .class public final Landroid/support/v4/a/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final f:Ljava/lang/Object;
a=0;// 
a=0;// .field private static g:Landroid/support/v4/a/d;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Landroid/content/Context;
a=0;// 
a=0;// .field private final b:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final c:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final d:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private final e:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/a/d;->f:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/a/d;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/a/d;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/a/d;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/a/d;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/a/d;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/a/e;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/a/e;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/a/e;-><init>(Landroid/support/v4/a/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/a/e;);
a=0;//     iput-object v0, p0, Landroid/support/v4/a/d;->e:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Landroid/support/v4/a/d;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v1, Landroid/support/v4/a/d;->f:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/support/v4/a/d;->g:Landroid/support/v4/a/d;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/a/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/a/d;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/a/d;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/a/d;);
a=0;//     sput-object v0, Landroid/support/v4/a/d;->g:Landroid/support/v4/a/d;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Landroid/support/v4/a/d;->g:Landroid/support/v4/a/d;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/support/v4/a/d;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/a/d;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     new-array v4, v0, [Landroid/support/v4/a/f;
a=0;// 
a=0;//     #v4=(Reference,[Landroid/support/v4/a/f;);
a=0;//     iget-object v0, p0, Landroid/support/v4/a/d;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/a/d;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_0
a=0;// 
a=0;//     aget-object v5, v4, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, v5, Landroid/support/v4/a/f;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/a/f;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/a/g;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/a/g;->b:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/a/d;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     iget-object v7, v5, Landroid/support/v4/a/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/HashMap;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v3=(Integer);v4=(Reference,[Landroid/support/v4/a/f;);v5=(Null);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/Intent;)Z
a=0;//     .locals 15
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v4/a/d;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v13
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getCategories()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Set;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v12, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v12=(Boolean);
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Resolving type "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v7, " scheme "
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v7, " of intent "
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object v8, v0
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Action list: "
a=0;// 
a=0;//     invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v11, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/util/ArrayList;);v11=(Integer);v14=(Conflicted);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v11, v1, :cond_6
a=0;// 
a=0;//     invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/a/g;
a=0;// 
a=0;//     move-object v9, v0
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/a/g;);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Matching against filter "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, v9, Landroid/support/v4/a/g;->a:Landroid/content/IntentFilter;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     iget-boolean v1, v9, Landroid/support/v4/a/g;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-eqz v12, :cond_b
a=0;// 
a=0;//     move-object v1, v10
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     add-int/lit8 v7, v11, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v11, v7
a=0;// 
a=0;//     move-object v10, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v12, v1
a=0;// 
a=0;//     #v12=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v7=(Conflicted);v8=(Reference,Ljava/util/ArrayList;);v9=(Reference,Landroid/support/v4/a/g;);v10=(Reference,Ljava/util/ArrayList;);v11=(Integer);v12=(Boolean);v14=(Conflicted);
a=0;//     iget-object v1, v9, Landroid/support/v4/a/g;->a:Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v7, "LocalBroadcastManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v7}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_b
a=0;// 
a=0;//     if-eqz v12, :cond_5
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "  Filter matched!  match=0x"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v14=(Conflicted);
a=0;//     if-nez v10, :cond_a
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, v9, Landroid/support/v4/a/g;->c:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v13
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/net/Uri;);v6=(Reference,Ljava/util/Set;);v8=(Reference,Ljava/util/ArrayList;);v10=(Reference,Ljava/util/ArrayList;);v11=(Integer);v12=(Boolean);
a=0;//     if-eqz v10, :cond_9
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge v2, v1, :cond_7
a=0;// 
a=0;//     invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/a/g;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, v1, Landroid/support/v4/a/g;->c:Z
a=0;// 
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Landroid/support/v4/a/f;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/a/f;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v2, v0, v10}, Landroid/support/v4/a/f;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/a/f;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->e:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/a/d;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     monitor-exit v13
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Boolean);v2=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v13
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v7=(Reference,Ujava/lang/Object;);v9=(Reference,Landroid/support/v4/a/g;);v10=(Reference,Ljava/util/ArrayList;);v11=(Integer);
a=0;//     move-object v1, v10
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Integer);v7=(Conflicted);
a=0;//     move-object v1, v10
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_2
a=0;// .end method
}}
